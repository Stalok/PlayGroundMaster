package org.derrick.playgroundmaster.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.derrick.playgroundmaster.entity.Quiz;

import java.util.List;

@Mapper
public interface QuizMapper {
    @Select("SELECT * FROM playground_db.quizzes where playground_id = #{playgroundId}")
    List<Quiz> getQuizzesByPlaygroundId(Integer playgroundId);
}
