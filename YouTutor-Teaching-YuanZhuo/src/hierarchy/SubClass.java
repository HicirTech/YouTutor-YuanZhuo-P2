package hierarchy;

//Inheritance
public class SubClass extends SuperClass{
	
	
	SubClass(){
		super();

	}
	
	SubClass(String define){
		name.name = define;
	}
	
	//OVERRIDE
	@Override
	public void doSomeThing() {
		System.out.println(name.name+": is overriding this class");
	}
	

}
