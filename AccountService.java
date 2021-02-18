package com.Banking.App;
//OBJECT CREATION LAYER / SPRING CLASS AND ENCAPSULATION
public class AccountService 
{

	private static int ID = 1;
	private static UserAccount a1;
	private static Application app;

	public static UserAccount createAcnt(String un, String pwd, long mob) {
		a1 = new UserAccount(ID, un, pwd, mob);
		ID++;
		return a1;
	}
	public static Application startTransaction(String cname,long cid)
	{
		app = new Application(cname, cid);
		return app;
	}
	public static void showMenu()
	{
	   app.BankMenu();
	}

	public static void showAcntDetails() {
		System.out.println("Customer No.          : "+a1.getId());
		System.out.println("Customer Phone Number :"+a1.getMob());
		System.out.println();
	}

	public static void updateMob(long newMob) {
		System.out.println("Old mob : " + a1.getMob());
		a1.setMob(newMob);
		System.out.println("Updated mob : " + a1.getMob());
	}

	public static void updatePwd(String newPwd) {
		System.out.println("Updating password");
		a1.setPwd(newPwd);
		System.out.println("Password Updated");
	}

}
