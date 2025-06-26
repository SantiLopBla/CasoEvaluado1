/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoevaluado1;

/**
 *
 * @author sanlo
 */
public class AgenteVentas {
    private String nombreAgente;
    private String cedulaAgente;
    private String codigoAgente ;
    private String sucursalPerteneciente;
    private boolean vehiculoPropio=false;
    
    public AgenteVentas(){
    }

    public AgenteVentas(String nombreAgente, String cedulaAgente, String codigoAgente, String sucursalPerteneciente) {
        this.nombreAgente = nombreAgente;
        this.cedulaAgente = cedulaAgente;
        this.codigoAgente = codigoAgente;
        this.sucursalPerteneciente = sucursalPerteneciente;
    }

    public String getNombreAgente() {
        return nombreAgente;
    }

    public void setNombreAgente(String nombreAgente) {
        this.nombreAgente = nombreAgente;
    }

    public String getCedulaAgente() {
        return cedulaAgente;
    }

    public void setCedulaAgente(String cedulaAgente) {
        this.cedulaAgente = cedulaAgente;
    }

    public String getCodigoAgente() {
        return codigoAgente;
    }

    public void setCodigoAgente(String codigoAgente) {
        this.codigoAgente = codigoAgente;
    }

    public String getSucursalPerteneciente() {
        return sucursalPerteneciente;
    }

    public void setSucursalPerteneciente(String sucursalPerteneciente) {
        this.sucursalPerteneciente = sucursalPerteneciente;
    }

    public boolean isVehiculoPropio() {
        return vehiculoPropio;
    }

    public void setVehiculoPropio(boolean vehiculoPropio) {
        this.vehiculoPropio = vehiculoPropio;
    }

    @Override
    public String toString() {
        return "Nombre del agente= " + nombreAgente +"\n"
                + "Codigo  del agente= " + codigoAgente +"\n"
                + "Sucursal del agente= " + sucursalPerteneciente +"\n"
                + "Agente cuenta con vehiculo propio" + vehiculoPropio;
    }

 
    
  
}
