package cn.gnnt.chess.module.five.dao.impl;

import cn.gnnt.chess.module.five.dao.IFinanceOperationDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Repository(value = "financeOperationDAO")
public class FinanceOperationDAO implements IFinanceOperationDAO {
    @Resource(name = "financeJdbcTemplate")
    private JdbcTemplate template;

    public int queryMaxID(){
        String sql = "select max(id) as maxid from tb_user";

        List<Map<String,Object>> list = template.queryForList(sql);

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
}
