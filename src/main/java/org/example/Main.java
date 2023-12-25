package org.example;

import org.example.annotation.DateFormat;
import org.example.entity.Ticket;
import org.example.reflection.ReflectionHelper;
import org.example.validator.DateValidator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
        Ticket ticket = new Ticket();

        System.out.println( "=============== Check Start date ============");
        // 1. Set startDate for ticket
        ticket.setStartDate("2023/12/24");

        // 2. Get value of annotation in
        String dateFormat = ReflectionHelper.getValueFromAnnotation(ticket, "startDate");
        System.out.println("Date format is: "+ dateFormat);

        try {
            // 3. Validate startDate
            boolean isDateMatchFormat = DateValidator.validateDateTime(ticket.getStartDate(), dateFormat);
            if(isDateMatchFormat) {
                System.out.println("\"" + ticket.getStartDate() + "\"" + " is the right date.");
            } else {
                System.out.println(ticket.getStartDate() + " is in wrong format.");
            }
        } catch (NoSuchFieldException e) {
            throw new NoSuchFieldException();
        }

        System.out.println( "=============== Check End date ============");
        // 1. Set end date for ticket
        ticket.setEndDate("2023/12/24 11:15");

        // 2. Get value of annotation in
        String dateFormatEndDate = ReflectionHelper.getValueFromAnnotation(ticket, "endDate");
        System.out.println("Date format is: "+ dateFormatEndDate);

        try {
            // 3. Validate startDate
            boolean isDateMatchFormat = DateValidator.validateDateTime(ticket.getEndDate(), dateFormatEndDate);
            if(isDateMatchFormat) {
                System.out.println("\"" + ticket.getStartDate() + "\"" + " is the right date.");
            } else {
                System.out.println(ticket.getStartDate() + " is in wrong format.");
            }
        } catch (NoSuchFieldException e) {
            throw new NoSuchFieldException();
        }
    }
}