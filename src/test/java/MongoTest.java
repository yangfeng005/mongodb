import com.mongodb.demo.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class MongoTest {

    public MongoTemplate mongoTemplate;

    @Before
    public void before(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-mongo.xml");
        mongoTemplate=(MongoTemplate) context.getBean("mongoTemplate");
    }

    @Test
    public void test(){
        User user=new User();
        user.setAge(19);
        user.setBirthday(new Date());
        user.setName("yangss");
        user.setFamilys(Arrays.asList("mother","father","sister"));

        mongoTemplate.insert(user);

    }
    @Test
    public void testQueryUser() {
        Query query = new Query();
        Criteria criteria=Criteria.where("age").gte(18);
        query.addCriteria(criteria);
        List<User> users=mongoTemplate.find(query,User.class);
    }
}
