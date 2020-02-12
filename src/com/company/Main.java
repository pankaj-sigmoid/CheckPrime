package com.company;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        PrimeChecker primeChecker =new PrimeChecker();
        primeChecker.setFileInput(new FileInput());

        boolean result= primeChecker.check();

        if(result) System.out.println("prime");
        else System.out.println("not prime");
    }
}
