package warehouse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import warehouse.models.Deal;

import java.util.List;

@Repository
@Transactional
public interface DealRepository extends JpaRepository<Deal, Integer> {

    @Query(value = "SELECT COUNT(deal_id) FROM deal", nativeQuery = true)
    Integer countByDealId();

}