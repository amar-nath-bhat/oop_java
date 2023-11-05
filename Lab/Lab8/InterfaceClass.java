/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8;

interface AreaComp{
    double compute();
    final double pi = 3.14;
}

class AreaofRectangle implements AreaComp{
    double l, b;
    AreaofRectangle(double l, double b){
        this.l=l;
        this.b=b;
    }
    public double compute(){
        return l*b;
    }
}

class AreaofCircle implements AreaComp{
    double r;
    AreaofCircle(double r){
        this.r=r;
    }
    public double compute(){
        return pi*r*r;
    }
}
public class InterfaceClass {
    public static void main(String args[]){
    AreaofRectangle a1 = new AreaofRectangle(5,7);
    double num1 = a1.compute();
    System.out.println(num1);
    AreaofCircle a2 = new AreaofCircle(5);
    double num2 = a2.compute();
    System.out.println(num2);
    }
}
