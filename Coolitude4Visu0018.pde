import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.ResIterator;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.query.DatasetAccessor;
import com.hp.hpl.jena.query.DatasetAccessorFactory;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.StmtIterator;
import com.hp.hpl.jena.ontology.Individual;
import com.hp.hpl.jena.util.iterator.ExtendedIterator;

// Need G4P library
import g4p_controls.*;

//JAVA
import java.io.FileInputStream;
import java.util.Iterator;

//JENA
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.query.ResultSetFormatter;

//toxics
import toxi.physics2d.*;
import toxi.physics2d.behaviors.GravityBehavior;
import toxi.geom.*;
import toxi.geom.Rect;
import toxi.physics2d.behaviors.AttractionBehavior;


OntModel model = ModelFactory.createOntologyModel( OntModelSpec.OWL_DL_MEM );
OutilBox outilBox=new OutilBox();
String fichierOnto="doap.rdf";
DatasetAccessor accessor = DatasetAccessorFactory.createHTTP("http://fuseki-smag0.rhcloud.com/ds/data");
Model updated = accessor.getModel("http://example/bookStore");

// Reference to physics world
VerletPhysics2D physics;
Particle centre;
Particle loupe;
float snapDist=10*10;
VerletParticle2D selected=null;
Boolean createSpring=false;
Boolean findConnexions=false;
Boolean afficheLiteral=false;
float distanceRessort=1;
float forceRessort=1;
float distanceAttraction=1;
float forceAttraction=1;



public void setup() {
  size(displayWidth, displayHeight, JAVA2D);
  createGUI();
  customGUI();
  // Place your setup code here

  // initialise l'environnement physique
  outilBox.initialisePhysics();
  outilBox.initialiseCentre();
}

public void draw() {
  background(230);
  stroke(0);
  try {  
    physics.update();
  }
  catch(Exception e) {
    println("physics n'est pas prêt :"+e.getMessage());
  }
  for (int i=0; i<physics.particles.size (); i++) {
    Particle p=(Particle)physics.particles.get(i);
    p.display();
  }
  stroke(200, 200, 255);
  for (Iterator i=physics.springs.iterator (); i.hasNext(); ) { 
    VerletSpring2D s=(VerletSpring2D)i.next();

    if ((s.a!=centre)&&(s.b!=centre)) {
      try { 
        
        line(s.a.x, s.a.y, s.b.x, s.b.y);
      }
      catch(Exception e) {
        println("erreur de ligne entre "+s.a+" et "+s.b+" "+e.getMessage());
      }
    }
  }
  if (createSpring) {
    outilBox.createSprings(); 
    //outilBox.createSpring2(); 
    createSpring=false;
  }
  if (findConnexions) {
    outilBox.findConnexions(model); 
    findConnexions=false;
  }
}

// Use this method to add additional statements
// to customise the GUI controls
public void customGUI() {
}

void fileSelected(File selection) {
  if (selection == null) {
    println("Window was closed or the user hit cancel.");
  } else {
    println("User selected " + selection.getAbsolutePath());
    model=outilBox.chargeFichier(selection.getAbsolutePath( ));
    outilBox.traitement(model);
    createSpring=true;
    // physics.update();
  }
}
