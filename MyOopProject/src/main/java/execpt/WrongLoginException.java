package execpt;

public class WrongLoginException extends Exception{
    public WrongLoginException (String invalid_login){
        super(invalid_login);
    }

    public String toString (){
        return this.getMessage();
    }

}
