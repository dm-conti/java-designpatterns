package it.mexican.javadesignpatterns.command.model;

import it.mexican.javadesignpatterns.command.Command;

public class FanOnCommand implements Command {
	private Fan fan;

	public FanOnCommand(Fan fan) {
		this.fan = fan;
	}

	public void execute() {
		fan.startRotate();
	}
}
