package org.derrick.playgroundmaster.controller;

import lombok.AllArgsConstructor;
import org.derrick.playgroundmaster.service.AnswerService;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/playground")
public class PlayGroundController {

    private final AnswerService answerService;

    /**
     * 开始答题
     * this method is used to start the playground, should be called by the backend spring app before any other operations
     * @param playgroundInitSql quizzes for the playground
     */
    @PostMapping("/start")
    public String start(@RequestParam String playgroundInitSql) {
        answerService.start(playgroundInitSql);
        return "Playground created";
    }

    /**
     * 执行查询语句
     * @param query select 查询语句
     * @return 查询结果
     * @throws SQLException 查询异常
     */
    @GetMapping("/query")
    public List<List<String>> executeQuery(@RequestParam String query) throws SQLException {
        return answerService.executeQuery(query);
    }

    /**
     * 执行更新语句
     * @param query non-select 更新语句
     * @return 更新的行数
     */
    @PostMapping("/update")
    public int executeUpdate(@RequestParam String query) {
        return answerService.executeUpdate(query);
    }

    /**
     * 检查答案
     * @return 是否正确
     */
    @GetMapping("/check")
    public Boolean checkAnswer() {
        return answerService.checkAnswer("SELECT * FROM practice_db.user");
    }
}
