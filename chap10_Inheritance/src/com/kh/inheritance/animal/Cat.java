package com.kh.inheritance.animal;

public class Cat extends Animal {
	public Cat(String name) {
		super(name); 
	}
	
	public void run() {
		System.out.println(getName() + " 주인이와서 달린다!");
	}
	
	@Override 
	public void eat() { //animal에 적혀있는 eat을 고양이 인에서만 다시 정의를 내준다.
		System.out.println(getName() + " 먹는데 중간에 먹이통을 뺏을 것");
	}
	
}