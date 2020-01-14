package com.sergo.edf;

import com.sergo.edf.configuration.DataSource;
import liquibase.integration.spring.SpringLiquibase;
import org.springframework.context.annotation.Bean;

public class databaseConfig {
    @Bean
    public SpringLiquibase liquibase() {
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setChangeLog("classpath:postgre-db/liquibase/dbChangeLog.xml");
        liquibase.setDataSource(DataSource.getDataSource());
        return liquibase;
    }
}
