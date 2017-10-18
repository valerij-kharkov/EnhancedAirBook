package vvs.com.ua.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import vvs.com.ua.stub.rqrs.EnhancedAirBookRQ;
import vvs.com.ua.stub.rqrs.EnhancedAirBookRS;

/**
 * Created by sols on 18.10.2017.
 */

@Service
public class CallAirBook {

    @Autowired
    private WebServiceTemplate webServiceTemplate;


    public EnhancedAirBookRS bookAir(EnhancedAirBookRQ request) {
        EnhancedAirBookRS response = (EnhancedAirBookRS) webServiceTemplate.marshalSendAndReceive(request);
        return response;
    }

}
