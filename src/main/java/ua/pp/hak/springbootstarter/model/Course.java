package ua.pp.hak.springbootstarter.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {

	@Id
	private String id;
	private String name;
	private String descrtiption;

	@ManyToOne
	private Topic topic;

	public Course() {

	}

	public Course(String id, String name, String descrtiption, Topic topic) {
		super();
		this.id = id;
		this.name = name;
		this.descrtiption = descrtiption;
		this.topic = topic;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescrtiption() {
		return descrtiption;
	}

	public void setDescrtiption(String descrtiption) {
		this.descrtiption = descrtiption;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

}
