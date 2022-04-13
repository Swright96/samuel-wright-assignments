package zooKeeper;

public class GiantBat extends Mammal {
	public GiantBat() {
		energy = 300;
	}
	public String fly() {
		energy -= 50;
		if (energy <= 0) {
			return "The bat is too tired to do anything else, hopefully he can eat a human soon";
		}
		else {
			return "Woosh! The bat takes off!";
		}
	}
	public String eatHumans() {
		energy += 25;
		if (energy > 300) {
			energy = 300;
		}
		return "Nom Nom Nom, do Humans taste like chicken?";
	}
	public String attackTown() {
		energy -= 100;
		if (energy <= 0) {
			return "The bat is too tired to do anything else, hopefully he can eat a human soon";
		}
		else {
			return "SKREEEEEEEE! The giant bat attacks the town! Everybody RUN!";
		}
	}
}
