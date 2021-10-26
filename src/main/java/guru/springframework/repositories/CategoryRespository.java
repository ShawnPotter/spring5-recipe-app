package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author Shawn Potter
 * @version 1.0
 */
public interface CategoryRespository extends CrudRepository<Category, Long>
{
    Optional<Category> findByDescription(String description);
}
