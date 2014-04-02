package DefaultPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class FullSpellList extends spellRepertoire {
	
	ArrayList<Spell>[] spellList;
	
	public FullSpellList() throws ClassNotFoundException{
		super.spellList = parse();
		super.name = "FullSpellList";
		//this works
	}
	
	public static ArrayList<Spell>[] parse() {
		ArrayList<Spell>[] spells = new ArrayList[10];
		for(int i = 0; i < 10; i++){
			spells[i] = new ArrayList<Spell>();
			}
		try {
			File spellFile = new File("spells/spell.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(spellFile);
			doc.getDocumentElement().normalize();

//			System.out.println("root of xml file" + doc.getDocumentElement().getNodeName());
			NodeList nodes = doc.getElementsByTagName("spell");
//			System.out.println("Start assinging");

			for (int i = 0; i < nodes.getLength(); i++) {
				Node node = nodes.item(i);
				Spell spell = new Spell();
				
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) node;
					spell.setName(getValue("name", element));
					spell.setAltName(getValue("altname", element));
					spell.setSchool(getValue("school", element));
					spell.setSubSchool(getValue("subschool", element));
					spell.setDescriptor(getValue("descriptor", element));
					spell.setLevel(getValue("level", element));
					spell.setComponents(getValue("components", element));
					spell.setCastingTime(getValue("casting_time", element));
					spell.setRange(getValue("range", element));
					spell.setTarget(getValue("target", element));
					spell.setArea(getValue("area", element));
					spell.setDuration(getValue("duration", element));
					spell.setSavingThrow(getValue("saving_throw", element));
					spell.setSpellResistance(getValue("spell_resistance", element));
					spell.setDescription(getValue("description", element));
					spell.setReference(getValue("reference", element));
					
				}
				ArrayList<Spell> firstArray = spells[0];
				firstArray.add(spell);
			}
		
					

//					
//					
//					int index = Integer.parseInt(spell.getLevel());
//					
//					spells[index].add(spell);
				
//			System.out.println("Done assinging");
			
//			for(ArrayList<Spell> lvlSpells: spells){
//				for(Spell s : lvlSpells){
//					System.out.println(s.getName());
//					System.out.println(s.getAltName());
//					System.out.println(s.getSchool());
//					System.out.println(s.getSubSchool());
//					System.out.println(s.getDescriptor());
//					System.out.println(s.getLevel());
//					System.out.println(s.getComponents());
//					System.out.println(s.getCastingTime());
//					System.out.println(s.getRange());
//					System.out.println(s.getTarget());
//					System.out.println(s.getArea());
//					System.out.println(s.getDuration());
//					System.out.println(s.getSavingThrow());
//					System.out.println(s.getSpellResistance());
//					System.out.println(s.getDescription());
//					System.out.println(s.getReference());
//					System.out.println("---------------------");
//				}
//			}
			
		} catch (Exception ex) { ex.printStackTrace();}
		
		return spells;
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
