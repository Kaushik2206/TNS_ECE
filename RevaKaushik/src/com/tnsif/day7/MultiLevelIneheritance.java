package com.tnsif.day7;

public class MultiLevelIneheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
City city = new City();
city.setCityName("Bangalore");
city.setArea("Yeshwanthpur");

State state = new State();
state.setStateName("Karnataka");
state.setLanguage("Kannada");

Country country = new Country();
country.setCountryName("India");
country.setCapital("Delhi");

System.out.println(city);
System.out.println(state);
System.out.println(country);


	}

}
