package hierarchy;

public class Run {
	public static void main(String[] args) {
//		SuperClass sp = new SuperClass();
	//	sp.doSomeThing();
		
		//polymorphism
		SubClass polymorphism = new SubClass("polymorphism");
		polymorphism.doSomeThing();
		System.out.println(polymorphism.getClass().getSimpleName());
		
		//Override
//		SuperClass overRide = new SubClass("overRide");
//		overRide.doSomeThing();
//		System.out.println(overRide.getClass().getSimpleName());
		
		
	}
	
}
