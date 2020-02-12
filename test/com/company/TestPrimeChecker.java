package com.company;

import org.junit.*;
import org.mockito.Mock;
import org.mockito.Spy;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class TestPrimeChecker {

    PrimeChecker primeChecker;
    PrimeChecker primeChecker1;

    @Mock
    FileInput fileInput;

    @Spy
    FileInput fileInput1;


    @Before
    public void setup(){
        primeChecker =new PrimeChecker();
        fileInput =mock(FileInput.class);
        primeChecker.setFileInput(fileInput);
        primeChecker1 = new PrimeChecker();
        fileInput1 = spy(new FileInput());
        primeChecker1.setFileInput(fileInput1);
    }

    @Test
    public void testPrime() throws IOException {
        when(fileInput.takeInputFromExternalFile()).thenReturn(5);
        boolean res= primeChecker.check();
        Assert.assertTrue(res);
    }

    @Test
    public void testNotPrime() throws IOException {
        when(fileInput.takeInputFromExternalFile()).thenReturn(8);
        boolean res= primeChecker.check();
        Assert.assertFalse(res);
    }

    @Test
    public void testNegative() throws IOException {
        doReturn(-7).when(fileInput1).takeInputFromExternalFile();
        boolean res= primeChecker1.check();
        Assert.assertFalse(res);
    }

    @Test
    public void testOne() throws IOException {
        doReturn(1).when(fileInput1).takeInputFromExternalFile();
        boolean res= primeChecker1.check();
        Assert.assertFalse(res);
    }


}
