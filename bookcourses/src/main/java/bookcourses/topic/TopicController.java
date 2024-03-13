package bookcourses.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bookcourses.topic.model.Topic;
import bookcourses.topic.service.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	
	@RequestMapping("/topics")
	public List<Topic>  getAllTopics()
	{
		 return topicService.getAllTopics();
	}
	
	
	@RequestMapping("/topics/{id}")
	public Topic  getTopic(@PathVariable String id)
	{
		return topicService.getTopic(id);
		
				
	}
	
	@PostMapping(value = "/topics")
	public void addTopic(Topic topic) {
		System.out.print(topic.getId());
		topicService.addTopic(topic);
	}
}
