package com.sergo.edf.configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;

public class DataSource {

    private static HikariConfig config = new HikariConfig();
    private static HikariDataSource dataSource;

    private  DataSource() {}

    // TODO move params to yml file
    // TODO find how to create multiple datasources
    @Bean
    public static HikariDataSource getDataSource() {
        if (dataSource == null) {
            config.setJdbcUrl( "jdbc:postgresql://localhost:5434/postgres" );
            config.setUsername( "user" );
            config.setPassword( "passw0rd" );
            config.setDriverClassName("org.postgresql.Driver");
            dataSource = new HikariDataSource( config );
        }
        return dataSource;
    }
}

