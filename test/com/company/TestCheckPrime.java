package com.company;

import org.junit.*;
import org.mockito.Mock;
import org.mockito.Spy;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class TestCheckPrime {

    CheckPrime checkPrime;
    CheckPrime checkPrime1;

    @Mock
    FileInput fileInput;

    @Spy
    FileInput fileInput1;


    @Before
    public void setup(){
        checkPrime =new CheckPrime();
        fileInput =mock(FileInput.class);
        checkPrime.setFileInput(fileInput);
        checkPrime1 = new CheckPrime();
        fileInput1 = spy(new FileInput());
        checkPrime1.setFileInput(fileInput1);
    }

    @Test
    public void testPrime() throws IOException {
        when(fileInput.takeInputFromExternalFile()).thenReturn(5);
        boolean res= checkPrime.isPrime();
        Assert.assertTrue(res);
    }

    @Test
    public void testNotPrime() throws IOException {
        when(fileInput.takeInputFromExternalFile()).thenReturn(8);
        boolean res= checkPrime.isPrime();
        Assert.assertFalse(res);
    }

    @Test
    public void testNegative() throws IOException {
        doReturn(-7).when(fileInput1).takeInputFromExternalFile();
        boolean res= checkPrime1.isPrime();
        Assert.assertFalse(res);
    }

    @Test
    public void testOne() throws IOException {
        doReturn(1).when(fileInput1).takeInputFromExternalFile();
        boolean res= checkPrime1.isPrime();
        Assert.assertFalse(res);
    }


}
