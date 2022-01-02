package com.next.technologies.mondomainemetier.brouillons;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BrouillonConfig {

    @ConfigurationProperties(prefix = "db.h2")
    @Bean("namh2")
    public ConfigPropTest getNam() {
        ConfigPropTest nam = new ConfigPropTest();
        return nam;
    }

    @ConfigurationProperties(prefix = "db.mysql")
    @Bean("nammysql")
    public ConfigPropTest getBak() {
        ConfigPropTest bak = new ConfigPropTest();
        return bak;
    }
}
