package Ex1;

public class Bear extends Animal {
	
	Bear(int weight, Season season) {
		super(weight, season, Color.BROWN);
	}
	
	@Override
	public String toString() {
		String s = "Bear. ";
		if (this.season == Season.WINTER)
			s += "I am sleeping. ";
		
		return s +
				"My weight is: " + weight +
				" and my color is: " + color;
	}
	
	@Override
	public void changeSeason() {
		super.changeSeason();
		switch (this.season)
		{
			case FALL:
				this.weight *= 5.0 /4;
				break;
			
			case WINTER:
				this.weight *= 4.0 /5;
				break;
			
			case SPRING:
				this.weight *= 3.0 /4;
				break;
			
			case SUMMER:
				this.weight *= 4.0 /3;
				break;
		}
	}
}

