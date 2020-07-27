package cn.gnnt.chess.module.four.controller;

import cn.gnnt.chess.module.four.dao.IOperationDAO;
import cn.gnnt.chess.module.four.service.IOperationService;
import cn.gnnt.chess.module.four.service.transaction.IOperationTransaction;
import cn.gnnt.chess.module.four.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class AddController {

    @Autowired
    private IOperationDAO operationDAO;

    @Autowired
    private IOperationTransaction operationTransaction;

    @Autowired
    private IOperationService operationService;

    @GetMapping("/add")
    public String add(){
        int maxID = operationDAO.queryMaxID();

        UserVO user = genUser(maxID);

        operationDAO.add(user);
        return "add new user info: "+user.toString();
    }

    @GetMapping("/addTest")
    public String addTest(){
        StringBuilder builder = new StringBuilder();
        builder.append(daoADD()).append("<br/>");
        builder.append(daoADDException()).append("<br/>");
        builder.append(transactionAdd()).append("<br/>");
        builder.append(transactionAddDAOException()).append("<br/>");
        builder.append(transactionAddException()).append("<br/>");
        builder.append(serviceAddDAO()).append("<br/>");
        builder.append(serviceAddTransaction()).append("<br/>");
        builder.append(serviceAddDAOException()).append("<br/>");
        builder.append(serviceAddTransactionException()).append("<br/>");
        builder.append(serviceAddTransactionDAOException()).append("<br/>");
        builder.append(serviceAddException()).append("<br/>");

        return builder.toString();
    }

    private String serviceAddException(){
        String info = "";
        String info2 = "";

        try {
            info += "servoce通过添加自己异常：";
            int maxID = operationDAO.queryMaxID();
            info += "原最大编号["+maxID+"]";
            UserVO user = genUser(maxID);
            //info2 += "用户信息["+user.toString()+"]";
            operationService.addException(user);
        }catch(Exception e){
            info2 += "异常信息["+e.getMessage()+"]";
        }finally{
            int maxID = operationDAO.queryMaxID();
            info += "新最大编号["+maxID+"]";
        }
        return info + info2;
    }

    private String serviceAddTransactionDAOException(){
        String info = "";
        String info2 = "";

        try {
            info += "servoce通过Transaction添加DAO异常：";
            int maxID = operationDAO.queryMaxID();
            info += "原最大编号["+maxID+"]";
            UserVO user = genUser(maxID);
            //info2 += "用户信息["+user.toString()+"]";
            operationService.addTransactionDAOException(user);
        }catch(Exception e){
            info2 += "异常信息["+e.getMessage()+"]";
        }finally{
            int maxID = operationDAO.queryMaxID();
            info += "新最大编号["+maxID+"]";
        }
        return info + info2;
    }

    private String serviceAddTransactionException(){
        String info = "";
        String info2 = "";

        try {
            info += "servoce通过Transaction添加异常：";
            int maxID = operationDAO.queryMaxID();
            info += "原最大编号["+maxID+"]";
            UserVO user = genUser(maxID);
            //info2 += "用户信息["+user.toString()+"]";
            operationService.addTransactionException(user);
        }catch(Exception e){
            info2 += "异常信息["+e.getMessage()+"]";
        }finally{
            int maxID = operationDAO.queryMaxID();
            info += "新最大编号["+maxID+"]";
        }
        return info + info2;
    }

    private String serviceAddDAOException(){
        String info = "";
        String info2 = "";

        try {
            info += "servoce通过DAO添加异常：";
            int maxID = operationDAO.queryMaxID();
            info += "原最大编号["+maxID+"]";
            UserVO user = genUser(maxID);
            //info2 += "用户信息["+user.toString()+"]";
            operationService.addDAOException(user);
        }catch(Exception e){
            info2 += "异常信息["+e.getMessage()+"]";
        }finally{
            int maxID = operationDAO.queryMaxID();
            info += "新最大编号["+maxID+"]";
        }
        return info + info2;
    }

    private String serviceAddTransaction(){
        String info = "";
        String info2 = "";

        try {
            info += "servoce通过transaction添加成功：";
            int maxID = operationDAO.queryMaxID();
            info += "原最大编号["+maxID+"]";
            UserVO user = genUser(maxID);
            //info2 += "用户信息["+user.toString()+"]";
            operationService.addTransaction(user);
        }catch(Exception e){
            info2 += "异常信息["+e.getMessage()+"]";
        }finally{
            int maxID = operationDAO.queryMaxID();
            info += "新最大编号["+maxID+"]";
        }
        return info + info2;
    }

    private String serviceAddDAO(){
        String info = "";
        String info2 = "";

        try {
            info += "servoce通过DAO添加成功：";
            int maxID = operationDAO.queryMaxID();
            info += "原最大编号["+maxID+"]";
            UserVO user = genUser(maxID);
            //info2 += "用户信息["+user.toString()+"]";
            operationService.addDAO(user);
        }catch(Exception e){
            info2 += "异常信息["+e.getMessage()+"]";
        }finally{
            int maxID = operationDAO.queryMaxID();
            info += "新最大编号["+maxID+"]";
        }
        return info + info2;
    }

    private String transactionAddException(){
        String info = "";
        String info2 = "";

        try {
            info += "transaction添加异常：";
            int maxID = operationDAO.queryMaxID();
            info += "原最大编号["+maxID+"]";
            UserVO user = genUser(maxID);
            //info2 += "用户信息["+user.toString()+"]";
            operationTransaction.addException(user);
        }catch(Exception e){
            info2 += "异常信息["+e.getMessage()+"]";
        }finally{
            int maxID = operationDAO.queryMaxID();
            info += "新最大编号["+maxID+"]";
        }
        return info + info2;
    }

    private String transactionAddDAOException(){
        String info = "";
        String info2 = "";

        try {
            info += "transaction添加DAO异常：";
            int maxID = operationDAO.queryMaxID();
            info += "原最大编号["+maxID+"]";
            UserVO user = genUser(maxID);
            //info2 += "用户信息["+user.toString()+"]";
            operationTransaction.addDAOException(user);
        }catch(Exception e){
            info2 += "异常信息["+e.getMessage()+"]";
        }finally{
            int maxID = operationDAO.queryMaxID();
            info += "新最大编号["+maxID+"]";
        }
        return info + info2;
    }

    private String transactionAdd(){
        String info = "";
        String info2 = "";

        try {
            info += "transaction添加成功：";
            int maxID = operationDAO.queryMaxID();
            info += "原最大编号["+maxID+"]";
            UserVO user = genUser(maxID);
            //info2 += "用户信息["+user.toString()+"]";
            operationTransaction.add(user);
        }catch(Exception e){
            info2 += "异常信息["+e.getMessage()+"]";
        }finally{
            int maxID = operationDAO.queryMaxID();
            info += "新最大编号["+maxID+"]";
        }
        return info + info2;
    }

    private String daoADDException(){
        String info = "";
        String info2 = "";

        try {
            info += "DAO添加异常：";
            int maxID = operationDAO.queryMaxID();
            info += "原最大编号["+maxID+"]";
            UserVO user = genUser(maxID);
            //info2 += "用户信息["+user.toString()+"]";
            operationDAO.addException(user);
        }catch(Exception e){
            info2 += "异常信息["+e.getMessage()+"]";
        }finally{
            int maxID = operationDAO.queryMaxID();
            info += "新最大编号["+maxID+"]";
        }
        return info + info2;
    }

    private String daoADD(){
        String info = "";
        String info2 = "";

        try {
            info += "DAO添加成功：";
            int maxID = operationDAO.queryMaxID();
            info += "原最大编号["+maxID+"]";
            UserVO user = genUser(maxID);
            //info2 += "用户信息["+user.toString()+"]";
            operationDAO.add(user);
        }catch(Exception e){
            info2 += "异常信息["+e.getMessage()+"]";
        }finally{
            int maxID = operationDAO.queryMaxID();
            info += "新最大编号["+maxID+"]";
        }
        return info + info2;
    }



    private UserVO genUser(int nowMaxID){
        UserVO user = new UserVO();
        user.setId(++nowMaxID);
        user.setUser_name("user"+user.getId());
        user.setPassword("123456");
        user.setName("addName"+user.getId());
        user.setSex(1);
        user.setBirthday(new Date());
        return user;
    }
}
