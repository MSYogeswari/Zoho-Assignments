import java.util.regex.*;
public class Validation {
    public boolean validateMobileNumber(String mobilenumber)
    {
        boolean validMobileNumber = false;
        Pattern patern = Pattern.compile("(0/91)?[7-9][0-9]{9}");
        Matcher match = patern.matcher(mobilenumber);
        validMobileNumber = match.find() && match.group().equals(mobilenumber);
        return validMobileNumber;
    }
    boolean validateUser(String username,String password)
    {
        if(username.compareTo("user1") == 0 && password.compareTo("user") == 0)
            return true;
        else
            return false;
    }
}