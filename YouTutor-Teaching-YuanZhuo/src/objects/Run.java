package objects;

public class Run {

	public static void main(String[] args) {
		Person tim = new Person();
		tim.name = "Tim";
		//tim.setAge(22);
		System.out.println(tim);
		
		Person ken = new Person("Kenneth", 40);
		ken.sayHello();
		ken.sayHello(true);
		//System.out.println(ken);
	}

}
