
package cursojava;

import javax.swing.JOptionPane;



public class PRIMER_EJECUTABLE {
    public static void main(String[] args) {
        
    
    int iNumero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de personas que mediremos"));
    int iSumatorio = 0;
    int iContador = iNumero;
		
    while (iContador != 0) {
		   
    iSumatorio = iSumatorio + iContador;
    iContador--;
	 
}
		
System.out.println("El sumatorio de " + iNumero + " es " + iSumatorio);
        }
      
//        while(num!=0){
//            num++;
//            acum=acum+num;
//             System.out.println("total "+acum);
            }
        //        Scanner enter=new Scanner (System.in);
//            System.out.println("Ingrese por 
        
       
            
                
        
            
        
