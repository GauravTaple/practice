package com.reldyn.collection_practice.Program;

public class Stream_Methods {
	String name;
	int id;
	
	public Stream_Methods(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return id +":"+name;
	}
	
	


}
