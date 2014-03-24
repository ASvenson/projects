import java.util.HashMap;


public class Player {

	String name;
	PlClass plClass;
	int plLevel;
	int casterLevel;
	boolean caster;
	HashMap knownSpells;
	
	public Player(String name, PlClass plClass, boolean caster, HashMap knownSpells){
		this.name = name;
		this.plClass = plClass;
		this.caster = caster;
		this.knownSpells = knownSpells;
	}
	
	public int getPlLevel(){
		return plLevel;
	}
	
	public int getCasterLevel(){
		return casterLevel;
	}
	
	
	public PlClass getPlClass() {
		// TODO Auto-generated method stub
		return plClass;
	}

	public boolean canCast() {
		// TODO Auto-generated method stub
		return caster;
	}

	public HashMap getKnownSpells() {
		// TODO Auto-generated method stub
		return knownSpells;
	}
}
