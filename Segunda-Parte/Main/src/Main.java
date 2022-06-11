
public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.agregarPuerta();
        System.out.println("Numer de puertas:" + miCoche.getNumPuertas());
    }
    public static class Coche {
        private int numPuertas = 1;
        public void agregarPuerta() {
            numPuertas++;
        }
        public int getNumPuertas() {
            return numPuertas;
        }
    }
}
