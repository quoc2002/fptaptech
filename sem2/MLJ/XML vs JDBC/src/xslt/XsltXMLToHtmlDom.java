package xslt;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;

public class XsltXMLToHtmlDom {
    private static final String XML_FILE="src/xslt/demo.xml";
    private static final String XSLT_FILE="src/xslt/demo-staff.xslt";

    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        InputStream inputStream = new FileInputStream(XML_FILE);
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(inputStream);
        FileOutputStream fileOutputStream = new FileOutputStream("src/xslt/staff.html");
        transformXML(document,fileOutputStream);
    }
    private static void transformXML(Document doc, OutputStream output)throws Exception {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer(new StreamSource(new File(XSLT_FILE)));
        transformer.transform(new DOMSource(doc),new StreamResult(output));

    }
}
