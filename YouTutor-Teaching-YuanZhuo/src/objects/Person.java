package objects;

public class Person {

	public String name;
	private int age;
//	protected
	
	Person(){
		this.age = 22;
	}
	Person(String name , int age){
		this.name=name;
		this.age=age;
	}
//	
//	public void setAge(int age) {
//		this.age = age;
//	}
	public int getAge() {
		return this.age;
	}
	
	public void sayHello() {
		System.out.println("Hello");
	}
	public void sayHello(boolean ken) {
		System.out.println(this.name+"Hello");
	}
	
	public String toString() {
		return "I am "+name+", and "+age+" years old";
	}
}
