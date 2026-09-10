package org.example;

public class Course {

    private int id;
    private String name;
    private int code;

    public Course(){}

    public Course(int id, String name, int code){
        this.id = id;
        this.name = name;
        this.code = code;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCode(int code){
        this.code = code;
    }

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