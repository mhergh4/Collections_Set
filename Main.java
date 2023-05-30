package practice;

import java.util.Scanner;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmailList emailList = new EmailList();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }

            
            //TODO: write code here
            if(input.substring(0,3).equals("ADD")){
                input = input.substring(3).trim();
                emailList.add(input);
                }


            if(input.substring(0,4).equals("LIST")){
                emailList.printList(emailList.getSortedEmails());
            }

        }
    }
}
