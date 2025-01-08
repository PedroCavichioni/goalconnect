package pedrocavichioni.goalconnect.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pedrocavichioni.goalconnect.dto.reports.ReportsResponseDTO;
import pedrocavichioni.goalconnect.model.Match;
import pedrocavichioni.goalconnect.model.Team;
import pedrocavichioni.goalconnect.repository.MatchRepository;
import pedrocavichioni.goalconnect.repository.TeamRepository;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Objects;

@Service
public class ReportsService {

    @Autowired
    private MatchRepository matchRepository;

    @Autowired
    private TeamRepository teamRepository;

    public ReportsResponseDTO getAllReports(){
        Integer matchesQuantity = getMatchesQuantity();
        Integer winsQuantity = getWinsQuantity();
        Double winsPercentage = getWinPercentage();
        Team mostWatchedTeam = getMostWatchedTeam();
        Integer daysWithoutWatching = getDaysWithoutWatching();
        return new ReportsResponseDTO(matchesQuantity, winsQuantity,winsPercentage, mostWatchedTeam, daysWithoutWatching);
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

    private Double getWinPercentage() {
        double winsPercentage = 0;
        double wonPoints = 0;
        double totalPoints = 0;

        List<Match> matches = matchRepository.findAll();

        Long teamWinnerId = 0L;

        for (Match match : matches) {
            Team supportedTeam = match.getSupportedTeam();

            Integer scoreTeamOne = match.getScoreTeamOne();
            Integer scoreTeamTwo = match.getScoreTeamTwo();

            if (scoreTeamOne > scoreTeamTwo) {
                teamWinnerId = match.getTeamOne().getId();
            } else if (scoreTeamOne < scoreTeamTwo) {
                teamWinnerId = match.getTeamTwo().getId();
            } else {
                wonPoints += 1;
            }

            if (Objects.equals(match.getSupportedTeam().getId(), teamWinnerId)) {
                wonPoints += 1;
            }
            totalPoints += 3;
        }

        winsPercentage = (wonPoints / totalPoints) * 100;

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formatted = decimalFormat.format(winsPercentage).replace(",", ".");

        return Double.valueOf(formatted);
    }

    private Team getMostWatchedTeam(){
        return teamRepository.getMostWatchedTeam();
    }

    private Integer getDaysWithoutWatching(){
        return matchRepository.getDaysWithoutWatching();
    }
}
