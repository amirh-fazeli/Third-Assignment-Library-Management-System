import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    /*
    * The library should have a list of books.
    * The library should have a map of books ISBNs which is linked to the amount of book
    -> (for example: harry potter -> 4 means there are currently 4 harry potter books)
    * The library should have a list of users and a list of librarians.
     */

    //book related functions

    ArrayList<Book> bookList = new ArrayList<Book>();
    HashMap<String, Integer> numMap = new HashMap<String, Integer>();
    ArrayList<User> userList = new ArrayList<User>();
    ArrayList<Librarian> librarianList = new ArrayList<Librarian>();


    public void addBook(Book book,int num){
        bookList.add(book);
        if(numMap.get(book.getISBN())==null) {
            numMap.put(book.getISBN(), num);
        }

        else{
            int av=numMap.get(book.getISBN());
            numMap.put(book.getISBN(),num+av);
        }
    }

    public void removeBook(String name){
        int ind=indexBook(name);
        if(ind!=-1) {
            bookList.remove(ind);
            System.out.println("you removed " + name + " successfully!");        }

        else{
            System.out.println("there is no such book in the library!");
        }
    }

    public int indexBook(String name) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void searchBook(String name){
        int ind=indexBook(name);

        if(ind!=-1) {
            System.out.println(bookList.get(indexBook(name)));
        }

        else{
            System.out.println("wanted book is not available in our library");
        }
    }

    public void updateBook(){
        //TODO
    }

    public void doesBookExist(String name){
        int ind=indexBook(name);

        if(ind!=-1) {
            if(numMap.get(bookList.get(ind).getISBN())!=0) {
                System.out.println("there are " + numMap.get(bookList.get(ind).getISBN()) + " of " + name + " available ");
            }

            else{
                System.out.println("wanted book is not available in our library");
            }
        }

        else{
            System.out.println("wanted book is not available in our library");
        }
    }

    public Boolean bookExistCheck(String name) {
        int ind = indexBook(name);

        if (ind != -1) {
            if (numMap.get(bookList.get(ind).getISBN()) != 0) {
                return true;
            }

            else {
                return false;
            }
        }
        else{
            return false;
        }
    }

    public void increaseBook(String name){
        int ind=indexBook(name);
        numMap.put(bookList.get(ind).getISBN(),numMap.get(bookList.get(ind).getISBN())+1);
    }

    public void decreaseBook(String name){
        int ind=indexBook(name);
        numMap.put(bookList.get(ind).getISBN(),numMap.get(bookList.get(ind).getISBN())-1);
    }

    //user related functions
    public Boolean userLogIn(String username,String password){
        int ind= userIndex(username);

        if(userList.get(ind).getPassword().equals(password)){
            return true;
        }

        return false;
    }

    public int userIndex(String username){
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getUsername().equals(username)) {
                return i;
            }
        }
        return -1;
    }

    public void addUser(User user){
        userList.add(user);
    }

    public void removeUser(String username){
        int ind=userIndex(username);
        if (ind!=-1) {
            userList.remove(ind);
            System.out.println("you removed " + username + " successfully!");
        }

        else{
            System.out.println("there is no user with such username");
        }
    }

    public void searchUser(String username){
        int ind=userIndex(username);
        if(ind!=-1) {
            System.out.println(userList.get(ind));
        }

        else{
            System.out.println("no user with such username was found");
        }
    }

    public User loggedUser(String username){
        int ind=userIndex(username);
        return userList.get(ind);
    }

    public void updateUser(){
        //TODO
    }

    public boolean doesUserExist(String username){
        int ind=userIndex(username);

        if(ind==-1){
            return false;
        }

        return true;
    }

    //librarian related functions


    public int librarianIndex(String username){
        for (int i = 0; i < librarianList.size(); i++) {
            if (librarianList.get(i).getUsername().equals(username)) {
                return i;
            }
        }
        return -1;
    }

    public Boolean librarianLogIn(String username,String password){
        int ind= librarianIndex(username);

        if(librarianList.get(ind).getPassword().equals(password)){
            return true;
        }

        return false;
    }

    public void addLibrarian(Librarian librarian){
        librarianList.add(librarian);
    }

    public void removeLibrarian(String username){
        int ind=librarianIndex(username);

        if(ind!=-1) {
            librarianList.remove(ind);
            System.out.println("you removed " + username + " successfully!");
        }

        else{
            System.out.println("there is no such librarian with this username");
        }
    }

    public void searchLibrarian(String username){
        int ind=librarianIndex(username);
        if(ind!=-1) {
            System.out.println(librarianList.get(ind));
        }

        else{
            System.out.println("no librarian with such username was found");
        }
    }

    public void updateLibrarian(){
        //TODO
    }

    public boolean doesLibrarianExist(String username){
        int ind=librarianIndex(username);

        if(ind==-1){
            return false;
        }

        return true;
    }

}
