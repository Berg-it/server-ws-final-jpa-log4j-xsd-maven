//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2014.10.22 à 04:44:08 PM WAT 
//


package com.bergit.webservice.schemas.user;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bergit.webservice.schemas.user package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bergit.webservice.schemas.user
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegisterServiceUserResponse }
     * 
     */
    public RegisterServiceUserResponse createRegisterServiceUserResponse() {
        return new RegisterServiceUserResponse();
    }

    /**
     * Create an instance of {@link RegisterUserResponse }
     * 
     */
    public RegisterUserResponse createRegisterUserResponse() {
        return new RegisterUserResponse();
    }

    /**
     * Create an instance of {@link AuthentificationServiceUserResponse }
     * 
     */
    public AuthentificationServiceUserResponse createAuthentificationServiceUserResponse() {
        return new AuthentificationServiceUserResponse();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link AuthentificationServiceUserRequest }
     * 
     */
    public AuthentificationServiceUserRequest createAuthentificationServiceUserRequest() {
        return new AuthentificationServiceUserRequest();
    }

    /**
     * Create an instance of {@link LoginRequest }
     * 
     */
    public LoginRequest createLoginRequest() {
        return new LoginRequest();
    }

    /**
     * Create an instance of {@link RegisterServiceUserRequest }
     * 
     */
    public RegisterServiceUserRequest createRegisterServiceUserRequest() {
        return new RegisterServiceUserRequest();
    }

    /**
     * Create an instance of {@link RegisterUserRequest }
     * 
     */
    public RegisterUserRequest createRegisterUserRequest() {
        return new RegisterUserRequest();
    }

}
