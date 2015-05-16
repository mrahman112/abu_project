package xml;

import java.io.PrintStream;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class DuplicateTags {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void readXml(Document requestDoc,PrintStream out)throws Exception{
        Document responseDoc = null;
/*

        Element root = ((Object) requestDoc).getRootElement();

        List tableNameList = root.getChildren("TABLEDATA");

        for(int i=0; i<tableNameList.size(); i++){
            Element table = (Element) tableNameList.get(i);
            String tableName = table.getAttribute("name").getValue();
            int numOfRows = table.getAttribute("rows").getIntValue();
            System.out.println(tableName+" : tableName---------------------- numOfRows : "+numOfRows);

            List rowList = table.getChildren("ROW");
               for(int j=0; j<rowList.size(); j++){
                   Element row = (Element) rowList.get(j);
                   System.out.println("row : "+rowList.size());

                   List fieldList =  row.getChildren("FIELD");
                   System.out.println("----------------------");
                   for(int k=0; k<fieldList.size(); k++){
                       Element field = (Element) fieldList.get(k);
                       String fieldName = field.getAttribute("name").getValue();
                       String fieldValue = field.getTextTrim();
                       System.out.println(fieldName+"----------------------"+fieldValue);
                   }
                   System.out.println("----------------------");
               }

*/
        }



}
