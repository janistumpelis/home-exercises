package io.codelex.typesandvariables.exercises;

public class Exercise9 {

    public static void main(String[] args) {
        int inputDistance  = 2500;
        int hour = 5;
        int minutes = 56;
        int seconds = 23;

        int oneMileInMeters = 1609;

        double metersPerSecond = 0;
        double kmPerHour = 0;
        double milesPerHour = 0;

        int totalSeconds = hour * 60 * 60 + minutes * 60 + seconds;
        double totalHours = (double) hour + (minutes / 60d) + (seconds / (60d * 60d));

        metersPerSecond = (double) inputDistance / totalSeconds;
        kmPerHour = (inputDistance / 1000d) / totalHours;
        milesPerHour = (inputDistance / 1609d) / totalHours;

        System.out.println(metersPerSecond);
        System.out.println(kmPerHour);
        System.out.println(milesPerHour);

    }

}
