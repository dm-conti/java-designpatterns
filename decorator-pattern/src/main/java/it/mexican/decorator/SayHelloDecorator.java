package it.mexican.decorator;

import it.mexican.component.Component;
import it.mexican.decorator.Decorator;

/**
 * Created with IntelliJ IDEA.
 * User: uzumaki
 * Date: 19/03/14
 * Time: 22:51
 * To change this template use File | Settings | File Templates.
 */
public class SayHelloDecorator implements Decorator {

    private Component component;

    public SayHelloDecorator(Component component){
        this.component = component;
    }

    @Override
    public String sayHello() {
        return component.sayHello().concat(" ByeBye!");  //To change body of implemented methods use File | Settings | File Templates.
    }
}