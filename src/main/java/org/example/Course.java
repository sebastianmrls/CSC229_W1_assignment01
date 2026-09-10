package org.example;

//This class creates courses with an id, name and code
public class Course {

    //Data members of the Course class
    private int id;
    private String name;
    private int code;

    //Default constructor
    public Course(){}

    //Overloaded constructor that initializes all data members
    public Course(int id, String name, int code){
        this.id = id;
        this.name = name;
        this.code = code;
    }

    //Setter methods
    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCode(int code){
        this.code = code;
    }

    //Getter methods
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getCode(){
        return code;
    }

}