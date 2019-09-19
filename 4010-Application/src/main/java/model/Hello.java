package model;

public class Hello {

	String address;
	String address1;
	
	
	public static void main(String args[]){

		Names names= new Names();
		
		names.setfName("Vineeth");
		names.setlName("Reddy");
		names.setmName("xyz");
		names.setAge(20);
		names.setId(1);
		
		System.out.println("The first Name is :" +names.getfName());
		
		}
}
