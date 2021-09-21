package Interfaces;

public class Main {
	
	public static void main(String[] args) {
////		ITelephone neetigyaPhone;
//		ITelephone 	neetigyaPhone = new DeskPhone(123456);
//		neetigyaPhone.powerOn();
//		neetigyaPhone.callPhone(123456);
//		neetigyaPhone.answer();
////		neetigyaPhone.getMake();
//		
		DeskPhone 	deskPhone = new DeskPhone(123456);
		deskPhone.getMake();
		
		
		// dynamic polymorphism  
		
		deskPhone.powerOn();
		
		deskPhone = new MobilePhone(123456);
		deskPhone.powerOn();
//		deskPhone.getChargerType();
		
		MobilePhone mobilePhone = (MobilePhone)deskPhone; 
		mobilePhone.getChargerType();
		
	}

}
