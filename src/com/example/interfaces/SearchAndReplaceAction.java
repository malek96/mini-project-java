package com.example.interfaces;

import java.io.FileReader;
import java.io.IOException;

public interface SearchAndReplaceAction {
    public String searchAndReplace (String searchString, String replaceString, FileReader file) throws IOException;

}
