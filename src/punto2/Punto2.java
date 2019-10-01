
package punto2;

import javax.swing.JOptionPane;


public class Punto2 {

    Caracteristicas t1,t2,t3;
    int costt=0;
          
    public static void main(String[] args) {
      Punto2 ob = new Punto2();
      ob.tiquetes();
     
    }
    
    public void tiquetes(){
        t1= new Caracteristicas();
        t2= new Caracteristicas();
        t3= new Caracteristicas();
        
       
           
           t1.setNombre(JOptionPane.showInputDialog("Ingrese nombre"));
           t1.setCosto(Integer.parseInt(JOptionPane.showInputDialog("Ingrese costo")));
           t1.setFecha(JOptionPane.showInputDialog("Digite la fecha"));
           t1.setHora(Integer.parseInt(JOptionPane.showInputDialog("Ingrese hora")));
           t1.setNum(Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero e vuelo")));
       
           t2.setNombre(JOptionPane.showInputDialog("Ingrese nombre"));
           t2.setCosto(Integer.parseInt(JOptionPane.showInputDialog("Ingrese costo")));
           t2.setFecha(JOptionPane.showInputDialog("Digite la fecha"));
           t2.setHora(Integer.parseInt(JOptionPane.showInputDialog("Ingrese hora")));
           t2.setNum(Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero e vuelo")));
           
           t3.setNombre(JOptionPane.showInputDialog("Ingrese nombre"));
           t3.setCosto(Integer.parseInt(JOptionPane.showInputDialog("Ingrese costo")));
           t3.setFecha(JOptionPane.showInputDialog("Digite la fecha"));
           t3.setHora(Integer.parseInt(JOptionPane.showInputDialog("Ingrese hora")));
           t3.setNum(Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero e vuelo")));
           
        costt=t1.getCosto()+t2.getCosto()+t3.getCosto();
        JOptionPane.showMessageDialog(null, "El costo total es" + costt);
    }
}
