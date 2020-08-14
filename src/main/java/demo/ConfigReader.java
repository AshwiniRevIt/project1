package demo;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

 

public class ConfigReader {

 

        // TODO Auto-generated method stub
             String configPath;
             Properties prop;
             public ConfigReader(String configPath) throws Exception
             {
                 this.configPath=configPath;
                 File fi=new File(this.configPath);
                 FileInputStream read=new FileInputStream(fi);
                 prop=new Properties();
                 prop.load(read);
                 //Configshow("browserName");
             }
             public void Configshow(String key)throws Exception
             {
                //Properties prop=new Properties();
                //prop.get(key);
                System.out.println(prop.getProperty(key));
             } 
            public static void main(String args[])throws Exception {
                ConfigReader cr=new ConfigReader("C:\\Users\\Lotus\\eclipse-workspace\\demo\\src\\test\\resources\\config\\config.properties");
                cr.Configshow("browserName");
                cr.Configshow("username");
                cr.Configshow("password");
            }
         }
 
 


/*public void configfetch(String configpath, String key) throws IOException {
	 File fi=new File (configpath);
	 FileInputStream reader=new FileInputStream(fi);
	 Properties prop=new Properties();
	 prop.load(reader);
	 prop.get(key);
}
public static void main(String[] args) throws IOException  {
	ConfigReader cr=new ConfigReader();
	cr .configfetch("C:\\Users\\Lotus\\eclipse-workspace\\demo\\src\\test\\resources\\config\\config.properties","key");
}
}*/
