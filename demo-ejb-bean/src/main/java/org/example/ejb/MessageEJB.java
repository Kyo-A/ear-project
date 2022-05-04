package org.example.ejb;

import javax.ejb.Stateless;
import java.util.Random;

@Stateless
public class MessageEJB {

    private final String[] messages = { "Hey", "Hi", "Hello", "Bonjour" };

    public String getMessage(String name){
        return String.format("%s %s!", messages[new Random().nextInt(4)], name);
    }
}
