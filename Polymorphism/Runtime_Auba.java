package polymorphism;
/**
 *
 * @author AsaphDexter
 */
public class Runtime_Auba extends Runtime_Ozil {
      int maxspeed = 100; 
      public static void main(String args[]){  
  Runtime_Ozil myObj = new Runtime_Auba();  
  System.out.println(myObj.maxspeed);//70  
}  
}
