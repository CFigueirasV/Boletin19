package boletin19_2;

/**
 *
 * @author cfigueirasvalverde
 */
public class Boletin19_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos x = new Metodos();
        Alumno[] clase = new Alumno[5];
        x.crearArray(clase);
        x.mostrar(clase);
        x.aprobados(clase);
        x.suspensos(clase);
        x.notaMedia(clase);
        x.notaMaisAlta(clase);
        x.visualizarNota(clase, "pedro");
        x.listaAprobados(clase);
        x.visualizarNotaTeclado(clase);
    }
    
}