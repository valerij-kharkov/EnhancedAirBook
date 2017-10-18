package vvs.com.ua.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sols on 18.10.2017.
 */


@org.springframework.context.annotation.Configuration
@PropertySource(value = {"classpath:ws.properties"})
@ComponentScan(basePackages = {"vvs.com.ua"})
public class Configuration {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public Jaxb2Marshaller jaxb2Marshaller() {
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        Map<String, Boolean> properties = new HashMap<>();
        properties.put(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxb2Marshaller.setPackagesToScan(new String[]{"vvs.com.ua.stub"});
        jaxb2Marshaller.setMarshallerProperties(properties);
        return jaxb2Marshaller;
    }

    @Bean
    public WebServiceTemplate webServiceTemplate(@Value("${ws.wsdlUrl}") String url) {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setDefaultUri(url);
        //webServiceTemplate.setInterceptors(new ClientInterceptor[]{new ChangeMassageClientInterceptor()});
        webServiceTemplate.setMarshaller(jaxb2Marshaller());
        webServiceTemplate.setUnmarshaller(jaxb2Marshaller());
        return webServiceTemplate;
    }


}
