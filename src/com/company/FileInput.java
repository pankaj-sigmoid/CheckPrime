package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileInput {

    public int takeInputFromExternalFile() throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("input"));
        int num=Integer.parseInt(br.readLine());
        return num;
    }
}
