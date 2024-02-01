package com.tnsif.day7;

public class State {
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	private String stateName;
	private String language;
	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", language=" + language + "]";
	}

}
