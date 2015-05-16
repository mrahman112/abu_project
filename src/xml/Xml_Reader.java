package xml;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Xml_Reader {

	public static void main(String[] args) throws MalformedURLException, SAXException, IOException, ParserConfigurationException {
		/*
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(new URL("http://feed.theplatform.com/f/dCK2IC/atv_usa_showcase_stage").openStream());
		doc.getDocumentElement().normalize();
		 
		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
	 
		NodeList nList = doc.getElementsByTagName("item");
	 
		System.out.println("----------------------------");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			 
			Node nNode = nList.item(temp);
	 
			System.out.println("\nCurrent Element :" + nNode.getNodeName());
	 
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	 
				Element eElement = (Element) nNode;
	 
				//System.out.println("Staff id : " + eElement.getAttribute("id"));
				System.out.println("Episode title is  : " + eElement.getElementsByTagName("title").item(0).getTextContent());
				
	 
			}
		}
		*/
		String episodesUrl="http://feed.theplatform.com/f/dCK2IC/atv_usa_show_overview?byCustomValue={fullEpisode}{true}";
		Feed_Reader fr=new Feed_Reader();
		//fr.getImageUrlByEpisodeName(episodesUrl);
		//fr.getEpisodesInfoByName("Benched", "production");
		fr.getEntitledEpisode(episodesUrl);
	    }
}
	  
	 
