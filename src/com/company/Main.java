package com.company;

public class Main {

    public static void main(String[] args) {

        int cena = 0;
        if (args.length != 0) {
            for (String i : args) {
                switch (i) {
                    case "0":
                        System.out.println("Smažený sýr");
                        cena += 74;
                        break;
                    case "1":
                        System.out.println("Vepřové maso");
                        cena += 55;
                        break;
                    case "2":
                        System.out.println("Jablko");
                        cena += 14;
                        break;
                    case "3":
                        System.out.println("Hruška");
                        cena += 149;
                        break;
                    case "4":
                        System.out.println("Vodka");
                        cena += 42;
                        break;
                    case "5":
                        System.out.println("Sýr");
                        cena += 49;
                        break;
                    case "6":
                        System.out.println("Kalendář");
                        cena += 102;
                        break;
                    case "7":
                        System.out.println("Kinder Maxi King");
                        cena += 34;
                        break;
                    default:
                        break;
                }
            }
            System.out.println(cena+" CZK");
        } else {
            System.out.println("0 = Smažený sýr (74 CZK)");
            System.out.println("1 = Vepřové maso (55 CZK)");
            System.out.println("2 = Jablko (14 CZK)");
            System.out.println("3 = Hruška (149 CZK)");
            System.out.println("4 = Vodka (42 CZK)");
            System.out.println("5 = Sýr (49 CZK)");
            System.out.println("6 = Kalendář 2 (102 CZK)");
            System.out.println("7 = Kinder Maxi King (34 CZK)");
        }

    }

}
