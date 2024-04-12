package SEP2.W4.dao;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoDBDAO {
    private final MongoCollection<Document> collection;

    public MongoDBDAO(MongoDatabase database) {
        this.collection = database.getCollection("users");
    }

    public void addUser(String id, String name, int age, String city) {
        Document document = new Document("_id", id)
                .append("name", name)
                .append("age", age)
                .append("city", city);
        collection.insertOne(document);
    }

    public Document getUserById(String id) {
        return collection.find(new Document("_id", id)).first();
    }

    public void updateUser(String id, String name, int age, String city) {
        Document document = new Document("name", name)
                .append("age", age)
                .append("city", city);
        collection.updateOne(new Document("_id", id), new Document("$set", document));
    }

    public void deleteUser(String id) {
        collection.deleteOne(new Document("_id", id));
    }
}
