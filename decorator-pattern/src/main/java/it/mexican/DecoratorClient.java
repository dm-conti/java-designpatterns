package it.mexican;

import it.mexican.component.SayHelloComponent;
import it.mexican.component.Component;
import it.mexican.decorator.Decorator;
import it.mexican.decorator.SayHelloDecorator;

/**
 * Created with IntelliJ IDEA.
 * User: uzumaki
 * Date: 19/03/14
 * Time: 22:59
 * To change this template use File | Settings | File Templates.
 */
public class DecoratorClient {
    public static void main(String[] args){
        Component component = new SayHelloComponent();
        System.out.println(component.sayHello());

        System.out.println();

        Decorator decorator = new SayHelloDecorator(component);
        System.out.println(decorator.sayHello());

    }
}
