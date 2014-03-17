package it.mexican.javadesignpatterns.command.model;

import it.mexican.javadesignpatterns.command.Command;

public class LightOnCommand implements Command {
	private Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.turnOn();
	}
}
