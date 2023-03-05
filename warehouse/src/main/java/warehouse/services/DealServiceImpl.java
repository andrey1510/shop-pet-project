package warehouse.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import warehouse.models.Customer;
import warehouse.models.Deal;
import warehouse.repositories.DealRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DealServiceImpl implements DealService {

    @Autowired
    private DealRepository dealRepository;

    @Override
    public Deal createDeal(Deal deal) {
        return dealRepository.save(deal);
    }

    @Override
    public void deleteDealById(Integer dealId) {
        dealRepository.deleteById(dealId);
    }

    @Override
    public Optional<Deal> getDealById(Integer dealId) {
        return dealRepository.findById(dealId);
    }

    @Override
    public List<Deal> findALlDeals(){
        return dealRepository.findAll();
    }

    @Override
    public Integer countByDealId(){
        return dealRepository.countByDealId();
    }

}
