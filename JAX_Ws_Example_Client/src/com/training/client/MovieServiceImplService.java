
package com.training.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MovieServiceImplService", targetNamespace = "http://services.training.com/", wsdlLocation = "http://localhost:9090/rating?wsdl")
public class MovieServiceImplService
    extends Service
{

    private final static URL MOVIESERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException MOVIESERVICEIMPLSERVICE_EXCEPTION;
    private final static QName MOVIESERVICEIMPLSERVICE_QNAME = new QName("http://services.training.com/", "MovieServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9090/rating?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MOVIESERVICEIMPLSERVICE_WSDL_LOCATION = url;
        MOVIESERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public MovieServiceImplService() {
        super(__getWsdlLocation(), MOVIESERVICEIMPLSERVICE_QNAME);
    }

    public MovieServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MOVIESERVICEIMPLSERVICE_QNAME, features);
    }

    public MovieServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, MOVIESERVICEIMPLSERVICE_QNAME);
    }

    public MovieServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MOVIESERVICEIMPLSERVICE_QNAME, features);
    }

    public MovieServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MovieServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MovieService
     */
    @WebEndpoint(name = "MovieServiceImplPort")
    public MovieService getMovieServiceImplPort() {
        return super.getPort(new QName("http://services.training.com/", "MovieServiceImplPort"), MovieService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MovieService
     */
    @WebEndpoint(name = "MovieServiceImplPort")
    public MovieService getMovieServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.training.com/", "MovieServiceImplPort"), MovieService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MOVIESERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw MOVIESERVICEIMPLSERVICE_EXCEPTION;
        }
        return MOVIESERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
