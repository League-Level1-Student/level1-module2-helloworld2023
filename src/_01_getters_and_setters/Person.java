package _01_getters_and_setters;

public class Person {

	private String name;
	private String superpower;
	
	Person(String name, String superpower){
		this.name = name;
		this.superpower = superpower;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	public String getSuperpower() {
		return superpower;
	}
	public void setSuperpower(String s) {
		superpower = s;
	}
	
	public String toString() {
		return (name + " has mad " + superpower + " skills.");
	}
}
