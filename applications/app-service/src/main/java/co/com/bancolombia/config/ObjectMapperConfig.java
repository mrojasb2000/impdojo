package co.com.bancolombia.config;

import org.reactivecommons.utils.ObjectMapperImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ObjectMapperConfig {
    @Bean
    public ObjectMapperImp objectMapper() {
        return new ObjectMapperImp();
    }
}
