package creational.builder;

public class PatternDemo {

	public static void main(String[] args) {
		
		User user1 = new User.UserBuilder("Rakesh", "Allam").age(24).build();
		System.out.println(user1);
		
		User user2 = new User.UserBuilder("Rakesh", "Allam").build();
		System.out.println(user2);
		
		User user3 = new User.UserBuilder("Rakesh", "Allam")
				.age(30)
				.phone("9949")
				.build();
		System.out.println(user3);
	}
}
