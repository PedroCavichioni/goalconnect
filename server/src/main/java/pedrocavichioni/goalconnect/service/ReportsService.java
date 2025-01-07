package pedrocavichioni.goalconnect.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pedrocavichioni.goalconnect.dto.ReportsResponseDTO;
import pedrocavichioni.goalconnect.model.Match;
import pedrocavichioni.goalconnect.model.Team;
import pedrocavichioni.goalconnect.repository.MatchRepository;

import java.util.List;

@Service
public class ReportsService {

    @Autowired
    private MatchRepository matchRepository;

    public ReportsResponseDTO getAllReports(){
        return new ReportsResponseDTO();
    }

    private Integer getMatchesQuantity(){
        return Math.toIntExact(matchRepository.count());
    }

    private Integer getWinsQuantity(){
        List< Match > matches = matchRepository.findAll();
        Integer winsQuantity = 0;

        for(Match match : matches){
            Team supportedTeam = match.getSupportedTeam();

        }
    }
}
