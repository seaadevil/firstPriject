

import java.util.Scanner;   // import class Scanner
public class Sum {
    public static void main(String... args){
        System.out.println("Enter first int number:");
        Scanner sc1=new Scanner(System.in);
        if(sc1.hasNextInt()){
            int i=sc1.nextInt();
            System.out.println("Enter second int number:");
            Scanner sc2=new Scanner(System.in);
            if(sc2.hasNextInt()){
                int k=sc2.nextInt();
                System.out.println("Sum "+i+" and "+k+" is equal to "+(i+k));
            }
            else System.out.println("Error. You entered isn't int");
        }
        else System.out.println("Error. You entered isn't int");
    }
}