package Behavioural.iterator;

public class Topic {
	
	String name;
	
	Topic(String newName){
		this.name = newName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Topic [name=" + name + "]";
	}
}
