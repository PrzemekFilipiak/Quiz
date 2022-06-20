package pl.game.quizplus.quiz.fronted;

import lombok.Data;

@Data
public class GameOptions {
    private int numberOfQuestions = 5;
    Difficulty difficulty;
    private int categoryId;


}
