package DefaultPackage;
import java.util.ArrayList;
import java.util.HashMap;


public class mySpells {

	HashMap prepared;
	PlClass plClass;
	Player player;
	
	
	public mySpells(Player player, HashMap prepared){
		
		this.player = player;
		plClass = player.getPlClass();
		ArrayList<Spell> prepare = new ArrayList<Spell>();
		
		this.prepared = prepared;
		prepared.put("0", new ArrayList<Spell>());
		prepared.put("1", new ArrayList<Spell>());
	    prepared.put("2", new ArrayList<Spell>());
	    prepared.put("3", new ArrayList<Spell>());
	    prepared.put("4", new ArrayList<Spell>());
	    prepared.put("5", new ArrayList<Spell>());
	    prepared.put("6", new ArrayList<Spell>());
	    prepared.put("7", new ArrayList<Spell>());
	    prepared.put("8", new ArrayList<Spell>());
	    prepared.put("9", new ArrayList<Spell>());
	    
	}
	
	public void Prepare(Spell spell){
		
		int level = spell.getLevel();
		
		prepared.put(level, spell);
		
	}
	
	public void Cast(Spell spell){
		
		prepared.remove(spell);
	}
	
	public ArrayList neededSpells(){
		ArrayList<ArrayList> neededSpells = new ArrayList();
		if(player.canCast()){
			HashMap knSpell = player.getKnownSpells();
			
			for(Integer i = 0; i < 10; i++){
				String key = i.toString();
				int numSpellsAtLevel = (int) knSpell.get(key);
				
				ArrayList spellsAtLevel = (ArrayList) prepared.get(key);
				int count = 0;
				
				for(Spell spell: spellsAtLevel){
					count++;
				}
				ArrayList tuple;
				tuple.add(key);
				tuple.add(count);
				
				neededSpells.add(tuple);
				
				return neededSpells;
			}
				
		} else {
			ArrayList<String> error = new ArrayList();
			error.add("Cannot Cast");
			return error;
		}
	}
	
	
	
	
}
