package Interfaces;


interface waterbottle{
	String color = "Blue";
	void fillUp();
	void pourout();
}


public class interfaceexample implements waterbottle  {
	
      public static void main(String[] args) {
		System.out.println(color);
		interfaceexample ex = new interfaceexample();
		ex.fillUp();
		ex.pourout();

	}
     
	@Override
	public void fillUp() {
		 System.out.println( "It is filled" );  
	}

	@Override
	public void pourout() {
	System.out.println("It is poured out");
		
	}
      

}
