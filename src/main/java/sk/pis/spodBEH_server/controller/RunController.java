package sk.pis.spodBEH_server.controller;

import mypackage.Cities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.pis.spodBEH_server.model.Run;
import sk.pis.spodBEH_server.model.RunRunner;
import sk.pis.spodBEH_server.repo.RunRepository;
import sk.pis.spodBEH_server.repo.RunRunnerRepository;
import sk.pis.spodBEH_server.service.CityService;
import sk.pis.spodBEH_server.service.NotificationService;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("run")
public class RunController {

    @Autowired
    RunRepository runRepository;

    @Autowired
    RunRunnerRepository runRunnerRepository;

    @Autowired
    NotificationService notificationService;

    @Autowired
    CityService cityService;

    @GetMapping(value = "/getAll", produces = "application/json")
    public List<Run> getAll() {
        return runRepository.findAll();
    }

    @GetMapping(value = "/register/{runId}/{runnerId}", produces = "application/json")
    public void register(@PathVariable Long runnerId, @PathVariable Long runId) {
        runRunnerRepository.save(new RunRunner(runId, runnerId));
        notificationService.sendSmsNotificationRunRegistration(runId, runnerId, true);
    }

    @GetMapping(value = "/unregister/{runId}/{runnerId}", produces = "application/json")
    @Transactional
    public void unregister(@PathVariable Long runId, @PathVariable Long runnerId) {
        runRunnerRepository.deleteRunRunnerByRunIdAndRunnerId(runId, runnerId);
        notificationService.sendSmsNotificationRunRegistration(runId, runnerId, false);
    }

    @GetMapping(value = "/getSKCities", produces = "application/json")
    public List<Cities> getAllSKCities() {
        return cityService.getSKCities();
    }
}
