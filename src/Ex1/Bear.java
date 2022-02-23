package Ex1;

public class Bear extends Animal {
	
	Bear(int weight, Season season) {
		super(weight,season,Color.BROWN);
	}
	@Override
	public String toString() {
		String s = "Bear. ";
		if(this.season == Season.WINTER)
			s += "I am sleeping. ";

		return s +
				"My weight is: " + weight +
				" and my color is: " + color;
	}
	@Override
	public void changeSeason() {
		super.changeSeason();
		switch (this.season) {
			case FALL -> {
				this.weight *= 1.25;
				break;
			}
			case WINTER -> {
				this.weight *= 0.8;
				break;
			}
			case SPRING -> {
				this.weight *= 0.75;
				break;
			}
			case SUMMER -> {
				this.weight *= 1.33;
				break;
			}
		}
	}
}
