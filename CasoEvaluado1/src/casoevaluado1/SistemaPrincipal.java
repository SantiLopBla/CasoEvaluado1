/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoevaluado1;

import javax.swing.JOptionPane;

/**
 *
 * @author sanlo
 */
public class SistemaPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AgenteVentas a = new AgenteVentas(); //Llama clase de agente
        a.setNombreAgente(JOptionPane.showInputDialog("Ingrese el nombre del agente de ventas: "));
        a.setCedulaAgente(JOptionPane.showInputDialog("Ingrese la cedula del agente de ventas: "));
        a.setCodigoAgente(JOptionPane.showInputDialog("Ingrese el codigo del agente de ventas: "));
        a.setSucursalPerteneciente(JOptionPane.showInputDialog("Ingrese la sucursal perteneciente del agente de ventas: "));
        a.setVehiculoPropio(JOptionPane.showConfirmDialog(null, "¿El agente tiene vehiculo propio") == 0);
        
        int cantFacturas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de facturas que desea registrar, esto para un control del sistema;"));
        int i = 0; //contador
        
        while (i < cantFacturas) { //para salir del programa
        Facturas f =new Facturas(); //abre clase de facturas 
        f.procesoFacturas();
        
        JOptionPane.showMessageDialog(null, a.toString()); //to strings de clases
        JOptionPane.showMessageDialog(null, f.toString());
        
        i++;
        }
        
    }

}
