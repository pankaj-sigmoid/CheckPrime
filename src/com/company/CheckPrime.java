package com.company;

import java.io.IOException;

public class CheckPrime {

    private FileInput fileInput;
    public void setFileInput(FileInput fileInput){
        this.fileInput = fileInput;
    }

    public boolean isPrime() throws IOException {

        int num= fileInput.takeInputFromExternalFile();

        // Corner case
        if (num <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < num; i++)
            if (num % i == 0)
                return false;

        return true;
    }

}
