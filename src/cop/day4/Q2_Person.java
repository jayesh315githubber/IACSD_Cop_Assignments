package cop.day4;

public class Q2_Person {

	private String name;
	private int age;
	private String city;
	
	public Q2_Person() {
		this.name = "Suraj";
		this.age = 25;
		this.city = "Pune";
	}

	public Q2_Person(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}

	private String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public void display() {
		System.out.println("Name : "+getName());
		System.out.println("age : "+getAge());
		System.out.println("City : "+getCity());
	}

}
