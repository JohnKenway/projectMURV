package cn.gnnt.chess.module.six.service.transaction;

import cn.gnnt.chess.module.six.vo.UserVO;

public interface IOperationTransaction {
    public void add(UserVO user);

    public void addDAOException(UserVO user) throws Exception;

    public void addException(UserVO user) throws Exception;
}
