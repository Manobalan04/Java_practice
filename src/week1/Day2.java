package week1;

public class Day2 {

	int n1 = 5;

	int[] arr = { 2, 5, 3, 6 };

	static int[] arr1 = { 5, 9, 2, 0 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Day2 man = new Day2();

//	    operators
//	    arithmetic, comparison, logical, ternary, assignment

//	    arithmetic
		System.out.println("arithmetic operator:-");
		System.out.println(man.n1 + 5);
		System.out.println(man.n1 / 2);
		System.out.println(man.n1 % 2);

//	    comparison
		System.out.println("comparison operator:-");
		System.out.println(10 == 5);
		System.out.println(10 > 5);
		System.out.println(10 != 5);

//	    logical
		System.out.println("logical operator:-");
		System.out.println(10 != 10 || 10 == 10); // || it print true any of one comes true
		System.out.println(10 != 10 && 10 == 10); // && it print true two of them comes true

//	    ternary
		System.out.println("ternary operator:-");

		int n2 = (10 < 16) ? 3 : 6;
		System.out.println(n2);

		char n3 = (10 > 16) ? 'm' : 'a';
		System.out.println(n3);

		int positive = man.n1 > 0 ? man.n1 : -man.n1;
		System.out.println(positive);

//	    loops

//	    if loop
		System.out.println("if loop:-");

		if (10 < 5) {
			System.out.println("hi");
		} else if (10 < 5) {
			System.out.println("hello");
		} else {
			System.out.println("java");
		}

		if (10 > 7) {
			System.out.println("one");
		}
		if (10 > 7) {
			System.out.println("two");
		}

//	    for loop
		System.out.println("for loop:-");

		for (int i = 0; i < man.arr.length; i++) {
			System.out.println(man.arr[i]);
		}

//	    while loop
		System.out.println("while loop:-");

		int i = 0;
		while (i < arr1.length) {
			System.out.println(arr1[i]);
			i++;
		}

//	    int i=0;
//	    boolean flag=true;
//	    while(flag) {
//	    	System.out.println(arr1[i]);
//	    	i++;
//	    	
//	    	if(i==4) {
//	    		flag=false;
//	    	}
//	    }

//	    do while loop
		System.out.println("do-while loop:-");

		do {
			System.out.println(arr1[i - 1]);
		} while (10 < 5);

//	    do {
//	    	System.out.println("java");
//	    }while(10<5);

//	    int i=0;
//	    boolean flag=true;
//	    do {
//	    	System.out.println(arr1[i]);
//	    }while(flag);

//	    post, pre increment
		System.out.println("post, pre increment:-");

//	    post increment
		int a = 0;
		int k = a++; // it add after printing k and store in it(a), but not store in k
		System.out.println("post increment-> " + k);
		System.out.println("post increment-> " + a);

//	    pre increment
		int b = 0;
		int c = ++b; // it add before itself and stored in c
		System.out.println("pre increment-> " + c);
		System.out.println("pre increment-> " + b);

//	    
//	    int l=0;
//	    l++;
//	    int m=l++;
//	    System.out.println(m);
//	    System.out.println(l);
//	    
//	    int d=0;
//	    int e=d++ + d;
//	    System.out.println(e);
//	    System.out.println(d);
//	    
//	    int g=0;
//	    int h=g++ + (++g);
//	    System.out.println(h);
//	    System.out.println(g);

	}

}