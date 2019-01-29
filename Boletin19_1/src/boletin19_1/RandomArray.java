package boletin19_1;

/**
 *
 * @author cfigueirasvalverde
 */
class RandomArray {
      public int[] crearArray(int[] lista){
        for(int i=0;i<6;i++){
            lista[i]=(int) (Math.random()*50+1);
        }
        for(int i=5;i>=0;i--){
            System.out.println(lista[i]);
        }
        return lista;
    }
}