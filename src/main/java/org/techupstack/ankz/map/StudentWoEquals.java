package org.techupstack.ankz.map;

public class StudentWoEquals {

	private int id;
	private String name;

	public StudentWoEquals(int i, String string) {
		this.id = i;
		this.name = string;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	@Override
	public String toString() {
		return "id: " + this.id + " name: " +this.name;
	}
	

	@Override
	public int hashCode() {
		return 1;
	}

}
