

package cursojava;


import javax.swing.JOptionPane;


public class ventanaJOption {
    public static void main(String[] args) {
        
  
       
     JOptionPane.showMessageDialog(null, "*** BIENVENIDO A SU GARAGE VIRTUAL ***");
int vehiculo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tipo de vehiculo, 1-Auto, 2- Moto"));
int metodoPago = Integer.parseInt(JOptionPane.showInputDialog("Ingrese metodo de pago, 1-Efectivo, 2-Tarjeta de debito."));
int horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de horas transcurridas en garage" ));
int totalA = horas * 100;
int totalB = horas * 25;

double valorPorcentajeA = (totalA * 0.20)+totalA;
double valorPorcentajeB = (totalB * 0.20)+totalB;

switch (metodoPago) {
case 1:


switch (vehiculo) {
case 1:

if (horas <= 1 || horas >= 3 ) {

JOptionPane.showMessageDialog(null, "EL TIEMPO TRANSCURRIDO ES DE "+ horas + " HORA, SU TOTAL ES "+horas*100);

}else if (horas > 1 && horas <= 2 ) {
JOptionPane.showMessageDialog(null, "EL TIEMPO TRANSCURRIDO ES DE "+ horas + " HORAS, SU TOTAL ES "+ 150*0.20);

}else{
JOptionPane.showMessageDialog(null, "CANTIDAD INGRESADA INCORRECTA");
}
break;

case 2:
if (horas <= 1 || horas >= 3 ) {

JOptionPane.showMessageDialog(null, "EL TIEMPO TRANSCURRIDO ES DE "+ horas + " HORA, SU TOTAL ES DE $" + horas * 25);

}else if (horas > 1 && horas <= 2 ) {
JOptionPane.showMessageDialog(null, "EL TIEMPO TRANSCURRIDO ES DE "+ horas + " HORAS, SU TOTAL ES $37");

}else {
JOptionPane.showMessageDialog(null, "CANTIDAD INGRESADA INCORRECTA");
}
break;
}

case 2:


switch (vehiculo) {
case 1:


if (horas <= 1 || horas > 3 ) {

JOptionPane.showMessageDialog(null, "EL TIEMPO TRANSCURRIDO ES DE "+ horas + " HORA, SU TOTAL ES "+valorPorcentajeA);

}else if (horas > 1 && horas <= 2 ) {
JOptionPane.showMessageDialog(null, "EL TIEMPO TRANSCURRIDO ES DE "+ horas + " HORAS, SU TOTAL ES " + (valorPorcentajeA-50));

}
break;

case 2:
if (horas <= 1 || horas > 3 ) {

JOptionPane.showMessageDialog(null, "EL TIEMPO TRANSCURRIDO ES DE "+ horas + " HORA, SU TOTAL ES DE $" + valorPorcentajeB);

}else if (horas > 1 && horas <= 2 ) {
JOptionPane.showMessageDialog(null, "EL TIEMPO TRANSCURRIDO ES DE "+ horas + " HORAS, SU TOTAL ES $37"+ (valorPorcentajeB-13));

}else {
JOptionPane.showMessageDialog(null, "CANTIDAD INGRESADA INCORRECTA");
}

} break;
default:
JOptionPane.showMessageDialog(null, "METODO DE PAGO INCORRECTO");



}


}
}

