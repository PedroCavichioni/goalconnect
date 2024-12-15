package pedrocavichioni.goalconnect.dto.team;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pedrocavichioni.goalconnect.model.Team;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TeamResponseDTO {

    private Long id;

    private String name;

    private String state;

    private String photoUrl;

    public TeamResponseDTO(Team team){
      this(
              team.getId(),
              team.getName(),
              team.getState(),
              team.getPhotoUrl());
    }
}
