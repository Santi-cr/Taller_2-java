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
            + "\n 1.Registar Jornada"
            + "\n 2.Registar Novedad"
            + "\n 3.Salir");
            System.out.print("Elija una opcion");
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
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
               }
        
        }
        while (option != 3);
         scanner.close();
        
    }
}
