package warehouse.services;

import warehouse.models.Deal;

import java.util.Optional;

public interface DealService {

    Deal createDeal(Deal deal);

    void deleteDealById(Integer dealId);

    Optional<Deal> getDealById(Integer dealId);

}
