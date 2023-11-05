/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8;

abstract class Area{
    abstract double compute();
    
    double pi= 3.14;
    void msg(){
        System.out.println("Computing Area");
    }
}

class rectArea extends Area{
    double l, b;
    rectArea(double l, double b){
        this.l=l;
        this.b=b;
    }
    double compute(){
        return l*b;
    }
}

class circArea extends Area{
    int r;
    circArea(int r){
        this.r=r;
    }
    double compute(){
        return pi*r*r;
    }
}
public class Abstract {
    public static void main(String args[]){
    rectArea a1 = new rectArea(5, 7);
    double num1 = a1.compute(); 
    System.out.println(num1);
    
    circArea a2 = new circArea(5);
    double num2 = a2.compute(); 
    System.out.println(num2);
    }
}
