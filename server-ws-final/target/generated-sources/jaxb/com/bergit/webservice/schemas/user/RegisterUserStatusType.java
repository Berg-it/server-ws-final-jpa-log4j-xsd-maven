//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2014.10.22 à 05:19:36 PM WAT 
//


package com.bergit.webservice.schemas.user;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RegisterUserStatusType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RegisterUserStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUCCESS"/>
 *     &lt;enumeration value="WRONG_DATA"/>
 *     &lt;enumeration value="USER_EXIST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RegisterUserStatusType")
@XmlEnum
public enum RegisterUserStatusType {

    SUCCESS,
    WRONG_DATA,
    USER_EXIST;

    public String value() {
        return name();
    }

    public static RegisterUserStatusType fromValue(String v) {
        return valueOf(v);
    }

}
