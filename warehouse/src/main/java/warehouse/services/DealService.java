package warehouse.services;

import warehouse.models.Customer;
import warehouse.models.Deal;

import java.util.List;
import java.util.Optional;

public interface DealService {

    Deal createDeal(Deal deal);

    void deleteDealById(Integer dealId);

    Optional<Deal> getDealById(Integer dealId);

    List<Deal> findALlDeals();

    Integer countByDealId();
}
