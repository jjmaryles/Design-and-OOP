
package Ex1;

public class FigTree extends Tree {
	
	boolean hasLeaves;
	boolean hasFruit;
	
	FigTree(int height, Season season) {
		super(0,null,null);
		
		hasLeaves = true;
		if(season==Season.FALL)
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
		
		res += "My weight is: " + height;
		
		if(!hasLeaves)
			res += "and I have no leaves";
		
		return res;
	}
	
	@Override
	public void changeSeason() {
		
		super.changeSeason();
		
		hasFruit = false;
		switch (season){
			case WINTER -> {
				this.height+=20;
				hasLeaves = false;
				break;
			}
			
			case SUMMER -> {
				this.height+=10;
				this.hasFruit = true;
				break;
			}
			
			case SPRING -> {
				this.height+=10;
				leavesColor = Color.GREEN;
				break;
			}
			
			case FALL -> {
				leavesColor = Color.YELLOW;
				break;
			}
			
			
			
		}
	}
}
