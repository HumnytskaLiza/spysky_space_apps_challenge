package pacan.svyat.Satellite;

import org.springframework.stereotype.Service;
import pacan.svyat.User.User;

import java.util.List;

@Service
public class SatelliteService {
    private final SatelliteRepository satelliteRepository;

    public SatelliteService(SatelliteRepository satelliteRepository) {
        this.satelliteRepository = satelliteRepository;
    }

    public List<Satellite> getAllSatellite() {
        return satelliteRepository.findAll();
    }

    public pacan.svyat.Satellite.MaxMinResponseSatellite getMaxMin(User.Sub status) {
        pacan.svyat.Satellite.MaxMinResponseSatellite maxMinResponse = new pacan.svyat.Satellite.MaxMinResponseSatellite();
        maxMinResponse.setMinValue(satelliteRepository.findMinDate());

        System.out.println(status);
        if (status == User.Sub.standart) {
            maxMinResponse.setMaxValue(satelliteRepository.findAvgDate());
        } else {
            maxMinResponse.setMaxValue(satelliteRepository.findMaxDate());

        }
        return maxMinResponse;
    }
}
