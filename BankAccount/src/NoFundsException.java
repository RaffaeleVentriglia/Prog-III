public class NoFundsException extends Exception {
    public NoFundsException() { super("Fondi non sufficienti"); }
    public String toString() { return getMessage(); }
}
