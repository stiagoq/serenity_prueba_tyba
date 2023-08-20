package test.certificationlogin.exceptions;

public class SearchException extends AssertionError {
    public SearchException(String message, Throwable cause) {
        super(message, cause);
    }

    public static String getNotMatchMessage(){
        return ("the page web isn't doing of test");
    }
}
