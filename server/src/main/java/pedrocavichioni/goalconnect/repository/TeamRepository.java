package pedrocavichioni.goalconnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pedrocavichioni.goalconnect.model.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
}
