package com.example.interfaces;

import java.io.FileNotFoundException;
import java.io.FileReader;

public interface ReadFileAction {
    public FileReader readFile() throws FileNotFoundException;

}
