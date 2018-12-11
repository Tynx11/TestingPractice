package ITIS;

import ITIS.Model.Message;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Data {

    public static String file = "src/Data.xml";
    private static List<String> message;
    private static Document document;

    static {
        File f = new File(file);
        if (!f.exists()) {
            try {
                throw new Exception("Problem: data file not found: " + file);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = null;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        try {
            document = dBuilder.parse(f);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        document.getDocumentElement().normalize();

    }


    public static List<String> getMessage() {
        if (message == null) {
            message = new ArrayList();
            NodeList nodes = document.getElementsByTagName("text");
            for (int i = 0; i < nodes.getLength() ; i++) {
                message.add(nodes.item(i).getTextContent());

            }
        }
        return message;
    }
}
