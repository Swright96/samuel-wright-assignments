package zooKeeper;

public class Gorilla extends Mammal{
	public String throwSomething() {
		energy -= 5;
		return "The Gorilla threw that really hard!";
	}
	public String eatBanana() {
		energy += 10;
		if (energy > 100) {
			energy = 100;
		}
		return "The Gorilla really knows how to eat bananas!";
	}
	public String climbObstacle() {
		energy -= 10;
		return "The Gorilla seems to tire himself out by climbing!";
	}
}
