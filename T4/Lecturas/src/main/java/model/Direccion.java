package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD) // JAXB leerá directamente los atributos privados (FIELD)

public class Direccion {

    private String calle;
    private String provincia;
    private String localidad;

    /*
    En memoria sería algo así:
    Direccion d = new Direccion("Gran Via", "Madrid", "Madrid");

    Y cuando JAXB la convierta a XML, será algo como:
    <direccion>
        <calle>Gran Via</calle>
        <provincia>Madrid</provincia>
        <localidad>Madrid</localidad>
    </direccion>
     */

}
