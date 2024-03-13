package org.derrick.playgroundmaster.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.derrick.playgroundmaster.entity.User;

import java.util.List;

@Mapper
public interface PracticeMapper {

    @Select("SELECT * FROM main_db.user")
    List<User> selectAllUsers();


}
