package execpt;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(String invalid_password) {
        super(invalid_password);
    }

    public String toString (){
        return this.getMessage();
    }

}
