package ExceptionHandling.NegativeNumberException;public class NegativeNumberException extends Exception {    String msg;    public NegativeNumberException(){        msg="negative Number";    }    public NegativeNumberException(String m){        super(m);        this.msg=m;    }}