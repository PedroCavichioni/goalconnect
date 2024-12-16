package pedrocavichioni.goalconnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pedrocavichioni.goalconnect.model.Match;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {
}

