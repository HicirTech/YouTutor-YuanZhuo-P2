package hierarchy;

public class SuperClass {
	Name name;
	private String notShow;
	SuperClass(){
		name.name = "super";
		notShow="This is not use out side of the class";
	}
	
	public void doSomeThing() {
		System.out.println(name+" Class is doing some thing");
	}
	
	public String toString() {
		return name.name +"  "+notShow;//
	}
}
