package mongoboot.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import mongoboot.domain.PointOfInterest;

/**
 * @author Tobias Trelle
 */
@RepositoryRestResource
public interface PointOfInterestRepository extends MongoRepository<PointOfInterest, Integer> {

}
