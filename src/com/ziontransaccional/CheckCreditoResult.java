/**
 * CheckCreditoResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ziontransaccional;

public class CheckCreditoResult  implements java.io.Serializable {
    private int idRespuesta;

    private java.lang.String descripcion;

    private java.lang.String usuario;

    private java.math.BigDecimal creditoDisponible;

    public CheckCreditoResult() {
    }

    public CheckCreditoResult(
           int idRespuesta,
           java.lang.String descripcion,
           java.lang.String usuario,
           java.math.BigDecimal creditoDisponible) {
           this.idRespuesta = idRespuesta;
           this.descripcion = descripcion;
           this.usuario = usuario;
           this.creditoDisponible = creditoDisponible;
    }


    /**
     * Gets the idRespuesta value for this CheckCreditoResult.
     * 
     * @return idRespuesta
     */
    public int getIdRespuesta() {
        return idRespuesta;
    }


    /**
     * Sets the idRespuesta value for this CheckCreditoResult.
     * 
     * @param idRespuesta
     */
    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }


    /**
     * Gets the descripcion value for this CheckCreditoResult.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this CheckCreditoResult.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the usuario value for this CheckCreditoResult.
     * 
     * @return usuario
     */
    public java.lang.String getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this CheckCreditoResult.
     * 
     * @param usuario
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }


    /**
     * Gets the creditoDisponible value for this CheckCreditoResult.
     * 
     * @return creditoDisponible
     */
    public java.math.BigDecimal getCreditoDisponible() {
        return creditoDisponible;
    }


    /**
     * Sets the creditoDisponible value for this CheckCreditoResult.
     * 
     * @param creditoDisponible
     */
    public void setCreditoDisponible(java.math.BigDecimal creditoDisponible) {
        this.creditoDisponible = creditoDisponible;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckCreditoResult)) return false;
        CheckCreditoResult other = (CheckCreditoResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idRespuesta == other.getIdRespuesta() &&
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion()))) &&
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario()))) &&
            ((this.creditoDisponible==null && other.getCreditoDisponible()==null) || 
             (this.creditoDisponible!=null &&
              this.creditoDisponible.equals(other.getCreditoDisponible())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getIdRespuesta();
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        if (getCreditoDisponible() != null) {
            _hashCode += getCreditoDisponible().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckCreditoResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ziontransaccional.com/", "CheckCreditoResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idRespuesta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ziontransaccional.com/", "IdRespuesta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ziontransaccional.com/", "Descripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ziontransaccional.com/", "Usuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditoDisponible");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ziontransaccional.com/", "CreditoDisponible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
