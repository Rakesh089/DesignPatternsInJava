package Behavioural.iterator;


//Concrete iterator

public class TopicsIterator implements Iterator<Topic>{

	Topic[] topics = null;
	int position = 0;
	int length;
	
	TopicsIterator(Topic[] topics){
		this.topics = topics;
		length = topics.length;
	}
	
	@Override
	public boolean hasNext() {
		if(position >= length)
			return false;
		return true;
	}

	@Override
	public Topic next() {
		// TODO Auto-generated method stub
		return topics[position++];
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		position=0;
		
	}

	@Override
	public Topic current() {
		// TODO Auto-generated method stub
		return topics[position];
	}

}
