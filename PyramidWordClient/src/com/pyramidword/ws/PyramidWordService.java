/**
 * PyramidWordService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pyramidword.ws;

public interface PyramidWordService extends javax.xml.rpc.Service {
    public java.lang.String getPyramidWordAddress();

    public com.pyramidword.ws.PyramidWord getPyramidWord() throws javax.xml.rpc.ServiceException;

    public com.pyramidword.ws.PyramidWord getPyramidWord(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
