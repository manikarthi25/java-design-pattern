package com.java.design.pattern.creational_design.singleton_pattern;

public class LazySingleton {

	/*
	   we often need to create a class that can be instantiated only once at a time. 
	   We can't create the object of a singleton class more than once. However, 
	   if we try to create the object of a singleton class after the first time, 
	   the new reference variable will also point to the first instance created.
	 */

	private static LazySingleton lazySingletonObject = null;
	public String str;

	private LazySingleton() {

	}

	public static LazySingleton getInstance() {
		if (lazySingletonObject == null) {
			lazySingletonObject = new LazySingleton();
		}
		return lazySingletonObject;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LazySingleton single1 = LazySingleton.getInstance();
		single1.str = "Hi I am the singleton class string";

		LazySingleton single2 = LazySingleton.getInstance();
		single2.str = "Hi I am the other string";

		LazySingleton single3 = LazySingleton.getInstance();
		single3.str = "I am some other string";

		System.out.println("first reference: " + single1.str);
		System.out.println("second reference: " + single2.str);
		System.out.println("third reference: " + single3.str);
	}

}

/*
first reference: I am some other string
second reference: I am some other string
third reference: I am some other string
*/


/*
we create the instance of the class in synchronized method or synchronized block, 
so instance of the class is created when required
class A{  
 private static A obj;  
 private A(){}  
   
 public static A getA(){  
   if (obj == null){  
      synchronized(Singleton.class){  
        if (obj == null){  
            obj = new Singleton();//instance will be created at request time  
        }  
    }              
    }  
  return obj;  
 }  
  
 public void doSomething(){  
 //write your code  
 }  
}  
*/