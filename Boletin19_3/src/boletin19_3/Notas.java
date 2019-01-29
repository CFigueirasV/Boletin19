package boletin19_3;

import javax.swing.JOptionPane;

/**
 *
 * @author cfigueirasvalverde
 */
class Notas {
  public int darValorInt() {
        return Integer.parseInt(JOptionPane.showInputDialog("Nota : "));
    }

    public String darValorString() {
        return JOptionPane.showInputDialog("Nombre alumno: ");
    }

    public void aprobados(int[] arrayI, String[] arrayS) {

        for (int i = 0; i < arrayI.length; i++) {
            if (arrayI[i] >= 5.0) {
                System.out.println(arrayS[i]);
            }
        }
    }

    public void notasAlumnos(int[] arrayI, String[] arrayS) {
        for (int i = 0; i < arrayI.length; i++) {
            arrayI[i] = darValorInt();
            arrayS[i] = darValorString();
        }
    }

    public void lista(int[] arrayI, String[] arrayS) {

        int aux;
        String aux2;
        for (int i = 0; i < arrayI.length - 1; i++) {
            for (int j = i + 1; j < arrayI.length; j++) {
                if (arrayI[i] > arrayI[j]) {
                    aux = arrayI[i];
                    arrayI[i] = arrayI[j];
                    arrayI[j] = aux;
                    aux2 = arrayS[i];
                    arrayS[i] = arrayS[j];
                    arrayS[j] = aux2;
                }
            }
        }
    }

    public void visualizarLista(int[] arrayI, String[] arrayS) {
        for (int i = 0; i < arrayI.length; i++) {
            System.out.println("\nAlumno: " + arrayS[i]);
            System.out.println("Nota: " + arrayI[i]);

        }
    }

    public void visualizarAlumno(int[] arrayI, String[] arrayS) {
        String alumno = darValorString();
        for (int i = 0; i < arrayS.length; i++) {
            if (alumno == arrayS[i]) {
                System.out.println("Nota: " + arrayI[i]);
            }
        }
    }
}