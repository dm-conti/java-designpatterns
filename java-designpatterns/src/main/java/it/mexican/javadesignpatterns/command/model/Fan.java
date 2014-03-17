package it.mexican.javadesignpatterns.command.model;

public class Fan {
	public void startRotate() {
		System.out.println("Fan is rotating");
	}

	public void stopRotate() {
		System.out.println("Fan is not rotating");
	}
}