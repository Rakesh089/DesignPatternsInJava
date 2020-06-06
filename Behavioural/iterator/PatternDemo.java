package Behavioural.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Topic[] topics = new Topic[5];
		
		 topics[0] = new Topic("topic1");
		 topics[1] = new Topic("topic2");
		 topics[2] = new Topic("topic3");
		 topics[3] = new Topic("topic4");
		 topics[4] = new Topic("topic5");
		
		 Behavioural.iterator.List<Topic> topiclist = new TopicsList(topics);
		 Behavioural.iterator.Iterator<Topic> iterator = topiclist.iterator();
		 while(iterator.hasNext()) {
			 System.out.println(iterator.next().getName());
		 }

		List<String> list = new ArrayList<String>();
		list.add("Text 1");
		list.add("Text 2");
		list.add("Text 3");
		
		System.out.println("#4 iterator");
		Iterator<String> iterator1 = list.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		
		
	}

}
