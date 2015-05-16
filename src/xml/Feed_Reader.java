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

public class Feed_Reader {
	
	
	static String url;
	static DocumentBuilder db;
	static Document doc;
	static DocumentBuilderFactory dbf;
	
	

	public void getTitles(String episodesUrl) throws MalformedURLException, SAXException, IOException, ParserConfigurationException {
	
		dbf = DocumentBuilderFactory.newInstance();
		 db = dbf.newDocumentBuilder();
		 doc = db.parse(new URL(episodesUrl).openStream());
		 doc.getDocumentElement().normalize();
		doc.getDocumentElement().normalize();
	 
		NodeList nList = doc.getElementsByTagName("item");
	 
		int index=0; 
		for (int temp = 0; temp < nList.getLength(); temp++) {
			
			
			Node nNode = nList.item(temp);
	 
			//System.out.println("\nCurrent Element :" + nNode.getNodeName());
	 
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	 
				Element eElement = (Element) nNode;
	 
				//System.out.println("Staff id : " + eElement.getAttribute("id"));
				
				try{
					System.out.println("Episode title is  : " + eElement.getElementsByTagName("title").item(0).getTextContent());
				
				
				}catch(Exception e){
					
				}
				index++;
				
	 
			}
		
			
		}
		System.out.println("total items present : "+index);
	    }
	
	public void getEpisodesInfoByName(String episodeName, String platform) throws ParserConfigurationException, MalformedURLException, SAXException, IOException{
		String staging="dCK2IC";  
		String production="HNK2IC";
		String episodesUrl;
		if(platform.equalsIgnoreCase(staging)){
		 episodesUrl="http://feed.theplatform.com/f/dCK2IC/atv_usa_show_overview?byCategories=Series/"+episodeName+"&byCustomValue={fullEpisode}{true}";
		}else{
			episodesUrl="http://feed.theplatform.com/f/HNK2IC/atv_usa_show_overview?byCategories=Series/"+episodeName+"&byCustomValue={fullEpisode}{true}";
		}
		dbf = DocumentBuilderFactory.newInstance();
		 db = dbf.newDocumentBuilder();
		 doc = db.parse(new URL(episodesUrl).openStream());
		 doc.getDocumentElement().normalize();
		doc.getDocumentElement().normalize();
		 
		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
	 
		NodeList nList = doc.getElementsByTagName("item");
	 
		System.out.println("----------------------------");
		int index=0; 
		for (int temp = 0; temp < nList.getLength(); temp++) {
			
			Node nNode = nList.item(temp);
	 
			System.out.println("\nCurrent Element :" + nNode.getNodeName());
	 
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	 
				Element eElement = (Element) nNode;
	 
				//System.out.println("Staff id : " + eElement.getAttribute("id"));
				
				try{
					System.out.println("Episode title is  : " + eElement.getElementsByTagName("title").item(0).getTextContent());
					String a=eElement.getElementsByTagName("dcterms:valid").item(0).getTextContent();
					String b[]=a.split(";");
					System.out.println(b[0]);
					System.out.println(b[1]);
				
				System.out.println("Category  : " + eElement.getElementsByTagName("media:category").item(0).getTextContent());
				
				System.out.println("Ratings  : " + eElement.getElementsByTagName("media:rating").item(0).getTextContent());
				
				System.out.println("Entitlement  : " + eElement.getElementsByTagName("pl1:entitlement").item(0).getTextContent());
				System.out.println("Published on  : " + eElement.getElementsByTagName("pubDate").item(0).getTextContent());
				}catch(Exception e){
					
				}
				index++;
		}
		}
		System.out.println("total items present : "+index);
	    }
	
	public void getImageUrlByEpisodeName(String episodeName) throws MalformedURLException, SAXException, IOException, ParserConfigurationException {
		
		String episodesUrl="http://feed.theplatform.com/f/dCK2IC/atv_usa_show_overview?byCategories=Series/"+episodeName+"&byCustomValue={fullEpisode}{true}";
		
		dbf = DocumentBuilderFactory.newInstance();
		 db = dbf.newDocumentBuilder();
		 doc = db.parse(new URL(episodesUrl).openStream());
		 doc.getDocumentElement().normalize();
		
	 
		NodeList nPanList = doc.getElementsByTagName("media:thumbnail");


		for(int temp = 0 ; temp <nPanList.getLength(); temp++){
		Node nNode = nPanList.item(temp);
		
		if(nNode.getNodeType()==Node.ELEMENT_NODE){
			Element eElement = (Element) nNode;
			String mUrl=eElement.getAttribute("url");
			System.out.println(mUrl);
		}
		}
		/*
		NodeList childList = eElement.getChildNodes();
		String [] sPANNO = new String[childList.getLength()] ;
		for(int i = 0; i < childList.getLength(); i++){
		Node childNode = childList.item(i);
		sPANNO[i] = childNode.getNodeName() + "\t" +childNode.getTextContent();
		System.out.println(sPANNO[i]);
		}
		*/
		} 
		
		public void getLatestEpisode(String url) throws MalformedURLException, SAXException, IOException, ParserConfigurationException {
			
			//String episodesUrl="http://feed.theplatform.com/f/dCK2IC/atv_usa_show_overview?byCategories=Series/"+episodeName+"&byCustomValue={fullEpisode}{true}";
			
			dbf = DocumentBuilderFactory.newInstance();
			 db = dbf.newDocumentBuilder();
			 doc = db.parse(new URL(url).openStream());
			 doc.getDocumentElement().normalize();
			
		 
			NodeList nPanList = doc.getElementsByTagName("media:thumbnail");


			for(int temp = 0 ; temp <nPanList.getLength(); temp++){
			Node nNode = nPanList.item(temp);
			
			if(nNode.getNodeType()==Node.ELEMENT_NODE){
				Element eElement = (Element) nNode;
				String mUrl=eElement.getAttribute("url");
				System.out.println(mUrl);
			}
			/*
			NodeList childList = eElement.getChildNodes();
			String [] sPANNO = new String[childList.getLength()] ;
			for(int i = 0; i < childList.getLength(); i++){
			Node childNode = childList.item(i);
			sPANNO[i] = childNode.getNodeName() + "\t" +childNode.getTextContent();
			System.out.println(sPANNO[i]);
			}
			*/
			} 
			
	}
		public void getEntitledEpisode(String url) throws ParserConfigurationException, MalformedURLException, SAXException, IOException{
			dbf = DocumentBuilderFactory.newInstance();
			 db = dbf.newDocumentBuilder();
			 doc = db.parse(new URL(url).openStream());
			 doc.getDocumentElement().normalize();
			
		 
			NodeList nPanList = doc.getElementsByTagName("item");


			for(int temp = 0 ; temp <nPanList.getLength(); temp++){
			Node nNode = nPanList.item(temp);
			
			if(nNode.getNodeType()==Node.ELEMENT_NODE){
				Element eElement = (Element) nNode;
				System.out.println("Title : " + eElement.getElementsByTagName("title").item(0).getTextContent());
				System.out.println("Entitlement  : " + eElement.getElementsByTagName("pl1:entitlement").item(0).getTextContent());
				
			}
		}
}
}