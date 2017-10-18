package vvs.com.ua;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import vvs.com.ua.services.CallAirBook;
import vvs.com.ua.stub.rqrs.EnhancedAirBookRQ;
import vvs.com.ua.stub.rqrs.EnhancedAirBookRS;

import java.util.List;

/**
 * Created by sols on 18.10.2017.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = vvs.com.ua.config.Configuration.class, loader = AnnotationConfigContextLoader.class)

public class AirBookTest {
    @Autowired
    private CallAirBook callAirBook;

    @Test
    public void testCall() {
        EnhancedAirBookRQ request = new EnhancedAirBookRQ();
        EnhancedAirBookRQ.OTAAirBookRQ otaAirBookRQ = new EnhancedAirBookRQ.OTAAirBookRQ();
        request.setOTAAirBookRQ(otaAirBookRQ);
        EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation destinationInformation = new EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation();
        otaAirBookRQ.setOriginDestinationInformation(destinationInformation);
        List<EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment> flightSegment = destinationInformation.getFlightSegment();
        flightSegment.add( new EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment(){{
            setArrivalDateTime("2017-21-10");
            setBrandID("1");
            setFlightNumber("2");
        }});

        EnhancedAirBookRS enhancedAirBookRS = callAirBook.bookAir(request);
        Assert.assertNotNull(enhancedAirBookRS);
    }


}
