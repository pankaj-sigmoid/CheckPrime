package com.company;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CheckPrime checkPrime=new CheckPrime();
        checkPrime.setFileInput(new FileInput());

        boolean result=checkPrime.isPrime();

        if(result) System.out.println("prime");
        else System.out.println("not prime");
    }
}
