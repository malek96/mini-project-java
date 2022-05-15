package com.example.classes;

import com.example.interfaces.OutputFileAction;
import com.example.interfaces.ReadFileAction;
import com.example.interfaces.SearchAndReplaceAction;

import java.io.*;

public class TxtFile extends FileTest implements OutputFileAction, ReadFileAction, SearchAndReplaceAction {
    public TxtFile() {
    }

    public TxtFile(String inputPath, String outputPath) {
        super(inputPath, outputPath);
    }

    @Override
    public FileReader readFile() throws FileNotFoundException {
        FileReader reader = new FileReader(this.getInputPath());
        return reader;
    }

    @Override
    public String searchAndReplace(String searchString, String replaceString, FileReader file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(file);
        StringBuilder allString = new StringBuilder();
        String oneLine = "";

        while ((oneLine = bufferedReader.readLine()) != null){
            oneLine = oneLine.replaceAll(searchString, replaceString);
            allString.append(oneLine+"\n");
        }
        bufferedReader.close();
        return allString.toString();
    }

    @Override
    public void outputFile(String allString) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.getOutputPath()));
        bufferedWriter.write(allString);
        bufferedWriter.close();
    }
}
