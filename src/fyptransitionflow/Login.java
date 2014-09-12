package fyptransitionflow;

public class Login {
    
    public Boolean attempt(String username, String password){
        
        if(username.equals("aeri") && password.equals("1a")){
            return true;
        }else{
            return false;
        }
    }
}
