package com.urvi.copy;

public class Singleton {
	public static Singleton singleInstance=null;
	String s1="Welcome";
	

	
	public static Singleton getInstance(){
		if(singleInstance==null){
		Singleton singleton=new Singleton();
		singleInstance=singleton;
		}
	
		return singleInstance;
		
}
		
	public static void main(String[] args) {
		Singleton singleton1=Singleton.getInstance();

	System.out.println(singleton1.s1);
	System.out.println(singleton1.hashCode());
	
	
	Singleton singleton2=Singleton.getInstance();
	System.out.println(singleton2.s1);
	System.out.println(singleton2.hashCode());
	
	Singleton singleton3=Singleton.getInstance();
	System.out.println(singleton3.s1);
	System.out.println(singleton3.hashCode());
	}

}
