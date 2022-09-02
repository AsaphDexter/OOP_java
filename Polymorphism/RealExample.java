package polymorphism;
/**
 *
 * @author AsaphDexter
 * 
 * Consider a scenario, Bank is a class that provides method to get the rate of interest. But, 
 * rate of interest may differ according to banks. For example, Coco, Strawberry and Vanilla banks could provide 1%, 2% and 3% 
 * rate of interest.
 * 
 * Note: It is also given in method overriding but there was no upcasting.
 */
public class RealExample {
public static void main(String[] args){  
Coco a = new Coco();  
Strawberry b = new Strawberry();  
Vanilla c = new Vanilla();  
System.out.println("Coco Rate of Interest: "+ a.getRateOfInterest());  
System.out.println("Strawberry Rate of Interest: "+ b.getRateOfInterest());  
System.out.println("Vanilla Rate of Interest: "+ c.getRateOfInterest());  
}  
} 

