package structural.adapter;

public class EnemyTank implements EnemyAttacker{

	@Override
	public void fireWeapon() {
		System.out.println("Enemy tank does some damage !!!");
	}

	@Override
	public void driveForward() {
		System.out.println("Enemy tank is driving forward !!!");
		
	}

	@Override
	public void assignDriver(String driverName) {
		System.out.println(driverName + " is driving the tank !!!");
	}

}
