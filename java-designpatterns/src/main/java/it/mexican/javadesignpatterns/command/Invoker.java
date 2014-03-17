package it.mexican.javadesignpatterns.command;


public class Invoker {
	private Command onCommand, offCommand;
	
	public Invoker(Command onCommand, Command offCommand){
		this.onCommand = onCommand;
		this.offCommand = offCommand;
	}
	
	public void on(){
		this.onCommand.execute();
	}
	
	public void off(){
		this.offCommand.execute();
	}
}