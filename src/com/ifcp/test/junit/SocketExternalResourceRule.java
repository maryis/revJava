package com.ifcp.test.junit;

import org.junit.rules.ExternalResource;

public class SocketExternalResourceRule extends ExternalResource {

    private int server;

    @Override
    protected void before() throws Throwable { //runs before each test

        start(server);
    }

    private void start(int server) {
        System.out.println("server Started");
    }

    private void close(int server) {
        System.out.println("server Closed");

    }

    @Override
    protected void after() { //runs after each test
        close(server);
    }


}
