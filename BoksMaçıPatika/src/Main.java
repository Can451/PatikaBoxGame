public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Can", 15, 100, 100,40,50);
        Fighter f2 = new Fighter("EmirAli", 20, 80, 100,30,50);


        Match match = new Match(f1, f2, 100, 100);
        match.run();
    }




}
