package alexiuscrow.swagger.example;

import io.swagger.jaxrs.config.BeanConfig;
import org.glassfish.jersey.server.ResourceConfig;

public class JerseyConf extends ResourceConfig {
    public JerseyConf() {
        packages("alexiuscrow.swagger.example.ws","io.swagger.jaxrs.listing");

        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.0");
        beanConfig.setBasePath("/swagger-exmpl");
        beanConfig.setResourcePackage("alexiuscrow.swagger.example.ws");
        beanConfig.setScan(true);
    }
}
