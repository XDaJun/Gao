package Stdeng;

public class Students {
	private String name;
	private int age;
	private double stature;
	double weihght;
	String className;
	
	public String getname(){
		return name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getStature() {
		return stature;
	}

	public void setStature(double stature) {
		this.stature = stature;
	}

	public void setname(String name){
		this.name =name;
	}
	
	public void study(){
		System.out.println(name+"正在学习。");
	}
}
