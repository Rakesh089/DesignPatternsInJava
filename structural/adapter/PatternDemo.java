package structural.adapter;

public class PatternDemo {

	public static void main(String[] args) {
		
		EnemyAttacker rx7 = new EnemyTank();
		
		rx7.assignDriver("Frank");
		rx7.driveForward();
		rx7.fireWeapon();
		
		
		EnemyAttacker robot = new EnemyRobotAdapter(new EnemyRobot());
		robot.assignDriver("Racks");
		robot.driveForward();
		robot.fireWeapon();
	}

}
