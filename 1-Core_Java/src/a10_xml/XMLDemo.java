package a10_xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

//import org.w3c.dom.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLDemo {

    // XML file to be created and read.
    private static final String FILE_NAME = "src/a10_xml/students.xml";

    public static void main(String[] args) {
        createXML();
        System.out.println();
        readXML();
    }

    // Creates an XML file using the DOM API.
    public static void createXML() {

        try {

            // DocumentBuilderFactory creates a DocumentBuilder.
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Document represents the complete XML document.
            Document document = builder.newDocument();

            // Root Element <students>
            Element root = document.createElement("students");
            document.appendChild(root);

            // Child Element <student>
            Element student = document.createElement("student");

            // Adding an attribute to <student>.
            student.setAttribute("id", "101");

            // <name>Dipesh</name>
            Element name = document.createElement("name");
            name.appendChild(document.createTextNode("Dipesh"));

            // <age>21</age>
            Element age = document.createElement("age");
            age.appendChild(document.createTextNode("21"));

            // Constructing the XML hierarchy.
            student.appendChild(name);
            student.appendChild(age);

            root.appendChild(student);

            // Transformer writes the XML Document from memory (RAM) to the XML file (Disk).
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            
            // Pretty prints the XML.
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File(FILE_NAME));
            transformer.transform(source, result);

            System.out.println("XML file created successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    
    
    // Reads and parses the XML file.
    public static void readXML() {

        try {

            File xmlFile = new File(FILE_NAME);				

            if (!xmlFile.exists()) {
                System.out.println("XML file not found.");
                return;
            }

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse(xmlFile);

            // Normalizes the XML structure.
            document.getDocumentElement().normalize();

            // Returns all <student> elements.
            NodeList students = document.getElementsByTagName("student");

            System.out.println("Parsed XML:");

            for (int i = 0; i < students.getLength(); i++) {

                Node node = students.item(i);

                // Checks whether the node is an Element.
                if (node.getNodeType() == Node.ELEMENT_NODE) {

                    Element student = (Element) node;			// Downcasting.

                    String id = student.getAttribute("id");

                    String name = student.getElementsByTagName("name").item(0).getTextContent();

                    String age = student.getElementsByTagName("age").item(0).getTextContent();

                    System.out.println("ID : " + id);
                    System.out.println("Name : " + name);
                    System.out.println("Age : " + age);
                    System.out.println();

                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}