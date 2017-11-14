/**
 * MensajeriaSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ziontransaccional;

public interface MensajeriaSoap extends java.rmi.Remote {
    public com.ziontransaccional.StandardResponse enviaMensaje(java.lang.String usuario, java.lang.String clave, java.lang.String mensaje, java.lang.String codigoPais, java.lang.String telefono, java.lang.String codificacion) throws java.rmi.RemoteException;
    public com.ziontransaccional.CheckPhoneResponse consultaNumero(java.lang.String telefono) throws java.rmi.RemoteException;
    public com.ziontransaccional.CheckCreditoResult consultaCreditoDisponible(java.lang.String usuario, java.lang.String clave) throws java.rmi.RemoteException;
}
