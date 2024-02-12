package com.criticalthinking4_csc372;

public class Cone extends Shape {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surfaceArea() {
        double l = Math.sqrt(radius * radius + height * height); // slant height
        return Math.PI * radius * (radius + l);
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height / 3;
    }

    @Override
    public String toString() {
    	return "Radius = " + radius + "/ Height = " + height + "/ Surface Area = " + surfaceArea() + "/ Volume = " + volume();
    	}
}