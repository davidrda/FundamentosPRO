package model;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class Usuario {

    @XmlAttribute // id aparece como atributo (field)
    private int id;

    private String nombre; // elemento
    private String apellido; // elemento

    private Direccion direccion; // elemento

    @XmlAttribute
    private String dni; // dni aparece como atributo (field)

    @XmlAttribute
    private int edad; // edad aparece como atributo (field)

    public Usuario(String nombre, String apellido, Direccion direccion, String dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.dni = dni;
        this.edad = edad;
    }
}
