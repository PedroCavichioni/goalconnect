package pedrocavichioni.goalconnect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pedrocavichioni.goalconnect.dto.ReportsResponseDTO;
import pedrocavichioni.goalconnect.service.ReportsService;

@RestController
@RequestMapping("/api/dashboard")
public class ReportsController {

    @Autowired
    private ReportsService reportsService;

    @GetMapping
    private ReportsResponseDTO getReports(){
        return reportsService.getAllReports();
    }
}
