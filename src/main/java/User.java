import java.util.ArrayList;

public class User{
    //User should have a list of books
    //User should have a username and a password

    private ArrayList<String> borrowed = new ArrayList<String>();

    private String username;
    private String password;
    private String joinedDate;

//    public User(String username,String password){
//        this.username=username;
//        this.password=password;
//    }


    public User(String username,String password,String joinedDate){
        this.username=username;
        this.password=password;
        this.joinedDate=joinedDate;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setJoinedDate(String joinedDate) {
        this.joinedDate = joinedDate;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getJoinedDate() {
        return joinedDate;
    }

    public void rentBook(String name, Library lib){
        if(lib.bookExistCheck(name)){
            if(!isBookBorrowed(name)) {
                borrowed.add(name);
                lib.decreaseBook(name);
                System.out.println("you borrowed " + name + "!");
            }

            else{
                System.out.println("you have already borrowed this book");
            }
        }

        else{
            System.out.println(name + " is not available in our library");
        }
    }

    public void returnBook(String name,Library lib){
        if(isBookBorrowed(name)){
            borrowed.remove(name);
            lib.increaseBook(name);
            System.out.println("you returned " + name + "!");
        }

        else{
            System.out.println(name + " is not one of your borrowed books");
        }
    }

    public Boolean isBookBorrowed(String name){
        for(int i = 0;i<borrowed.size();i++){
            if(borrowed.get(i).equals(name)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "{" +
                ", username = '" + username + '\'' +
                ", password = '" + password + '\'' +
                ", joined on = '" + joinedDate + '\'' +
                ", borrowed books = " + borrowed +
                '}';
    }


//    public void
}
