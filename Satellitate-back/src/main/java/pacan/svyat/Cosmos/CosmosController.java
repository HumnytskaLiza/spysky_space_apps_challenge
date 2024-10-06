package pacan.svyat.Cosmos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pacan.svyat.User.User;

import java.util.List;

@RestController
@RequestMapping("/cosmos")
public class CosmosController {

    private final CosmosService cosmosService;

    public CosmosController(CosmosService cosmosService) {
        this.cosmosService = cosmosService;
    }

    @GetMapping("/")
    private List<Cosmos> getAllCosmos() {
        return cosmosService.getAllCosmos();
    }

    @GetMapping("/maxmin/{status}")
    private pacan.svyat.Cosmos.MaxMinResponseCosmos getMaxMin(@PathVariable User.Sub status) {
        return cosmosService.getMaxMin(status);
    }
}
