package com.pyramidword.ws;

public class PyramidWordProxy implements com.pyramidword.ws.PyramidWord {
  private String _endpoint = null;
  private com.pyramidword.ws.PyramidWord pyramidWord = null;
  
  public PyramidWordProxy() {
    _initPyramidWordProxy();
  }
  
  public PyramidWordProxy(String endpoint) {
    _endpoint = endpoint;
    _initPyramidWordProxy();
  }
  
  private void _initPyramidWordProxy() {
    try {
      pyramidWord = (new com.pyramidword.ws.PyramidWordServiceLocator()).getPyramidWord();
      if (pyramidWord != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)pyramidWord)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)pyramidWord)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (pyramidWord != null)
      ((javax.xml.rpc.Stub)pyramidWord)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.pyramidword.ws.PyramidWord getPyramidWord() {
    if (pyramidWord == null)
      _initPyramidWordProxy();
    return pyramidWord;
  }
  
  public boolean checkPyramidWord(java.lang.String inputString) throws java.rmi.RemoteException{
    if (pyramidWord == null)
      _initPyramidWordProxy();
    return pyramidWord.checkPyramidWord(inputString);
  }
  
  
}