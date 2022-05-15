package com.example.classes;

import com.example.interfaces.OutputFileAction;
import com.example.interfaces.ReadFileAction;
import com.example.interfaces.SearchAndReplaceAction;

import java.io.*;

public class XmlFile extends FileTest implements OutputFileAction, ReadFileAction, SearchAndReplaceAction {
    public XmlFile() {
    }

    public XmlFile(String inputPath, String outputPath) {
        super(inputPath, outputPath);
    }

    @Override
    public FileReader readFile() throws FileNotFoundException {

        return null;
    }

    @Override
    public String searchAndReplace(String searchString, String replaceString, FileReader file) throws IOException {

        return null;
    }

    @Override
    public void outputFile(String allString) throws IOException {



    }
}
