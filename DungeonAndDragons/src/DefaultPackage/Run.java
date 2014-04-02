package DefaultPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
import java.util.ArrayList;
//import java.util.HashMap;





import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Run implements Serializable {
	
	FullSpellList fullSpellList;
	KnownSpells knownSpells;
	PrepSpells prepSpells;
	Player player;
	Wizard wizard;
	
	public Run() throws ClassNotFoundException{
		if(check("knownSpells")){
			readSaveFile("knownSpells");
		}else{
			knownSpells = new KnownSpells();
		}
		
		if(check("fullSpellList")){
			readSaveFile("prepSpells");
		}else{
			prepSpells = new PrepSpells();
		}
		
		fullSpellList = new FullSpellList();
		player = new Player();
		
	}
	
	public void save(){
		mkSpellFile(knownSpells);
		mkSpellFile(prepSpells);
		mkSpellFile(fullSpellList);
	}
	
	public void mkSpellFile(spellRepertoire spellList){
		
		String name = spellList.getName();
		
		try{  //to catch I/O
			
			// Open a file to write to, named SavedObj.sav.
			FileOutputStream saveSpells = new FileOutputStream(name + ".sav");
	
			// Create an ObjectOutputStream to put object into save file.
			ObjectOutputStream save = new ObjectOutputStream(saveSpells);
	
			// Now we do the save.
			save.writeObject(spellList);
	
			// Close the file.
			save.close();
			
			System.out.println("wrote " + name);
			
			}
		catch(Exception exc){
			exc.printStackTrace(); // If there was an error, print the info.
		}
	}

	public boolean check(String loc) {
		// TODO Auto-generated method stub
		
		String path = "E:/Users/Adrian/Documents/GitHub/projects/DungeonAndDragons/" + loc;
		File file = new File(path);
		Boolean checkFile = file.isFile();
		
		return checkFile;
	}

	public void getKnownSpells(String tag) {
		// TODO Auto-generated method stub
		System.out.println("non implemented yet");
	}

	public void getKnownSpells() {
		// TODO Auto-generated method stub
		for(ArrayList<Spell> spellList : knownSpells.getList())
			for(Spell spell : spellList){
				System.out.println(spell.getName());
		}
	}
	
	public void getPrepSpells(String tag) {
		// TODO Auto-generated method stub
		System.out.println("non implemented yet");
	}

	
	public void getPrepSpells() {
		// TODO Auto-generated method stub
		for(ArrayList<Spell> spellList : prepSpells.getList())
			for(Spell spell : spellList){
				System.out.println(spell.getName());
		}
	}

	public void cast(String name) {
		// TODO Auto-generated method stub
		
		Spell spell = lookup("name", name, prepSpells);
		
		if(spell == null){
			System.out.println("you cannot cast a spell you have not prepared");
		} else {
			removeSpell(name, prepSpells);
			System.out.println("you cast " + name);
		}
	}

	public void prepare(String name) {
		// TODO Auto-generated method stub
		Spell spell = lookup("name", name, knownSpells);
		
		if(spell == null){
			System.out.println("you cannot prepare a spell you do not know");
		} else {
			prepSpells.add(spell);
			System.out.println("you prepared " + name);
		}
	}
	

	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("not implemented yet");
	}

	public void learn(String name) {
		// TODO Auto-generated method stub
		Spell spell = lookup("name", name, fullSpellList);
		if(spell==null){
			System.out.println("this is not a valid spell");
		} else {
			knownSpells.add(spell);
			System.out.println("you learned " + name);
		}
	}
	
	public Spell lookup(String type, String value, spellRepertoire spellRep){
		
		Spell lastSpell = null;
		type = "name";
		for(ArrayList<Spell> spellList : spellRep.getList()){
			//System.out.println("first loop");
			for(Spell spell : spellList){
				//System.out.println("second loop");
				String attribute = "";
				if(type.equals("name")){
					attribute = spell.getName();
					//System.out.println(attribute);
				}
				
				if(attribute.equals(value)){
					lastSpell = spell;
					//System.out.println("assigning");
				}
			}
		}
		//System.out.println("returning the spell");
		return lastSpell;
	}


	public void levelUp() {
		// TODO Auto-generated method stub
		player.levelUp();
		System.out.println("please now add spells");
	}

	public void tag(String name, String tag) {
		// TODO Auto-generated method stub
		Spell spell = lookup("name", name, fullSpellList);
		Spell oldSpell = spell;
		spell.addTag(tag);
		
		knownSpells.replace(oldSpell, spell);
		prepSpells.replace(oldSpell, spell);
	}

	public void removeTag(String name, String tag) {
		// TODO Auto-generated method stub
		Spell spell = lookup("name", name, fullSpellList);
		
		Spell oldSpell = spell;
		spell.removeTag(tag);
		
		knownSpells.replace(oldSpell, spell);
		prepSpells.replace(oldSpell, spell);
	}
	
	public void removeSpell(String name, String location) {
		// TODO Auto-generated method stub
		
		if(location == "fullSpellList"){
			removeSpell(name, fullSpellList);
			
		} else if(location == "knownSpells"){
			removeSpell(name, knownSpells);
			
		} else if(location == "prepSpells"){
			removeSpell(name, prepSpells);
		} else {
			System.out.println("not a valid location");
		}
	}
		
	public void removeSpell(String name, spellRepertoire location) {
		// TODO Auto-generated method stub
		
		Spell spell = lookup("name", name, fullSpellList);
		
		//System.out.println("going into location.remove");
		location.remove(spell);
		
	}
	public spellRepertoire readSaveFile(String loc){
		String path = "E:/Users/Adrian/Documents/GitHub/projects/DungeonAndDragons/" + loc;
		try{
			FileInputStream fileInput = new FileInputStream(path);
			ObjectInputStream objectInput = new ObjectInputStream(fileInput);
			spellRepertoire spellRep = (spellRepertoire) objectInput.readObject();
			objectInput.close();
	 
			return spellRep;
		}catch(Exception ex){
			ex.printStackTrace();
			return null;
		}
	}
}