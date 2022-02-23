package Ex1;

public abstract class Animal implements Seasonable,Comparable{
	protected int weight;
	protected Season season;
	protected Color color;
	
	Animal(int weight, Season season, Color color){
		this.weight =weight;
		this.season =season;
		this.color =color;
	}
	
	@Override
	public Season getCurrentSeason() {
		return season;
	}
	
	@Override
	public int compareTo(Object o) {
		Animal other = (Animal)o;
		return this.weight- other.weight;
	}

	@Override
	public void changeSeason() {
		switch (this.season) {
			case FALL -> {
				this.season = Season.WINTER;
				break;
			}
			case WINTER -> {
				this.season = Season.SPRING;
				break;
			}
			case SPRING -> {
				this.season = Season.SUMMER;
				break;
			}
			case SUMMER -> {
				this.season = Season.FALL;
				break;
			}
		}
	}

	@Override
	public String toString() {
		return "Animal: " +
				"My weight is: " + weight +
				" and my color is: " + color;
	}
}