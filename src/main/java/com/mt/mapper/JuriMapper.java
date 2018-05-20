package com.mt.mapper;

import com.mt.model.Tree;
import com.mt.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/5/14 0014.
 */
@Mapper
public interface JuriMapper {
    //登陆的时候查询
    @Select("select * from t_user where  username =#{username}")
    List<User> queryUser(String username);

    @Select("select  t.* from t_user u,t_role r , t_tree t,t_userrole  ur ,t_rolequan rq where u.userid = ur.userid and r.roleid\n" +
            "        =ur.roleid and r.roleid= rq.rid and t.id = rq.id and u.userid=#{userid}")
    List<Tree>  queryMenu(Integer userid);

    // 递归  自己调用自己

    @Select("select  t.* from t_user u,t_role r , t_tree t,t_userrole  ur ,t_rolequan rq where u.userid = ur.userid and r.roleid =ur.roleid and r.roleid= rq.rid  and rq.rqid = r.roleid and u.userid=#{userid}  and  t.pid=#{id}")
    List<Tree> queryMenuha(@Param("userid") Integer userid, @Param("id")Integer id);


    @Select("select * from t_user where username =#{username}")
    User updatemima(String username);

    @Update("update t_user set userpass=#{newpass} where userid=#{userid}")
    void upmm(Integer userid, String newpass);
}
