package execpt;

public class Test {
    public static void main(String args[]) {

        try {
            verifyLoginPassword("Anna", "12_3", "12_3!");
        } catch (WrongLoginException e) {
            System.out.println(e.toString());
        } catch (WrongPasswordException e) {
            System.out.println(e.toString());
        }
        finally {
            System.out.println("Verification is completed");
        }
    }

    public static void verifyLoginPassword(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {
        if (!verifyLogin(login)) {
            throw new WrongLoginException("Invalid login");
        }
        if (!verifyPassword(password, confirmPassword)) {
            throw new WrongPasswordException("Invalid password");
        }
    }

    public static boolean verifyLogin(String login) {
        if ((login.length() < 20) && (login.matches("(.*)_(.*)"))) {
            return true;
        } else return false;
    }

    public static boolean verifyPassword(String password, String confirmPassword) {
        if ((password.length() < 20) && (password.matches("(.*)_(.*)"))
                && (password.matches("(.*)!(.*)")) && (password.equals(confirmPassword))) {
            return true;
        } else return false;
    }

}




