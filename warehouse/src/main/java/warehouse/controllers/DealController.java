package warehouse.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import warehouse.models.Deal;
import warehouse.services.DealService;
import java.util.Optional;

@RestController
@RequestMapping("/api/deal/")
@RequiredArgsConstructor
@Tag(name = "Deal operations", description = "Deal controller of Warehouse service")
public class DealController {

    private final DealService dealService;

    @PostMapping
    public Deal createDeal(@RequestBody Deal deal) {
        return dealService.createDeal(deal);
    }

    @DeleteMapping("{deal_id}")
    void deleteDealById(@PathVariable("deal_id") Integer dealId) {
        dealService.deleteDealById(dealId);
    }

    @GetMapping("{deal_id}")
    public Optional<Deal> getDealById(@PathVariable("deal_id") Integer dealId) {
        return dealService.getDealById(dealId);
    }

}
