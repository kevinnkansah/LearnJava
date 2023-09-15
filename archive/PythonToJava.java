public class PythonToJava {
    public static void main(String[] args) {
        String firstName = "Andre";
        String surName = "Henney";
        int myAge = 10;
        int momAge = 40;

        System.out.println("Welcome user. This program calculates the age at which you are exactly one-third your mom's age.");
        
        System.out.println("My first name is " + firstName);
        System.out.println("My surname is " + surName);
        System.out.println(" ");
        System.out.println("My current age is " + myAge);
        System.out.println("My mom's current age is " + momAge);

        double y = (momAge - 3 * myAge) / 2;
        double myAge_new = myAge + y;
        double momAge_new = momAge + y;

        System.out.println("It will take the following number of years for my age to be exactly one third my mom's age: " + y);
        System.out.println("At that time, my age will be " + myAge_new + " years old.");
        System.out.println("and my mom will be " + momAge_new + " years old.");
        System.out.println("Thanks");
    }
}