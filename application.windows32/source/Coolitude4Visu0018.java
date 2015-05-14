import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

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
import g4p_controls.*; 
import java.io.FileInputStream; 
import java.util.Iterator; 
import com.hp.hpl.jena.ontology.OntModel; 
import com.hp.hpl.jena.rdf.model.ModelFactory; 
import com.hp.hpl.jena.ontology.OntModelSpec; 
import com.hp.hpl.jena.query.ResultSet; 
import com.hp.hpl.jena.query.QueryExecution; 
import com.hp.hpl.jena.query.QueryExecutionFactory; 
import com.hp.hpl.jena.ontology.OntClass; 
import com.hp.hpl.jena.query.ResultSetFormatter; 
import toxi.physics2d.*; 
import toxi.physics2d.behaviors.GravityBehavior; 
import toxi.geom.*; 
import toxi.geom.Rect; 
import toxi.physics2d.behaviors.AttractionBehavior; 

import com.hp.hpl.jena.sparql.expr.aggregate.*; 
import org.apache.http.protocol.*; 
import org.apache.xerces.impl.dv.dtd.*; 
import org.apache.http.impl.client.cache.memcached.*; 
import org.apache.http.util.*; 
import com.fasterxml.jackson.databind.jsonschema.*; 
import org.apache.jena.riot.adapters.*; 
import com.hp.hpl.jena.sparql.engine.main.*; 
import org.apache.xerces.dom.events.*; 
import org.apache.xerces.impl.dv.xs.*; 
import org.apache.jena.riot.lang.*; 
import org.apache.log4j.config.*; 
import javax.xml.validation.*; 
import org.apache.jena.atlas.data.*; 
import org.apache.xerces.impl.dv.util.*; 
import javax.xml.transform.dom.*; 
import org.apache.log4j.lf5.viewer.categoryexplorer.*; 
import com.hp.hpl.jena.tdb.setup.*; 
import org.apache.xerces.impl.dtd.models.*; 
import com.hp.hpl.jena.sparql.algebra.optimize.*; 
import com.fasterxml.jackson.core.base.*; 
import com.hp.hpl.jena.sdb.layout2.hash.*; 
import com.hp.hpl.jena.sparql.function.library.*; 
import org.apache.http.client.cache.*; 
import org.apache.log4j.helpers.*; 
import com.hp.hpl.jena.sdb.core.sqlnode.*; 
import org.xml.sax.ext.*; 
import com.hp.hpl.jena.tdb.index.bplustree.*; 
import org.apache.xerces.impl.io.*; 
import org.apache.jena.atlas.*; 
import javax.xml.stream.*; 
import arq.cmdline.*; 
import com.hp.hpl.jena.sparql.engine.main.iterator.*; 
import com.hp.hpl.jena.sdb.exprmatch.*; 
import com.hp.hpl.jena.sparql.sse.lang.parser.*; 
import com.hp.hpl.jena.sparql.path.eval.*; 
import org.apache.log4j.lf5.viewer.configure.*; 
import org.w3c.dom.events.*; 
import com.hp.hpl.jena.rdf.arp.lang.*; 
import org.apache.log4j.or.sax.*; 
import com.hp.hpl.jena.*; 
import org.openjena.riot.*; 
import com.hp.hpl.jena.mem.*; 
import com.hp.hpl.jena.sparql.util.graph.*; 
import com.hp.hpl.jena.assembler.*; 
import com.fasterxml.jackson.databind.annotation.*; 
import org.apache.xmlcommons.*; 
import org.apache.http.auth.*; 
import com.hp.hpl.jena.sparql.sse.builders.*; 
import com.hp.hpl.jena.sparql.engine.binding.*; 
import org.apache.http.client.utils.*; 
import org.slf4j.impl.*; 
import com.hp.hpl.jena.sparql.function.*; 
import javax.xml.stream.util.*; 
import com.hp.hpl.jena.rdf.listeners.*; 
import com.hp.hpl.jena.shared.wg.*; 
import javax.xml.datatype.*; 
import org.apache.jena.riot.process.inf.*; 
import com.hp.hpl.jena.sparql.pfunction.*; 
import com.hp.hpl.jena.shared.impl.*; 
import org.apache.html.dom.*; 
import com.hp.hpl.jena.sparql.procedure.*; 
import com.hp.hpl.jena.sparql.expr.nodevalue.*; 
import org.apache.log4j.lf5.*; 
import org.apache.commons.codec.language.bm.*; 
import com.fasterxml.jackson.databind.ext.*; 
import com.hp.hpl.jena.sdb.engine.*; 
import com.hp.hpl.jena.sparql.algebra.op.*; 
import org.apache.jena.riot.checker.*; 
import com.hp.hpl.jena.sdb.layout2.*; 
import com.hp.hpl.jena.sdb.layout1.*; 
import com.fasterxml.jackson.databind.exc.*; 
import com.hp.hpl.jena.sparql.path.*; 
import org.apache.http.conn.*; 
import com.hp.hpl.jena.tdb.base.page.*; 
import org.apache.jena.atlas.lib.cache.*; 
import org.apache.xerces.jaxp.*; 
import org.apache.http.impl.entity.*; 
import javax.xml.transform.*; 
import org.apache.xerces.impl.xpath.*; 
import com.hp.hpl.jena.tdb.store.bulkloader2.*; 
import org.apache.jena.riot.out.*; 
import com.hp.hpl.jena.rdf.model.impl.*; 
import org.w3c.dom.html.*; 
import com.fasterxml.jackson.databind.*; 
import com.hp.hpl.jena.sparql.engine.optimizer.*; 
import com.hp.hpl.jena.util.iterator.*; 
import com.hp.hpl.jena.util.*; 
import com.hp.hpl.jena.sparql.*; 
import org.apache.http.pool.*; 
import com.hp.hpl.jena.reasoner.rulesys.builtins.*; 
import org.w3c.dom.views.*; 
import tdb.cmdline.*; 
import org.apache.log4j.or.*; 
import com.fasterxml.jackson.databind.ser.impl.*; 
import org.apache.http.impl.client.cache.ehcache.*; 
import com.fasterxml.jackson.databind.deser.*; 
import org.apache.jena.atlas.io.*; 
import com.hp.hpl.jena.sparql.mgt.*; 
import com.github.jsonldjava.core.*; 
import org.apache.jena.atlas.iterator.*; 
import com.hp.hpl.jena.sparql.graph.*; 
import org.apache.xerces.impl.dv.*; 
import org.apache.log4j.varia.*; 
import com.fasterxml.jackson.databind.module.*; 
import org.apache.http.conn.ssl.*; 
import org.apache.log4j.*; 
import com.hp.hpl.jena.sparql.sse.*; 
import com.hp.hpl.jena.reasoner.transitiveReasoner.*; 
import org.apache.xerces.jaxp.datatype.*; 
import org.apache.http.client.entity.*; 
import org.apache.log4j.nt.*; 
import com.hp.hpl.jena.shared.*; 
import com.hp.hpl.jena.sparql.modify.*; 
import com.hp.hpl.jena.reasoner.rulesys.impl.*; 
import org.apache.http.impl.cookie.*; 
import com.hp.hpl.jena.n3.*; 
import org.apache.http.params.*; 
import org.apache.jena.atlas.web.auth.*; 
import org.apache.log4j.jmx.*; 
import com.hp.hpl.jena.xmloutput.*; 
import com.hp.hpl.jena.n3.turtle.*; 
import org.apache.xerces.impl.xs.traversers.*; 
import com.fasterxml.jackson.databind.jsonFormatVisitors.*; 
import org.apache.http.conn.util.*; 
import com.hp.hpl.jena.tdb.index.factories.*; 
import org.apache.http.impl.auth.*; 
import org.apache.jena.riot.*; 
import com.fasterxml.jackson.databind.util.*; 
import com.hp.hpl.jena.sparql.algebra.table.*; 
import com.hp.hpl.jena.tdb.migrate.*; 
import com.hp.hpl.jena.shared.uuid.*; 
import org.apache.xerces.impl.*; 
import com.hp.hpl.jena.sparql.lang.arq.*; 
import org.apache.http.cookie.*; 
import com.hp.hpl.jena.tdb.sys.*; 
import com.fasterxml.jackson.core.io.*; 
import org.apache.jena.atlas.web.*; 
import org.apache.jena.riot.tokens.*; 
import org.apache.jena.common.*; 
import com.hp.hpl.jena.tdb.modify.*; 
import org.w3c.dom.xpath.*; 
import com.hp.hpl.jena.query.*; 
import org.apache.commons.codec.binary.*; 
import org.apache.http.io.*; 
import org.apache.http.message.*; 
import com.hp.hpl.jena.tdb.solver.stats.*; 
import com.hp.hpl.jena.tdb.base.record.*; 
import org.apache.xerces.xinclude.*; 
import org.apache.xerces.impl.xs.opti.*; 
import com.hp.hpl.jena.sparql.vocabulary.*; 
import org.apache.log4j.pattern.*; 
import org.apache.jena.web.*; 
import com.hp.hpl.jena.tdb.base.file.*; 
import org.xml.sax.helpers.*; 
import org.apache.jena.iri.*; 
import org.apache.http.annotation.*; 
import com.hp.hpl.jena.tdb.*; 
import com.hp.hpl.jena.datatypes.*; 
import org.apache.http.impl.conn.*; 
import com.fasterxml.jackson.databind.ser.*; 
import com.hp.hpl.jena.sparql.function.user.*; 
import org.apache.xerces.xpointer.*; 
import com.hp.hpl.jena.sdb.store.*; 
import org.w3c.dom.bootstrap.*; 
import org.apache.xerces.stax.events.*; 
import com.fasterxml.jackson.databind.cfg.*; 
import com.hp.hpl.jena.tdb.index.ext.*; 
import com.hp.hpl.jena.rdf.arp.*; 
import com.hp.hpl.jena.sparql.engine.optimizer.reorder.*; 
import com.hp.hpl.jena.sparql.sse.lang.*; 
import org.apache.http.impl.pool.*; 
import com.hp.hpl.jena.sparql.engine.iterator.*; 
import org.apache.xerces.jaxp.validation.*; 
import com.hp.hpl.jena.sparql.lib.*; 
import com.hp.hpl.jena.tdb.base.block.*; 
import org.apache.xerces.impl.xs.*; 
import org.apache.jena.atlas.logging.java.*; 
import tdb.*; 
import javax.xml.transform.stax.*; 
import com.hp.hpl.jena.datatypes.xsd.impl.*; 
import org.slf4j.spi.*; 
import org.apache.xerces.xni.parser.*; 
import org.apache.xerces.impl.xpath.regex.*; 
import com.github.jsonldjava.utils.*; 
import org.apache.xerces.impl.xs.models.*; 
import com.hp.hpl.jena.sparql.sse.writers.*; 
import com.hp.hpl.jena.reasoner.*; 
import org.apache.log4j.lf5.util.*; 
import com.hp.hpl.jena.rdf.arp.impl.*; 
import org.apache.jena.atlas.json.io.*; 
import org.w3c.dom.ranges.*; 
import com.hp.hpl.jena.sdb.layout2.index.*; 
import org.apache.log4j.chainsaw.*; 
import com.fasterxml.jackson.databind.jsontype.*; 
import com.hp.hpl.jena.vocabulary.*; 
import org.apache.commons.codec.*; 
import org.apache.xerces.impl.xs.identity.*; 
import com.hp.hpl.jena.sparql.function.library.leviathan.*; 
import org.xml.sax.*; 
import com.hp.hpl.jena.sparql.procedure.library.*; 
import org.apache.http.conn.routing.*; 
import com.hp.hpl.jena.tdb.solver.*; 
import com.hp.hpl.jena.sparql.modify.request.*; 
import com.hp.hpl.jena.sdb.graph.*; 
import javax.xml.parsers.*; 
import jena.cmdline.*; 
import com.fasterxml.jackson.core.format.*; 
import com.hp.hpl.jena.tdb.base.*; 
import riotcmd.*; 
import com.fasterxml.jackson.databind.jsontype.impl.*; 
import org.apache.http.client.methods.*; 
import org.apache.jena.atlas.test.*; 
import org.apache.http.impl.*; 
import com.hp.hpl.jena.rdf.model.*; 
import org.slf4j.*; 
import com.hp.hpl.jena.sdb.script.*; 
import com.hp.hpl.jena.tdb.mgt.*; 
import com.hp.hpl.jena.sdb.compiler.*; 
import com.hp.hpl.jena.rdf.arp.states.*; 
import org.apache.commons.logging.*; 
import org.apache.http.client.params.*; 
import com.hp.hpl.jena.sdb.assembler.*; 
import com.hp.hpl.jena.update.*; 
import com.fasterxml.jackson.databind.ser.std.*; 
import org.apache.jena.atlas.json.*; 
import org.apache.http.auth.params.*; 
import org.apache.log4j.net.*; 
import org.apache.wml.*; 
import com.hp.hpl.jena.datatypes.xsd.*; 
import com.hp.hpl.jena.sparql.util.*; 
import com.fasterxml.jackson.databind.type.*; 
import com.fasterxml.jackson.databind.introspect.*; 
import org.apache.commons.logging.impl.*; 
import org.apache.xerces.impl.msg.*; 
import org.apache.http.cookie.params.*; 
import com.hp.hpl.jena.sdb.*; 
import com.hp.hpl.jena.sparql.engine.index.*; 
import com.hp.hpl.jena.util.cache.*; 
import org.apache.jena.riot.system.*; 
import com.hp.hpl.jena.assembler.exceptions.*; 
import org.apache.wml.dom.*; 
import org.w3c.dom.css.*; 
import com.fasterxml.jackson.core.util.*; 
import org.apache.xerces.dom3.as.*; 
import com.hp.hpl.jena.sparql.engine.*; 
import com.fasterxml.jackson.annotation.*; 
import org.apache.jena.riot.process.normalize.*; 
import com.hp.hpl.jena.sparql.core.*; 
import com.hp.hpl.jena.xmloutput.impl.*; 
import org.apache.jena.iri.impl.*; 
import com.hp.hpl.jena.tdb.nodetable.*; 
import com.hp.hpl.jena.sparql.engine.ref.*; 
import com.hp.hpl.jena.graph.*; 
import arq.*; 
import com.hp.hpl.jena.assembler.assemblers.*; 
import com.fasterxml.jackson.databind.node.*; 
import com.hp.hpl.jena.sparql.resultset.*; 
import org.apache.log4j.rewrite.*; 
import com.hp.hpl.jena.sparql.core.assembler.*; 
import com.hp.hpl.jena.tdb.transaction.*; 
import org.apache.http.concurrent.*; 
import org.apache.xerces.xni.grammars.*; 
import com.hp.hpl.jena.ontology.*; 
import jena.*; 
import sdb.*; 
import com.fasterxml.jackson.databind.deser.impl.*; 
import com.hp.hpl.jena.n3.turtle.parser.*; 
import com.hp.hpl.jena.tdb.base.recordbuffer.*; 
import com.hp.hpl.jena.sdb.shared.*; 
import org.w3c.dom.*; 
import org.apache.xerces.impl.validation.*; 
import com.hp.hpl.jena.sparql.syntax.*; 
import org.apache.jena.atlas.json.io.parser.*; 
import org.apache.xerces.stax.*; 
import org.apache.jena.atlas.json.io.parserjavacc.javacc.*; 
import org.apache.http.conn.scheme.*; 
import javax.xml.stream.events.*; 
import org.apache.xerces.util.*; 
import com.hp.hpl.jena.graph.impl.*; 
import org.apache.xerces.impl.xs.util.*; 
import org.apache.log4j.jdbc.*; 
import com.hp.hpl.jena.sparql.lang.sparql_11.*; 
import com.hp.hpl.jena.sparql.lang.sparql_10.*; 
import org.apache.log4j.xml.*; 
import com.hp.hpl.jena.sparql.expr.*; 
import com.github.jsonldjava.impl.*; 
import com.hp.hpl.jena.sdb.compiler.rewrite.*; 
import sdb.cmd.*; 
import javax.xml.transform.sax.*; 
import com.hp.hpl.jena.sdb.sql.*; 
import com.hp.hpl.jena.sdb.modify.*; 
import org.apache.xerces.parsers.*; 
import com.hp.hpl.jena.tdb.lib.*; 
import com.hp.hpl.jena.sdb.util.*; 
import org.apache.jena.riot.stream.*; 
import com.hp.hpl.jena.ontology.impl.*; 
import javax.xml.namespace.*; 
import org.apache.http.*; 
import com.hp.hpl.jena.sparql.lang.*; 
import tdb.tools.*; 
import com.hp.hpl.jena.tdb.base.buffer.*; 
import org.apache.http.client.protocol.*; 
import org.apache.jena.atlas.csv.*; 
import org.apache.xerces.xs.datatypes.*; 
import org.apache.jena.atlas.event.*; 
import org.apache.http.impl.client.cache.*; 
import com.hp.hpl.jena.tdb.store.*; 
import org.apache.jena.atlas.logging.*; 
import com.hp.hpl.jena.enhanced.*; 
import org.apache.http.impl.client.*; 
import com.hp.hpl.jena.sdb.core.*; 
import com.hp.hpl.jena.tdb.index.*; 
import com.hp.hpl.jena.sdb.core.sqlexpr.*; 
import com.hp.hpl.jena.sparql.core.describe.*; 
import com.hp.hpl.jena.sparql.serializer.*; 
import org.slf4j.helpers.*; 
import com.hp.hpl.jena.tdb.base.objectfile.*; 
import org.apache.jena.riot.web.*; 
import com.hp.hpl.jena.tdb.assembler.*; 
import com.hp.hpl.jena.sdb.layout2.expr.*; 
import org.apache.jena.atlas.json.io.parserjavacc.*; 
import com.hp.hpl.jena.sparql.pfunction.library.*; 
import org.apache.xml.serialize.*; 
import org.apache.xerces.impl.dtd.*; 
import com.hp.hpl.jena.sparql.algebra.*; 
import org.apache.http.client.*; 
import org.apache.http.impl.io.*; 
import org.apache.log4j.or.jms.*; 
import org.apache.http.conn.params.*; 
import org.apache.xerces.xni.*; 
import com.fasterxml.jackson.core.sym.*; 
import org.w3c.dom.ls.*; 
import org.apache.http.impl.conn.tsccm.*; 
import org.apache.commons.codec.digest.*; 
import org.apache.commons.codec.net.*; 
import org.apache.xerces.dom.*; 
import com.fasterxml.jackson.core.json.*; 
import org.apache.log4j.spi.*; 
import org.apache.jena.riot.other.*; 
import org.w3c.dom.stylesheets.*; 
import com.fasterxml.jackson.databind.deser.std.*; 
import arq.cmd.*; 
import com.hp.hpl.jena.graph.compose.*; 
import org.apache.commons.codec.language.*; 
import javax.xml.*; 
import com.fasterxml.jackson.core.*; 
import com.hp.hpl.jena.sdb.print.*; 
import com.hp.hpl.jena.tdb.graph.*; 
import org.apache.log4j.lf5.viewer.*; 
import org.apache.xerces.xs.*; 
import org.apache.http.entity.*; 
import org.w3c.dom.traversal.*; 
import com.fasterxml.jackson.core.type.*; 
import com.hp.hpl.jena.sparql.engine.http.*; 
import com.hp.hpl.jena.reasoner.rulesys.*; 
import org.apache.jena.atlas.lib.*; 
import org.apache.jena.riot.writer.*; 
import com.hp.hpl.jena.tdb.store.bulkloader.*; 
import javax.xml.transform.stream.*; 
import javax.xml.xpath.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Coolitude4Visu0018 extends PApplet {














// Need G4P library


//JAVA



//JENA









//toxics







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
    println("physics n'est pas pr\u00eat :"+e.getMessage());
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

public void fileSelected(File selection) {
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
class OutilBox {

  OutilBox() {
  } 


  public OntModel chargeFichier(String _fichier) {
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

  public void selectFichier() {
    selectInput("Selectionnez une ontologie \u00e0 charger:", "fileSelected");
  }

  public void fileSelected(File selection) {
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
      model.add(model2);// rremplissage de model avec les donn\u00e9es charg\u00e9es
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
  public void initialiseCentre() {
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
    VerletSpring2D springLoupe=new VerletSpring2D(centre, loupe, 80, 0.001f);
    physics.addSpring(springLoupe);
    AttractionBehavior rayonLoupe=new AttractionBehavior(loupe, 100, -10);
    physics.addBehavior(rayonLoupe );
  }
  
  
            public void afficheVisu(OntModel _model){
              OntModel ontModel=_model;
              reloadVisualisation();
              
              
              
              
            }
  
  
  
  public void reloadVisualisation() {
  ResIterator resources=model.listSubjects(); 
  while (resources.hasNext ()) {
    Resource resource=resources.nextResource();
    println(resource);
    Particle particleResource=new Particle(random(width), random(height));
    physics.addParticle(particleResource);
    particleResource.setResource(resource);
    particleResource.setType("sujet");
    particleResource.setCouleur(color(0xff1F7b9b));
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
  
  
  
  
  
  
  
  
  
  
  public void traitement(OntModel _model) {
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
      VerletSpring2D springCentre=new VerletSpring2D(classe, centre, height/2-40, 0.001f);
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
      VerletSpring2D springIndivCentre=new VerletSpring2D(individuel, centre, height/4-20, 0.001f);
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

  public void findSujets(OntModel _model) {
    ResIterator sujets=_model.listSubjects();
    while (sujets.hasNext ()) {
      Resource sujet=sujets.next();
      Particle sujetParticle=new Particle(random(width), random(height));
      physics.addParticle(sujetParticle);
      sujetParticle.resource=sujet;
      sujetParticle.couleur=color(0xff1F7b9b);
      sujetParticle.type="individuel";
      sujetParticle.taille=20;
      AttractionBehavior resourceVital=new AttractionBehavior(sujetParticle, sujetParticle.taille+5, -3);
      physics.addBehavior(resourceVital );
      VerletSpring2D springResCentre=new VerletSpring2D(sujetParticle, centre, 200, 0.0001f);
      physics.addSpring(springResCentre);
    }
    findConnexions=true;
    /* StmtIterator statements=_model.listStatements();
     while (statements.hasNext ()) {
     Statement stmt      = statements.nextStatement();
     
     println(stmt);
     }*/
  }
  public void findConnexions(OntModel _model) {
    println("FIND CONNEXIONS");
    StmtIterator statements = model.listStatements();
    while (statements.hasNext ()) {
      Particle origine=null;
      Particle destination=null;
      Statement stmt      = statements.nextStatement();  // obtenir la prochaine d\u00e9claration
      Resource  subject   = stmt.getSubject();     // obtenir le sujet
      Property  predicate = stmt.getPredicate();   // obtenir le pr\u00e9dicat
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
            // println("PB? j'aurais d\u00fb trouver le sujet "+sRecherche.resource.toString()+" "+subject.toString());
          }
        }
        catch(Exception e) {
          println("Pas de resource pour cette particle? un blank_node? "+subject+" "+e.getMessage());
        }
        if (!sujetExiste) {
          println("cr\u00e9ation du sujet "+subject);
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
          println("je la cr\u00e9\u00e9");
          destination=createRDFNodeParticle(objetR);
        }
      } else {
        // l'objet est un litt\u00e9ral
        objetString= "\"" + object.toString() + "\"";
        destination=createLiteralParticle(objetString);
      }
      println(objetString);
      if ((origine!=null)&&(destination!=null)) {
        VerletSpring2D springSujetObjet=new VerletSpring2D(origine, destination, 50, 0.0001f);
        physics.addSpring(springSujetObjet);
      }
    }
  }

  public Particle createRDFNodeParticle(Resource _resource) {
    Resource resource=_resource;
    Particle RDFNodeParticle=new Particle(random(width), random(height));
    physics.addParticle(RDFNodeParticle);
    RDFNodeParticle.resource=resource;
    RDFNodeParticle.couleur=color(200, 200, 0);
    RDFNodeParticle.type="rdfnode";
    RDFNodeParticle.taille=20;
    AttractionBehavior RDFNodeParticleVital=new AttractionBehavior(RDFNodeParticle, RDFNodeParticle.taille+5, -3);
    physics.addBehavior(RDFNodeParticleVital );
    VerletSpring2D springRDFNodeParticleCentre=new VerletSpring2D(RDFNodeParticle, centre, 800, 0.0001f);
    physics.addSpring(springRDFNodeParticleCentre);
    return RDFNodeParticle;
  }
  public Particle createSujetParticle(Resource _resource) {
    Resource resource=_resource;
    Particle SujetParticle=new Particle(random(width), random(height));
    physics.addParticle(SujetParticle);
    SujetParticle.resource=resource;
    SujetParticle.couleur=color(0, 200, 0);
    SujetParticle.type="sujet";
    SujetParticle.taille=10;
    AttractionBehavior SujetParticleVital=new AttractionBehavior(SujetParticle, SujetParticle.taille+5, -3);
    physics.addBehavior(SujetParticleVital );
    VerletSpring2D springSujetParticleCentre=new VerletSpring2D(SujetParticle, centre, 800, 0.0001f);
    physics.addSpring(springSujetParticleCentre);
    return SujetParticle;
  }


  public Particle createLiteralParticle(String  _literal) {
    String literal=_literal;
    Particle literalParticle=new Particle(random(width), random(height));
    physics.addParticle(literalParticle);
    literalParticle.texte=literal;
    literalParticle.resource=null;
    literalParticle.couleur=color(0xffCC00CC);
    literalParticle.type="literal";
    literalParticle.taille=5;
    AttractionBehavior literalVital=new AttractionBehavior(literalParticle, literalParticle.taille+5, -3);
    physics.addBehavior(literalVital );
    VerletSpring2D springLiteralCentre=new VerletSpring2D(literalParticle, centre, width/2, 0.0001f);
    physics.addSpring(springLiteralCentre);
    return literalParticle;
  }

  public void createSprings() {
    int i=0;
    StmtIterator statements=model.listStatements();
    while (statements.hasNext ()) {

      Particle origine=centre;
      Particle destination=centre;
      Statement stmt      = statements.nextStatement();  // obtenir la prochaine d\u00e9claration
      Resource  subject   = stmt.getSubject();     // obtenir le sujet
      Property  predicate = stmt.getPredicate();   // obtenir le pr\u00e9dicat
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
        // l'objet est un litt\u00e9ral
        objetString= "\"" + object.toString() + "\"";
      }
      //test pour voir si sujet et objet on d\u00e9j\u00e0 \u00e9t\u00e9s cr\u00e9\u00e9s
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
           println ("trouv\u00e9 "+p.resource.getLocalName().toString());
           
           }else{
           print("."); 
           }*/
        }
        try {


          VerletSpring2D springStatement=new VerletSpring2D(origine, destination, 10, 0.1f);
          physics.addSpring(springStatement);
        }
        catch(Exception e) {
          println(e.getMessage());
        }
      }
    }
  }


  public void initialisePhysics() {
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
public void mousePressed() { 
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
public void keyPressed() {
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
public void mouseDragged() { 
  if (selected!=null) {  
    if (selected==loupe) {
      centre.lock();
    }
    selected.set(mouseX, mouseY);
  }
} 

// if we had a selected particle unlock it again and kill reference 
public void mouseReleased() { 
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
class Particle extends VerletParticle2D {

  int taille=10;
  int couleur=color(200, 200, 200);
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
  public void display() {
    this.scaleVelocity(0.9f);
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

  public void setResource(Resource _resource) {
    this.resource=_resource;
  }
  public void setCouleur(int _couleur) {
    this.couleur=_couleur;
  }
  public void setObjetobjetRDFNode(RDFNode _objetRDFNode) {
    objetRDFNode=_objetRDFNode;
  }
  public void setObjetobjetString(Literal _objetLiteral) {
    objetLiteral=_objetLiteral;
  }
  public void setText(String _texte) {

    this.texte=_texte;
  }
  public void setType(String _type) {
    this.type=_type;
  }
  /*  void createSpring() {
   StmtIterator statements=model.listStatements((Resource)this.resource, null, (RDFNode)null);
   while (statements.hasNext ()) {
   Statement stmt      = statements.nextStatement();
   //  println(stmt);
   Property  predicate = stmt.getPredicate();   // obtenir le pr\u00e9dicat
   RDFNode   object    = stmt.getObject();
   
   if (object.isResource()) {
   
   if (model.contains(object.asResource(), null, (RDFNode)null)) { // voir si notre objet est aussi un sujet --> du coup , on ne l'aoute pas
   String objetString=object.asResource().getLocalName().toString();
   // println("trouv\u00e9"+ objetString);
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
   //  println("###################pastrouv\u00e9");
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
  public void setSprings() {
    statements=model.listStatements((Resource)resource, null, (RDFNode)null);
    while (statements.hasNext ()) {
      Statement stmt      = statements.nextStatement();
      println(stmt);
      Property  predicate = stmt.getPredicate();   // obtenir le pr\u00e9dicat
      RDFNode   object    = stmt.getObject();
      if (object.isResource()) {
        if (model.contains(null, null, object)) {
          println(object+"existe d\u00e9j\u00e0 en RDFNode");
          ///
          println("trouv\u00e9"+ object.toString());
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



          if (model.contains(object.asResource(), null, (RDFNode)null)) { // voir si notre objet est aussi un sujet --> du coup , on ne l'aoute pas mais il ne faut pas non plus l'ajouter si c'est d\u00e9j\u00e0 un RDFNode
            println("trouv\u00e9"+ object.asResource().getLocalName().toString());
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
                AttractionBehavior espacement=new AttractionBehavior(this, taille*1.5f, -10);
                physics.addBehavior(espacement );
                p.setCouleur(color(200, 25, 200));
              }
            }
          } else {
            // println("###################pastrouv\u00e9");
            Particle objetRDFNode=new Particle(this.x-1, this.y-1);
            physics.addParticle(objetRDFNode);
            VerletSpring2D springRDFNode=new VerletSpring2D(this, objetRDFNode, (this.taille+objetRDFNode.taille), 0.1f);     
            physics.addSpring(springRDFNode);
            VerletSpring2D springRDFNodeCentreP1=new VerletSpring2D(centre, objetRDFNode, height/2, 0.0001f);      
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
        VerletSpring2D springLiteral=new VerletSpring2D(this, objetLiteral, (this.taille+objetLiteral.taille), 0.01f);      
        physics.addSpring(springLiteral);
        AttractionBehavior espacementLiteral=new AttractionBehavior(objetLiteral, taille, -10);
        physics.addBehavior(espacementLiteral );
        VerletSpring2D springLiteralCentreP1=new VerletSpring2D(centre, objetLiteral, height/2, 0.0001f);      
        physics.addSpring(springLiteralCentreP1);      
        objetLiteral.setText(object.toString());
        objetLiteral.setType("literal");
        objetLiteral.setCouleur(color(25, 200, 200));
      }
    }
  }
  public void updateSpringAttraction() {
    physics.removeBehavior(espacement) ;
    physics.removeSpring(springPredicate) ;
    springPredicate      =new VerletSpring2D(centre, this, (this.taille+centre.taille)*distanceRessort*distanceRessort, 0.001f*forceRessort*forceRessort);
    physics.addSpring(springPredicate);
    espacement=new AttractionBehavior(this, this.taille*2*distanceAttraction*distanceAttraction, -20*forceAttraction*forceAttraction);
    physics.addBehavior(espacement );
  }
}
/* =========================================================
 * ====                   WARNING                        ===
 * =========================================================
 * The code in this tab has been generated from the GUI form
 * designer and care should be taken when editing this file.
 * Only add/edit code inside the event handlers i.e. only
 * use lines between the matching comment tags. e.g.

 void myBtnEvents(GButton button) { //_CODE_:button1:12356:
     // It is safe to enter your event code here  
 } //_CODE_:button1:12356:
 
 * Do not rename this tab!
 * =========================================================
 */

public void panel1_Click1(GPanel source, GEvent event) { //_CODE_:panel1:512783:
  println("panel1 - GPanel event occured " + System.currentTimeMillis()%10000000 );
} //_CODE_:panel1:512783:

public void chargefichier_click1(GButton source, GEvent event) { //_CODE_:chargeficfier:395436:
  println("button1 - GButton event occured " + System.currentTimeMillis()%10000000 );
  selectInput("Select a file to process:", "fileSelected");
} //_CODE_:chargeficfier:395436:

public void urlEndpoint_change1(GTextField source, GEvent event) { //_CODE_:urlEndpoint:586046:
  println("textfield1 - GTextField event occured " + System.currentTimeMillis()%10000000 );
} //_CODE_:urlEndpoint:586046:

public void chargeUrl_click(GButton source, GEvent event) { //_CODE_:chargeUrl:578594:
  println("chargeUrl - GButton event occured " + System.currentTimeMillis()%10000000 );
  println("connexion :"+urlEndpoint.getText());
  accessor = DatasetAccessorFactory.createHTTP(urlEndpoint.getText());
  model.add(updated);
//  outilBox.traitement(model);
//  outilBox.findSujets(model);
  outilBox.afficheVisu(model);
//  model.write(System.out, "RDF/XML-ABBREV");
} //_CODE_:chargeUrl:578594:

public void clear_click1(GButton source, GEvent event) { //_CODE_:clear:961854:
  println("clear - GButton event occured " + System.currentTimeMillis()%10000000 );
  model = ModelFactory.createOntologyModel( OntModelSpec.OWL_DL_MEM );
  outilBox.initialisePhysics();
  outilBox.initialiseCentre();
} //_CODE_:clear:961854:

public void LiteralCheckBox_clicked1(GCheckbox source, GEvent event) { //_CODE_:LiteralCheckBox:871673:
  println("afficheLiteral - GCheckbox event occured " + System.currentTimeMillis()%10000000 );
  afficheLiteral=source.isSelected();
  println(source.isSelected());
} //_CODE_:LiteralCheckBox:871673:

public void distanceRessortSlider_change1(GSlider source, GEvent event) { //_CODE_:distanceRessortSlider:205478:
  println("distanceSlider - GSlider event occured " + System.currentTimeMillis()%10000000 );
  distanceRessort=source.getValueF();
} //_CODE_:distanceRessortSlider:205478:

public void forceRessortSlider_change1(GSlider source, GEvent event) { //_CODE_:forceRessortSlider:654297:
  println("attractionSlider - GSlider event occured " + System.currentTimeMillis()%10000000 );
  forceRessort=source.getValueF();
} //_CODE_:forceRessortSlider:654297:

public void forceAttractionSlider_change1(GCustomSlider source, GEvent event) { //_CODE_:forceAttractionSlider:987695:
  println("forceAttractionSlider - GCustomSlider event occured " + System.currentTimeMillis()%10000000 );
  forceAttraction=source.getValueF();
} //_CODE_:forceAttractionSlider:987695:

public void distanceAttractSlider_change1(GCustomSlider source, GEvent event) { //_CODE_:distanceAttractSlider:336813:
  println("distanceAttractSlider - GCustomSlider event occured " + System.currentTimeMillis()%10000000 );
  distanceAttraction=source.getValueF();
} //_CODE_:distanceAttractSlider:336813:



// Create all the GUI controls. 
// autogenerated do not edit
public void createGUI(){
  G4P.messagesEnabled(false);
  G4P.setGlobalColorScheme(GCScheme.BLUE_SCHEME);
  G4P.setCursor(ARROW);
  if(frame != null)
    frame.setTitle("Sketch Window");
  panel1 = new GPanel(this, 27, 22, 323, 277, "Tab bar text");
  panel1.setText("Tab bar text");
  panel1.setOpaque(true);
  panel1.addEventHandler(this, "panel1_Click1");
  chargeficfier = new GButton(this, 8, 24, 80, 30);
  chargeficfier.setText("charge fichier");
  chargeficfier.addEventHandler(this, "chargefichier_click1");
  urlEndpoint = new GTextField(this, 7, 65, 222, 30, G4P.SCROLLBARS_NONE);
  urlEndpoint.setText("http://fuseki-smag0.rhcloud.com/ds/data");
  urlEndpoint.setOpaque(true);
  urlEndpoint.addEventHandler(this, "urlEndpoint_change1");
  chargeUrl = new GButton(this, 234, 68, 80, 30);
  chargeUrl.setText("Charge Url");
  chargeUrl.addEventHandler(this, "chargeUrl_click");
  clear = new GButton(this, 103, 24, 80, 30);
  clear.setText("Clear");
  clear.addEventHandler(this, "clear_click1");
  LiteralCheckBox = new GCheckbox(this, 13, 120, 120, 20);
  LiteralCheckBox.setTextAlign(GAlign.LEFT, GAlign.MIDDLE);
  LiteralCheckBox.setText("Affiche Literal");
  LiteralCheckBox.setOpaque(false);
  LiteralCheckBox.addEventHandler(this, "LiteralCheckBox_clicked1");
  label1 = new GLabel(this, 6, 99, 312, 20);
  label1.setText("-----------------------------");
  label1.setOpaque(false);
  distanceRessortSlider = new GSlider(this, 17, 166, 100, 40, 10.0f);
  distanceRessortSlider.setShowValue(true);
  distanceRessortSlider.setLimits(1.0f, 0.0f, 2.0f);
  distanceRessortSlider.setNumberFormat(G4P.DECIMAL, 2);
  distanceRessortSlider.setOpaque(true);
  distanceRessortSlider.addEventHandler(this, "distanceRessortSlider_change1");
  forceRessortSlider = new GSlider(this, 13, 233, 100, 40, 10.0f);
  forceRessortSlider.setShowValue(true);
  forceRessortSlider.setLimits(1.0f, 0.0f, 2.0f);
  forceRessortSlider.setNumberFormat(G4P.DECIMAL, 2);
  forceRessortSlider.setOpaque(true);
  forceRessortSlider.addEventHandler(this, "forceRessortSlider_change1");
  distanceRessortLbl = new GLabel(this, 15, 143, 99, 20);
  distanceRessortLbl.setText("Distance ressort");
  distanceRessortLbl.setOpaque(false);
  forceRessortLbl = new GLabel(this, 25, 209, 80, 20);
  forceRessortLbl.setText("Force ressort");
  forceRessortLbl.setOpaque(false);
  distanceAttracLbl = new GLabel(this, 130, 147, 105, 20);
  distanceAttracLbl.setText("Distance attraction");
  distanceAttracLbl.setOpaque(false);
  forceAttracLbl = new GLabel(this, 127, 210, 111, 20);
  forceAttracLbl.setText("Force attraction");
  forceAttracLbl.setOpaque(false);
  forceAttractionSlider = new GCustomSlider(this, 132, 232, 100, 40, "grey_blue");
  forceAttractionSlider.setLimits(0.5f, 0.0f, 1.0f);
  forceAttractionSlider.setNumberFormat(G4P.DECIMAL, 2);
  forceAttractionSlider.setOpaque(false);
  forceAttractionSlider.addEventHandler(this, "forceAttractionSlider_change1");
  distanceAttractSlider = new GCustomSlider(this, 129, 166, 100, 40, "grey_blue");
  distanceAttractSlider.setLimits(1.0f, 0.0f, 2.0f);
  distanceAttractSlider.setNumberFormat(G4P.DECIMAL, 0);
  distanceAttractSlider.setOpaque(true);
  distanceAttractSlider.addEventHandler(this, "distanceAttractSlider_change1");
  panel1.addControl(chargeficfier);
  panel1.addControl(urlEndpoint);
  panel1.addControl(chargeUrl);
  panel1.addControl(clear);
  panel1.addControl(LiteralCheckBox);
  panel1.addControl(label1);
  panel1.addControl(distanceRessortSlider);
  panel1.addControl(forceRessortSlider);
  panel1.addControl(distanceRessortLbl);
  panel1.addControl(forceRessortLbl);
  panel1.addControl(distanceAttracLbl);
  panel1.addControl(forceAttracLbl);
  panel1.addControl(forceAttractionSlider);
  panel1.addControl(distanceAttractSlider);
}

// Variable declarations 
// autogenerated do not edit
GPanel panel1; 
GButton chargeficfier; 
GTextField urlEndpoint; 
GButton chargeUrl; 
GButton clear; 
GCheckbox LiteralCheckBox; 
GLabel label1; 
GSlider distanceRessortSlider; 
GSlider forceRessortSlider; 
GLabel distanceRessortLbl; 
GLabel forceRessortLbl; 
GLabel distanceAttracLbl; 
GLabel forceAttracLbl; 
GCustomSlider forceAttractionSlider; 
GCustomSlider distanceAttractSlider; 
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Coolitude4Visu0018" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
