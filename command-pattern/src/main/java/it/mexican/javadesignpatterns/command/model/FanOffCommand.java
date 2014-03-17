package it.mexican.javadesignpatterns.command.model;

import it.mexican.javadesignpatterns.command.Command;

public class FanOffCommand implements Command {
	private Fan fan;
    
	public FanOffCommand (Fan fan) {
            this.fan =  fan;
    }
    public void execute( ) {
    	fan.stopRotate();
    }
}
