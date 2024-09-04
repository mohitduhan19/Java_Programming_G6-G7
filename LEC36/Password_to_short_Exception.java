package LEC36;
class PasswordtoshortException extends Exception{
    public PasswordtoshortException(String  message){
        super(message);
    }
}
public class Password_to_short_Exception {
    private static final int MIN_LENGTH = 8;

    public static void main(String[] args) {
        String password = "short";//example

        try {
            validatePassword(password);
            System.out.println("password is validated");
        }catch (PasswordtoshortException e){
            System.out.println(e.getMessage());
        }
    }
    public static void validatePassword(String password)throws PasswordtoshortException{
        if(password.length() <MIN_LENGTH){
            throw new PasswordtoshortException("Password to short");
        }
    }
}
