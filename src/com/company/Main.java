package com.company;

public class Main {

    public static void main(String[] args) {
        int date = 8;
        int year = 2021;
        String day = "Wednesday";
        String month = "September";
        printAmerican(date,year,day,month);
        newLine();
        printEuropean(date,year,day,month);

    }
    public static void printAmerican(int date, int year, String day, String month) {
        System.out.printf("American format: %s, %d %s, %d", day, date, month, year);
    }
    public static void printEuropean(int date, int year, String day, String month) {
        System.out.printf("European format: %s, %s %d, %d", day, month, date, year);
    }
    public static void newLine(){
        System.out.println();
    }

}
