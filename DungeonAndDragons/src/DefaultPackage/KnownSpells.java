package DefaultPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class KnownSpells extends spellRepertoire {
	
	public KnownSpells(){
		super.name = "KnownSpell";
		
	}
	
	public String getName(){
		return super.name;
	}
}
