package DefaultPackage;

public class BonusSpells {
	
	int[][] bonusSpells;

	public BonusSpells() {
		// TODO Auto-generated constructor stub
		
		int [][] smBonusSpells = 
			{
				{0,0,0,0,0,0,0,0,0,0},
				{0,1,0,0,0,0,0,0,0,0},
				{0,1,1,0,0,0,0,0,0,0},
				{0,1,1,1,0,0,0,0,0,0},
				{0,1,1,1,1,0,0,0,0,0},
				{0,2,1,1,1,1,0,0,0,0},
				{0,2,2,1,1,1,1,0,0,0},
				{0,2,2,2,1,1,1,1,0,0},
				{0,2,2,2,2,1,1,1,1,0},
				{0,3,2,2,2,2,1,1,1,1},
				{0,3,3,2,2,2,2,1,1,1},
				{0,3,3,3,2,2,2,2,1,1},
				{0,3,3,3,3,2,2,2,2,1},
				{0,4,3,3,3,3,2,2,2,2},
				{0,4,4,3,3,3,3,2,2,2},
				{0,4,4,4,3,3,3,3,2,2},
				{0,4,4,4,4,3,3,3,3,2},
				
			};
		bonusSpells = smBonusSpells;
	}
	
	public int[] getBonusSpells(int bonus){
		int[] spellAtLvl = bonusSpells[bonus];
		return spellAtLvl;
		
	}

}
