//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2014.10.22 � 04:44:08 PM WAT 
//


package com.bergit.webservice.schemas.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://www.bergit.com/webservice/schemas/user}LoginRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request"
})
@XmlRootElement(name = "AuthentificationServiceUserRequest")
public class AuthentificationServiceUserRequest {

    @XmlElement(required = true)
    protected LoginRequest request;

    /**
     * Obtient la valeur de la propri�t� request.
     * 
     * @return
     *     possible object is
     *     {@link LoginRequest }
     *     
     */
    public LoginRequest getRequest() {
        return request;
    }

    /**
     * D�finit la valeur de la propri�t� request.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginRequest }
     *     
     */
    public void setRequest(LoginRequest value) {
        this.request = value;
    }

}
