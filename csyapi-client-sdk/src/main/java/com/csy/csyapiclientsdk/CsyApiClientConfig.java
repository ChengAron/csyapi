package com.csy.csyapiclientsdk;

import com.csy.csyapiclientsdk.client.CsyApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties("csyapi.client")
@ComponentScan
public class CsyApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public CsyApiClient csyApiClient() {
        return new CsyApiClient(accessKey,secretKey);
    }
}
