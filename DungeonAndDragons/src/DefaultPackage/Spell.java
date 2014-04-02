package DefaultPackage;
import java.util.ArrayList;

import org.w3c.dom.Element;


public class Spell implements java.io.Serializable {
	
	

	private String name;
	private String altName;
	private String school;
	private String subSchool;
	private String descriptor;
	private String level;
	private String components;
	private String castingTime;
	private String range;
	private String target;
	private String area;
	private String duration;
	private String savingThrow;
	private String spellResistance;
	private String description;
	private String reference;
	private ArrayList<String> tags;

	public Spell(){
		setName("N/A");
		setAltName("N/A");
		setSchool("N/A");
		setSubSchool("N/A");
		setDescriptor("N/A");
		setLevel("N/A");
		setComponents("N/A");
		setCastingTime("N/A");
		setRange("N/A");
		setTarget("N/A");
		setArea("N/A");
		setDuration("N/A");
		setSavingThrow("N/A");
		setSpellResistance("N/A");
		setDescription("N/A");
		setReference("N/A");
		tags = new ArrayList<String>();
		
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}


	public String getAltName() {
		return altName;
	}

	public void setAltName(String altName) {
		this.altName = altName;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getSubSchool() {
		return subSchool;
	}

	public void setSubSchool(String subSchool) {
		this.subSchool = subSchool;
	}

	public String getDescriptor() {
		return descriptor;
	}

	public void setDescriptor(String descriptor) {
		this.descriptor = descriptor;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getComponents() {
		return components;
	}

	public void setComponents(String components) {
		this.components = components;
	}

	public String getCastingTime() {
		return castingTime;
	}

	public void setCastingTime(String castingTime) {
		this.castingTime = castingTime;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getSavingThrow() {
		return savingThrow;
	}

	public void setSavingThrow(String savingThrow) {
		this.savingThrow = savingThrow;
	}

	public String getSpellResistance() {
		return spellResistance;
	}

	public void setSpellResistance(String spellResistance) {
		this.spellResistance = spellResistance;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public void addTag(String tag) {
		// TODO Auto-generated method stub
		tags.add(tag);
	}
	public void removeTag(String tag) {
		// TODO Auto-generated method stub
		tags.remove(tag);
	}
}
