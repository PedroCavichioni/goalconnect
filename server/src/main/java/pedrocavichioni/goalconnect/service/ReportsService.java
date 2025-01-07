package pedrocavichioni.goalconnect.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pedrocavichioni.goalconnect.dto.ReportsResponseDTO;
import pedrocavichioni.goalconnect.model.Match;
import pedrocavichioni.goalconnect.model.Team;
import pedrocavichioni.goalconnect.repository.MatchRepository;

import java.util.List;
import java.util.Objects;

@Service
public class ReportsService {

    @Autowired
    private MatchRepository matchRepository;

    public ReportsResponseDTO getAllReports(){
        Integer matchesQuantity = getMatchesQuantity();
        Integer winsQuantity = getWinsQuantity();
        return new ReportsResponseDTO(matchesQuantity, winsQuantity);
    }

    private Integer getMatchesQuantity(){
        return Math.toIntExact(matchRepository.count());
    }
  
    private Integer getWinsQuantity(){
        List< Match > matches = matchRepository.findAll();

        int winsQuantity = 0;

        for(Match match : matches){
            Team supportedTeam = match.getSupportedTeam();

            Integer scoreTeamOne = match.getScoreTeamOne();
            Integer scoreTeamTwo = match.getScoreTeamTwo();

            Long teamWinnerId = 0L;

            if(scoreTeamOne > scoreTeamTwo){
                teamWinnerId = match.getTeamOne().getId();
            }else if(scoreTeamOne < scoreTeamTwo){
                teamWinnerId = match.getTeamTwo().getId();
            }

            if(Objects.equals(match.getSupportedTeam().getId(), teamWinnerId)){
                winsQuantity += 1;
            }
        }
        return  winsQuantity;
    }
}
