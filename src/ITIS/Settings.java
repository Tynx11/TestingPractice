package ITIS;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Settings {
    public static String file = "src/Settings.xml";

    private static String baseUrl;
    private static String login;
    private static String password;
    private static Document document;

    static {
        File f = new File(file);
        if (!f.exists()) {
            try {
                throw new Exception("Problem: settings file not found: " + file);
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

    public static String getBaseUrl() {
        if (baseUrl == null) {
            baseUrl = document.getElementsByTagName("BaseUrl").item(0).getFirstChild().getNodeValue();
        }
        return baseUrl;
    }

    public static String getLogin() {
        if (login == null) {
            login = document.getElementsByTagName("Login").item(0).getFirstChild().getNodeValue();
        }
        return login;
    }

    public static String getPassword() {
        if (password == null) {
            password = document.getElementsByTagName("Password").item(0).getFirstChild().getNodeValue();
        }
        return password;
    }
}