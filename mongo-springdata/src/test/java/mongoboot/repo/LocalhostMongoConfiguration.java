package mongoboot.repo;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClient;


/**
 * Test configuration using localhost:27017
 * @author Tobias Trelle
 */
@Configuration
@EnableMongoRepositories("mongoboot.repo")
public class LocalhostMongoConfiguration extends AbstractMongoConfiguration {

	@Override
	protected String getDatabaseName() {
		return "test";
	}

	@Override
	public MongoClient mongoClient() {
		return new MongoClient();
	}
	
}
