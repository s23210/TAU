import game.Game;
import game.GameBoard;
import game.GameField;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BoardGameTest {

    @Test
    public void movePlayerTest() {
        List<List<GameField>> gameFields = new ArrayList<>();
        gameFields.add(new ArrayList<>(List.of(GameField.PLAYER, GameField.EMPTY)));
        GameBoard gameBoard = new GameBoard();
        gameBoard.setGameBoard(gameFields);
        Game game = new Game(gameBoard);

        game.movePlayerRight();

        assertEquals(GameField.PLAYER, gameBoard.getGameBoard().get(0).get(1));
    }

    @Test
    public void moveRightOutsideOfGameBoundsNoExceptionThrownTest() {
        List<List<GameField>> gameFields = new ArrayList<>();
        gameFields.add(new ArrayList<>(List.of(GameField.PLAYER)));
        GameBoard gameBoard = new GameBoard();
        gameBoard.setGameBoard(gameFields);
        Game game = new Game(gameBoard);

        game.movePlayerDown();
        game.movePlayerRight();
        game.movePlayerUp();
        game.movePlayerLeft();

        // No exception should be thrown
    }

    @Test
    public void detectWinTest() {
        List<List<GameField>> gameFields = new ArrayList<>();
        gameFields.add(new ArrayList<>(List.of(GameField.PLAYER, GameField.OBSTACLE, GameField.EMPTY)));
        gameFields.add(new ArrayList<>(List.of(GameField.EMPTY, GameField.EMPTY, GameField.OBSTACLE)));
        gameFields.add(new ArrayList<>(List.of(GameField.EMPTY, GameField.EMPTY, GameField.STOP)));
        GameBoard gameBoard = new GameBoard();
        gameBoard.setGameBoard(gameFields);
        Game game = new Game(gameBoard);

        game.movePlayerDown();
        game.movePlayerDown();
        game.movePlayerRight();
        game.movePlayerRight();

        assertTrue(game.isGameOver());
        assertEquals(GameField.PLAYER, gameBoard.getGameBoard().get(2).get(2));
    }

    @Test
    public void checkIfStartAndStopArePresentOnOtherSides() {
        GameBoard gameBoard = new GameBoard();
        gameBoard.initializeFields();

        long count = gameBoard.getGameBoard().stream()
                .filter(row -> row.contains(GameField.STOP) || row.contains(GameField.START))
                .count();

        assertEquals(2, count);
    }

    @Test
    public void checkIfPlayerIsPresentOnBoard() {
        GameBoard gameBoard = new GameBoard();
        gameBoard.initializeGameBoard();

        long count = gameBoard.getGameBoard().stream()
                .filter(row -> row.contains(GameField.PLAYER))
                .count();

        assertEquals(1, count);
    }

    @Test
    public void checkIfObstaclesArePresentOnBoard() {
        GameBoard gameBoard = new GameBoard();
        gameBoard.initializeFields();

        long count = gameBoard.getGameBoard().stream()
                .flatMap(List::stream)
                .filter(field -> field == GameField.OBSTACLE)
                .count();

        assertTrue(count > 1);
    }

    @Test
    public void checkIfEmptyFieldsArePresentOnBoard() {
        GameBoard gameBoard = new GameBoard();
        gameBoard.initializeFields();

        long count = gameBoard.getGameBoard().stream()
                .flatMap(List::stream)
                .filter(field -> field == GameField.EMPTY)
                .count();

        assertTrue(count > 1);
    }

    @Test
    public void checkIfPlayerIsOnStart() {
        GameBoard gameBoard = new GameBoard();
        gameBoard.initializeGameBoard();

        long count = gameBoard.getGameBoard().stream()
                .flatMap(List::stream)
                .filter(field -> field == GameField.PLAYER)
                .count();

        assertEquals(1, count);
    }

    @Test
    public void checkIfStopIsOnBoard() {
        GameBoard gameBoard = new GameBoard();
        gameBoard.initializeFields();

        long count = gameBoard.getGameBoard().stream()
                .flatMap(List::stream)
                .filter(field -> field == GameField.STOP)
                .count();

        assertEquals(1, count);
    }

    @Test
    public void checkIfObstaclesAreOnBoard() {
        GameBoard gameBoard = new GameBoard();
        gameBoard.initializeFields();

        long count = gameBoard.getGameBoard().stream()
                .flatMap(List::stream)
                .filter(field -> field == GameField.OBSTACLE)
                .count();

        assertTrue(count > 1);
    }

    @Test
    public void checkIfEmptyFieldsAreOnBoard() {
        GameBoard gameBoard = new GameBoard();
        gameBoard.initializeFields();

        long count = gameBoard.getGameBoard().stream()
                .flatMap(List::stream)
                .filter(field -> field == GameField.EMPTY)
                .count();

        assertTrue(count > 1);
    }
}
