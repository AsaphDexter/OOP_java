package polymorphism;
/**
 *
 * @author AsaphDexter
 * simple example of Runtime Polymorphism with multilevel inheritance.
 */
public class PolymorphismWiithMultilevelInheritance { 
void eat(){System.out.println("eating");}  
}  
  
class Dog extends PolymorphismWiithMultilevelInheritance{  
@Override
void eat(){System.out.println("eating bones");}  
}  
  
class BabyDog extends Dog{  
@Override
void eat(){System.out.println("drinking milk");}  
  
public static void main(String[] args){  
PolymorphismWiithMultilevelInheritance a, b ,c;  
a = new PolymorphismWiithMultilevelInheritance();  
b = new Dog();  
c = new BabyDog();  
  
a.eat();  
b.eat();  
c.eat();  
}  
} 
  
