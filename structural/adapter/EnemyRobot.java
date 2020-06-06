package structural.adapter;

public class EnemyRobot {
		
	public void smashWithHands() {
		System.out.println("Enemy Robot smashing with Hands !!!");
	}
	
	public void walkForward() {
		System.out.println("Enemy Robot walks forwards !!!");
		
	}

	public void reactToHuman(String driverName) {
		System.out.println("Enemy robot tramps on " + driverName);
	}
}
