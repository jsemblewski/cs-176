package edu.monmouth.lab1;

public class Lab1 {
	public static void main(String[] args) {

        Person person1 = new Person();

	    System.out.println( person1.getName());
	    System.out.println( person1.isNameLong());

        System.out.println();

        Person person2 = new Person("rolf");
        System.out.println(person2.getName());
        System.out.println(person2.isNameLong());

        System.out.println();

        Person person3 = new Person("ebenezer");
        System.out.println( person3.getName());
        System.out.println( person3.isNameLong());

        System.out.println();

        Person person4 = new Person("alexander");
        System.out.println(person4.getName());
        System.out.println(person4.isNameLong());

        System.out.println();

        Person person5 = new Person(null);
	    System.out.println(person5.getName());
        

        System.out.println();

        Person person6 = new Person("");
        System.out.println(person6.getName());
        System.out.println(person6.isNameLong());
	    }
	}

