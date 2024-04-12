package SEP2.W4.datasource;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MongoDBConnector {
    private static final String DATABASE = "MongoCRUD";

    private final MongoDatabase mongoDatabase;

    private MongoDBConnector() {
        Properties properties = new Properties();

        try (InputStream inputStream = MongoDBConnector.class.getClassLoader().getResourceAsStream("Properties/mongodb.properties")) {
            properties.load(inputStream);
            String uri = properties.getProperty("mongoCRUD.uri");

            MongoClient mongoClient = MongoClients.create(new ConnectionString(uri));
            this.mongoDatabase = mongoClient.getDatabase(DATABASE);
        } catch (IOException e) {
            throw new RuntimeException("Could not load MongoDB properties file", e);
        }
    }

    public static MongoDBConnector getInstance() {
        return MongoDBConnectorHolder.instance;
    }

    public MongoDatabase getDatabase() {
        return mongoDatabase;
    }

    private static final class MongoDBConnectorHolder {
        private static final MongoDBConnector instance = new MongoDBConnector();
    }
}
