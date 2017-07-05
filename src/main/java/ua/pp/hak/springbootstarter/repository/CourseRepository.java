package ua.pp.hak.springbootstarter.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ua.pp.hak.springbootstarter.model.Course;

public interface CourseRepository extends CrudRepository<Course, String> {

	public List<Course> findByTopicId(String topicId);

}
