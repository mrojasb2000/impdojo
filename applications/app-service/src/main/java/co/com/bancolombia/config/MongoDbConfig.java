package co.com.bancolombia.config;


import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.beans.factory.annotation.Value;

import java.util.Collection;
import java.util.Collections;


@Configuration
@EnableMongoRepositories(basePackages = "co.com.bancolombia.mongo")
public class MongoDbConfig extends AbstractMongoClientConfiguration {

    @Value("${mongoConfig.user}")
    private String dbUser;

    @Value("${mongoConfig.password}")
    private String dbPassword;

    @Value("${mongoConfig.database}")
    private String dbName;

    @Value("${mongoConfig.connectionString}")
    private String dbConnectionString;


    @Override
    protected String getDatabaseName() {
        return dbName;
    }

    @Override
    public MongoClient mongoClient() {
        final ConnectionString connectionString = new ConnectionString(dbConnectionString);
        final MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();
        return MongoClients.create(mongoClientSettings);
    }

    @Override
    public Collection<String> getMappingBasePackages() {
        return Collections.singleton("co.com.bancolombia.mongo");
    }
}