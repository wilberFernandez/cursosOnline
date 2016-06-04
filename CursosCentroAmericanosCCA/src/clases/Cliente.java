/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Oscar Barahona
 */
public class Cliente {
    private int cliAdmin;
    private String cliNombre;
    private String cliApellido;
    private String cliDireccion;
    private int cliEdad;
    private String cliTelefono;
    private String cliSexo;
    private String cliFechaNac;
    private String cliCorreo;
    private String cliClave;
    private String cliPais;

    public Cliente() {
    }

    public Cliente(int cliAdmin, String cliNombre, String cliApellido, String cliDireccion, int cliEdad, String cliTelefono, String cliSexo, String cliFechaNac, String cliCorreo, String cliClave, String cliPais) {
        this.cliAdmin = cliAdmin;
        this.cliNombre = cliNombre;
        this.cliApellido = cliApellido;
        this.cliDireccion = cliDireccion;
        this.cliEdad = cliEdad;
        this.cliTelefono = cliTelefono;
        this.cliSexo = cliSexo;
        this.cliFechaNac = cliFechaNac;
        this.cliCorreo = cliCorreo;
        this.cliClave = cliClave;
        this.cliPais = cliPais;
    }

    public int getCliAdmin() {
        return cliAdmin;
    }

    public void setCliAdmin(int cliAdmin) {
        this.cliAdmin = cliAdmin;
    }

    public String getCliNombre() {
        return cliNombre;
    }

    public void setCliNombre(String cliNombre) {
        this.cliNombre = cliNombre;
    }

    public String getCliApellido() {
        return cliApellido;
    }

    public void setCliApellido(String cliApellido) {
        this.cliApellido = cliApellido;
    }

    public String getCliDireccion() {
        return cliDireccion;
    }

    public void setCliDireccion(String cliDireccion) {
        this.cliDireccion = cliDireccion;
    }

    public int getCliEdad() {
        return cliEdad;
    }

    public void setCliEdad(int cliEdad) {
        this.cliEdad = cliEdad;
    }

    public String getCliTelefono() {
        return cliTelefono;
    }

    public void setCliTelefono(String cliTelefono) {
        this.cliTelefono = cliTelefono;
    }

    public String getCliSexo() {
        return cliSexo;
    }

    public void setCliSexo(String cliSexo) {
        this.cliSexo = cliSexo;
    }

    public String getCliFechaNac() {
        return cliFechaNac;
    }

    public void setCliFechaNac(String cliFechaNac) {
        this.cliFechaNac = cliFechaNac;
    }

    public String getCliCorreo() {
        return cliCorreo;
    }

    public void setCliCorreo(String cliCorreo) {
        this.cliCorreo = cliCorreo;
    }

    public String getCliClave() {
        return cliClave;
    }

    public void setCliClave(String cliClave) {
        this.cliClave = cliClave;
    }

    public String getCliPais() {
        return cliPais;
    }

    public void setCliPais(String cliPais) {
        this.cliPais = cliPais;
    }

    @Override
    public String toString() {
        return "Cliente{" + 
                "cliAdmin=" + cliAdmin + 
                ", cliNombre=" + cliNombre + 
                ", cliApellido=" + cliApellido +
                ", cliDireccion=" + cliDireccion +
                ", cliEdad=" + cliEdad + 
                ", cliTelefono=" + cliTelefono + 
                ", cliSexo=" + cliSexo + 
                ", cliFechaNac=" + cliFechaNac + 
                ", cliCorreo=" + cliCorreo + 
                ", cliClave=" + cliClave + 
                ", cliPais=" + cliPais + '}';
    }
    
    
    
    
    
    
    
    
    
    
   
}
