package Ex1;


public class OliveTree extends Tree {
	
	boolean hasFruit;
	
	OliveTree(int height, Season season) {
		super(height, season, Color.GREEN);
		
		hasFruit = false;
		if (season == Season.FALL)
			hasFruit = true;
	}
	
	@Override
	public String toString() {
		String res = "Olive tree. ";
		
		if(hasFruit)
			res+="I give fruit. " ;
		
		res+= super.toString();
		
		return res;
	}
	
	@Override
	public void changeSeason() {
		super.changeSeason();
		
		hasFruit = false;
		switch (season)
		{
			case WINTER:
				this.height += 5;
				break;
			
			
			case SUMMER: case SPRING:
				this.height += 10;
				break;
			
			
			case FALL:
				hasFruit = true;
				this.height += 5;
				break;
			
			
		}
	}
}
