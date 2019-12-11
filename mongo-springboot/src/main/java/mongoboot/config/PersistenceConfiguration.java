package mongoboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import mongoboot.repo.PointOfInterestRepository;

/**
 * @author Tobias Trelle
 */
@Configuration
@EnableMongoRepositories(basePackageClasses = PointOfInterestRepository.class)
public class PersistenceConfiguration {

}
