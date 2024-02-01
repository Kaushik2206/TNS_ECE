package com.tnsif.day7;

public class City {
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	private String cityName;
	private String area;
	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", area=" + area + "]";
	} 

}
