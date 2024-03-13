package bookcourses.topic.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import bookcourses.topic.model.Topic;

@Service
public class TopicService {
	
	
	
	 static List<Topic> topics= new ArrayList<Topic>();
	 static {
		 Topic topic1=new Topic("001","JAVA","programming lang");
			Topic topic2=new Topic("002",".net","programming lang");
			Topic topic3=new Topic("003","JS","programming lang");
		 topics.add(topic3);
		 topics.add(topic2);
		 topics.add(topic1);
	 }
	
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id){
		
		
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}
}
