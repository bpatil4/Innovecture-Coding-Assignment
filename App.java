package com.mycompany.app;

/**
Application:Hello world
Author:Bhagyashri Patil
Created on:28/02/2020 
*/
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
