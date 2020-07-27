package cn.gnnt.chess.module.six.dao.impl;

import cn.gnnt.chess.module.six.dao.IOperationDAO;
import cn.gnnt.chess.module.six.util.OperationUtil;
import cn.gnnt.chess.module.six.vo.UserVO;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Repository(value = "financeOperationDAO")
public class FinanceOperationDAO extends AbstractOperationDAO {
    @Resource(name = "financeJdbcTemplate")
    private JdbcTemplate template;

    protected JdbcTemplate getTemplate() {
        return template;
    }
}
