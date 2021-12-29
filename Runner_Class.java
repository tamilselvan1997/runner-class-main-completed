package com.Mini_Project_Dec;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.configuration.Configuration_Reader_Manager;
import org.openqa.selenium.WebDriver;
import org.pom.Page_Object_Manager;
import com.property.Property_File;

public class Runner_Class extends Base_Class {

	public static WebDriver driver = getbrowser("chrome");

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	static Logger log = Logger.getLogger(Property_File.class);

	public static void main(String[] args) throws InterruptedException, IOException {

		PropertyConfigurator.configure("log4j.properties");

		String geturl = Configuration_Reader_Manager.getinstanceCRM().getinstanceCR().geturl();

		url(geturl);

		log.info("url launch sucessfully ");

		clickOnElement(pom.gethp().getSignin());

		thread(3000);

		String getusername = Configuration_Reader_Manager.getinstanceCRM().getinstanceCR().getusername();

		String getpassword = Configuration_Reader_Manager.getinstanceCRM().getinstanceCR().getpassword();

		inputValueElement(pom.getlp().getEmailid(), getusername);

		inputValueElement(pom.getlp().getPassword(), getpassword);

		clickOnElement(pom.getlp().getLogin());

		log.info("login sucessfully");

		clickOnElement(pom.getsp().getTshirt());

		clickOnElement(pom.getip().getImage());

		frame(pom.getsf().getFrame());

		clickOnElement(pom.getpage6().getPage());

		defaultcontent();

		thread(5000);

		clickOnElement(pom.getpage7().getSeven());

		clickOnElement(pom.getpage8().getEight());

		clickOnElement(pom.getpage9().getPage());

		clickOnElement(pom.getpage10().getTen());

		clickOnElement(pom.getpage11().getElevan());

		clickOnElement(pom.getpage12().getCheque());

		clickOnElement(pom.getpage13().getMyorder());

		log.info(" my order booked sucessfully");

		javascript("scrollintoview", pom.getpage13().getJscript());

		scroll("scrollby");

		screenshot("C:\\Users\\KATHIR\\Desktop\\desktop\\Testing\\Screenshots\\pic4.png");
	}

}
