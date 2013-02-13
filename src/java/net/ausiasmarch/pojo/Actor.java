package net.ausiasmarch.pojo;
// Generated 13-feb-2013 11:27:45 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Actor generated by hbm2java
 */
public class Actor  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private Set<Interpreta> interpretas = new HashSet<Interpreta>(0);

    public Actor() {
    }

	
    public Actor(String nombre) {
        this.nombre = nombre;
    }
    public Actor(String nombre, Set<Interpreta> interpretas) {
       this.nombre = nombre;
       this.interpretas = interpretas;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set<Interpreta> getInterpretas() {
        return this.interpretas;
    }
    
    public void setInterpretas(Set<Interpreta> interpretas) {
        this.interpretas = interpretas;
    }




}


