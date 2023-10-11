
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
            + "\n 1.Licencias Temporales"
            + "\n 2.Licencia de Maternidad"       
            + "\n 3.Licencia de Paternidad" 
            + "\n 4.Incapacidades"
            + "\n 5.Vacaciones"
            + "\n 6.Permisos");
            System.out.print("Elija una opcion");
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
                    System.out.println("Opcion Incorrecta");
               }
        
        }
        while (option != 6);
        scanner.close();
        
        
        
    }
   
        private static void RegisterTemporaryLicenses() {
        
            int Days=1;
            
            if(Days > 4){
                System.out.println("Debe tomar vacaciones");
            }
            
            
    }   
        
        private static void RegisterMaternalLeave() {
         
            int Days = 1;
            if(Days <= 180){
                System.out.println("Le restan " + (180 - Days) + "días de Licencia");
            }
    }
    
        private static void RegisterPaternalLeave() {
         int Days = 1;
         if(Days<=15){
             System.out.println("lleva" + (15 + Days) + "días de licencia");
             Days++;
         }
    }
        
        private static void Incapacity() {
         int Days=1;
         if(Days <=20){
             System.out.println("le quedan "+ (20 - Days) + "días de incapacidad");
         }
    }
        
        private static void Vacation() {
         int Days = 1;
         if(Days < 15){
             System.out.println("le quedan "+ (15 - Days) + "días de vacaciones");
         }
            
    }
        private static void Permissions() {
         int Days = 1;
        
         if(Days <=5){
             System.out.println("Permiso aceptado");
         }else{
             if(Days > 5){
                 System.out.println("Solicite un dia de vacaciones o una licencia temporal ");
             }
         }
    }
}
    
    
    
    

   
    

