public class Main {
    public static void main(String[] args) {
        Semaforo s = new Semaforo(1);

        Automobile a1 = new Automobile("Guglielmo1", s);
        Automobile a2 = new Automobile("Guglielmo2", s);
        Automobile a3 = new Automobile("Guglielmo3", s);

        a1.start();
        a2.start();
        a3.start();
    }
}