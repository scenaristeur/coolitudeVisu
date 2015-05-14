class OutilBox {

  OutilBox() {
  } 


  OntModel chargeFichier(String _fichier) {
    InputStream in=null;
    try {
      in = new FileInputStream(_fichier); // or any windows path model.read(in, null);
    }
    catch(Exception  e) {
      println(e.getMessage());
    }


    OntModel model = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM);
    model.read(in, null);
    //  in.close();
    Iterator<OntClass> it = model.listClasses();
    while (it.hasNext ()) {
      OntClass ontclass = it.next();
      //  System.out.println(ontclass.toString());
      //System.out.println(ontclass.getLabel(null));
    }
    return model;
  }

  void selectFichier() {
    selectInput("Selectionnez une ontologie à charger:", "fileSelected");
  }

  void fileSelected(File selection) {
    println(selection.getAbsolutePath());
    if (selection == null) {
      println("Window was closed or the user hit cancel.");
    } else {
      println("User selected " + selection.getAbsolutePath());
      OntModel model2 = ModelFactory.createOntologyModel( OntModelSpec.OWL_DL_MEM );
      model2.read(selection.getAbsolutePath().toLowerCase());
      //model2.write(System.out, "RDF/XML-ABBREV");
      // reinitialisation de model
      model = ModelFactory.createOntologyModel( OntModelSpec.OWL_DL_MEM );
      model.add(model2);// rremplissage de model avec les données chargées
      model.write(System.out, "RDF/XML-ABBREV");
    }
  }
  /*  void chargeSparql() {
   String endpoint = "http://192.168.56.2:3030/ds/query";
   String requete = "SELECT * WHERE {?S ?P ?O}";
   //String requeteJS = "SELECT ?x WHERE { ?x <http://www.w3.org/2001/vcard-rdf/3.0#FN> 'John Smith' }";
   //SELECT ?x ?fname WHERE {?x  <http://www.w3.org/2001/vcard-rdf/3.0#FN>  ?fname}
   // select-query
   QueryExecution qe = QueryExecutionFactory.sparqlService(endpoint, requete);
   //qe.setInitialBinding( );
   println (qe);
   ResultSet result = qe.execSelect();
   ////////////////////////:::::::::::::
   // Pour afficher les resultats deux solutions ResultSetFormatter.out(System.out, result); ou While / has next
   ResultSetFormatter.out(System.out, result);
  /*while (result.hasNext ()) {
   QuerySolution querySolution = result.next();
   println(querySolution);
   }*/
  //////////////////////////:::::::

  /*  int numb = result.getRowNumber();
   println (numb);
   
   //REcuperation des infos dans un model
   //Model model = ModelFactory.createDefaultModel();
   OntModel m = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
   String describe_query = "DESCRIBE * WHERE {?S ?P ?O}";
   QueryExecution req = QueryExecutionFactory.sparqlService(endpoint, describe_query);
   //   draw();
   req.execDescribe(m);
   m.write(System.out);
   */
  //   ClassHierarchy hierarchie = new ClassHierarchy();
  //   hierarchie.showHierarchy(System.out, m);
  /*  }*/
  void initialiseCentre() {
    centre=new Particle(width/2, height/2);
    centre.lock();
    centre.couleur=color(200, 0, 0);
    centre.type="centre";
    centre.texte="Centre";
    physics.addParticle(centre);
    loupe = new Particle(width/2+10, height/2+10);
    physics.addParticle(loupe);
    loupe.couleur=color(0, 0, 200);
    loupe.type="loupe";
    loupe.texte="Loupe";
    VerletSpring2D springLoupe=new VerletSpring2D(centre, loupe, 80, 0.001);
    physics.addSpring(springLoupe);
    AttractionBehavior rayonLoupe=new AttractionBehavior(loupe, 100, -10);
    physics.addBehavior(rayonLoupe );
  }
  
  
            void afficheVisu(OntModel _model){
              OntModel ontModel=_model;
              reloadVisualisation();
              
              
              
              
            }
  
  
  
  void reloadVisualisation() {
  ResIterator resources=model.listSubjects(); 
  while (resources.hasNext ()) {
    Resource resource=resources.nextResource();
    println(resource);
    Particle particleResource=new Particle(random(width), random(height));
    physics.addParticle(particleResource);
    particleResource.setResource(resource);
    particleResource.setType("sujet");
    particleResource.setCouleur(color(#1F7b9b));
    try{
    particleResource.setText(resource.asResource().getLocalName().toString());}
    catch(Exception e){
      //gestion des blankNodes
     particleResource.setText(resource.asNode().toString()); 
    }
    particleResource.setSprings();
   /* VerletSpring2D springPredicate=new VerletSpring2D(centre, particleResource, (particleResource.taille+centre.taille)*distanceRessort, 0.01*forceRessort);
    physics.addSpring(springPredicate);
     AttractionBehavior espacement=new AttractionBehavior(particleResource, particleResource.taille*distanceAttraction, -10*forceAttraction);
    physics.addBehavior(espacement );*/
  }
}
  
  
  
  
  
  
  
  
  
  
  void traitement(OntModel _model) {
    Iterator<OntClass> classes = model.listClasses();
    ExtendedIterator<Individual> ontIndividuels=model.listIndividuals();


    while (classes.hasNext ()) {
      OntClass ontclass = classes.next();
      //  println(ontclass.toString());
      //System.out.println(ontclass.getLabel(null));
      Particle classe=new Particle(random(width), random(height));
      physics.addParticle(classe);
      classe.couleur=color(200, 200, 0);
      classe.type="classe";
      classe.resource=ontclass;
      VerletSpring2D springCentre=new VerletSpring2D(classe, centre, height/2-40, 0.001);
      physics.addSpring(springCentre);
      AttractionBehavior espaceVital=new AttractionBehavior(classe, classe.taille*2, -10);
      physics.addBehavior(espaceVital );
    }

    while (ontIndividuels.hasNext ()) {
      Individual ontIndividuel=ontIndividuels.next();
      println( ontIndividuel.toString());
      Particle individuel=new Particle(random(width), random(height));
      physics.addParticle(individuel);
      individuel.couleur=color(200, 0, 200);
      individuel.type="individuel";
      individuel.resource=ontIndividuel;
      VerletSpring2D springIndivCentre=new VerletSpring2D(individuel, centre, height/4-20, 0.001);
      physics.addSpring(springIndivCentre);
      AttractionBehavior espaceVitalIndividuel=new AttractionBehavior(individuel, individuel.taille*2, -10);
      physics.addBehavior(espaceVitalIndividuel );
      /* try {
       String indivuduelClasse = ontIndividuel.getOntClass().toString();  
       
       }
       catch(Exception e)
       {
       println("impossible de recuperer la classe "+ontIndividuel);
       }*/
    }
  }
 /* void createSpring2() {
    println("createSpring2");
    for (int i=0; i<physics.particles.size (); i++) {
      Particle p=(Particle)physics.particles.get(i);
      p.createSpring();
    }
  }*/

  void findSujets(OntModel _model) {
    ResIterator sujets=_model.listSubjects();
    while (sujets.hasNext ()) {
      Resource sujet=sujets.next();
      Particle sujetParticle=new Particle(random(width), random(height));
      physics.addParticle(sujetParticle);
      sujetParticle.resource=sujet;
      sujetParticle.couleur=color(#1F7b9b);
      sujetParticle.type="individuel";
      sujetParticle.taille=20;
      AttractionBehavior resourceVital=new AttractionBehavior(sujetParticle, sujetParticle.taille+5, -3);
      physics.addBehavior(resourceVital );
      VerletSpring2D springResCentre=new VerletSpring2D(sujetParticle, centre, 200, 0.0001);
      physics.addSpring(springResCentre);
    }
    findConnexions=true;
    /* StmtIterator statements=_model.listStatements();
     while (statements.hasNext ()) {
     Statement stmt      = statements.nextStatement();
     
     println(stmt);
     }*/
  }
  void findConnexions(OntModel _model) {
    println("FIND CONNEXIONS");
    StmtIterator statements = model.listStatements();
    while (statements.hasNext ()) {
      Particle origine=null;
      Particle destination=null;
      Statement stmt      = statements.nextStatement();  // obtenir la prochaine déclaration
      Resource  subject   = stmt.getSubject();     // obtenir le sujet
      Property  predicate = stmt.getPredicate();   // obtenir le prédicat
      RDFNode   object    = stmt.getObject();      // obtenir l'objet
      String sujetString= subject.getLocalName();
      String predicateString=predicate.getLocalName();
      String objetString=null;
      // Spring spring = new Spring(stmt);
      // springs.add(spring);
      //Recuperation de la particle correspondant au sujet
      Particle sRecherche=null;
      Boolean sujetExiste=false;
      // for (int i=0; i<physics.particles.size (); i++) {
      for (int i=0; i<physics.particles.size (); i++) {
        try {
          sRecherche=(Particle) physics.particles.get(i);
          if (sRecherche.resource==subject) {
            sujetExiste=true;
            println("le sujet existe "+sRecherche+" "+subject);
            origine=sRecherche;
            return;
          } else {
            sujetExiste=false;
            // println("PB? j'aurais dû trouver le sujet "+sRecherche.resource.toString()+" "+subject.toString());
          }
        }
        catch(Exception e) {
          println("Pas de resource pour cette particle? un blank_node? "+subject+" "+e.getMessage());
        }
        if (!sujetExiste) {
          println("création du sujet "+subject);
          origine=createSujetParticle(subject);
        }
      }


      Boolean objetExiste=false;
      Particle pRecherche=null;
      if (object instanceof Resource) {
        Resource objetR= object.asResource();
        objetString=objetR.getLocalName();
        for (int i=0; i<physics.particles.size (); i++) {
          try {
            pRecherche=(Particle) physics.particles.get(i);
            if (pRecherche.resource==objetR) {
              objetExiste=true;
              return;
            } else {
              objetExiste=false;
            }
          }
          catch(Exception e) {
            println("l'objet nest pas une resource ? un literal ? yun blank_node? "+objetR+" "+e.getMessage());
          }
        }
        if (objetExiste) {
          println("la resource existe, je m'y connecte");
          destination=pRecherche;
        } else {
          println("je la créé");
          destination=createRDFNodeParticle(objetR);
        }
      } else {
        // l'objet est un littéral
        objetString= "\"" + object.toString() + "\"";
        destination=createLiteralParticle(objetString);
      }
      println(objetString);
      if ((origine!=null)&&(destination!=null)) {
        VerletSpring2D springSujetObjet=new VerletSpring2D(origine, destination, 50, 0.0001);
        physics.addSpring(springSujetObjet);
      }
    }
  }

  Particle createRDFNodeParticle(Resource _resource) {
    Resource resource=_resource;
    Particle RDFNodeParticle=new Particle(random(width), random(height));
    physics.addParticle(RDFNodeParticle);
    RDFNodeParticle.resource=resource;
    RDFNodeParticle.couleur=color(200, 200, 0);
    RDFNodeParticle.type="rdfnode";
    RDFNodeParticle.taille=20;
    AttractionBehavior RDFNodeParticleVital=new AttractionBehavior(RDFNodeParticle, RDFNodeParticle.taille+5, -3);
    physics.addBehavior(RDFNodeParticleVital );
    VerletSpring2D springRDFNodeParticleCentre=new VerletSpring2D(RDFNodeParticle, centre, 800, 0.0001);
    physics.addSpring(springRDFNodeParticleCentre);
    return RDFNodeParticle;
  }
  Particle createSujetParticle(Resource _resource) {
    Resource resource=_resource;
    Particle SujetParticle=new Particle(random(width), random(height));
    physics.addParticle(SujetParticle);
    SujetParticle.resource=resource;
    SujetParticle.couleur=color(0, 200, 0);
    SujetParticle.type="sujet";
    SujetParticle.taille=10;
    AttractionBehavior SujetParticleVital=new AttractionBehavior(SujetParticle, SujetParticle.taille+5, -3);
    physics.addBehavior(SujetParticleVital );
    VerletSpring2D springSujetParticleCentre=new VerletSpring2D(SujetParticle, centre, 800, 0.0001);
    physics.addSpring(springSujetParticleCentre);
    return SujetParticle;
  }


  Particle createLiteralParticle(String  _literal) {
    String literal=_literal;
    Particle literalParticle=new Particle(random(width), random(height));
    physics.addParticle(literalParticle);
    literalParticle.texte=literal;
    literalParticle.resource=null;
    literalParticle.couleur=color(#CC00CC);
    literalParticle.type="literal";
    literalParticle.taille=5;
    AttractionBehavior literalVital=new AttractionBehavior(literalParticle, literalParticle.taille+5, -3);
    physics.addBehavior(literalVital );
    VerletSpring2D springLiteralCentre=new VerletSpring2D(literalParticle, centre, width/2, 0.0001);
    physics.addSpring(springLiteralCentre);
    return literalParticle;
  }

  void createSprings() {
    int i=0;
    StmtIterator statements=model.listStatements();
    while (statements.hasNext ()) {

      Particle origine=centre;
      Particle destination=centre;
      Statement stmt      = statements.nextStatement();  // obtenir la prochaine déclaration
      Resource  subject   = stmt.getSubject();     // obtenir le sujet
      Property  predicate = stmt.getPredicate();   // obtenir le prédicat
      RDFNode   object    = stmt.getObject();      // obtenir l'objet
      String sujetString= subject.getLocalName();
      String predicateString=predicate.getLocalName();
      String objetString=null;
      // Spring spring = new Spring(stmt);
      // springs.add(spring);
      if (object instanceof Resource) {
        Resource objetR= object.asResource();
        objetString=objetR.getLocalName();
      } else {
        // l'objet est un littéral
        objetString= "\"" + object.toString() + "\"";
      }
      //test pour voir si sujet et objet on déjà étés créés
      for (int j=0; j<physics.particles.size (); j++) {
        Particle p=(Particle)physics.particles.get(j);
        if (p.resource!=null) {// pour pallier aux ressources nulles de centre et loupe
          if (subject.equals(p.resource)) {
            //  println(subject.toString()+" ... "+p.resource.toString());
            origine=p;
            p.taille=(p.taille)+2;
            AttractionBehavior rayonLoupe=new AttractionBehavior(p, p.taille, -2);
            physics.addBehavior(rayonLoupe );
            println(predicateString+" ~~~~~~ "+objetString);
            return;
          } else {
            /*   origine=new Particle(random(width), random(height));
             origine.couleur=color(0, 255, 0);
             origine.resource=subject;
             println("nouvelle Origine "+subject.getLocalName().toString());
             physics.addParticle(origine);*/
          }
          if (object.equals(p.resource)) {
            //  println(subject.toString()+" ... "+p.resource.toString());
            destination=p;
            p.taille=(p.taille)+2;
            AttractionBehavior rayonLoupe=new AttractionBehavior(p, p.taille, -2);
            physics.addBehavior(rayonLoupe );
            //  println(predicateString+" ~~~~~~ "+objetString);
            return;
          } else {
            /* destination=new Particle(random(width), random(height));
             destination.couleur=color(0, 255, 0);
             destination.resource=object.asResource();
             println("nouvelle Destination "+objetString);
             
             physics.addParticle(destination);*/
          }
          /* if (p.resource.toString().equals(subject.toString())){
           println ("trouvé "+p.resource.getLocalName().toString());
           
           }else{
           print("."); 
           }*/
        }
        try {


          VerletSpring2D springStatement=new VerletSpring2D(origine, destination, 10, 0.1);
          physics.addSpring(springStatement);
        }
        catch(Exception e) {
          println(e.getMessage());
        }
      }
    }
  }


  void initialisePhysics() {
    // Initialize the physics
    physics=new VerletPhysics2D();
    //physics.addBehavior(new GravityBehavior(new Vec2D(0,0.5)));
    // This is the center of the world
    Vec2D center = new Vec2D(width/2, height/2);
    // these are the worlds dimensions (50%, a vector pointing out from the center in both directions)
    Vec2D extent = new Vec2D(width/2-20, height/2-20);
    // Set the world's bounding box
    physics.setWorldBounds(Rect.fromCenterExtent(center, extent));
    // Make two particles
    // Particle p1 = new Particle(width/2+10, height/2);
    // Particle p2 = new Particle(width/2, height/2-100); //Une representation de mon action actuelle
    // Lock one in place
    //  p1.lock();
    //  p2.setText("MOI");

    // Make a spring connecting both Particles
    // VerletSpring2D spring=new VerletSpring2D(p1, p2, 80, 0.001);
    //AttractionBehavior espacementCentre=new AttractionBehavior(p1, 100, -1);
    //AttractionBehavior fixeMaRepresentation=new AttractionBehavior(p2, 100, -10);
    //  AttractionBehavior fixeMaRepresentation=new AttractionBehavior(p2,-10,1000);
    // physics.addBehavior(espacementCentre );
    //physics.addBehavior(fixeMaRepresentation );
    // p2.lock();
    // Anything we make, we have to add into the physics world
    // physics.addParticle(p1);
    // physics.addParticle(p2);
    // physics.addSpring(spring);
  }
}

// check all particles if mouse pos is less than snap distance 
void mousePressed() { 
  selected=null; 
  Vec2D mousePos=new Vec2D(mouseX, mouseY); 

  for (Iterator i=physics.particles.iterator (); i.hasNext(); ) { 
    VerletParticle2D p=(VerletParticle2D)i.next(); 
    // if mouse is close enough, keep a reference to 
    // the selected particle and lock it (becomes unmovable by physics) 
    if (p.distanceToSquared(mousePos)<snapDist) { 
      selected=p; 
      selected.lock(); 
      if ((selected!=centre)&&(selected!=loupe)) {
        Particle selectedParticle=(Particle)selected;
        try {//pour DEBUG
          println(selectedParticle.resource.toString());
        }
        catch(Exception e) {
          println("pas grave, clic sur une particule sans ressource (ex : literal)"+e.getMessage());
        }
      }
      break;
    }
  }
} 
void keyPressed() {
  if (key=='i'||key=='I') {
    // initialiseP1P2();
  }
  if (key=='f'||key=='F') {
    centre.lock();
  }
  if (key=='c'||key=='C') {
    centre.x=width/2;
    centre.y=height/2;
    centre.lock();
  }
}
// only react to mouse dragging events if we have a selected particle 
void mouseDragged() { 
  if (selected!=null) {  
    if (selected==loupe) {
      centre.lock();
    }
    selected.set(mouseX, mouseY);
  }
} 

// if we had a selected particle unlock it again and kill reference 
void mouseReleased() { 
  if (selected!=null) { 
    selected.unlock(); 
    selected=null;
  }
  /*  if (key=='f'||key=='F') {
   if(!centre.isLocked()&&(selected!=centre)){
   centre.lock();
   }else{
   centre.unlock();
   }    
   }*/
}
