package models;




public class User {
    private String user_username;
    private int user_id;
    private String user_email;
    private String user_pass;
    private String user_cpass;

    public User() {

    }

    public User(String user_username,String user_email, String user_pass,String user_cpass){
        this.user_username=user_username;
        this.user_email = user_email;
        this.user_pass = user_pass;
        this.user_cpass = user_cpass;
    }

    public User(String user_username, String user_pass){
        this.user_username=user_username;
        this.user_pass = user_pass;
    }

    public int getUserId() {
        return user_id;
    }

    public void SETUserID(int custId) {
        this.user_id = custId;
    }

    public void setuserUsername(String newuserUsername){
        this.user_username = newuserUsername;
    }

    public String getuserUsername(){
        return this.user_username;
    }
    public void setuserEmail(String newuserlEmail){
        this.user_email = newuserlEmail;
    }

    public String getuserEmail(){
        return this.user_email;

    }

    public void setuserPass(String newuserPass){
        this.user_pass = newuserPass;
    }

    public String getuserPass(){
        return this.user_pass;
    }

    public void setuserCpass(String newuserCpass){
        this.user_cpass = newuserCpass;
    }

    public String getuserCpass(){
        return this.user_cpass;
    }

    

   
    // public static void main(String[] args) {
    //     new Student(10,null,null,null,0);
    //     }
}