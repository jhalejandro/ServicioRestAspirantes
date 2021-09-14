
package com.empresa.model;

/**
 *
 * @author jhalejandro
 */
public class Desarrollador {
    private int idDesarrallador;
    private String Nombre;
    private String Apellido;
    private String rolAspirante;

    public void setIdDesarrallador(int idDesarrallador) {
        this.idDesarrallador = idDesarrallador;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setRolAspirante(String rolAspirante) {
        this.rolAspirante = rolAspirante;
    }

    public int getIdDesarrallador() {
        return idDesarrallador;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getRolAspirante() {
        return rolAspirante;
    }
    
}
