package cn.gnnt.chess.module.six.dao.impl;

import cn.gnnt.chess.module.six.dao.IOperationDAO;
import cn.gnnt.chess.module.six.util.OperationUtil;
import cn.gnnt.chess.module.six.vo.UserVO;
import org.springframework.jdbc.core.JdbcTemplate;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

public abstract class AbstractOperationDAO  implements IOperationDAO {

    public void add(UserVO user){
        String sql = "insert into tb_user (id,user_name,password,name,age,sex,birthday,created,updated) values (?,?,?,?,?,?,?,sysdate(),sysdate())";
        Object[] params = new Object[] { user.getId(), user.getUser_name(), user.getPassword(), user.getName()
                , user.getAge(), user.getSex(), user.getBirthday() };
        getTemplate().update(sql,params);
    }

    public void addException(UserVO user) throws Exception {
        add(user);
        throw OperationUtil.genException();
    }

    public UserVO query(int id){
        String sql = "select * from tb_user where id=?";
        List<Map<String,Object>> list = getTemplate().queryForList(sql, id);
        if(list == null || list.size() <= 0){
            return null;
        }
        Map<String,Object> map = list.get(0);

        UserVO result = translateUser(map);
        return result;
    }

    public int queryMaxID(){
        String sql = "select max(id) as maxid from tb_user";

        List<Map<String,Object>> list = getTemplate().queryForList(sql);

        if(list != null && list.size() > 0){
            Map<String,Object> map = list.get(0);
            Object value = map.get("MAXID");
            if(value == null){
                return 0;
            }
            if(value.getClass().equals(BigDecimal.class)){
                return ((BigDecimal) value).intValue();
            }
            return (Integer) value;
        }
        return 0;
    }

    protected abstract JdbcTemplate getTemplate();

    private UserVO translateUser(Map<String,Object> map){
        UserVO result = new UserVO();
        result.setBirthday((Date)map.get("BIRTHDAY"));
        result.setCreated((Date)map.get("CREATED"));
        result.setName(""+map.get("NAME"));
        result.setPassword(""+map.get("PASSWORD"));
        result.setUpdated((Date)map.get("UPDATED"));
        result.setUser_name(""+map.get("USER_NAME"));
        if(map.get("SEX") != null && map.get("SEX").getClass().equals(BigDecimal.class)){
            result.setSex(((BigDecimal)map.get("SEX")).intValue());
        }else{
            result.setSex((Integer)map.get("SEX"));
        }
        if(map.get("ID") != null && map.get("ID").getClass().equals(BigDecimal.class)){
            result.setId(((BigDecimal)map.get("ID")).intValue());
        }else{
            result.setId((Integer)map.get("ID"));
        }
        if(map.get("AGE") != null && map.get("AGE").getClass().equals(BigDecimal.class)){
            result.setAge(((BigDecimal)map.get("AGE")).intValue());
        }else{
            result.setAge((Integer)map.get("AGE"));
        }
        return result;
    }
}
