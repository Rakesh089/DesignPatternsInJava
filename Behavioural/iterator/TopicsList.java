package Behavioural.iterator;

//Concrete Aggregate

public class TopicsList implements List<Topic>{

	Topic[] topics; 
	
	TopicsList(Topic[] topics){
		this.topics = topics;
	}
	
	@Override
	public Iterator<Topic> iterator() {
		// TODO Auto-generated method stub
		return new TopicsIterator(topics);
	}

	
}
