package pacan.svyat.Cosmos;

import org.springframework.stereotype.Service;
import pacan.svyat.User.User;

import java.util.List;

@Service
public class CosmosService {
    private final CosmosRepository cosmosRepository;

    public CosmosService(CosmosRepository cosmosRepository) {
        this.cosmosRepository = cosmosRepository;
    }

    public List<Cosmos> getAllCosmos() {
        return cosmosRepository.findAll();
    }

    public pacan.svyat.Cosmos.MaxMinResponseCosmos getMaxMin(User.Sub status) {
        pacan.svyat.Cosmos.MaxMinResponseCosmos maxMinResponse = new pacan.svyat.Cosmos.MaxMinResponseCosmos();
        maxMinResponse.setMinValue(cosmosRepository.findMinDate());

        System.out.println(status);
        if (status == User.Sub.standart) {
            maxMinResponse.setMaxValue(cosmosRepository.findAvgDate());
        } else {
            maxMinResponse.setMaxValue(cosmosRepository.findMaxDate());
        }
        return maxMinResponse;
    }
}
