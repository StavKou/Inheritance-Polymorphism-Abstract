
package com.mycompany.examples.exercises;

import java.util.Date;


public class Person {
    
    private String name = "Tom";
    private Date birth;
    
    public boolean equals(Object other) {
    
        if (other == this) return true;
        if (other == null) return false;
        if (getClass() != other.getClass() ) return false;
        
        Person person = (Person) other;
        return (
        (name == person.name || name != null && name.equals(person.name))) &&
                (birth == person.birth ||
                (birth != null && birth.equals(person.birth))
        );
    }
    
    
     
}
        
        
//public static void main(String[] args){
//    
//        Person person = new Person();
//        System.out.println(person.name);
//    
//    }