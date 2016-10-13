package org.linuxy.main;

import java.net.URISyntaxException;

import org.linuxy.etc.DonePrint;
import org.linuxy.etc.WhileWebsite;
import org.linuxy.etc.logo;
import org.linuxy.etc.DonePrint.*;
public class Main {

	/**
	 * @param args
	 * @throws InterruptedException 
	 * @throws URISyntaxException 
	 */
	public static void main(String[] args) throws InterruptedException, URISyntaxException {
		logo.LogoWrite();
		System.out.println("WARNING:YOU HAVE INCIATED A TROGEN!");
		Thread.sleep(1500);
		System.out.println("Now Extracting VIRUS");
		System.out.println("FUck the niggers");
		Thread.sleep(1500);
		Progress();
		DonePrint.Print();
		System.out.println("Now Installing Virus");
		Thread.sleep(1500);
		Progress();
		DonePrint.Print();
		System.out.println("Getting my Porn");
		Desktop1.Google();
		Desktop1.meatspin();
		Desktop1.Amazon();	
		WhileWebsite.WhileLoopWebsites();
		

	}
private static void Progress() {
	try {
	      for (double progressPercentage = 0.0; progressPercentage < 1.0; progressPercentage += 0.01) {
	        ProgressDemo.updateProgress(progressPercentage);
	        Thread.sleep(20);
	      }
	    } catch (InterruptedException e) {}
	  }
}
