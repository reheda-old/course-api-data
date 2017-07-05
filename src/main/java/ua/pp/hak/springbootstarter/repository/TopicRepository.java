package ua.pp.hak.springbootstarter.repository;

import org.springframework.data.repository.CrudRepository;

import ua.pp.hak.springbootstarter.model.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> {

	// getAllTopics()
	// getTopic(String id)
	// updateTopic(Topic topic)
	// deleteTopic(String id)

}
