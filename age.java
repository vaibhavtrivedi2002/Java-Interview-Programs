//this program prints you are adult or not using condition
import java.util.*;
public class age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your age:");
        int age= sc.nextInt();
        if(age>18){
            System.out.println("You are an adult");
        }else{
            System.out.println("You are a teenager");
            sc.close();
        }
    }
}
