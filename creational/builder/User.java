package creational.builder;

public class User {
	
	private final String firstName;
	private final String lastName;
	private final int age;
	private final String phone;
	private final String address;
	
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}

	private User(UserBuilder userBuilder) {
		this.firstName = userBuilder.firstName;
		this.lastName = userBuilder.lastName;
		this.age = userBuilder.age;
		this.phone = userBuilder.phone;
		this.address = userBuilder.address;
	}
	
	public static class UserBuilder{
		private final String firstName;
		private final String lastName;
		private int age;
		private String phone;
		private String address;
		
		UserBuilder(String firstName, String lastName){ //Mandatory parameters in builder constructor
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		UserBuilder age(int age) {
			this.age  = age;
			return this;
		}
		
		UserBuilder phone(String phone) {
			this.phone  = phone;
			return this;
		}
		
		UserBuilder address(String address) {
			this.address  = address;
			return this;
		}
		
		User build() {
			User user = new User(this);
			return user;
		}
	}
}
