import java.util.HashMap;


public abstract class PlClass {
	
	int level;
	HashMap knownSpells;
	
	public PlClass(int level){
		int level;
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
