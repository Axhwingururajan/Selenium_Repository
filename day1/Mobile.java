package week1.day1;
public class Mobile {
public void makeCall() {
	String mobileModel="I-Phone15";
	float mobileWeight=6.37f;
	System.out.println(mobileModel +" Pro Max");
	System.out.println(mobileWeight +" Weight");
}
public void sendMsg() {
	boolean isFullCharged=true;
	int mobileCost=79900;
	System.out.println(isFullCharged +" fully charged");
	System.out.println(mobileCost +" is my mobile cost");
}	
public static void main (String[] args) {
	Mobile rogMobile=new Mobile();
	System.out.println("This is My Mobile Specification :\n");
	rogMobile.makeCall();
	rogMobile. sendMsg();	
}
}