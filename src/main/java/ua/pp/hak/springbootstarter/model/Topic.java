package ua.pp.hak.springbootstarter.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	
	@Id
	private String id;
	private String name;
	private String descrtiption;

	public Topic() {

	}

	public Topic(String id, String name, String descrtiption) {
		super();
		this.id = id;
		this.name = name;
		this.descrtiption = descrtiption;
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

}
