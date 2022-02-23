
package Ex1;

public class FigTree extends Tree {
	
	boolean hasLeaves;
	boolean hasFruit;
	
	FigTree(int height, Season season) {
		super(height,season,null);
		
		if(Season.FALL== season)
			leavesColor = Color.YELLOW;
		else
			leavesColor = Color.GREEN;
		
		hasLeaves = true;
		if(season==Season.WINTER)
			hasLeaves = false;
		
		hasFruit = false;
		if(season==Season.SUMMER)
			hasFruit = true;
	}
	
	@Override
	public String toString() {
		String res = "Fig tree. ";
		
		if(hasFruit)
			res += "I give fruit. ";
		
		res += "My height is: " + height;
		
		if(!hasLeaves)
			res += " and I have no leaves";
		
		else
			res+= " and my color is: " +leavesColor.toString();
		
		return res;
	}
	
	@Override
	public void changeSeason() {
		
		super.changeSeason();
		
		hasLeaves = true;
		hasFruit = false;
		switch (season){
			case WINTER -> {
				this.height+=20;
				hasLeaves = false;
				break;
			}
			
			case SUMMER -> {
				this.height+=30;
				this.hasFruit = true;
				break;
			}
			
			case SPRING -> {
				this.height+=30;
				leavesColor = Color.GREEN;
				break;
			}
			
			case FALL -> {
				leavesColor = Color.YELLOW;
				this.height +=20;
				break;
			}
			
			
			
		}
	}
}
