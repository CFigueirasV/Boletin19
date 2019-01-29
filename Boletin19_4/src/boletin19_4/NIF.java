package boletin19_4;

import javax.swing.JOptionPane;

/**
 *
 * @author cfigueirasvalverde
 */
class NIF {
  public void letra(int[] arrayL,String[] arrayS){
     int dni=Integer.parseInt(JOptionPane.showInputDialog("Número DNI: "));
     int resto=dni%23;
      for (int i = 0; i < arrayL.length; i++) {
           if(resto==arrayL[i]){
            System.out.println("\nnº: " + arrayL[i]+"--> "+ arrayS[i]);           
           }
        }
 }   
    

}