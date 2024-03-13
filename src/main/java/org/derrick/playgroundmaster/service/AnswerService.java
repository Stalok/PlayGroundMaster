package org.derrick.playgroundmaster.service;

import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public interface AnswerService {
    List<List<String>> executeQuery(String query) throws SQLException;

    /**
     * 检查答案 select query
     * @param query 查询语句
     * @return 是否正确
     */
    Boolean checkAnswer(String query);

    /**
     * 检查答案 non-select query
     * @return 是否正确
     */
    Boolean checkAnswer();

    int executeUpdate(String query);

    void start(String playgroundInitSql);
}
