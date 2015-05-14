class Particle extends VerletParticle2D {

  int taille=10;
  color couleur=color(200, 200, 200);
  String type="defaut";
  String uri;
  Resource resource=null;
  String texte;
  Literal objetLiteral;
  RDFNode objetRDFNode;
  StmtIterator statements;
  VerletSpring2D springPredicate;
  AttractionBehavior espacement;

  Particle(float x, float y) {
    super(x, y);
    ;
  }
  void display() {
    this.scaleVelocity(0.9);
    updateSpringAttraction();
    fill(couleur);
    if ((type=="classe")||(type=="rdfnode")) {
      rectMode(CENTER);
      rect(x, y, taille*2, taille);
    } else if ((type=="individuel")||(type=="centre")||(type=="loupe")||(type=="literal")||(type=="sujet")) {        
      ellipse(x, y, taille, taille);
    }
    try {

      if (texte!=null) {
        if (type=="literal") {
          Vec2D mousePos=new Vec2D(mouseX, mouseY);
          if ((this.distanceToSquared(mousePos)<snapDist*this.taille*2)||(afficheLiteral)) { 
            fill(0);
            text(texte, x-textWidth(texte)/2, y-10);
          } else {
            return;
          }
        } else {
          text(texte, x, y-10);
        }
      } else {
        texte=resource.getLocalName().toString();
      }
    }
    catch(Exception e) {
      texte="_blankNode";
      // println("impossible de recuperer le texte de la resource");
    }
  }

  void setResource(Resource _resource) {
    this.resource=_resource;
  }
  void setCouleur(color _couleur) {
    this.couleur=_couleur;
  }
  void setObjetobjetRDFNode(RDFNode _objetRDFNode) {
    objetRDFNode=_objetRDFNode;
  }
  void setObjetobjetString(Literal _objetLiteral) {
    objetLiteral=_objetLiteral;
  }
  void setText(String _texte) {

    this.texte=_texte;
  }
  void setType(String _type) {
    this.type=_type;
  }
  /*  void createSpring() {
   StmtIterator statements=model.listStatements((Resource)this.resource, null, (RDFNode)null);
   while (statements.hasNext ()) {
   Statement stmt      = statements.nextStatement();
   //  println(stmt);
   Property  predicate = stmt.getPredicate();   // obtenir le prédicat
   RDFNode   object    = stmt.getObject();
   
   if (object.isResource()) {
   
   if (model.contains(object.asResource(), null, (RDFNode)null)) { // voir si notre objet est aussi un sujet --> du coup , on ne l'aoute pas
   String objetString=object.asResource().getLocalName().toString();
   // println("trouvé"+ objetString);
   try {
   for (VerletParticle2D chercheParticle : physics.particles) {
   Particle p=(Particle)chercheParticle;
   String pTexte=p.texte;
   if ((objetString).equals(pTexte)) {
   //   try {
   //println("dans la particle "+p.texte);
   VerletSpring2D springResourceTrouvee=new VerletSpring2D(this, p, 100, 0.01);     
   physics.addSpring(springResourceTrouvee);
   this.taille=this.taille+3;
   p.taille=p.taille+2;
   AttractionBehavior espacement=new AttractionBehavior(this, 20, -10);
   physics.addBehavior(espacement );
   
   } else {
   //  try {
   //  println("###################pastrouvé");
   Particle objetRDFNode=new Particle(this.x+1, this.y+1);
   physics.addParticle(objetRDFNode);
   VerletSpring2D springRDFNode=new VerletSpring2D(this, objetRDFNode, 20, 0.01);     
   physics.addSpring(springRDFNode);
   VerletSpring2D springRDFNodeCentreP1=new VerletSpring2D(centre, objetRDFNode, 20, 0.01);      
   physics.addSpring(springRDFNodeCentreP1); 
   AttractionBehavior espacementNouveau=new AttractionBehavior(objetRDFNode, 10, -2);
   physics.addBehavior(espacementNouveau );
   objetRDFNode.resource=object.asResource();
   objetRDFNode.type="sujet";
   objetRDFNode.setCouleur(color(200,200,25));
   
   }
   }
   }
   catch(Exception e) {
   println("pb FOR");
   }
   }
   } else {
   try {
   // println("LLLLLLLLLLLLLLLLLLLLLL "+object+" est literal"); 
   
   Particle objetLiteral=new Particle(this.x+1, this.y+1);
   physics.addParticle(objetLiteral );
   VerletSpring2D springLiteral=new VerletSpring2D(this, objetLiteral, 20, 0.01);      
   physics.addSpring(springLiteral);
   AttractionBehavior espacementLiteral=new AttractionBehavior(objetLiteral, 10, -2);
   physics.addBehavior(espacementLiteral );
   VerletSpring2D springLiteralCentreP1=new VerletSpring2D(centre, objetLiteral, 20, 0.01);      
   physics.addSpring(springLiteralCentreP1);      
   objetLiteral.resource=object.asResource();
   objetLiteral.type="Literal";
   
   objetLiteral.setCouleur(color(0,200,25));
   }
   catch(Exception e) {
   println("gerer les Literal "+e.getMessage());
   //  e.printStackTrace();
   }
   }
   //  println(" ");
   }
   }
   */
  void setSprings() {
    statements=model.listStatements((Resource)resource, null, (RDFNode)null);
    while (statements.hasNext ()) {
      Statement stmt      = statements.nextStatement();
      println(stmt);
      Property  predicate = stmt.getPredicate();   // obtenir le prédicat
      RDFNode   object    = stmt.getObject();
      if (object.isResource()) {
        if (model.contains(null, null, object)) {
          println(object+"existe déjà en RDFNode");
          ///
          println("trouvé"+ object.toString());
          String objetString=object.toString();
          for (VerletParticle2D chercheParticle : physics.particles) {
            Particle p=(Particle)chercheParticle;
            String pTexte=p.texte;
            if ((objetString).equals(pTexte)) {
              println("dans la particle RDFNode "+p.texte);
              /* if (taille>150) {
               taille=150;
               } else {*/
              taille=taille+2;
              //   }
              VerletSpring2D springResourceTrouvee=new VerletSpring2D(this, p, (this.taille+p.taille)*distanceRessort, 10*forceRessort);     
              physics.addSpring(springResourceTrouvee);


              AttractionBehavior espacement=new AttractionBehavior(this, taille*2, -10);
              physics.addBehavior(espacement );
              p.setCouleur(color(200, 200, 25));
            }
          }


          ///
        } else {



          if (model.contains(object.asResource(), null, (RDFNode)null)) { // voir si notre objet est aussi un sujet --> du coup , on ne l'aoute pas mais il ne faut pas non plus l'ajouter si c'est déjà un RDFNode
            println("trouvé"+ object.asResource().getLocalName().toString());
            String objetString=object.asResource().getLocalName().toString();
            for (VerletParticle2D chercheParticle : physics.particles) {
              Particle p=(Particle)chercheParticle;
              String pTexte=p.texte;
              if ((objetString).equals(pTexte)) {
                println("dans la particle "+p.texte);
                VerletSpring2D springResourceTrouvee=new VerletSpring2D(this, p, (this.taille+p.taille), 10);     
                physics.addSpring(springResourceTrouvee);

                /* if (taille>50) {
                 taille=50;
                 } else {*/
                taille=taille+2;
                //  }
                AttractionBehavior espacement=new AttractionBehavior(this, taille*1.5, -10);
                physics.addBehavior(espacement );
                p.setCouleur(color(200, 25, 200));
              }
            }
          } else {
            // println("###################pastrouvé");
            Particle objetRDFNode=new Particle(this.x-1, this.y-1);
            physics.addParticle(objetRDFNode);
            VerletSpring2D springRDFNode=new VerletSpring2D(this, objetRDFNode, (this.taille+objetRDFNode.taille), 0.1);     
            physics.addSpring(springRDFNode);
            VerletSpring2D springRDFNodeCentreP1=new VerletSpring2D(centre, objetRDFNode, height/2, 0.0001);      
            physics.addSpring(springRDFNodeCentreP1); 
            AttractionBehavior espacementNouveau=new AttractionBehavior(objetRDFNode, taille, -10);
            physics.addBehavior(espacementNouveau );
            objetRDFNode.setText(object.asResource().getLocalName().toString());
            objetRDFNode.setType("classe");


            objetRDFNode.setCouleur(color(200, 200, 20));
          }
        }
      } else {
        //  println("LLLLLLLLLLLLLLLLLLLLLL "+object+" est literal"); 

        Particle objetLiteral=new Particle(this.x+1, this.y+1);
        physics.addParticle(objetLiteral );
        VerletSpring2D springLiteral=new VerletSpring2D(this, objetLiteral, (this.taille+objetLiteral.taille), 0.01);      
        physics.addSpring(springLiteral);
        AttractionBehavior espacementLiteral=new AttractionBehavior(objetLiteral, taille, -10);
        physics.addBehavior(espacementLiteral );
        VerletSpring2D springLiteralCentreP1=new VerletSpring2D(centre, objetLiteral, height/2, 0.0001);      
        physics.addSpring(springLiteralCentreP1);      
        objetLiteral.setText(object.toString());
        objetLiteral.setType("literal");
        objetLiteral.setCouleur(color(25, 200, 200));
      }
    }
  }
  void updateSpringAttraction() {
    physics.removeBehavior(espacement) ;
    physics.removeSpring(springPredicate) ;
    springPredicate      =new VerletSpring2D(centre, this, (this.taille+centre.taille)*distanceRessort*distanceRessort, 0.001*forceRessort*forceRessort);
    physics.addSpring(springPredicate);
    espacement=new AttractionBehavior(this, this.taille*2*distanceAttraction*distanceAttraction, -20*forceAttraction*forceAttraction);
    physics.addBehavior(espacement );
  }
}
