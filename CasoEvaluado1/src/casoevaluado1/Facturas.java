/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoevaluado1;

import javax.swing.JOptionPane;

/**
 *
 * @author sanlo
 */
public class Facturas {

    private String nombreCliente;
    private String cedulaCliente;
    private String codigoFactura;
    private double montoFactura;
    private boolean hayProducElectrico = false;
    private boolean hayProducAuto = false;
    private int mes;
    private boolean hayProducConstruc = false;
    private int cantProduElectrico = 0;
    private int cantProdcuAuto = 0;
    private int cantProduConstruc = 0;
    private int sumaPuntos = 0;
    private int numFacturas=0;
    private boolean bonoExtra=false;
    private double facturFinal=0;
    private int sumaComisiones=0;

    
    public Facturas() { //mostrar en main
    }

    public Facturas(String nombreCliente, String cedulaCliente, String codigoFactura, double montoFactura, int mes) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.codigoFactura = codigoFactura;
        this.montoFactura = montoFactura;
        this.mes = mes;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public double getMontoFactura() {
        return montoFactura;
    }

    public void setMontoFactura(double montoFactura) {
        this.montoFactura = montoFactura;
    }

    public boolean isHayProducElectrico() {
        return hayProducElectrico;
    }

    public void setHayProducElectrico(boolean hayProducElectrico) {
        this.hayProducElectrico = hayProducElectrico;
    }

    public boolean isHayProducAuto() {
        return hayProducAuto;
    }

    public void setHayProducAuto(boolean hayProducAuto) {
        this.hayProducAuto = hayProducAuto;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public boolean isHayProducConstruc() {
        return hayProducConstruc;
    }

    public void setHayProducConstruc(boolean hayProducConstruc) {
        this.hayProducConstruc = hayProducConstruc;
    }

    public int getCantProduElectrico() {
        return cantProduElectrico;
    }

    public void setCantProduElectrico(int cantProduElectrico) {
        this.cantProduElectrico = cantProduElectrico;
    }

    public int getCantProdcuAuto() {
        return cantProdcuAuto;
    }

    public void setCantProdcuAuto(int cantProdcuAuto) {
        this.cantProdcuAuto = cantProdcuAuto;
    }

    public int getCantProduConstruc() {
        return cantProduConstruc;
    }

    public void setCantProduConstruc(int cantProduConstruc) {
        this.cantProduConstruc = cantProduConstruc;
    }

    public int getSumaPuntos() {
        return sumaPuntos;
    }

    public void setSumaPuntos(int sumaPuntos) {
        this.sumaPuntos = sumaPuntos;
    }

    public int getNumFacturas() {
        return numFacturas;
    }

    public void setNumFacturas(int numFacturas) {
        this.numFacturas = numFacturas;
    }

    public boolean isBonoExtra() {
        return bonoExtra;
    }

    public void setBonoExtra(boolean bonoExtra) {
        this.bonoExtra = bonoExtra;
    }

    public double getFacturFinal() {
        return facturFinal;
    }

    public void setFacturFinal(double facturFinal) {
        this.facturFinal = facturFinal;
    }

    public int getSumaComisiones() {
        return sumaComisiones;
    }

    public void setSumaComisiones(int sumaComisiones) {
        this.sumaComisiones = sumaComisiones;
    }

   
    
    public void procesoFacturas() { // Registra facturas
        boolean seguir = true;
        int u = 0; 
        int g = 0; 

        while (seguir) {
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea agregar una factura?");
            if (respuesta == 0) {
                u++;
                Facturas f = new Facturas();
                f.setNombreCliente(JOptionPane.showInputDialog("Ingrese el nombre el cliente;"));
                f.setCedulaCliente(JOptionPane.showInputDialog("Ingrese la cedula del cliente"));
                f.setCodigoFactura(JOptionPane.showInputDialog("Ingrese el codigo de la factura: "));
                f.setMontoFactura(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la factura: ")));
                f.setHayProducElectrico(JOptionPane.showConfirmDialog(null, "¿La factura contiene productos electricos?") == 0);
                f.setCantProduElectrico(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos electricos")));
                f.setHayProducAuto(JOptionPane.showConfirmDialog(null, "¿La factura contiene productos automotrices?") == 0);
                f.setCantProdcuAuto(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos automotrices:")));
                f.setHayProducConstruc(JOptionPane.showConfirmDialog(null, "¿La factura tiene productos de construccion? ") == 0);
                f.setCantProduConstruc(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos de construccion")));

                int numMes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de la factura: "));
                while (true) {
                    if (mes <= 12) {
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Mes invalido.");
                        numMes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nuevamente la semana de la actividad:"));
                        f.setMes(numMes);
                    }
                }
                double factura = f.getMontoFactura();
                int cantidadElectrico = f.getCantProduElectrico();
                int cantidadAutomotriz = f.getCantProdcuAuto();
                int cantidadConstruccion = f.getCantProduConstruc();
                int sumaPuntos = 0;
                double facturaSuma1 = 0;
                double facturaSuma2 = 0;
                double facturaSuma3 = 0;
                double facturaSuma4 = 0;
                double facturaSuma5 = 0;
                double facturaSuma6 = 0;
                double facturaSuma7 = 0;
                double facturaSuma8 = 0;
                double facturaFinalCalc=0;
                double sumaComisionesFinalCalc=0;

                if (f.hayProducConstruc && f.hayProducAuto && f.hayProducElectrico) {
                    sumaPuntos += 3;
                    facturaSuma1 = factura * 0.1;
                }
                if (cantidadElectrico >= 3) {
                    sumaPuntos += 1;
                    facturaSuma2 = factura * 0.04;
                }
                if (cantidadElectrico<3){
                    facturaSuma3=factura*0.02;
                    sumaPuntos+=1;
                }
                if (cantidadAutomotriz>4){
                    facturaSuma4=factura*0.04;
                    sumaPuntos+=1;
                }
                if (cantidadAutomotriz<4){
                   facturaSuma5=factura*0.02;
                   sumaPuntos+=1;
                }
                if (f.hayProducConstruc){
                    facturaSuma6=factura*0.08;
                    sumaPuntos+=2;
                }
                if (factura>50000){
                    facturaSuma7=factura*0.05;
                    sumaPuntos+=1;
                }
                if (numFacturas>3 || factura>300000){
                    facturaSuma8+=20000;
                    bonoExtra=true;
                }
                facturaFinalCalc=facturaSuma1+facturaSuma2+facturaSuma3+facturaSuma4+facturaSuma5+facturaSuma6+facturaSuma7+facturaSuma8;
                sumaComisionesFinalCalc= facturaSuma1+facturaSuma2+facturaSuma3+facturaSuma4+facturaSuma5+facturaSuma6+facturaSuma7+facturaSuma8;
                f.setSumaComisiones(sumaComisiones);
                f.setBonoExtra(bonoExtra);
                
            }else{
                seguir=false;
            }
            
        }
    
}

    @Override
    public String toString() {
        return "Facturas{" + "codigoFactura=" + codigoFactura + ", montoFactura=" + montoFactura + ", sumaPuntos=" + sumaPuntos + ", bonoExtra=" + bonoExtra + ", facturFinal=" + facturFinal + ", sumaComisiones=" + sumaComisiones + '}';
    }

  

    }