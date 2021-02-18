package com.Banking.App;


public class Mainclass {

	public static void main(String[] args) 
	{
		AccountService.createAcnt("Smith", "pwd123", 98765441232l);
		AccountService.showAcntDetails();
		AccountService.startTransaction("Smith", 1929);
		AccountService.showMenu();
	}

}
