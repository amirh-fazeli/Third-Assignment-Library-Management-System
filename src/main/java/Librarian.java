public class Librarian {
    private String username;
    private String password;
    private String joinedDate;

    public Librarian(String username,String password,String joinedDate){
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

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "{" +
                "username = '" + username + '\'' +
                ", password = '" + password + '\'' +
                ", joined on = '" + joinedDate + '\'' +
                '}';
    }
}
