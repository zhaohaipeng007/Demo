package fansheconstructor;

public class Person {

	private String name;
	private int age;

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

	 private Person(String name){
	 super();
	 this.name=name;

	 System.out.println("����˽�л����вι���");
	 }
	 public Person(String name, int age) {
	 super();
	 this.name = name;
	 this.age = age;
	 System.out.println("�����вι��췽��");
	 }
	 public Person() {
	 super();
	 // TODO Auto-generated constructor stub
	 }
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
