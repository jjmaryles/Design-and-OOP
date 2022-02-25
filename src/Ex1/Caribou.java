
package Ex1;

public class Caribou extends Animal {
	
	Caribou(int weight, Season season) {
		super(weight, season, Color.BROWN);
		if(season == Season.WINTER)
			this.color = Color.WHITE;
	}
	
	@Override
	public String toString() {
		String s = "Caribou: ";
		if(this.season == Season.WINTER)
			s += "I am migrating south. ";

		else if(this.season == Season.SUMMER)
			s += "I am migrating north. ";

		return s +
				"My weight is: " + weight +
				" and my color is: " + color;
	}
	
	@Override
	public void changeSeason() {
		super.changeSeason();
		switch (this.season) {
			case WINTER:
				this.color = Color.WHITE;
				break;

			case SPRING:
				this.color = Color.BROWN;
				break;

			default:
				break;

		}
	}
}
