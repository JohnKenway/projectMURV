package cn.gnnt.chess.module.six.vo;


import cn.gnnt.chess.module.six.util.OperationUtil;

import java.util.Date;

public class UserVO {

    private int id;

    private String user_name;

    private String password;

    private String name;

    private int age;

    private int sex;

    private Date birthday;

    private Date created;

    private Date updated;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();

        result.append("id["+id+"]")
                .append("user_name["+user_name+"]")
                .append("name["+name+"]")
                .append("password["+password+"]")
                .append("six["+(sex == 1 ? "man" : "women")+"]")
                .append("birthday["+ OperationUtil.fmtTime(birthday, "yyyy-MM-dd")+"]")
                .append("created["+OperationUtil.fmtTime(created, "yyyy-MM-dd HH:mm:ss")+"]")
                .append("updated["+OperationUtil.fmtTime(updated, "yyyy-MM-dd HH:mm:ss")+"]");

        return result.toString();
    }
}
