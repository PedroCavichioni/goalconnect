package pedrocavichioni.goalconnect.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pedrocavichioni.goalconnect.dto.team.TeamResponseDTO;
import pedrocavichioni.goalconnect.model.Match;
import pedrocavichioni.goalconnect.model.Team;
import pedrocavichioni.goalconnect.repository.TeamRepository;

import java.util.Optional;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public TeamResponseDTO getTeamById(final Long id){

        if(id <= 0){
            return new TeamResponseDTO();
        }
        Optional<Team> response = teamRepository.findById(id);

        return response.map(TeamResponseDTO::new).orElseGet(TeamResponseDTO::new);
    }
<<<<<<< Updated upstream
=======
  
    public List<Team> getAllTeams(){
        return teamRepository.findAll();
    }

    public Team registerTeam(final TeamRequestDTO teamRequestDTO){

        if(teamRequestDTO.getName().isEmpty() || teamRequestDTO.getState().isEmpty() || teamRequestDTO.getPhotoUrl().isEmpty()){
            return null;
        }

        Team team = new Team(teamRequestDTO);
        return teamRepository.save(team);
    }

    public Team updateTeam(final TeamRequestDTO teamRequestDTO){
        if(teamRequestDTO.getName().isEmpty() || teamRequestDTO.getState().isEmpty() || teamRequestDTO.getPhotoUrl().isEmpty()){
            return null;
        }
        Team team = new Team(teamRequestDTO);
        return teamRepository.save(team);
    }
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======

    public void deleteTeam(final Long id){
        teamRepository.deleteById(id);
    }
>>>>>>> Stashed changes
}
