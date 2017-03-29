package alexiuscrow.jersey2.swagger.example;

import io.swagger.jaxrs.config.BeanConfig;
import org.glassfish.jersey.server.ResourceConfig;

public class JerseyConf extends ResourceConfig {
    public JerseyConf() {
        packages("alexiuscrow.jersey2.swagger.example.ws","io.swagger.jaxrs.listing");

        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.0");
        beanConfig.setBasePath("/jersey-swagger-exmpl");
        beanConfig.setResourcePackage("alexiuscrow.jersey2.swagger.example.ws");
        beanConfig.setScan(true);
    }
}
