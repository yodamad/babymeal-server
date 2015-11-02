package fr.jahland.baby.repo;

import fr.jahland.baby.model.Masterdata;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by mvincent on 02/11/2015.
 */
@RepositoryRestResource(collectionResourceRel = "masterdata", path = "masterdata")
public interface MasterdataRepository extends MongoRepository<Masterdata, Integer> {

    List<Masterdata> findByType(@Param("type") String type);
}
