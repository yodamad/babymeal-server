package fr.jahland.baby.repo;

import fr.jahland.baby.model.Poop;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by mvincent on 27/10/2015.
 */
@RepositoryRestResource(collectionResourceRel = "poop", path = "poop")
public interface PoopRepository extends MongoRepository<Poop, String> {
}
