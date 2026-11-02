package edu.monmouth.lab1;

public class Stringlab {

    public static void main(String[] args) {

        String value = new String("Monmouth University");
        
        System.out.println("Number of characters: " + value.length());
        System.out.println("First character: " + value.charAt(0));
        System.out.println("Last character: " + value.charAt(value.length() - 1));

        
        System.out.println(" third character is uppercase: " +
                Character.isUpperCase(value.charAt(2)));

        
        if (Character.isDigit(value.charAt(9))) {
            System.out.println("tenth character is digit");
        } else {
            System.out.println("tenth character is letter");
        }
    }
}