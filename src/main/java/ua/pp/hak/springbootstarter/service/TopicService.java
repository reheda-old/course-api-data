package ua.pp.hak.springbootstarter.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.pp.hak.springbootstarter.model.Topic;
import ua.pp.hak.springbootstarter.repository.TopicRepository;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

//	private List<Topic> topics;
//
//	{
//		topics = new ArrayList<>();
//		topics.add(new Topic("spring", "Spring Framework", "Spring Framework Descr"));
//		topics.add(new Topic("java", "Core Java", "Core Java descr"));
//		topics.add(new Topic("js", "Javascript", "Javascript descr"));
//	}

	public List<Topic> getAllTopics() {
		// return topics;
		
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	public Topic getTopic(String id) {
		// return topics.stream().filter(t ->
		// t.getId().equals(id)).findFirst().get();
		
		return topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
		// topics.add(topic);
		
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
//		for (int i = 0; i < topics.size(); i++) {
//			Topic t = topics.get(i);
//			if (t.getId().equals(id)) {
//				topics.set(i, topic);
//				return;
//			}
//		}
		
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
//		topics.removeIf(t -> t.getId().equals(id));
		
		topicRepository.delete(id);
	}

}
