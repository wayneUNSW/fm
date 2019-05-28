package fm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	public static void main (String [] args){
        FreemarkerUtil util = new FreemarkerUtil();
        Map<String, Object> map = new HashMap<String, Object>();
 
        Group group = new Group();
        group.setName("IT");
         
        User user1 = new User();
        user1.setId(001);
        user1.setName("wayne");
        user1.setAge(12);
        user1.setGroup(group);
         
        User user2 = new User();
        user2.setId(002);
        user2.setName("wayne");
        user2.setAge(22);
        user2.setGroup(group);
        
        User user3 = new User();
        user3.setId(003);
        user3.setName("wayne");
        user3.setAge(14);
        user3.setGroup(group);
        
        List<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        
        map.put("username","wayne");
        map.put("users", users);
        map.put("user1", user1);
        //普通EL赋值
        util.print("02.ftl", map );
        //判断
        //util.print("03.ftl", map, "03.html");
        //遍历
        //util.print("05.ftl", map);
        //子元素判断
        //util.print("06.ftl", map);
    }
}
