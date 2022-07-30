package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configproperties {
	Properties prop;
	public Configproperties() throws Exception {
		File src = new File("./testdata/config.properties");
		FileInputStream fis = new FileInputStream(src);
		prop = new Properties();
			prop.load(fis);		
	}

	public String geturl() {
		return prop.getProperty("link");

	}

	public String getDriver() {
		return prop.getProperty("chromedriver");
	}
}
