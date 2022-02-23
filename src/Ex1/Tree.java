package Ex1;


public abstract class Tree implements Comparable, Seasonable {
	protected int height;
	protected Season season;
	protected Color leavesColor;
	
	
	Tree(int height, Season season, Color leavesColor){
		this.height = height;
		this.season = season;
		this.leavesColor = leavesColor;
	}
	
	@Override
	public Season getCurrentSeason() {
		return season;
	}
	
	
	@Override
	public int compareTo(Object o) {
		
		Tree other = (Tree)o;
		return this.height- other.height;
	}
	
	@Override
	public void changeSeason() {
		switch (season){
			case FALL:
				season= Season.WINTER;
				break;
			
			case SPRING:
				season=Season.SUMMER;
				break;
			
			case SUMMER:
				season = Season.FALL;
				break;
			
			case WINTER:
				season = Season.SPRING;
				break;
			
		}
		
	}
	
	@Override
	public String toString() {
		return "My height is: "+height+" and my color is: " +leavesColor.toString();
	}
}
