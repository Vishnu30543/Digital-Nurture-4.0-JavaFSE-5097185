package com.example.factorymethod;

public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening The PDF document...");
    }
}
