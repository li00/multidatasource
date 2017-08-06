package p.lzf.quickexcel.service;

import org.springframework.stereotype.Service;
import p.lzf.quickexcel.mapper.user.UserMapper;
import p.lzf.quickexcel.model.User;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lzf on 2017/8/6.
 */
@Service
public class UserImpService implements IUserService {
    @Resource
    private UserMapper userMapper;
    public List<User> getUserList() {
        return this.userMapper.getUserList();
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
