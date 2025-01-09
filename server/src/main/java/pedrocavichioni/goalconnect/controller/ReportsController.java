package pedrocavichioni.goalconnect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pedrocavichioni.goalconnect.dto.reports.ReportsResponseDTO;
import pedrocavichioni.goalconnect.service.ReportsService;

@RestController
@RequestMapping("/api/dashboard")
public class ReportsController {

    @Autowired
    private ReportsService reportsService;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    private ReportsResponseDTO getReports(){
        return reportsService.getAllReports();
    }
}
