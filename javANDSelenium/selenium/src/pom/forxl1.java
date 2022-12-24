package pom;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class forxl1 {
	public static String xl(int a,int b) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream file =new FileInputStream("D:\\december_practice\\all start_to_end\\javANDSelenium\\data.xlsx");
	
String val=	WorkbookFactory.create(file).getSheet("Credentials").getRow(a).getCell(b).getStringCellValue();
	return val;
	}

}
