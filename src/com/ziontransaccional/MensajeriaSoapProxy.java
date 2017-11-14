package com.ziontransaccional;

public class MensajeriaSoapProxy implements com.ziontransaccional.MensajeriaSoap {
  private String _endpoint = null;
  private com.ziontransaccional.MensajeriaSoap mensajeriaSoap = null;
  
  public MensajeriaSoapProxy() {
    _initMensajeriaSoapProxy();
  }
  
  public MensajeriaSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initMensajeriaSoapProxy();
  }
  
  private void _initMensajeriaSoapProxy() {
    try {
      mensajeriaSoap = (new com.ziontransaccional.MensajeriaLocator()).getMensajeriaSoap();
      if (mensajeriaSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)mensajeriaSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)mensajeriaSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (mensajeriaSoap != null)
      ((javax.xml.rpc.Stub)mensajeriaSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ziontransaccional.MensajeriaSoap getMensajeriaSoap() {
    if (mensajeriaSoap == null)
      _initMensajeriaSoapProxy();
    return mensajeriaSoap;
  }
  
  public com.ziontransaccional.StandardResponse enviaMensaje(java.lang.String usuario, java.lang.String clave, java.lang.String mensaje, java.lang.String codigoPais, java.lang.String telefono, java.lang.String codificacion) throws java.rmi.RemoteException{
    if (mensajeriaSoap == null)
      _initMensajeriaSoapProxy();
    return mensajeriaSoap.enviaMensaje(usuario, clave, mensaje, codigoPais, telefono, codificacion);
  }
  
  public com.ziontransaccional.CheckPhoneResponse consultaNumero(java.lang.String telefono) throws java.rmi.RemoteException{
    if (mensajeriaSoap == null)
      _initMensajeriaSoapProxy();
    return mensajeriaSoap.consultaNumero(telefono);
  }
  
  public com.ziontransaccional.CheckCreditoResult consultaCreditoDisponible(java.lang.String usuario, java.lang.String clave) throws java.rmi.RemoteException{
    if (mensajeriaSoap == null)
      _initMensajeriaSoapProxy();
    return mensajeriaSoap.consultaCreditoDisponible(usuario, clave);
  }
  
  
}