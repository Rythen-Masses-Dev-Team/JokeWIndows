package org.linuxy.main;

public class WInClose {
	public static void firefoxClose() {
		
		String[] Exlude = {""};
		String[]  WinEx = {"C:\\Program Files\\Mozilla Firefox\\firefox.exe","-new-window", "coderanch.com"};
		String[]  LinuxEx = {"firefox"};
		
		if (org.linuxy.etc.DetectOS.getOS()) {
			WinEx = Exlude; 
			
		}
		else if (org.linuxy.etc.DetectOS.isUnix()) {
			LinuxEx = Exlude;
			
		}
		

		
		  Runtime rt = Runtime.getRuntime();
		    try{
		    Process clientProcess = rt.exec(Exlude);
		 
		    int exitVal = clientProcess.waitFor();
		    System.out.println("Process exitValue: " + exitVal);
		 
		    } catch (Exception e){
		        e.printStackTrace();
		    }
	}
	

}
