
package com.mycompany.examples.exercises;


public class People {
 
    private String name;
    private int age;
    private String skincolor;

    public People() {
    }

    public People(String name, int age, String skincolor) {
        this.name = name;
        this.age = age;
        this.skincolor = skincolor;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSkincolor() {
        return skincolor;
    }

    public void setSkincolor(String skincolor) {
        this.skincolor = skincolor;
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("People{name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", skincolor=").append(skincolor);
        sb.append('}');
        return sb.toString();
    }
    
    
    protected void Language() {
        
            System.out.println("The Language is: ");
    }
    
    
}
