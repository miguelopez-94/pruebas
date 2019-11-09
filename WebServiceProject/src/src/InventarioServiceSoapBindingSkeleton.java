/**
 * InventarioServiceSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package src;

public class InventarioServiceSoapBindingSkeleton implements src.Inventario, org.apache.axis.wsdl.Skeleton {
    private src.Inventario impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("valido", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://src/", "valido"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("valido") == null) {
            _myOperations.put("valido", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("valido")).add(_oper);
    }

    public InventarioServiceSoapBindingSkeleton() {
        this.impl = new src.InventarioServiceSoapBindingImpl();
    }

    public InventarioServiceSoapBindingSkeleton(src.Inventario impl) {
        this.impl = impl;
    }
    public java.lang.String valido() throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.valido();
        return ret;
    }

}
