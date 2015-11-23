package fr.jahland.baby.repo;

import fr.jahland.baby.model.Meal;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;

/**
 * Created by mvincent on 27/10/2015.
 */
@PreAuthorize("hasRole('ROLE_ADMIN')")
@RepositoryRestResource(collectionResourceRel = "meal", path = "meal")
public interface MealRepository extends MongoRepository<Meal, String> {
}
