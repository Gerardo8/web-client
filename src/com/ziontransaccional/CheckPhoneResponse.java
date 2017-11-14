/**
 * CheckPhoneResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ziontransaccional;

public class CheckPhoneResponse  implements java.io.Serializable {
    private int idRespuesta;

    private java.lang.String descripcion;

    private java.lang.String tipoDeRed;

    private java.lang.String proveedor;

    private java.lang.String ciudad;

    private java.lang.String telefono;

    public CheckPhoneResponse() {
    }

    public CheckPhoneResponse(
           int idRespuesta,
           java.lang.String descripcion,
           java.lang.String tipoDeRed,
           java.lang.String proveedor,
           java.lang.String ciudad,
           java.lang.String telefono) {
           this.idRespuesta = idRespuesta;
           this.descripcion = descripcion;
           this.tipoDeRed = tipoDeRed;
           this.proveedor = proveedor;
           this.ciudad = ciudad;
           this.telefono = telefono;
    }


    /**
     * Gets the idRespuesta value for this CheckPhoneResponse.
     * 
     * @return idRespuesta
     */
    public int getIdRespuesta() {
        return idRespuesta;
    }


    /**
     * Sets the idRespuesta value for this CheckPhoneResponse.
     * 
     * @param idRespuesta
     */
    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }


    /**
     * Gets the descripcion value for this CheckPhoneResponse.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this CheckPhoneResponse.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the tipoDeRed value for this CheckPhoneResponse.
     * 
     * @return tipoDeRed
     */
    public java.lang.String getTipoDeRed() {
        return tipoDeRed;
    }


    /**
     * Sets the tipoDeRed value for this CheckPhoneResponse.
     * 
     * @param tipoDeRed
     */
    public void setTipoDeRed(java.lang.String tipoDeRed) {
        this.tipoDeRed = tipoDeRed;
    }


    /**
     * Gets the proveedor value for this CheckPhoneResponse.
     * 
     * @return proveedor
     */
    public java.lang.String getProveedor() {
        return proveedor;
    }


    /**
     * Sets the proveedor value for this CheckPhoneResponse.
     * 
     * @param proveedor
     */
    public void setProveedor(java.lang.String proveedor) {
        this.proveedor = proveedor;
    }


    /**
     * Gets the ciudad value for this CheckPhoneResponse.
     * 
     * @return ciudad
     */
    public java.lang.String getCiudad() {
        return ciudad;
    }


    /**
     * Sets the ciudad value for this CheckPhoneResponse.
     * 
     * @param ciudad
     */
    public void setCiudad(java.lang.String ciudad) {
        this.ciudad = ciudad;
    }


    /**
     * Gets the telefono value for this CheckPhoneResponse.
     * 
     * @return telefono
     */
    public java.lang.String getTelefono() {
        return telefono;
    }


    /**
     * Sets the telefono value for this CheckPhoneResponse.
     * 
     * @param telefono
     */
    public void setTelefono(java.lang.String telefono) {
        this.telefono = telefono;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckPhoneResponse)) return false;
        CheckPhoneResponse other = (CheckPhoneResponse) obj;
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
            ((this.tipoDeRed==null && other.getTipoDeRed()==null) || 
             (this.tipoDeRed!=null &&
              this.tipoDeRed.equals(other.getTipoDeRed()))) &&
            ((this.proveedor==null && other.getProveedor()==null) || 
             (this.proveedor!=null &&
              this.proveedor.equals(other.getProveedor()))) &&
            ((this.ciudad==null && other.getCiudad()==null) || 
             (this.ciudad!=null &&
              this.ciudad.equals(other.getCiudad()))) &&
            ((this.telefono==null && other.getTelefono()==null) || 
             (this.telefono!=null &&
              this.telefono.equals(other.getTelefono())));
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
        if (getTipoDeRed() != null) {
            _hashCode += getTipoDeRed().hashCode();
        }
        if (getProveedor() != null) {
            _hashCode += getProveedor().hashCode();
        }
        if (getCiudad() != null) {
            _hashCode += getCiudad().hashCode();
        }
        if (getTelefono() != null) {
            _hashCode += getTelefono().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckPhoneResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ziontransaccional.com/", "CheckPhoneResponse"));
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
        elemField.setFieldName("tipoDeRed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ziontransaccional.com/", "TipoDeRed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proveedor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ziontransaccional.com/", "Proveedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ciudad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ziontransaccional.com/", "Ciudad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefono");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ziontransaccional.com/", "Telefono"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
