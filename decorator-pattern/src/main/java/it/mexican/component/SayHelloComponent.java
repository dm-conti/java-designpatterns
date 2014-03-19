package it.mexican.component;

import it.mexican.component.Component;

/**
 * Created with IntelliJ IDEA.
 * User: uzumaki
 * Date: 19/03/14
 * Time: 22:57
 * To change this template use File | Settings | File Templates.
 */
public class SayHelloComponent implements Component {

    @Override
    public String sayHello() {
        return "Hello Worls";  //To change body of implemented methods use File | Settings | File Templates.
    }
}
