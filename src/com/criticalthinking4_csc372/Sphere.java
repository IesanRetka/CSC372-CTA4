package com.criticalthinking4_csc372;

public class Sphere extends Shape {
	private double radius;
	
	public Sphere(double radius) {
		this.radius = radius;
	}

	@Override
	public double surfaceArea() {
		return 4 * Math.PI * radius * radius;
	}

	@Override
	public double volume() {
		return (4.0/3) * Math.PI * Math.pow(radius, 3);
	}

	@Override
	public String toString() {
		return "Radius = " + radius + "/ Surface Area = " + surfaceArea() + "/ Volume = " + volume();
	}
}
