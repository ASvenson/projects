package DefaultPackage;



public class Wizard extends PlClass {
	
	int[][] perDay;

	public Wizard(int level){
		super(level);
		int [][] helpPerDay = 
			{
				{3,1,0,0,0,0,0,0,0,0},
				{4,2,0,0,0,0,0,0,0,0},
				{4,2,1,0,0,0,0,0,0,0},
				{4,3,2,0,0,0,0,0,0,0},
				{4,3,2,1,0,0,0,0,0,0},
				{4,3,3,2,0,0,0,0,0,0},
				{4,4,3,2,1,0,0,0,0,0},
				{4,4,3,3,2,0,0,0,0,0},
				{4,4,4,3,2,1,0,0,0,0},
				{4,4,4,3,3,2,0,0,0,0},
				{4,4,4,4,3,2,1,0,0,0},
				{4,4,4,4,3,3,2,0,0,0},
				{4,4,4,4,4,3,2,1,0,0},
				{4,4,4,4,4,3,3,2,0,0},
				{4,4,4,4,4,4,3,2,1,0},
				{4,4,4,4,4,4,3,3,2,0},
				{4,4,4,4,4,4,4,3,2,1},
				{4,4,4,4,4,4,4,3,3,2},
				{4,4,4,4,4,4,4,4,3,3},
				{4,4,4,4,4,4,4,4,4,4}
			};
		perDay = helpPerDay;
		
		// TODO Auto-generated constructor stub
	}

	public boolean isCaster(){
		return true;
	}
	
	public String casterType(){
		return "arcane";
	}
	
//	public HashMap getKnownSpells(){
//		return knownSpells;
//	}
	
	public void mkKnownSpells(){
		return;
	}
	
	public int[] getSpellsPerDay(int spLevel){
		return perDay[spLevel-1];
	}
	
	
	

}
