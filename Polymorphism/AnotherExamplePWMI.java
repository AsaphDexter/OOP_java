package polymorphism;
/**
 *
 * @author AsaphDexter
 * another example of Runtime Polymorphism with multilevel inheritance.
 */
public class AnotherExamplePWMI { 
void eat(){
    System.out.println("animal is eating...");
}  
}  
  
class Lion extends AnotherExamplePWMI{  
@Override
void eat(){
    System.out.println("Lion is eating...");  
}  
}

class Cub extends Lion{  
public static void main(String[] args){  
AnotherExamplePWMI a = new Cub();  
a.eat();  
}

}



