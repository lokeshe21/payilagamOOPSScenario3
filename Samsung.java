public class Samsung extends FactoryDemo{
	
	static int price=5000;
	
public int call(int seconds){

	return seconds;
}
	
	
public void sendMessage(){
}

public void receiveCall(){
}
		
public void verifyFingerPrint(){
}

public void providePattern(){
}
public static void main(String[] args){
	Samsung sam= new Samsung();
	sam.browse();
	System.out.println(sam.price);


}
}

