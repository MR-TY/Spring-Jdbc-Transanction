package com.ty.entity;

public class Person {
	private int id;
	private String name;
	private int account;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String name, int account) {
		super();
		this.id = id;
		this.name = name;
		this.account = account;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", account=" + account + "]";
	}
}
