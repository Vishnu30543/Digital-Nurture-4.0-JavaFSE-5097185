package com.example.factorymethod;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening The Word document...");
    }
}
