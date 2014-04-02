package DefaultPackage;
import java.util.HashMap;


public abstract class PlClass {
	
	int level;
	//HashMap knownSpells;
	
	public PlClass(int level){
		this.level = level ;
	}

	public boolean isCaster(){
		return false;
	}
	
	public String casterType(){
		return "non-caster";
	}
	
	
	public void mkKnownSpells(){
		return;
	}
	
}
