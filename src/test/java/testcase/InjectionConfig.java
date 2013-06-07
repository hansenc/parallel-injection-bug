package testcase;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InjectionConfig
{
    @Bean(autowire = Autowire.BY_NAME)
    public String testString()
    {
        return "testString";
    }
}
