package dom;
import DefaultPackage.Spell;

import org.w3c.dom.Element;

public class Input {

	public static Object Level(String value) {
		// TODO Auto-generated method stub
		Integer num = Integer.parseInt(value)
		
		return (int)num;
	}

	public static Object Components(String value) {
		// TODO Auto-generated method stub
		
		String[] list = value.split(" ");
		
		return list;
	}

	public static Object Range(String value) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
