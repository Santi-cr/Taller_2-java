package com.mycompany.mina;
import static com.mycompany.mina.Licenses.NoveltyRegister;
import static com.mycompany.mina.TimeRegister.JourneyRegister;
import java.time.LocalDateTime;
import java.util.Scanner;


public class Mina {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in); 
       
        
              
          
      
        int option;
        
        do{
            System.out.println("\n Menú"
            + "\n 1.Register Day"
            + "\n 2.Register News"
            + "\n 3.Go out);
            System.out.print("Choose an option");
            option = scanner.nextInt();
            scanner.nextLine();


            switch(option){
                case 1:
                    JourneyRegister();
                    break;
                
                case 2:
                    NoveltyRegister();
                    break;
                case 3:
                    System.out.println("Exiting the program");
                    break;
                default:
                    System.out.println("Incorrect Option");
               }
        
        }
        while (option != 3);
         scanner.close();
        
    }
}
