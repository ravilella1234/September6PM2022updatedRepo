package webdriverScreenshots;

import java.util.Date;

public class Selfy5 
{

	public static void main(String[] args) 
	{
		Date dt = new Date();
		System.out.println(dt);
		String d = dt.toString().replace(':', '_').replace(' ', '_');
		System.out.println(d);
	}

}
