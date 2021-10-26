package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Shawn Potter
 * @version 1.0
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long>
{

}
