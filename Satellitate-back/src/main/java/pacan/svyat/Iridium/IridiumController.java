package pacan.svyat.Iridium;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pacan.svyat.User.User;

import java.util.List;

@RestController
@RequestMapping("/iridium")
public class IridiumController {

    private final IridiumService iridiumService;

    public IridiumController(IridiumService iridiumService) {
        this.iridiumService = iridiumService;
    }

    @GetMapping("/")
    private List<Iridium> getAllIridium() {
        return iridiumService.getAllIridium();
    }

    @GetMapping("/maxmin/{status}")
    private pacan.svyat.Iridium.MaxMinResponseIridium getMaxMin(@PathVariable User.Sub status) {
        return iridiumService.getMaxMin(status);
    }
}
