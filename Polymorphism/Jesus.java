package polymorphism;
/**
 *
 * @author AsaphDexter
 */
public class Jesus extends Xhaka{  
  void kick(){
      System.out.println("with the ball, received from Xhaka, Scoring");
  }  
  public static void main(String args[]){  
    Xhaka ball = new Jesus();//upcasting  
    ball.kick();  
  }  
}  