package org.linuxy.main;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class Desktop1 {
	public static String GetName = "";
	

	public static void Google() throws URISyntaxException, InterruptedException {
		GetName = "Google.com";
		System.out.println("Run ning" + GetName);
		Thread.sleep(5000); 
		
	    try {
	        URI uri = new URI("https://www.google.com");
	        Desktop desktop = null;
	        if (Desktop.isDesktopSupported()) {
	          desktop = Desktop.getDesktop();
	        }

	        if (desktop != null)
	          desktop.browse(uri);
	      } catch (IOException ioe) {
	        ioe.printStackTrace();
	      } catch (URISyntaxException use) {
	        use.printStackTrace();
	      }

	    }

public static void  Amazon() throws URISyntaxException, InterruptedException {
	GetName = "Amazon";
	System.out.println("Running" + GetName);
	Thread.sleep(5000); 
    try {
        URI uri = new URI("https://www.google.com");
        Desktop desktop = null;
        if (Desktop.isDesktopSupported()) {
          desktop = Desktop.getDesktop();
        }

        if (desktop != null)
          desktop.browse(uri);
      } catch (IOException ioe) {
        ioe.printStackTrace();
      } catch (URISyntaxException use) {
        use.printStackTrace();
      }

    }

public static void  YouTube() throws URISyntaxException, InterruptedException {
	GetName = "YouTube";
	System.out.println("Running" + GetName);
	Thread.sleep(5000); 
    try {
        URI uri = new URI("https://www.youtube.com");
        Desktop desktop = null;
        if (Desktop.isDesktopSupported()) {
          desktop = Desktop.getDesktop();
        }

        if (desktop != null)
          desktop.browse(uri);
      } catch (IOException ioe) {
        ioe.printStackTrace();
      } catch (URISyntaxException use) {
        use.printStackTrace();
      }

    }

public static void  meatspin() throws URISyntaxException, InterruptedException {
	GetName = "YouAreAIdot";
	System.out.println("Running" + GetName);
	Thread.sleep(5000); 
    try {
        URI uri = new URI("http://www.youareanidiot.org/");
        Desktop desktop = null;
        if (Desktop.isDesktopSupported()) {
          desktop = Desktop.getDesktop();
        }

        if (desktop != null)
          desktop.browse(uri);
      } catch (IOException ioe) {
        ioe.printStackTrace();
      } catch (URISyntaxException use) {
        use.printStackTrace();
      }

    }
}
	