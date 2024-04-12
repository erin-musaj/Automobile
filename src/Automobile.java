public class Automobile extends Thread{

    private String n;
    private Semaforo s;

    public Automobile(String n, Semaforo s){
        this.s=s;
        this.n=n;
    }

    @Override
    public void run(){
        System.out.println(n + " si avvicina al semaforo");
        s.P();
        System.out.println(n + " sta attraversando l'incrocio");
        try {
            Thread.sleep(2000);
        }catch(Exception e){
            Thread.currentThread().interrupt();
        }
        System.out.println(n + " ha attraversato l'incrocio");
        s.V();
    }
}
