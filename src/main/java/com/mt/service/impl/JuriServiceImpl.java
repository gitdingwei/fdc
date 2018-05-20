package com.mt.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mt.mapper.JuriMapper;
import com.mt.model.Tree;
import com.mt.model.User;
import com.mt.service.JuriService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/5/14 0014.
 */
@Service
public class JuriServiceImpl implements JuriService {
    @Autowired
    private JuriMapper juriMapper;

    //登陆的时候查询
    @Override
        public Map<String, Object> loginDeng(User user) {
            String flag="0";
            Map map=new HashMap();
            List<User> list=juriMapper.queryUser(user.getUsername());
            if (list!=null && list.size()>0) {
                flag="1";
                User user2=list.get(0);
                if (user2.getUserpass().equals(user.getUserpass())) {
                    flag="2";
                    map.put("user", user2);
                }
            }
            map.put("flag", flag);
            return map;
        }

    @Override
    public List<Tree> queryTree(Integer userid) {
        List<Tree> firstMenu = juriMapper.queryMenu(userid);
        System.out.println(firstMenu);
        // 查询一级菜单的子菜单
        recursionMenu(firstMenu,userid);

        return firstMenu;
    }

    private void recursionMenu(List<Tree> firstMenu,Integer userid) {
            System.out.println(firstMenu);
            System.out.println(userid);
            for (Tree menu : firstMenu) {
                System.out.println(firstMenu);
                System.out.println(userid);

                System.out.println(menu.getId());
                // 查询菜单是否有子菜单
                List<Tree> menuList2 = juriMapper.queryMenuha(userid,menu.getId());
                System.out.println(menuList2);
                if (menuList2.size() > 0) {

                    menu.setNodes(menuList2);

                   recursionMenu(menuList2,userid);
                }
            }
        }
    @Override
    public Map<String, Object> updatemima(String username,String userpass, String newpass) {
        Map<String,Object> map=new HashMap<String,Object>();
        String mas="";
        User user =juriMapper.updatemima(username);
        if (user!=null){
            if(""!=user.getUserpass() & userpass.equals(user.getUserpass())){
                mas="success";
                map.put("user", user);
                juriMapper.upmm(user.getUserid(),newpass);
            }else{
                //密码错误
                mas="erroruserpas";
            }
        }else{
            //用户名或手机号不存在
            mas="errorsss";
        }
        map.put("mas", mas);
        return map;
    }


}
