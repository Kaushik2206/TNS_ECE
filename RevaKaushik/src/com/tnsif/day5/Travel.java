package com.tnsif.day5;

public class Travel {
	private String Source;
	private String Destination;
	private String Name;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	
	@Override
	public String toString() {
		return "Travel [Name=" + Name + ", Source=" + Source + ", Destination=" + Destination +"]";
	}
	
	

}
