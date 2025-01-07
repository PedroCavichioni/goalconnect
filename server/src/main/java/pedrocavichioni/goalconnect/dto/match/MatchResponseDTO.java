package pedrocavichioni.goalconnect.dto.match;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pedrocavichioni.goalconnect.model.Match;
import pedrocavichioni.goalconnect.model.Team;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MatchResponseDTO {

    private Long id;

    private Date date;

    private Integer scoreTeamOne;

    private Integer scoreTeamTwo;

    private Team teamOne;

    private Team teamTwo;

    private Team supportedTeam;

    public MatchResponseDTO(Match match){
        this(
                match.getId(),
                match.getDate(),
                match.getScoreTeamTwo(),
                match.getScoreTeamOne(),
                match.getTeamOne(),
                match.getTeamTwo(),
                match.getSupportedTeam()
        );
    }
}

