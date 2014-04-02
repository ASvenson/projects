package dom;
import javax.xml.parsers.DocumentBuilder; 
import javax.xml.parsers.DocumentBuilderFactory;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException; 
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.*

import java.io.File;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;
import org.w3c.dom.Entity;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class SpellParser {

	public SpellParser() {
		// TODO Auto-generated constructor stub
	}
	public void main(Document doc){
		
		doc.getDocumentElement().normalize();
		
		NodeList nodes = doc.getElementsByTagName("spell");
		System.out.println("==========================");
	
		for (int i = 0; i < nodes.getLength(); i++) {
			Node node = nodes.item(i);
	
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				System.out.println("Spell Name: " + getValue("name", element));
				System.out.println("Spell AltName: " + getValue("altname", element));
				System.out.println("Spell School: " + getValue("school", element));
				System.out.println("Spell Level: " + getValue("level", element));
				System.out.println("Spell Components: " + getValue("components", element));
				System.out.println("Spell Casting Time: " + getValue("casting_time", element));
				System.out.println("Spell Range: " + getValue("range", element));
				System.out.println("Spell Target: " + getValue("target", element));
				System.out.println("Spell Duration: " + getValue("duration", element));
				System.out.println("Spell Saving Throw: " + getValue("saving_throw", element));
				System.out.println("Spell Spell Resistance: " + getValue("p", element));
				System.out.println("Spell Description: " + getValue("p", element));
				System.out.println("---------------------");
			}
		}
	}
	
	catch (Exception ex) {ex.printStackTrace();}
	}
	
	
	private static String getValue(String tag, Element element) {
	NodeList nodes = element.getElementsByTagName(tag).item(0).getChildNodes();
	Node node = (Node) nodes.item(0);
	return node.getNodeValue();
	}

}
