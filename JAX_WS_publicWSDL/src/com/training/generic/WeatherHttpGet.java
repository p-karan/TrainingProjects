
package com.training.generic;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WeatherHttpGet", targetNamespace = "http://ws.cdyne.com/WeatherWS/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WeatherHttpGet {


    /**
     * Gets Information for each WeatherID
     * 
     * @return
     *     returns com.training.generic.ArrayOfWeatherDescription
     */
    @WebMethod(operationName = "GetWeatherInformation")
    @WebResult(name = "ArrayOfWeatherDescription", targetNamespace = "http://ws.cdyne.com/WeatherWS/", partName = "Body")
    public ArrayOfWeatherDescription getWeatherInformation();

    /**
     * Allows you to get your City Forecast Over the Next 7 Days, which is updated hourly. U.S. Only
     * 
     * @param zip
     * @return
     *     returns com.training.generic.ForecastReturn
     */
    @WebMethod(operationName = "GetCityForecastByZIP")
    @WebResult(name = "ForecastReturn", targetNamespace = "http://ws.cdyne.com/WeatherWS/", partName = "Body")
    public ForecastReturn getCityForecastByZIP(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "ZIP")
        String zip);

    /**
     * Allows you to get your City's Weather, which is updated hourly. U.S. Only
     * 
     * @param zip
     * @return
     *     returns com.training.generic.WeatherReturn
     */
    @WebMethod(operationName = "GetCityWeatherByZIP")
    @WebResult(name = "WeatherReturn", targetNamespace = "http://ws.cdyne.com/WeatherWS/", partName = "Body")
    public WeatherReturn getCityWeatherByZIP(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "ZIP")
        String zip);

}
