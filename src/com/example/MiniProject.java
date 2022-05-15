package com.example;

import com.example.classes.FileTest;
import com.example.classes.TxtFile;
import com.example.classes.XmlFile;
import jdk.internal.org.xml.sax.InputSource;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.*;
public class MiniProject {
    public static void main(String[] arg) throws IOException, ParserConfigurationException {
        /**
         *  *.txt and *.xml files are created for test.
         * */

        /**  this code for search and replace in text file */
        TxtFile txtFile = new TxtFile("src/com/example/filetxt.txt","src/com/example/filetxtOutPut.txt");
        FileReader fileReader = txtFile.readFile();
        String xmlString = txtFile.searchAndReplace("customer","client",fileReader);
        txtFile.outputFile(xmlString);
        /**
         * my last try to do the second use case of search and replace in *.xml file
         */
        /*
        File file = new File("src/com/example/template.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        try {
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();
            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getDocumentElement().getChildNodes();
            System.out.println("node value : "+nodeList);
            for (int itr = 0; itr < nodeList.getLength(); itr++)
            {
                Node node = nodeList.item(itr);
                if(node.hasChildNodes()){

                }
                if(node.hasAttributes()){
                    NamedNodeMap namedNodeMap = node.getAttributes();
                    for (int i = 0; i < namedNodeMap.getLength(); i++)
                    {
                        Node atr =  namedNodeMap.item(i);
                        System.out.println("node atr : "+atr.getNodeName());


                    }
                }

            }

            } catch (SAXException e) {
            e.printStackTrace();
        }
        */



    }


}
