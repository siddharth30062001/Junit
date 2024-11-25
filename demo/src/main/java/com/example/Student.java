package com.example;

import java.util.*;
public class Student {

    List<String> student=new ArrayList();

    public void addStudent(String name){
       student.add(name);
    }

    public boolean removeStudent(String s){

        if(!student.contains(s)){
            throw new StudentNotFoundException("Student Not Found");
        }
        student.remove(s);

        return true;
    }

    public int countStudent(){

        return student.size();
    }

    public int removeAll(){
        student.clear();

        return student.size();
    }

    
}

class StudentNotFoundException extends RuntimeException{

    StudentNotFoundException(String message){
        super(message);
    }
}

