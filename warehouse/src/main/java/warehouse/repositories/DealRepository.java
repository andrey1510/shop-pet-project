package warehouse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import warehouse.models.Deal;

import java.util.List;

@Repository
@Transactional
public interface DealRepository extends JpaRepository<Deal, Integer> {

    List<Deal> findByQuantityBetween(Integer fromQuantity, Integer toQuantity);
}