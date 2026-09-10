package org.example;

//This class is used to test the Course class
public class DriverClass {
    public static void main(String[] args) {

        //Create a Course object using the default constructor
        Course c1 = new Course();

        //Display the default values
        System.out.println("Default values:");
        System.out.println(c1.getId());
        System.out.println(c1.getName());
        System.out.println(c1.getCode());
        System.out.println();

        //Change the values of Course c1 using setter methods
        c1.setId(1965);
        c1.setName("Finance");
        c1.setCode(101);

        //Display the updated values
        System.out.println("After setters:");
        System.out.println(c1.getId());
        System.out.println(c1.getName());
        System.out.println(c1.getCode());
        System.out.println();

        //Create Course c2 using the overloaded constructor
        Course c2 = new Course(1986, "History", 206);

        //Display the values of Course c2
        System.out.println("Parameterized constructor:");
        System.out.println(c2.getId());
        System.out.println(c2.getName());
        System.out.println(c2.getCode());

    }

}