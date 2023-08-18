package ecommerce.v2.configurations.beans;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServerPortCustomizerConfig implements WebServerFactoryCustomizer<ConfigurableWebServerFactory> {
    //bean for change default server port running.
    @Override
    public void customize(ConfigurableWebServerFactory factory) {
        factory.setPort(6060);
    }
}