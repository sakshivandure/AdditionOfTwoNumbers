package basics;

import java.util.Scanner;

public class Basics {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter two number");

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("addition of "+x+" and "+y+" = "+(x+y));
        
    }
    
}
