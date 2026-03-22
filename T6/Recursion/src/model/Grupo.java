package model;

import java.util.HashSet;
import java.util.Set;

public class Grupo {

    private String nombre;
    private Set<User> users;
    private Set<Grupo> subGrupos;

    public Grupo() {
        users = new HashSet<>();
        subGrupos = new HashSet<>();
    }

    public Grupo(String nombre) {
        users = new HashSet<>();
        subGrupos = new HashSet<>();
    }

    public void addUser(User u){
        users.add(u);
    }

    public void addSubGrupo(Grupo g){
        subGrupos.add(g);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Set<Grupo> getSubGrupos() {
        return subGrupos;
    }

    public void setSubGrupos(Set<Grupo> subGrupos) {
        this.subGrupos = subGrupos;
    }
}
