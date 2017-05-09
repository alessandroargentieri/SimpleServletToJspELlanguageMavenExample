package it.euris.example.models;

public class User {
	
	private String name;
	private String surname;
	private int age;
	
	public User(String _name, String _surname, int _age){
		this.name = _name;
		this.surname = _surname;
		this.age = _age;
	}
	
	public User(){}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
