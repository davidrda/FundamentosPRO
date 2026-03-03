package model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@XmlRootElement(name ="agenda") // esta clase es el nodo raiz

/*
Hay dos formas de que JAXB lea datos:
    Por getters (métodos get...)
    Directamente por los atributos privados (fields)
Aquí estás diciendo:
    👉 “Usa los atributos privados directamente.”
 */
@XmlAccessorType(XmlAccessType.FIELD)

public class Agenda {



    @XmlElement(name = "usuario") // Cada elemento de esta lista se llamará <usuario> en el XML.
    /* Se queda así:
    <agenda>
        <usuario>...</usuario>
        <usuario>...</usuario>
    </agenda>
     */

    private List<Usuario> lista;

    public Agenda() {
        lista = new ArrayList<>();
    }
}
