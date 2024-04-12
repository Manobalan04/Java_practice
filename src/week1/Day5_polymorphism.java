package week1;

class Animal {
	public void sound() {
		System.out.println("animal sounds");
	}

//		static it is like constructor(cannot use args in it) but it only will print first then only other operations run(print)
//		static {
//			System.out.println("static");
//		}
}

class Dog extends Animal {
	@Override // (it means it have parent class, may be in other class in package or else)
	public void sound() {
		System.out.println("dog sound");
	}
}

class Cow extends Animal {
	@Override
	public void sound() {
		System.out.println("cow sound");
	}
}

class Sheep extends Animal {
	@Override
	public void sound() {
		super.sound();
	}
}

public class Day5_polymorphism extends Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Polymorphism:-");
		System.out.println("");

		Animal cow1 = new Cow();
		Animal dog1 = new Dog();
		Animal s1 = new Sheep(); // calling parent from child

		cow1.sound();
		dog1.sound();

		s1.sound();

	}

}