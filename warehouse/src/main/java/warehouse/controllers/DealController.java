package warehouse.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import warehouse.models.Deal;
import warehouse.services.DealService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/deal/")
@RequiredArgsConstructor
@Tag(name = "deal_operations", description = "All operations with DealController of Warehouse service")
public class DealController {

    private final DealService dealService;


    @DeleteMapping("{deal_id}")
    void deleteDealById(@PathVariable("deal_id") Integer dealId) {
        dealService.deleteDealById(dealId);
    }


    @GetMapping("count_deals")
    public Integer countByDealId(){
        return dealService.countByDealId();
    }

    /////////////////// not working /////////////////////////////


    @PostMapping
    public Deal createDeal(@RequestBody Deal deal) {
        return dealService.createDeal(deal);
    }

    @GetMapping("{deal_id}")
    public Optional<Deal> getDealById(@PathVariable("deal_id") Integer dealId) {
        return dealService.getDealById(dealId);
    }

    @GetMapping
    public List<Deal> findALlDeals(){
        return dealService.findALlDeals();
    }

}
