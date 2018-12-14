package com.transport;

import com.transport.view.Printer;

import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Printer printer = new Printer();
        printer.start();
    }
}

