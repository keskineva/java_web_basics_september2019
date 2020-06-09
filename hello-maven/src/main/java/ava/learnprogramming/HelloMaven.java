package ava.learnprogramming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloMaven {
    private final static Logger log = LoggerFactory.getLogger(HelloMaven.class);

    public static void main(String[] args) {
        log.info("hello info");
        log.debug("hello debug");
    }
}
