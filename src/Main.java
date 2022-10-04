public class Main {
    public static void main(String[] args) {
        var resultant = suma(10,20,30);
        System.out.println(resultant);


        Coche miCoche = new Coche();
                miCoche.aumentarPuertas();
        System.out.println(miCoche.nPuertas);
    }

    private static int suma(int a, int b, int c) {
        return a + b + c;
    }



}

class  Coche {
    public int nPuertas;
    public void aumentarPuertas() {
        this.nPuertas++;
    }

}