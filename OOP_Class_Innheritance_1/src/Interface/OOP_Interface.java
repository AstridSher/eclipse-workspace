
package Interface;
interface In1 {
	   
  
    final int a = 10;
 
   
    void display();
}
 

class TestClass implements In1 {
   
   
    public void display(){ 
      System.out.println("Afrin"); 
    }

public class OOP_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TestClass t = new TestClass();
	        t.display();
	        System.out.println(a);
	}
}

}