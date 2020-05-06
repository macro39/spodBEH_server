package sk.pis.spodBEH_server.service;

import org.springframework.stereotype.Service;
import peaks.Peak;
import peaks.PeaksPortType;
import peaks.PeaksService;

@Service
public class PeakService {

    PeaksPortType service = new PeaksService().getPort(PeaksPortType.class);

    public Peak getPeak() {
        return service.getById(1);
    }
}
