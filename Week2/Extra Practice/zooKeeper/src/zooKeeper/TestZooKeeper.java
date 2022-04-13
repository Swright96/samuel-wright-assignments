package zooKeeper;

public class TestZooKeeper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create gorilla instance
		Gorilla harambe = new Gorilla();
		//Display original energy level
		System.out.println("Energy level is: " + harambe.displayEnergy());
		//Lose energy 3 times by throwing
		System.out.println(harambe.throwSomething());
		System.out.println(harambe.throwSomething());
		System.out.println(harambe.throwSomething());
		//Gain energy twice by eating bananas
		System.out.println(harambe.eatBanana());
		System.out.println(harambe.eatBanana());
		//Lose energy once by climbing
		System.out.println(harambe.climbObstacle());
		//Display energy == 90
		System.out.println("Energy level is: " + harambe.displayEnergy());
	}

}
