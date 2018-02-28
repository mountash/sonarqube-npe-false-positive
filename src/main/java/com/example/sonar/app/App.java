package com.example.sonar.app;

import com.example.sonar.util.Util;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ExampleObject obj = null;
        if(Util.isNotEmpty(obj)){
            System.out.println(obj.getName());
        } else {
            System.out.println("ExampleObject is empty");
        }
    }
}
