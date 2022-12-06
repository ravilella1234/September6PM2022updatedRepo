package selenium;

import org.apache.log4j.Logger;

public class TC_005 extends BaseTest
{
	private static final Logger log = Logger.getLogger(TC_005.class);
	
	public static void main(String[] args) throws Exception 
	{
		init();
		log.info("Init the properties files....");
		
		launch("chromebrowser");
		log.info("Openong the Browser : " + p.getProperty("chromebrowser") );
		
		navigateUrl("amazonurl");
		log.info("Navigating to Url : " + childProp.getProperty("amazonurl"));
		
		selectOption("amazonsearchdropbox_id","Books");
		log.info("Selecting the option Books By using the locator : " + orProp.getProperty("amazonsearchdropbox_id"));
				
		typeText("amazonsearchtextbox_id","Harry Potter");
		log.info("Entering Text Harry Potter By using locator : " + orProp.getProperty("amazonsearchtextbox_id"));
		
		clickElement("amazonsearchbutton_xpath");
		log.info("Clicked on Element By using locator : " + orProp.getProperty("amazonsearchbutton_xpath"));
		
	}
}
