package pedrocavichioni.goalconnect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pedrocavichioni.goalconnect.dto.team.TeamRequestDTO;
import pedrocavichioni.goalconnect.dto.team.TeamResponseDTO;
import pedrocavichioni.goalconnect.model.Team;
import pedrocavichioni.goalconnect.service.TeamService;

import java.util.List;

@RestController
@RequestMapping("/api/team")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/all")
    public List<Team> getAllTeams(){
        return teamService.getAllTeams();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("{id}")
    public ResponseEntity<TeamResponseDTO> getTeamById(@PathVariable("id") Long id){
        return ResponseEntity.ok(teamService.getTeamById(id));
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public ResponseEntity<Team> addTeam(@RequestBody TeamRequestDTO teamRequestDTO){
        return ResponseEntity.ok(teamService.registerTeam(teamRequestDTO));
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PutMapping
    public ResponseEntity<Team> updateTeam(@RequestBody TeamRequestDTO teamRequestDTO){
        return ResponseEntity.ok(teamService.updateTeam(teamRequestDTO));
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteTeam(@PathVariable("id") Long id){
        teamService.deleteTeam(id);
        return ResponseEntity.ok("Time deletado com sucesso!");
    }
}
