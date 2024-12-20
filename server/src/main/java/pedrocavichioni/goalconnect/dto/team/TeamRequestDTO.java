package pedrocavichioni.goalconnect.dto.team;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TeamRequestDTO {

    private Long id;

    private String name;

    private String state;

    private String photoUrl;

}