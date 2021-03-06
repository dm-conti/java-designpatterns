package it.mexican.javadesignpatterns.command.main;

import it.mexican.javadesignpatterns.command.Invoker;
import it.mexican.javadesignpatterns.command.model.Fan;
import it.mexican.javadesignpatterns.command.model.FanOffCommand;
import it.mexican.javadesignpatterns.command.model.FanOnCommand;
import it.mexican.javadesignpatterns.command.model.Light;
import it.mexican.javadesignpatterns.command.model.LightOffCommand;
import it.mexican.javadesignpatterns.command.model.LightOnCommand;

public class RunCommandPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        
		Light  testLight = new Light();
        LightOnCommand testLOC = new LightOnCommand(testLight);
        LightOffCommand testLFC = new LightOffCommand(testLight);
        
        Invoker testInvoker = new Invoker(testLOC,testLFC);       
        testInvoker.on();
        testInvoker.off();
        
        Fan testFan = new Fan( );
        FanOnCommand testFOC = new FanOnCommand(testFan);
        FanOffCommand testFFC = new FanOffCommand(testFan);
        
        Invoker testInvokerTwo = new Invoker(testFOC,testFFC);
        testInvokerTwo.on();
        testInvokerTwo.off(); 
	}
}