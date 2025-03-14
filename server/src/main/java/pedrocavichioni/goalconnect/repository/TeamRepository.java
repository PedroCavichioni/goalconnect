package pedrocavichioni.goalconnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pedrocavichioni.goalconnect.model.Team;

import java.util.List;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
    @Query("SELECT t " +
            "FROM team t " +
            "WHERE t.id = (" +
            "SELECT COALESCE(m.teamOne.id, m.teamTwo.id) " +
            "FROM match m " +
            "GROUP BY COALESCE(m.teamOne.id, m.teamTwo.id) " +
            "ORDER BY COUNT(COALESCE(m.teamOne.id, m.teamTwo.id)) DESC "+
            "LIMIT 1)")
    Team getMostWatchedTeam();

    @Query(value = "SELECT t FROM team t ORDER BY t.id ASC")
    List<Team> findAllOrderedById();
}
