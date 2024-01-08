package Es_01;
/*Riprendi uno degli esercizi già svolti e corretti
Aggiungi Junit al progetto
Crea una funzione di test che non dia errori*/
public class Main {
    public static void main(String args[]) {
        int x = 15;
        int y = 25;
        System.out.println("Sum of x + y = " + sum(x , y));
    }

    public static int sum(int x, int y){
        int z =  x +  y;
        return z;
    }
}
