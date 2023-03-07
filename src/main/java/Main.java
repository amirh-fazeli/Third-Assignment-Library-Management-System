import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /*
    * make a functional library app using oop
    * run the main program in Main.java and code the oop part in other classes
    * don't forget to add at least 1 librarian to the library to make it functionable.
    * *  *** don't limit yourself to our template ***
     */

    public static void main(String[] args) {
        runMenu();
    }

    public static void runMenu(){
        Library myLib=new Library();

        System.out.println("WELCOME TO OUR LIBRARY!");
        Librarian admin=new Librarian("admin","admin","0,0,00");
        myLib.addLibrarian(admin);

        Scanner scan=new Scanner(System.in);
        String username,password;
        boolean k=true;

        while (true) {
            k=true;
            System.out.println("are you 1.librarian or 2.user?");
            int role = scan.nextInt();

            switch (role) {
                case 1:
                    k=true;
                    System.out.println("username: ");
                    username = scan.next();
                    System.out.println("password: ");
                    password = scan.next();

                    if(myLib.doesLibrarianExist(username)) {
                        if (myLib.librarianLogIn(username, password)) {
                            while (k) {
                                System.out.println("what do you want to do?");
                                System.out.println("1.add a book");
                                System.out.println("2.remove a book");
                                System.out.println("3.get information of a book");
                                System.out.println("4.check how many copies of a book is available");
                                System.out.println("5.add a librarian");
                                System.out.println("6.get information of a librarian");
                                System.out.println("7.remove a librarian");
                                System.out.println("8.add an user");
                                System.out.println("9.get information of a user");
                                System.out.println("10.remove a user");
                                System.out.println("11.log out");


                                System.out.println("insert an number: ");
                                int choice = scan.nextInt();

                                switch (choice) {
                                    case 1:
                                        while (true) {
                                            Book book = inputBook();
                                            System.out.println("number of copies: ");
                                            int num = scan.nextInt();
                                            myLib.addBook(book, num);

                                            System.out.println("do you want to add another book? yes/no");

                                            String ch = scan.next();

                                            if (!ch.equals("yes")) {
                                                break;
                                            }

                                        }
                                        break;

                                    case 2:
                                        while (true) {
                                            System.out.println("insert name of the book you want to remove: ");
                                            String name = scan.next();
                                            myLib.removeBook(name);

                                            System.out.println("do you want to remove another book? yes/no");
                                            String ch = scan.next();

                                            if (!ch.equals("yes")) {
                                                break;
                                            }
                                        }
                                        break;

                                    case 3:
                                        while (true) {
                                            System.out.println("insert name of the book you want information from: ");
                                            String pame = scan.next();
                                            myLib.searchBook(pame);

                                            System.out.println("do you want information of another book? yes/no");
                                            String ch = scan.next();

                                            if (!ch.equals("yes")) {
                                                break;
                                            }
                                        }
                                        break;

                                    case 4:
                                        while (true) {
                                            System.out.println("insert name of the book you want to check: ");
                                            String pame = scan.next();
                                            myLib.doesBookExist(pame);

                                            System.out.println("do you want to check another book? yes/no");
                                            String ch = scan.next();

                                            if (!ch.equals("yes")) {
                                                break;
                                            }
                                        }
                                        break;

                                    case 5:
                                        while (true) {
                                            Librarian librarian1 = inputLibrarian();
                                            if(!myLib.doesLibrarianExist(librarian1.getUsername())) {
                                                myLib.addLibrarian(librarian1);
                                                System.out.println(librarian1.getUsername() + " successfully added");
                                            }

                                            else{
                                                System.out.println("a librarian with such username already exists");
                                            }

                                            System.out.println("do you want to add another librarian? yes/no");
                                            String ch = scan.next();


                                            if (!ch.equals("yes")) {
                                                break;
                                            }
                                        }

                                        break;

                                    case 6:
                                        while (true) {
                                            System.out.println("insert the username you want information from");
                                            username = scan.next();

                                            myLib.searchLibrarian(username);

                                            System.out.println("do you want to check on another librarian? yes/no");
                                            String ch = scan.next();

                                            if (!ch.equals("yes")) {
                                                break;
                                            }
                                        }

                                        break;


                                    case 7:
                                        while (true) {
                                            System.out.println("insert the username you want to remove");
                                            username = scan.next();

                                            myLib.removeLibrarian(username);

                                            System.out.println("do you want to remove another librarian? yes/no");
                                            String ch = scan.next();

                                            if (!ch.equals("yes")) {
                                                break;
                                            }
                                        }

                                        break;

                                    case 8:
                                        while (true) {
                                            User user = inputUser();
                                            if(!myLib.doesUserExist(user.getUsername())) {
                                                myLib.addUser(user);
                                                System.out.println(user.getUsername() + " successfully added!");
                                            }

                                            else{
                                                System.out.println("a user with such username already exists");
                                            }

                                            System.out.println("do you want to add another user? yes/no");
                                            String ch = scan.next();

                                            if (!ch.equals("yes")) {
                                                break;
                                            }
                                        }

                                        break;

                                    case 9:
                                        while (true) {
                                            System.out.println("insert the username you want information from");
                                            username = scan.next();

                                            myLib.searchUser(username);

                                            System.out.println("do you want to check on another user? yes/no");
                                            String ch = scan.next();

                                            if (!ch.equals("yes")) {
                                                break;
                                            }
                                        }

                                        break;

                                    case 10:
                                        while (true) {
                                            System.out.println("insert the username you want to remove");
                                            username = scan.next();

                                            myLib.removeUser(username);

                                            System.out.println("do you want to remove another user? yes/no");
                                            String ch = scan.next();

                                            if (!ch.equals("yes")) {
                                                break;
                                            }
                                        }

                                        break;


                                    case 11:
                                        k = false;
                                        break;
                                }
                            }
                        }

                        else{
                            System.out.println("wrong password");
                        }
                    }

                    else{
                        System.out.println("no librarian with such username is registered");
                    }

                    break;


                case 2:
                    k=true;
                    System.out.println("username: ");
                    username = scan.next();
                    System.out.println("password: ");
                    password = scan.next();
                    if(myLib.doesUserExist(username)) {
                        if (myLib.userLogIn(username, password)) {
                            User user = myLib.loggedUser(username);
                            while (k) {
                                System.out.println("what do you want to do?");
                                System.out.println("1.rent a book");
                                System.out.println("2.return a book");
                                System.out.println("3.get information of a book");
                                System.out.println("4.log out");

                                System.out.println("insert an number: ");
                                int choice = scan.nextInt();

                                switch (choice) {
                                    case 1:
                                        while (true) {
                                            System.out.println("insert the name of the book you want to rent: ");
                                            String name = scan.next();
                                            user.rentBook(name, myLib);

                                            System.out.println("do you want to rent another book? yes/no");
                                            String ch = scan.next();

                                            if (!ch.equals("yes")) {
                                                break;
                                            }
                                        }
                                        break;

                                    case 2:
                                        while (true) {
                                            System.out.println("insert the name of the book you want to return: ");
                                            String name = scan.next();
                                            user.returnBook(name, myLib);

                                            System.out.println("do you want to return another book? yes/no");
                                            String ch = scan.next();

                                            if (!ch.equals("yes")) {
                                                break;
                                            }
                                        }
                                        break;

                                    case 3:
                                        while (true) {
                                            System.out.println("insert name of the book you want information from: ");
                                            String pame = scan.next();
                                            myLib.searchBook(pame);

                                            System.out.println("do you want information of another book? yes/no");
                                            String ch = scan.next();

                                            if (!ch.equals("yes")) {
                                                break;
                                            }
                                        }
                                        break;

                                    case 4:
                                        myLib.removeUser(username);
                                        myLib.addUser(user);
                                        k = false;
                                        break;

                                    default:
                                        System.out.println("your option must be a number in range 1 to 4");
                                        break;
                                }
                            }
                        }

                        else{
                            System.out.println("incorrect password");
                        }
                    }
                    else{
                        System.out.println("no user with such username is registered");
                    }

                    break;
            }
        }
    }

    public static Book inputBook(){
        Scanner scan=new Scanner(System.in);

        System.out.println("name of the book: ");
        String name= scan.nextLine();

        System.out.println("name of the author: ");
        String author= scan.nextLine();

        System.out.println("year of publish: ");
        int year= scan.nextInt();

        System.out.println("ISBM: ");
        String ISBM= scan.next();

        Book book=new Book(name,author,year,ISBM);

        return book;

    }

    public static User inputUser(){
        Scanner scan=new Scanner(System.in);

        System.out.println("username: ");
        String username= scan.nextLine();

        System.out.println("password: ");
        String password= scan.nextLine();

        System.out.println("joining date: ");
        String joinedDate= scan.nextLine();

        User user=new User(username,password,joinedDate);

        return user;

    }

    public static Librarian inputLibrarian(){
        Scanner scan=new Scanner(System.in);

        System.out.println("username: ");
        String username= scan.nextLine();

        System.out.println("password: ");
        String password= scan.nextLine();

        System.out.println("joining date: ");
        String joinedDate= scan.nextLine();

        Librarian user=new Librarian(username,password,joinedDate);

        return user;

    }
}