import java.util.ArrayList;


public class Spell {
	
	String name;
	String type;
	int level;
	String desc;
	String webCall;
	ArrayList components;
	int range;
	String duration;
	String saveThrow;
	boolean spellResistance;

	public Spell(String name, String type, int level, String desc, String webCall, 
			ArrayList components, int range, String duration, String saveThrow,
			boolean spellResistance){
		
		this.name = name;
		this.type = type;
		this.level = level;
		this.desc = desc;
		this.webCall = webCall;
		this.components = components;
		this.range = range;
		this.duration = duration;
		this.saveThrow = saveThrow;
		this.spellResistance = spellResistance;
		
	}
	
	public String getName(){
		return name;
	}
	
	public String getType(){
		return type;
	}
	
	public int getLevel(){
		return level;
	}
	
	public String getDesc(){
		return desc;
	}
	
	public String getWebCall(){
		return webCall;
	}
	
	public ArrayList getComponents(){
		return components;
	}
	
	public int getRange(){
		int playerLevel = player.getLevel()
		return range ;
	}
	
	public String getDuration(){
		return duration;
	}
	
	public String getSaveThrow(){
		return saveThrow;
	}
	
	public boolean getSpellResistance(){
		return spellResistance;
	}
	
}
