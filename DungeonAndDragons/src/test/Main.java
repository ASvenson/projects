package test;
import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Main {

	public static void main(String args[]) {
		try {
			File spell = new File("spells/spell.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(spell);
			doc.getDocumentElement().normalize();

			System.out.println("root of xml file" + doc.getDocumentElement().getNodeName());
			NodeList nodes = doc.getElementsByTagName("spell");
			System.out.println("==========================");

			for (int i = 0; i < nodes.getLength(); i++) {
				Node node = nodes.item(i);

				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) node;
					System.out.println("Spell Name: " + getValue("name", element));
					System.out.println("Spell AltName: " + getValue("altname", element));
					System.out.println("Spell School: " + getValue("school", element));
					System.out.println("Spell Subschool: " + getValue("subschool", element));
					System.out.println("Spell Descriptor: " + getValue("descriptor", element));
					System.out.println("Spell Level: " + getValue("level", element));
					System.out.println("Spell Components: " + getValue("components", element));
					System.out.println("Spell Casting Time: " + getValue("casting_time", element));
					System.out.println("Spell Range: " + getValue("range", element));
					System.out.println("Spell Target: " + getValue("target", element));
					System.out.println("Spell Area: " + getValue("area", element));
					System.out.println("Spell Duration: " + getValue("duration", element));
					System.out.println("Spell Saving Throw: " + getValue("saving_throw", element));
					System.out.println("Spell Spell Resistance: " + getValue("p", element));
					System.out.println("Spell Description: " + getValue("p", element));
					System.out.println("Spell Reference: " + getValue("reference", element));
					System.out.println("---------------------");
				}
			}
		}
		
		catch (Exception ex) {ex.printStackTrace();}
	}
	

	private static String getValue(String tag, Element element) {
		try{
			NodeList nodes = element.getElementsByTagName(tag).item(0).getChildNodes();
			Node node = (Node) nodes.item(0);
			return node.getNodeValue();
		} catch(Exception e) {
			return "N/A";
		}
	}
}




