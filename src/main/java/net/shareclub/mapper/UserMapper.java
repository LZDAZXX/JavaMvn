package net.shareclub.mapper;

import net.shareclub.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    //插入操作
    void insert(User user);
}
