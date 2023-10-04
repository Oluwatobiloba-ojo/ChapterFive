package chapter_five.makingdiff;

import java.util.Scanner;

public class FairTax {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("""
                ======================================
                    WELCOME TO OLUWAFEMI FAIR TAX
                
                As you pay your tax may you be bless
                Press 1 to book in for the fair tax
                ======================================
                """);
        int user = input.nextInt();
        while (user == 1){
            System.out.println("""
                    1. A person
                    2. Couple
                    3. One person and 1 person dependent
                    4. Couple and One person dependent
                    5. One person and Two person dependent
                    6. Couple and Two person dependent
                    7. One person and Three person dependent
                    8. Couple and three person dependent
                    9. One person and Four person dependent
                    10.Couple and Four person dependent
                    11.One person and Five person dependent
                    12.Couple and Five person dependent
                    13.One person and Six person dependent
                    14.Couple and Six person dependent
                    15.One person and Seven person dependent
                    16.Couple and Seven person dependent
                    """);
            System.out.println("Enter the range of your household ");
            int range = input.nextInt();
            tax(range);
            System.out.println();
            System.out.println("Enter 1 to continue and 0 to stop for now");
            user = input.nextInt();
        }
    }







    public static void tax(int range){
        final double TAX = 0.23;
        switch (range){
            case 1:{
                System.out.println("Enter your Total expenses for the month: ");
                double spending = input.nextDouble();
                double taxRate = (spending * TAX) - 247;
                System.out.printf("The Fair tax for your expenses is %.2f", taxRate);
                break;
            }
            case 2:{
                System.out.println("Enter your Total expenses for the month: ");
                double spending = input.nextDouble();
                double taxRate = (spending * TAX) - 494;
                System.out.printf("The Fair tax for your expenses is %.2f", taxRate);
                break;
            }
            case 3:{
                System.out.println("Enter your Total expenses for the month: ");
                double spending = input.nextDouble();
                double taxRate = (spending * TAX) - 334;
                System.out.printf("The Fair tax for your expenses is %.2f", taxRate);
                break;
            }
            case 4:{
                System.out.println("Enter your Total expenses for the month: ");
                double spending = input.nextDouble();
                double taxRate = (spending * TAX) - 581;
                System.out.printf("The Fair tax for your expenses is %.2f", taxRate);
                break;
            }
            case 5:{
                System.out.println("Enter your Total expenses for the month: ");
                double spending = input.nextDouble();
                double taxRate = (spending * TAX) - 421;
                System.out.printf("The Fair tax for your expenses is %.2f", taxRate);
                break;
            }
            case 6: {
                System.out.println("Enter your Total expenses for the month: ");
                double spending = input.nextDouble();
                double taxRate = (spending * TAX) - 668;
                System.out.printf("The Fair tax for your expenses is %.2f", taxRate);
                break;
            }
            case 7:{
                System.out.println("Enter your Total expenses for the month: ");
                double spending = input.nextDouble();
                double taxRate = (spending * TAX) - 508;
                System.out.printf("The Fair tax for your expenses is %.2f", taxRate);
                break;
            }
            case 8:{
                System.out.println("Enter your Total expenses for the month: ");
                double spending = input.nextDouble();
                double taxRate = (spending * TAX) - 755;
                System.out.printf("The Fair tax for your expenses is %.2f", taxRate);
                break;
            }
            case 9:{
                System.out.println("Enter your Total expenses for the month: ");
                double spending = input.nextDouble();
                double taxRate = (spending * TAX) - 595;
                System.out.printf("The Fair tax for your expenses is %.2f", taxRate);
                break;
            }
            case 10:{
                System.out.println("Enter your Total expenses for the month: ");
                double spending = input.nextDouble();
                double taxRate = (spending * TAX) - 842;
                System.out.printf("The Fair tax for your expenses is %.2f", taxRate);
                break;
            }
            case 11:{
                System.out.println("Enter your Total expenses for the month: ");
                double spending = input.nextDouble();
                double taxRate = (spending * TAX) - 688;
                System.out.printf("The Fair tax for your expenses is %.2f", taxRate);
                break;
            }
            case 12:{
                System.out.println("Enter your Total expenses for the month: ");
                double spending = input.nextDouble();
                double taxRate = (spending * TAX) - 929;
                System.out.printf("The Fair tax for your expenses is %.2f", taxRate);
                break;
            }
            case 13:{
                System.out.println("Enter your Total expenses for the month: ");
                double spending = input.nextDouble();
                double taxRate = (spending * TAX) - 769;
                System.out.printf("The Fair tax for your expenses is %.2f", taxRate);
                break;
            }
            case 14:{
                System.out.println("Enter your Total expenses for the month: ");
                double spending = input.nextDouble();
                double taxRate = (spending * TAX) - 1016;
                System.out.printf("The Fair tax for your expenses is %.2f", taxRate);
                break;
            }
            case 15:{
                System.out.println("Enter your Total expenses for the month: ");
                double spending = input.nextDouble();
                double taxRate = (spending * TAX) - 856;
                System.out.printf("The Fair tax for your expenses is %.2f", taxRate);
                break;
            }
            case 16:{
                System.out.println("Enter your Total expenses for the month: ");
                double spending = input.nextDouble();
                double taxRate = (spending * TAX) - 1103;
                System.out.printf("The Fair tax for your expenses is %.2f", taxRate);
                break;
            }
            default:
                System.out.println("Enter the range between 1 to 16 invalid input");
        }
    }

}
