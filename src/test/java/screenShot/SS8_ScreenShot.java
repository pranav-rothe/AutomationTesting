package screenShot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class SS8_ScreenShot {

	
	public static void screenShot(WebDriver driver, String text) throws IOException {
		
		String timeStamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String path=".//ScreenShot//";
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File(path+text+"_"+timeStamp+".jpg");
		
		FileUtils.copyFile(src, des);
	}

}
