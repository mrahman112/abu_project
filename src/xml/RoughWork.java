package xml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class RoughWork {
	
	@Test
	public static void testingrog() throws Exception {
		
String url="http://feed.theplatform.com/f/HNK2IC/atv_usa_shelf2_v2";
		DataFeed d=new DataFeed();
		//System.out.println(d.getShowTitles(url));
		//System.out.println(d.getShowClipTitles(url));
		//System.out.println(d.getShowEpisodeTitles(url));
		Reporter.log("<strong>DATA SETUP</strong>");

    	System.out.println(d.getShowTitles(url));
		//System.out.println(d.getShowAssetID(url, "Balls"));
		Reporter.log("<strong>UI SETUP</strong>");

	}

}
