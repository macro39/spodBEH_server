package sk.pis.spodBEH_server.controller;

import mypackage.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sk.pis.spodBEH_server.model.Run;
import sk.pis.spodBEH_server.model.RunRunner;
import sk.pis.spodBEH_server.repo.RunRepository;
import sk.pis.spodBEH_server.repo.RunRunnerRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("run")
public class RunController {

    @Autowired
    RunRepository runRepository;

    @Autowired
    RunRunnerRepository runRunnerRepository;

    @GetMapping(value = "/getAll", produces = "application/json")
    public List<Run> getAll() {
        return runRepository.findAll();
    }

    @GetMapping(value = "/register/{runId}/{runnerId}", produces = "application/json")
    public void register(@PathVariable Long runnerId, @PathVariable Long runId) {
        runRunnerRepository.save(new RunRunner(runId, runnerId));
    }

    @GetMapping(value = "/unregister/{runId}/{runnerId}", produces = "application/json")
    @Transactional
    public void unregister(@PathVariable Long runId, @PathVariable Long runnerId) {
        runRunnerRepository.deleteRunRunnerByRunIdAndRunnerId(runId, runnerId);
    }

    @GetMapping("/getSKCities")
    public ArrayList<Cities> skuska() {
        CitiesPortType service = new CitiesService().getPort(CitiesPortType.class);

        ArrayOfCities cities = service.getAll();
        ArrayList<Cities> response = new ArrayList<>();

        for (Cities city : cities.getCity()) {
            if (city.getCountryIsoCode().equals("SK")) {
                response.add(city);
            }
        }

        return response;
    }
}
