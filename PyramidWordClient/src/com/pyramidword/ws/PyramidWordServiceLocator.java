/**
 * PyramidWordServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pyramidword.ws;

public class PyramidWordServiceLocator extends org.apache.axis.client.Service implements com.pyramidword.ws.PyramidWordService {

    public PyramidWordServiceLocator() {
    }


    public PyramidWordServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PyramidWordServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PyramidWord
    private java.lang.String PyramidWord_address = "http://localhost:8080/PyramidWord/services/PyramidWord";

    public java.lang.String getPyramidWordAddress() {
        return PyramidWord_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PyramidWordWSDDServiceName = "PyramidWord";

    public java.lang.String getPyramidWordWSDDServiceName() {
        return PyramidWordWSDDServiceName;
    }

    public void setPyramidWordWSDDServiceName(java.lang.String name) {
        PyramidWordWSDDServiceName = name;
    }

    public com.pyramidword.ws.PyramidWord getPyramidWord() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PyramidWord_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPyramidWord(endpoint);
    }

    public com.pyramidword.ws.PyramidWord getPyramidWord(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.pyramidword.ws.PyramidWordSoapBindingStub _stub = new com.pyramidword.ws.PyramidWordSoapBindingStub(portAddress, this);
            _stub.setPortName(getPyramidWordWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPyramidWordEndpointAddress(java.lang.String address) {
        PyramidWord_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.pyramidword.ws.PyramidWord.class.isAssignableFrom(serviceEndpointInterface)) {
                com.pyramidword.ws.PyramidWordSoapBindingStub _stub = new com.pyramidword.ws.PyramidWordSoapBindingStub(new java.net.URL(PyramidWord_address), this);
                _stub.setPortName(getPyramidWordWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("PyramidWord".equals(inputPortName)) {
            return getPyramidWord();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.pyramidword.com", "PyramidWordService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.pyramidword.com", "PyramidWord"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PyramidWord".equals(portName)) {
            setPyramidWordEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
