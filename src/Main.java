// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner; // import the Scanner class

    class Main {
        public static void main(String[] args) {
            Scanner myObj = new Scanner(System.in);
            String userName;

            // Enter username and press Enter
            System.out.println("Donne le nom de ta musique");
            userName = myObj.nextLine();

            System.out.println("Ta  musique est : " + userName);
        }
    }








