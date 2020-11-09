package lk.sampath.iwallet.smb.configuration;

import lk.sampath.iwallet.smb.api.ApiOriginFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {
    @Bean
    public FilterRegistrationBean apiOriginFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new ApiOriginFilter());
        registration.addUrlPatterns("/*");
        registration.setName("filter");
        return registration;
    }
}
