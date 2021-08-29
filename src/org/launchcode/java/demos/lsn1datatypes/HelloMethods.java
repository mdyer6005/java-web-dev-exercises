package org.launchcode.java.demos.lsn1datatypes;

public class HelloMethods {

    public static void main(String[] args) {
        String message = Message.getMessage("fr");
        message = message.concat(" changed");
        System.out.println(message);
    }

}
