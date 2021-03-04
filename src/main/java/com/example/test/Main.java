package com.example.test;

import java.util.Iterator;
import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {
        ServiceLoader<GetVersion> serviceLoader = ServiceLoader.load(GetVersion.class);
        Iterator<GetVersion> iterator = serviceLoader.iterator();
        if (iterator.hasNext()) {
            System.out.println("Version from POM is " + iterator.next().getVersion());
        } else {
            throw new RuntimeException("No implementation of GetVersion found");
        }
    }

}
