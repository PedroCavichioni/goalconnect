package pedrocavichioni.goalconnect.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pedrocavichioni.goalconnect.model.Team;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReportsResponseDTO {

    private Integer matchesQuantity;

    private  Integer winsQuantity;

    private Double winsPercentage;

    private Team teamMostWatched;

    private Integer daysWithoutWatching;

    public ReportsResponseDTO(Integer matchesQuantity, Integer winsQuantity){
        this.matchesQuantity = matchesQuantity;
        this.winsQuantity = winsQuantity;
    }
}
