
package com.mycompany.mina;
import java.util.Scanner;
public class Licenses extends Worker {

    

    
    private String Type;
    private int Days;

   

    public Licenses(String Type, int Days, String name, int idCard) {
        super(name, idCard);
        this.Type = Type;
        this.Days = Days;
    }

    public Licenses(String name, int idCard) {
        super(name, idCard);
    }
    
     public String getType() {
        return Type;
    }

    public int getDays() {
        return Days;
    }
    
    public static void NoveltyRegister(){ 
        Scanner scanner = new Scanner(System.in);
         int option;
        
        do{
            System.out.println("\n Menú Novedades"
            + "\n 1.Temporary Licenses"
            + "\n 2.Maternity Licence"       
            + "\n 3.Paternity Licence" 
            + "\n 4.Disabilities"
            + "\n 5.Vacations"
            + "\n 6.Permissions");
            System.out.print("Choose an option");
            option = scanner.nextInt();
            scanner.nextLine();


            switch(option){
                case 1:
                   RegisterTemporaryLicenses();
                    break;
                    
                case 2:
                    RegisterMaternalLeave();
                    
                case 3:
                    RegisterPaternalLeave();
                    
                case 4:
                    Incapacity();
                    
                case  5:
                    Vacation();
                    
                case  6:
                    Permissions();
                   
                default:
                    System.out.println("wrong option");
               }
        
        }
        while (option != 6);
        scanner.close();
        
        
        
    }
   
        private static void RegisterTemporaryLicenses() {
        
            int Days=1;
            
            if(Days > 4){
                System.out.println("must take vacation");
            }
            
            
    }   
        
        private static void RegisterMaternalLeave() {
         
            int Days = 1;
            if(Days <= 180){
                System.out.println("they remain " + (180 - Days) + "days of License");
            }
    }
    
        private static void RegisterPaternalLeave() {
         int Days = 1;
         if(Days<=15){
             System.out.println("carry" + (15 + Days) + "days of leave");
             Days++;
         }
    }
        
        private static void Incapacity() {
         int Days=1;
         if(Days <=20){
             System.out.println("are left "+ (20 - Days) + "days of disability");
         }
    }
        
        private static void Vacation() {
         int Days = 1;
         if(Days < 15){
             System.out.println("are left "+ (15 - Days) + "holidays");
         }
            
    }
        private static void Permissions() {
         int Days = 1;
        
         if(Days <=5){
             System.out.println("permission accepted");
         }else{
             if(Days > 5){
                 System.out.println("Request a vacation day or temporary leave ");
             }
         }
    }
}
    
    
    
    

   
    

