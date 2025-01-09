package pedrocavichioni.goalconnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pedrocavichioni.goalconnect.model.Match;

import java.util.List;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {
    @Query(value = "SELECT CAST(EXTRACT(EPOCH FROM AGE(CURRENT_DATE, MAX(date))) / (60*60*24) as INTEGER) FROM match", nativeQuery = true)
    Integer getDaysWithoutWatching();

    @Query(value = "SELECT m FROM match m ORDER BY m.date ASC")
    List<Match> findAllOrderedByDate();
}

