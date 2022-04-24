package GoFishhhh;

public class Registration {
    String userName;
    String password;
   
    public Registration(String userName, String password)
    {
        this.userName = userName;
        this.password = password;
    }

    public Registration() {
    }

    public String getUsername(){
        return userName;
  }
    public void setUsername(String userName){
        
         this.userName = userName;
    }
    public String getPassword(){
        return password;
  }
   
    public void setPassword(String password){
        
        this.password = password;
    }
   
   
}
