package cn.gnnt.chess.module.four.service.transaction;

import cn.gnnt.chess.module.four.vo.UserVO;

public interface IOperationTransaction {
    public void add(UserVO user);

    public void addDAOException (UserVO user) throws Exception;

    public void addException (UserVO user) throws Exception;
}
