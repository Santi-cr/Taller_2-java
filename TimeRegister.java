
package com.mycompany.mina;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeRegister extends Worker {
    
    private LocalDateTime startDate;
    private LocalDateTime departureDate;

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getDepartureDate() {
        return departureDate;
    }

    public TimeRegister(LocalDateTime startDate, LocalDateTime departureDate, String name, int idCard) {
        super(name, idCard);
        this.startDate = startDate;
        this.departureDate = departureDate;
    }

    public TimeRegister(String name, int idCard) {
        super(name, idCard);
    }
     
    public static void JourneyRegister(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the employee's name");
    String name = scanner.nextLine();
    System.out.println("Enter the employee's ID");
    int idCard = scanner.nextInt();
    Worker worker = new Worker(name, idCard);
    
    
    System.out.println("Enter start date (Format dd/mm/yy  hh:mm): ");
    String startDateA = scanner.nextLine();
    LocalDateTime startDate = LocalDateTime.parse
    (name, DateTimeFormatter.ISO_DATE);
    
    System.out.println("Enter the end date (Format dd/mm/yy  hh:mm): ");
    String departureDateA = scanner.nextLine();
    LocalDateTime departureDate = LocalDateTime.parse
    (name, DateTimeFormatter.ISO_DATE);
    
    int hoursWorked = (int) startDate.until(departureDate,
            java.time.temporal.ChronoUnit.HOURS);
     
    if(hoursWorked < 8){
        System.out.println("Alert: Missing " + (8 - hoursWorked)+ "hours to complete");
    }  
}
}

