package com.zhuzz.ssmDemo.controller;


import com.zhuzz.ssmDemo.dto.user.Student;
import com.zhuzz.ssmDemo.mapper.user.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;


@RestController
public class BaseController {

    @Autowired
    private StudentMapper mapper;
    /**
     * @Author: Zezhao.Zhu
     * @Description:
     * @Date: 18:04 2018/5/3
     */
    @RequestMapping(value = "find")
    public Map<String, Object> xmlOrJson() {
        Student nacy = mapper.findStudent("nacy");
        System.out.println(nacy);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("list", new String("1111"));
        return map;
    }



    public static void main(String[] args) {
        //声明Connection对象
        Connection con = null;
        //驱动程序名
        String driver = "com.mysql.jdbc.Driver";
        //URL指向要访问的数据库名mydata
        String url = "jdbc:mysql://localhost:3306/student?useUnicode=true&characterEncoding=utf-8&useSSL=false";
        //MySQL配置时的用户名
        String user = "root";
        //MySQL配置时的密码
        String passWord = "root";
        //遍历查询结果集
        try {
            //加载驱动程序
            Class.forName(driver);
            // 1.getConnection()方法，连接MySQL数据库！！
            con = DriverManager.getConnection(url, user, passWord);
            if (!con.isClosed()) {
                System.out.println("Succeeded connecting to the Database!");
            }
            //2.创建statement类对象，用来执行SQL语句！！
            Statement statement = con.createStatement();
            //要执行的SQL语句
            String sql = "select * from t_student";
            //3.ResultSet类，用来存放获取的结果集！！
            ResultSet rs = statement.executeQuery(sql);
            System.out.println("-----------------");
            System.out.println("执行结果如下所示:");
            System.out.println("-----------------");
            System.out.println("姓名" + "\t" + "年龄");
            System.out.println("-----------------");
            String name = null;
            String age = null;
            while (rs.next()) {
                //获取stuname这列数据
                name = rs.getString("name");
                //获取stuid这列数据
                age = rs.getString("age");
                //输出结果
                System.out.println(name + "\t" + age);
            }
            rs.close();
            con.close();
            System.out.println("数据库数据成功获取！！");
        } catch (ClassNotFoundException e) {
            //数据库驱动类异常处理
            System.out.println("Sorry,can`t find the Driver!");
            e.printStackTrace();
        } catch (SQLException e) {
            //数据库连接失败异常处理
            e.printStackTrace();
            System.out.println("数据库获取数据失败！！");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("数据库获取数据失败！！");
        }
    }

}
