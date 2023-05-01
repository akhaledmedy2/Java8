package com.demo.methodReferences;

public class MethodReferenceMain {

    public static void main(String[] args) {
        Square square = new Square(4);
        Shapes shapes = Square::calculateArea;

        System.out.println(shapes.getArea(square));

    }
}
