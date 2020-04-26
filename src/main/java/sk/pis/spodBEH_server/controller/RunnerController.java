package sk.pis.spodBEH_server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.pis.spodBEH_server.model.Run;
import sk.pis.spodBEH_server.model.RunRunner;
import sk.pis.spodBEH_server.model.Runner;
import sk.pis.spodBEH_server.repo.RunRepository;
import sk.pis.spodBEH_server.repo.RunRunnerRepository;
import sk.pis.spodBEH_server.repo.RunnerRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("runner")
public class RunnerController {

    @Autowired
    RunnerRepository runnerRepository;

    @Autowired
    RunRunnerRepository runRunnerRepository;

    @Autowired
    RunRepository runRepository;

    @GetMapping(value = "/authorize/{username}/{password}", produces = "application/json")
    public Runner authorize(@PathVariable(value = "username") String username, @PathVariable(value = "password") String password) {
        Runner runner = runnerRepository.findByUsernameAndPassword(username, password);

        List<RunRunner> runnerList = runRunnerRepository.getAllByRunnerId(runner.getRunnerId());

        ArrayList<Run> runArrayList = new ArrayList<Run>();

        for (RunRunner runRunner : runnerList) {
            runArrayList.add(runRepository.getOne(runRunner.getRunId()));
        }

        runner.setRuns(runArrayList);

        return runner;
    }
}
