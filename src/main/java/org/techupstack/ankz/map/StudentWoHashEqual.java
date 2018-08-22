package org.techupstack.ankz.map;

public class StudentWoHashEqual {

	private int id;
	private String name;

	public StudentWoHashEqual(int i, String string) {
		this.id=i;
		this.name=string;
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
		// TODO Auto-generated method stub
		return "id: " + this.id + " name: " +this.name;
	}

}
