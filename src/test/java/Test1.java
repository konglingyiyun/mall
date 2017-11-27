import com.company.dao.CartMapper;
import com.company.pojo.Cart;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/11/27 0027.
 */
public class Test1 {

    @Test
    public void MyTest() {

        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        CartMapper cartMapper = app.getBean(CartMapper.class);
        Cart cart = cartMapper.selectByPrimaryKey(126);
        System.out.println(cart);
    }
        //Cart selectByPrimaryKey(Integer id);

}
