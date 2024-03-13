package org.derrick.playgroundmaster.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.derrick.playgroundmaster.entity.User;

import java.util.List;

@Mapper
public interface MirrorMapper {
    @Select("SELECT * FROM mirror_db.user")
    List<User> selectAllUsers();
}
