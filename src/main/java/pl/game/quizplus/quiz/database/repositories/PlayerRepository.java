package pl.game.quizplus.quiz.database.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.game.quizplus.quiz.database.entities.PlayerEntity;

public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {


}
