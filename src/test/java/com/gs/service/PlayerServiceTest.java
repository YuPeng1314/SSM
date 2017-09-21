package com.gs.service;

import com.gs.bean.Player;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/9/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:/config/spring-context.xml",
        "classpath:/config/spring-mybatis.xml"})
public class PlayerServiceTest {

    @Autowired
    private PlayerService playerService;

    @Test
    public void testGetByName() {
        Player player = playerService.getByName("abc");
        // Assert.assertNotNull(player);
        System.out.println(player);
    }

}
