package GoFishhhh;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            ArrayList<Registration> regis = new ArrayList<Registration>();

            System.out.println("Firstly, create your account for playing this game");

            for (int i = 0; i < 1; i++) {
                Registration re = new Registration();
                System.out.println("Enter your username");
                re.setUsername(keyboard.nextLine());
                System.out.println("Enter your password");
                re.setPassword(keyboard.nextLine());
                regis.add(re);

            }
            System.out.println("Username : ");
            String userName = keyboard.next();
            System.out.println("Enter your password");
            String password = keyboard.next();

            boolean valid = false;
            do{
            for (int i = 0; i < regis.size(); i++) {

                if (regis.get(i).getUsername().equals(userName) && regis.get(i).getPassword().equals(password)) {
                    System.out.println("User is valid");
                    valid = true;
                      break;
                }

              
                

                    if (!regis.get(i).getUsername().equals(userName) && !regis.get(i).getPassword().equals(password)) {
                        System.out.println("Invalid username or password. Please try again");
                        for(int j = 0; j < 2; j++){
                        System.out.print("Enter you username: ");
                        userName = keyboard.next();
                        System.out.print("Enter your password: ");
                        password = keyboard.next();
                        
                        }
                       
                        
                    
                }
                System.out.println("Login after 5 minutes");
                }
            }
                while(valid == true);
        }

    }            
        
    
}