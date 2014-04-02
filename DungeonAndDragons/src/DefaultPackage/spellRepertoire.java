package DefaultPackage;

import java.util.ArrayList;



public abstract class spellRepertoire implements java.io.Serializable {
	
	Player player;
	ArrayList<Spell>[] spellList;
	public String name;
	
	public spellRepertoire(){
		spellList = new ArrayList[10];
	
		for(int i = 0; i < 10; i++){
			spellList[i] = new ArrayList<Spell>();
		}
	}
	public ArrayList<Spell>[] getList(){
		return spellList;
	}
	
	public String getName(){
		return name;
	}
	
	public void remove(Spell spell){
		for(ArrayList<Spell> spells : spellList){
			for(int i = 0; i<spells.size(); i++){
				Spell oldSpell = spells.get(i);

				if(oldSpell.getName().equals(spell.getName())){
					Spell val = spells.remove(i);
					//System.out.println("removed" + val.getName());
				}
			}
		}
	}
	
	public void removeAll(Spell spell){
		for(ArrayList<Spell> spells : spellList){
			for(int i = spells.size(); i < 0; i--){
				spells.remove(spell);
			}
		}
	}
	
	public void replace(Spell oldSpell, Spell spell){
		for(ArrayList<Spell> spells : spellList){
			spells.remove(oldSpell);
			spells.add(spell);
		}
	}
	
	public void replaceAll(Spell spell){
		for(ArrayList<Spell> spells : spellList){
			for(int i = spells.size(); i < 0; i--){
				boolean done = spells.remove(spell);
				if(done){
					spells.add(spell);
				}
			}
		}
	}
	public void add(Spell spell){
		int level;
		
		//remove the commas from the level field and push it into array
		String levelString = spell.getLevel().replace(",", "");
		
		String[] levelArray = levelString.split(" ");
		
		
		//makes finds the spell levels for the different types
		//I.E. level if wizard, cleric or druid
		int wizardLvl = 0;
		for(int j = 0; j<levelArray.length; j++){
			String value = levelArray[j];
			if(value.equals("Sorcerer/Wizard")){
				wizardLvl = Integer.parseInt(levelArray[j+1]);
			}
			//mk fields for other classes later
		}
		
		//for now, I'm assuming the player is a wizard
		level = wizardLvl;
		
		spellList[level].add(spell);
	}
}