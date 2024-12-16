package pedrocavichioni.goalconnect.dto.match;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pedrocavichioni.goalconnect.model.Match;

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

    private Long teamOne;

    private Long teamTwo;

    private Long supportedTeam;

    public MatchResponseDTO(Match match){
        this(
                match.getId(),
                match.getDate(),
                match.getScoreTeamTwo(),
                match.getScoreTeamOne(),
                match.getTeamOne().getId(),
                match.getTeamTwo().getId(),
                match.getSupportedTeam().getId()
        );
    }
}

