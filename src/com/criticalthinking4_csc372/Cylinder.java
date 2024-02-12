package com.criticalthinking4_csc372;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
    	return "Radius = " + radius + "/ Height = " + height + "/ Surface Area = " + surfaceArea() + "/ Volume = " + volume();
    }
}

