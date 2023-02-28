package warehouse.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import warehouse.models.Deal;

@Repository
@Transactional
public interface DealRepository extends CrudRepository<Deal, Integer> {
}