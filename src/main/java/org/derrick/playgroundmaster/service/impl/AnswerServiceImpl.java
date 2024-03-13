package org.derrick.playgroundmaster.service.impl;

import lombok.AllArgsConstructor;
import org.derrick.playgroundmaster.connecter.PlaygroundConnector;
import org.derrick.playgroundmaster.mapper.MirrorMapper;
import org.derrick.playgroundmaster.mapper.PracticeMapper;
import org.derrick.playgroundmaster.service.AnswerService;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor
@Service
public class AnswerServiceImpl implements AnswerService {

    private final PracticeMapper practiceMapper;
    private final MirrorMapper mirrorMapper;
    private static final PlaygroundConnector mainConnector = new PlaygroundConnector("jdbc:mysql://localhost:60001/main_db?user=root&password=123456");
    private final PlaygroundConnector mirrorConnector = new PlaygroundConnector("jdbc:mysql://localhost:60001/mirror_db?user=root&password=123456");
    @Override
    public List<List<String>> executeQuery(String query) throws SQLException {
        ResultSet resultSet = mainConnector.executeQuery(query);
        if (resultSet == null) {
            return null;
        }
        else {
            return mainConnector.convertResultSetToList(resultSet);
        }
    }

    @Override
    public Boolean checkAnswer(String query) {
        // run the query on the main db and the mirror db

        // compare the results

        // return the result of the comparison
        return null;
    }

    @Override
    public Boolean checkAnswer() {
        // get the select query from the db

        // run the query on the main db and the mirror db

        // compare the results

        // return the result of the comparison

        return false;
    }

    @Override
    public int executeUpdate(String query) {
        return mainConnector.executeUpdate(query);
    }

    @Override
    public void start(String playgroundInitSql) {
        // create the main db and the mirror db
        mainConnector.executeUpdate(playgroundInitSql);
        mirrorConnector.executeUpdate(playgroundInitSql);
    }

}
