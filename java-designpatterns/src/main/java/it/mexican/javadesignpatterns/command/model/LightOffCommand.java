package it.mexican.javadesignpatterns.command.model;

import it.mexican.javadesignpatterns.command.Command;

public class LightOffCommand implements Command {
	private Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.turnOff();
	}
}
