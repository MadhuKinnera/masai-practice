package com.madhu;



public class App {

	public static void main(String[] args) {
		
		String from  = "kinnerapavankalyan7@gmail.com";
		String to  = "hollypoter5@gmail.com";
		String subject  = "Sending Using Java";
		String text  = "Iam sending this email using Java Application";
		
		
		GmailSender sender = new GmailSender();
		
		boolean result = sender.sendGmail(to, from, subject, text);
		
		if(result) {
			System.out.println("Gmail Sent Successfully ");
		}else {
			System.out.println("There is a problem in sending gmail ");
		}
	}

}
