/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjclass;

/**
 *
 * @author Jalal
 */
public class MyJClass extends ParentClass implements MyInterface{

    int age;
    String name;

    MyJClass() {
        this.age = 36;
        this.name = "Jalal";
    }

    MyJClass(int age, String name) {
        this.age = age;
        this.name = name;
    }
    
    public void printDetails(){
        System.out.println(this.age);
        System.out.println(this.name);
        System.out.println(this.family);
    }

    public static void main(String[] args) {
//        System.out.println("Hello");
        
        MyJClass obj1 = new MyJClass();
//        System.out.println(obj1.age);
//        System.out.println(obj1.name);
//        System.out.println(obj1.family);
        
        MyJClass obj2 = new MyJClass(22,"New user");
//        System.out.println(obj2.age);
//        System.out.println(obj2.name);  
//        System.out.println(obj1.family);
        
        
        obj1.printDetails();
        obj2.printDetails();
    }

}
