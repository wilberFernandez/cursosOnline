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
public class Docente {
    private int idDoAdmin;
    private String doNombre;
    private String doApellido;
    private String doDireccion;
    private int doEdad;
    private String doTelefono;
    private String doSexo;
    private String doFechaNac;
    private String doCorreo;
    private String doClave;
    private String doPais;
    private String doTipoEmpleado;
    
    public Docente() {
    }

    public Docente(int idDoAdmin, String doNombre, String doApellido, String doDireccion, int doEdad, String doTelefono, String doSexo, String doFechaNac, String doCorreo, String doClave, String doPais, String doTipoEmpleado) {
        this.idDoAdmin = idDoAdmin;
        this.doNombre = doNombre;
        this.doApellido = doApellido;
        this.doDireccion = doDireccion;
        this.doEdad = doEdad;
        this.doTelefono = doTelefono;
        this.doSexo = doSexo;
        this.doFechaNac = doFechaNac;
        this.doCorreo = doCorreo;
        this.doClave = doClave;
        this.doPais = doPais;
        this.doTipoEmpleado= doTipoEmpleado;
    }   

    public int getDoAdmin() {
        return idDoAdmin;
    }

    public void setDoAdmin(int doAdmin) {
        this.idDoAdmin = idDoAdmin;
    }

    public String getDoNombre() {
        return doNombre;
    }

    public void setDoNombre(String doNombre) {
        this.doNombre = doNombre;
    }

    public String getDoApellido() {
        return doApellido;
    }

    public void setDoApellido(String doApellido) {
        this.doApellido = doApellido;
    }

    public String getDoDireccion() {
        return doDireccion;
    }

    public void setDoDireccion(String doDireccion) {
        this.doDireccion = doDireccion;
    }

    public int getDoEdad() {
        return doEdad;
    }

    public void setDoEdad(int doEdad) {
        this.doEdad = doEdad;
    }

    public String getDoTelefono() {
        return doTelefono;
    }

    public void setDoTelefono(String doTelefono) {
        this.doTelefono = doTelefono;
    }

    public String getDoSexo() {
        return doSexo;
    }

    public void setDoSexo(String doSexo) {
        this.doSexo = doSexo;
    }

    public String getDoFechaNac() {
        return doFechaNac;
    }

    public void setDoFechaNac(String doFechaNac) {
        this.doFechaNac = doFechaNac;
    }

    public String getDoCorreo() {
        return doCorreo;
    }

    public void setDoCorreo(String doCorreo) {
        this.doCorreo = doCorreo;
    }

    public String getDoClave() {
        return doClave;
    }

    public void setDoClave(String doClave) {
        this.doClave = doClave;
    }

    public String getDoPais() {
        return doPais;
    }

    public void setDoPais(String doPais) {
        this.doPais = doPais;
    }

    public String getDoTipoEmpleado() {
        return doTipoEmpleado;
    }

    public void setDoTipoEmpleado(String doTipoEmpleado) {
        this.doTipoEmpleado = doTipoEmpleado;
    }

    @Override
    public String toString() {
        return "Docente{" + 
                "doAdmin=" + idDoAdmin + 
                ", doNombre=" + doNombre + 
                ", doApellido=" + doApellido + 
                ", doDireccion=" + doDireccion + 
                ", doEdad=" + doEdad + 
                ", doTelefono=" + doTelefono + 
                ", doSexo=" + doSexo + 
                ", doFechaNac=" + doFechaNac + 
                ", doCorreo=" + doCorreo + 
                ", doClave=" + doClave + 
                ", doPais=" + doPais +
                ", doTipoEmpleado="+ doTipoEmpleado;
    }



}
