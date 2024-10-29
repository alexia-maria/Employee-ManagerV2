package com.baeldung.ls.spring;

import com.baeldung.ls.persistence.repository.impl.ProjectRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// @Configuration -- ii spuen containerului sa scaneze clasa,
//pentru ca in aceasta clasa sunt definite beans

// Beanul creat are denumirea metodei(cu majuscula): ProjectRepository
@Configuration
public class PersistenceConfig {

    @Bean
    public ProjectRepositoryImpl projectRepository(){
        return new ProjectRepositoryImpl();
    }
}
