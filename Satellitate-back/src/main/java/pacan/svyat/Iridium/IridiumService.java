package pacan.svyat.Iridium;

import org.springframework.stereotype.Service;
import pacan.svyat.User.User;

import java.util.List;

@Service
public class IridiumService {
    private final IridiumRepository iridiumRepository;

    public IridiumService(IridiumRepository iridiumRepository) {
        this.iridiumRepository = iridiumRepository;
    }

    public List<Iridium> getAllIridium() {
        return iridiumRepository.findAll();
    }

    public pacan.svyat.Iridium.MaxMinResponseIridium getMaxMin(User.Sub status) {
        pacan.svyat.Iridium.MaxMinResponseIridium maxMinResponse = new pacan.svyat.Iridium.MaxMinResponseIridium();
        maxMinResponse.setMinValue(iridiumRepository.findMinDate());

        System.out.println(status);
        if (status == User.Sub.standart) {
            maxMinResponse.setMaxValue(iridiumRepository.findAvgDate());
        } else {
            maxMinResponse.setMaxValue(iridiumRepository.findMaxDate());
        }
        return maxMinResponse;
    }
}
