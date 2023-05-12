//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.05.12 a las 10:04:01 AM CEST 
//


package com.cursoceat.xml.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cliente" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="dni" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="nombreApellidos" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="saldo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cliente"
})
@XmlRootElement(name = "banco")
public class Banco {

    @XmlElement(required = true)
    protected List<Banco.Cliente> cliente;

    /**
     * Gets the value of the cliente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cliente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCliente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Banco.Cliente }
     * 
     * 
     */
    public List<Banco.Cliente> getCliente() {
        if (cliente == null) {
            cliente = new ArrayList<Banco.Cliente>();
        }
        return this.cliente;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="dni" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="nombreApellidos" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="saldo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dni",
        "nombreApellidos",
        "fechaNacimiento",
        "saldo"
    })
    public static class Cliente {

        @XmlElement(required = true)
        protected String dni;
        @XmlElement(required = true)
        protected String nombreApellidos;
        @XmlElement(required = true)
        protected String fechaNacimiento;
        @XmlElement(required = true)
        protected String saldo;

        /**
         * Obtiene el valor de la propiedad dni.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDni() {
            return dni;
        }

        /**
         * Define el valor de la propiedad dni.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDni(String value) {
            this.dni = value;
        }

        /**
         * Obtiene el valor de la propiedad nombreApellidos.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombreApellidos() {
            return nombreApellidos;
        }

        /**
         * Define el valor de la propiedad nombreApellidos.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombreApellidos(String value) {
            this.nombreApellidos = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaNacimiento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFechaNacimiento() {
            return fechaNacimiento;
        }

        /**
         * Define el valor de la propiedad fechaNacimiento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFechaNacimiento(String value) {
            this.fechaNacimiento = value;
        }

        /**
         * Obtiene el valor de la propiedad saldo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSaldo() {
            return saldo;
        }

        /**
         * Define el valor de la propiedad saldo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSaldo(String value) {
            this.saldo = value;
        }

    }

}
