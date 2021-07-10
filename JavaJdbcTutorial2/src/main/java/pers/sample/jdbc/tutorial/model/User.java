package pers.sample.jdbc.tutorial.model;

import pers.sample.jdbc.tutorial.util.DataTransferObject;

public class User implements DataTransferObject {
	
	private long id;
	private String name;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public long getId() {
		// TODO Auto-generated method stub
		return id;
	}

	
	@Override
	public String toString() {
		return this.id + "\t" + this.name; 
	}
}
