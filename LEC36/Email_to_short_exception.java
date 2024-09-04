package LEC36;
class InvalidEmailException extends Exception{
    public InvalidEmailException(String message){
        super(message);
    }
}
public class Email_to_short_exception {
    public static void main(String[] args) {
        String email = "abcd@.gmail.com";

        try {
            validateEmail(email);
        }catch (InvalidEmailException e){
            System.out.println(e.getMessage());
        }
    }
    public static void validateEmail(String email)throws InvalidEmailException{
        if(!email.contains("@") || !email.substring(email.indexOf("@")).contains(".")){
            throw new InvalidEmailException("Invalid email");
        }
        System.out.println("Email is valid");
    }
}
