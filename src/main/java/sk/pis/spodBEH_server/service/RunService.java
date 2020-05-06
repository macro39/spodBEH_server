package sk.pis.spodBEH_server.service;

import mailnotificator.MailPortType;
import mailnotificator.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.pis.spodBEH_server.Constants;
import sk.pis.spodBEH_server.model.Run;
import sk.pis.spodBEH_server.model.Runner;
import sk.pis.spodBEH_server.repo.RunRepository;
import sk.pis.spodBEH_server.repo.RunnerRepository;
import smsnotificator.SMSPortType;
import smsnotificator.SMSService;

@Service
public class RunService {

    @Autowired
    RunRepository runRepository;

    @Autowired
    RunnerRepository runnerRepository;

    public void sendSmsNotificationRunRegistration(Long runId, Long runnerId, boolean registered) {
        Runner runner = runnerRepository.getOne(runnerId);
        Run run = runRepository.getOne(runId);

        String message;
        smsnotificator.SMSPortType smsService = new SMSService().getPort(SMSPortType.class);
        mailnotificator.MailPortType mailService = new MailService().getPort(MailPortType.class);
        if (registered) {
            message = "Registrácia na diaľkový beh " + run.getName() + " prebehla úspešne!";
            smsService.notify(Constants.teamId, Constants.teamPassword, runner.getTelephoneNumber(), Constants.smsSubjectRegister, message);
            mailService.notify(Constants.teamId, Constants.teamPassword, runner.getEmail(), Constants.smsSubjectRegister, message);
        } else {
            message = "Zrušenie registrácie na diaľkový beh " + run.getName() + " prebehlo úspešne!";
            smsService.notify(Constants.teamId, Constants.teamPassword, runner.getTelephoneNumber(), Constants.smsSubjectUnregister, message);
            mailService.notify(Constants.teamId, Constants.teamPassword, runner.getEmail(), Constants.smsSubjectUnregister, message);
        }
    }
}
