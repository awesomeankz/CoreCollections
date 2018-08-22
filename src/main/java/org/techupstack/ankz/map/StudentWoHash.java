package org.techupstack.ankz.map;

public class StudentWoHash {

	private int id;
	private String name;

	public StudentWoHash(int i, String string) {
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
	public boolean equals(Object obj) {
		return (this.id == ((StudentWoHash) obj).getId()) && this.name.equals(((StudentWoHash) obj).getName());
	}

	@Override
	public String toString() {
		return "id: " + this.id + " name: " + this.name;
	}

}
