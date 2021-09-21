package Interfaces;

public class MobilePhone extends DeskPhone {

	public MobilePhone(int myNumber) {
		super(myNumber);
	}
	@Override
	public void powerOn() {
		System.out.println("MobilePhone - Power ON ");
		
	} 
	
	public String getChargerType() {
		// TODO Auto-generated method stub
		return " Ctype";
	}
	
	
}
