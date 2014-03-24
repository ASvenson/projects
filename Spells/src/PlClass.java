import java.util.HashMap;


public abstract class PlClass {
	
	boolean caster;
	HashMap knownSpells;
	
	public PlClass(){
		
	}

	public boolean isCaster(){
		return false;
	}
	
	public String casterType(){
		return "non-caster";
	}
	
	public HashMap getKnownSpells(){
		return knownSpells;
	}
	
	public void mkKnownSpells(){
		return;
	}
	
}
