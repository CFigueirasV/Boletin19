package boletin19_4;

/**
 *
 * @author cfigueirasvalverde
 */
public class Boletin19_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] num = {3, 11, 20, 9, 22, 7, 4, 18, 13, 21, 19, 5, 12, 8, 16, 1, 15, 0, 17, 2, 10, 6, 14};
        String[] letra = {"A", "B", "C", "D", "E", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Y", "Z"};
        NIF dni1 = new NIF();
        dni1.letra(num, letra);
    }

}