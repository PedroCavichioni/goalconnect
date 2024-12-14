package pedrocavichioni.goalconnect.controller;

import org.springframework.web.bind.annotation.*;
import pedrocavichioni.goalconnect.model.Match;
import pedrocavichioni.goalconnect.model.Team;

@RestController
@RequestMapping("/api/match")
public class MatchController {
    @GetMapping("/all")
    public String getAllMatches(){
        return "";
    }

    @GetMapping("{id}")
    public String getMatchById(@PathVariable("id") Long id){
        return "";
    }

    @PostMapping
    public String addMatch(@RequestBody Match match){
        return "";
    }

    @PutMapping
    public String updateMatch(@RequestBody Match match){
        return "";
    }

    @DeleteMapping
    public String deleteMatch(@PathVariable("id") Long id){
        return "";
    }
}
