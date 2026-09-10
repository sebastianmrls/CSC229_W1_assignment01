package org.example;

public class DriverClass {
    public static void main(String[] args) {

        Course c1 = new Course();

        System.out.println("Default values:");
        System.out.println(c1.getId());
        System.out.println(c1.getName());
        System.out.println(c1.getCode());
        System.out.println();

        c1.setId(1965);
        c1.setName("Finance");
        c1.setCode(101);

        System.out.println("After setters:");
        System.out.println(c1.getId());
        System.out.println(c1.getName());
        System.out.println(c1.getCode());
        System.out.println();

        Course c2 = new Course(1986, "History", 206);

        System.out.println("Parameterized constructor:");
        System.out.println(c2.getId());
        System.out.println(c2.getName());
        System.out.println(c2.getCode());

    }

}