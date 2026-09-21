package part3.task4;

import java.util.ArrayList;
import java.util.List;

public class task4 {
    public static void main(String[] args) {
        //创建对象
        Shape1 shape1C= new Circle(5);
        Shape1 shape1R= new Rectangle(4, 6);
        Shape1 shape1T= new Triangle(3, 4, 5, 6);
        Shape2 shape2C= (Circle)shape1C;
        Shape2 shape2R= (Rectangle)shape1R;
        Shape2 shape2T= (Triangle)shape1T;
        //创建数组
        List<Shape1> shape1List = new ArrayList<>();//抽象类
        shape1List.add(shape1C);
        shape1List.add(shape1R);
        shape1List.add(shape1T);
        
        List<Shape2> shape2List = new ArrayList<>();//接口方案
        shape2List.add(shape2C);
        shape2List.add(shape2R);
        shape2List.add(shape2T);
        //循环调用同一种函数，不同的对象有不同的实现
        for (Shape1 shape1 : shape1List) {//抽象类
            System.out.println("Area: " + shape1.area());
            System.out.println("Perimeter: " + shape1.perimeter());
        }
        System.out.println("====================================");
        for (Shape2 shape2 : shape2List) {//接口方案
            System.out.println("Area: " + shape2.area());
            System.out.println("Perimeter: " + shape2.perimeter());
        }

}
}

abstract class Shape1 {
    public abstract double area();
    public abstract double perimeter();
}

interface Shape2 {
    public abstract double area();
    public abstract double perimeter();
}

class Circle extends Shape1 implements Shape2 {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape1 implements Shape2 {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}

class Triangle extends Shape1 implements Shape2 {
    private double base;
    private double height;
    private double sideA;
    private double sideB;

    public Triangle(double base, double height, double sideA, double sideB) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public double perimeter() {
        return base + sideA + sideB;
    }
}




