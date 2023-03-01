package warehouse.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import warehouse.models.Deal;

import java.util.List;

@Repository
@Transactional
public interface DealRepository extends CrudRepository<Deal, Integer> {

    List<Deal> findByQuantityBetween(Integer fromQuantity, Integer toQuantity);
}