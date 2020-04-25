package sk.pis.spodBEH_server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.pis.spodBEH_server.model.Run;
import sk.pis.spodBEH_server.repo.RunRepository;

import java.util.List;

@RestController
@RequestMapping("run")
public class RunController {

    @Autowired
    RunRepository runRepository;

    @GetMapping(value = "/getAll", produces = "application/json")
    public List<Run> getAll() {
        return runRepository.findAll();
    }
}
