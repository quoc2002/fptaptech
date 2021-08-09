import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.List;

public class XmlJdbcDemo {
    public static void main(String[] args) throws  Exception{
        // 1. Load driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/dbxml";
        String username="root";
        String password="";
        Connection connection = DriverManager.getConnection(url,username,password);

        // create tables according to the XML file
        connection.createStatement().execute("create table books (\n"+
                "id integer primary key auto_increment,\n"+
                "book_id varchar(30) not null unique,\n"+
                "author varchar(100) not null,\n"+
                "title varchar(250) not null ,\n"+
                "genre varchar(25) not null, \n"+
                "price float not null,\n"+
                "publish_date date not null,\n"+
                "description text not null \n"  + ")"
        );

        // XML Loading
        File file = new File("src/Books.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document xmlDoc = builder.parse(file);

        XPath xPath = XPathFactory.newInstance().newXPath();
        Object res = xPath.evaluate("/catalog/book",xmlDoc, XPathConstants.NODESET);

        NodeList nodeList = (NodeList) res;

        PreparedStatement stmt = connection.prepareStatement("insert into books" +
                "(book_id, author,title, genre, price,publish_date,description) values("+
                "?,?,?,?,?,str_to_date(?,'%Y-%m-%d'),?)");

        //save to db
        for(int i=0;i<nodeList.getLength();i++){
            Node node = nodeList.item(i);
            List<String> columns = Arrays.asList(getAttrValue(node,"id"),
                    getTextContent(node,"author"),
                    getTextContent(node,"title"),
                    getTextContent(node,"genre"),
                    getTextContent(node,"price"),
                    getTextContent(node,"publish_date"),
                    getTextContent(node,"description")

            );
            for(int n=0;n<columns.size();n++){
                stmt.setString(n+1,columns.get(n));
            }
            stmt.executeUpdate();
            System.out.println("Import xml data success");
        }

        // stmt.set
        //stmt.setString(1,"");

    }

    static  private String getAttrValue(Node node, String attrName){
        if(!node.hasAttributes()) {
            return "";
        }

        NamedNodeMap nmap = node.getAttributes();

        if(nmap==null) return "";

        Node n = nmap.getNamedItem(attrName);
        if(n == null) return "";

        return n.getNodeValue();
    }

    static private String getTextContent (Node parentNode, String childNode){
        NodeList nlist = parentNode.getChildNodes();
        for(int i = 0; i<nlist.getLength();i++){
            Node n = nlist.item(i);
            String name = n.getNodeName();
            if(name!=null && name.equals(childNode)){
                return  n.getTextContent();
            }
        }
        return "";
    }
}
