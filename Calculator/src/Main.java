public class Main {
    public static FrontEnd frontEnd = new FrontEnd();
    public static BackEnd backEnd = new BackEnd();

    public static void main(String [] args) {
        frontEnd.initialize();
        backEnd.addActionListeners();

    }
}
