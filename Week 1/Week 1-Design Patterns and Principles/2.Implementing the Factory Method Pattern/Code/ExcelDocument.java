package com.example.factorymethod;

public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening The Excel document...");
    }
}
