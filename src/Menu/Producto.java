package Menu;

import java.util.UUID;
import java.util.Date;


public class Producto {
    private String nombre;
    private String codigo;
    private String precioUnitario;
    private String fechaIngreso;
    private String fechaVencimiento;
    private String stock;
    private String categoria;
    private boolean caducado;

    // Constructor
    public Producto(String nombre, String codigo, String precioUnitario, String fechaIngreso, String fechaVencimiento, String stock, String categoria) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precioUnitario = precioUnitario;
        this.fechaIngreso = fechaIngreso;
        this.fechaVencimiento = fechaVencimiento;
        this.stock = stock;
        this.categoria = categoria;
        this.caducado = caducado;
    }
    
    public Producto(){
    }

    // Método para verificar si el producto ha caducado
    /*private boolean verificarCaducidad() {
        Date fechaActual = new Date();
        return fechaVencimiento != null && fechaActual.after(fechaVencimiento);
    }*/

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(String precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isCaducado() {
        return caducado;
    }

    public void setCaducado(boolean caducado) {
        this.caducado = caducado;
    }
    
    public String generarCodigoUnico() {
        return UUID.randomUUID().toString().replace("-", "").substring(0, 8);
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}