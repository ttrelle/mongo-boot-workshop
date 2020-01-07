package mongoboot.repo;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import mongoboot.domain.PointOfInterest;

/**
 * @author Tobias Trelle
 */
@RepositoryRestResource
public interface PointOfInterestRepository extends MongoRepository<PointOfInterest, Integer> {

    List<PointOfInterest> findByName(String name);

    List<PointOfInterest> findByAdresseOrt(String ort);

    @Query(value = "{}", fields = "{_id:0, name:1, desc:1}")
    List<PointOfInterest> findCompact();

}
