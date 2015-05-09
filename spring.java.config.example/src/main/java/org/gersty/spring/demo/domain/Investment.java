package org.gersty.spring.demo.domain;

public class Investment{

	private String name;
	private String type;

	public Investment(String name, String type){
		this.name=name;
		this.type=type;
	}

	public String getName(){
		return this.name;
	}
	public String getType(){
		return this.type;
	}
}