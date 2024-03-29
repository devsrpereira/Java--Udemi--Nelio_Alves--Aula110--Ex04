package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatterBuilder.html
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


//Instaciação com agora NOW
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

//Instanciação com ISO8601
        LocalDate d04 = LocalDate.parse("2023-05-02");
        LocalDateTime d05 = LocalDateTime.parse("2023-05-02T19:52:45");
        Instant d06 = Instant.parse("2023-05-02T19:52:45Z");
        Instant d07 = Instant.parse("2023-05-02T19:52:45-03:00");

//Texto formatado customizado
        LocalDate d08 = LocalDate.parse("02/05/2023", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("02/05/2023 20:06", fmt2);

//Dia, mes, ano [hora]
        LocalDate d10 = LocalDate.of(2023, 05, 02);
        LocalDateTime d11 = LocalDateTime.of(2023,05,02, 20,14);


        System.out.println("*** Instanciação com NOW ***");
        System.out.println("d01 = "+d01);
        System.out.println("d02 = "+d02);
        System.out.println("d03 = "+d03);

        System.out.println();
        System.out.println("*** Instanciação com txt ISO8601 ***");
        System.out.println("d04 = "+d04);
        System.out.println("d05 = "+d05);
        System.out.println("d06 = "+d06);
        System.out.println("d07 = "+d07);


        System.out.println();
        System.out.println("*** Instanciação com txt customizado ***");
        System.out.println("d08 = "+d08);
        System.out.println("d09 = "+d09);


        System.out.println();
        System.out.println("*** Instanciação com dia, mes, ano separados ***");
        System.out.println("d10 = "+d10);
        System.out.println("d11 = "+d11);

    }
}
