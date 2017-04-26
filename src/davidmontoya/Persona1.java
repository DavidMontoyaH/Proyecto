/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davidmontoya;

/**
 *
 * @author sena
 */
public class Persona1 {
    private String nombre;
    public void setNombre (String nombreParametro)
    {
        this.nombre=nombreParametro;
    }
    public String getNombre()
    {
return this.nombre;
    }
    public void andar()
    {
        System.out.print(nombre+"Está caminando");
        
        System.out.print(nombre+"Hola");
    }
}
