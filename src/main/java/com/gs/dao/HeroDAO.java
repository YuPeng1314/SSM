package com.gs.dao;

import com.gs.bean.Hero;
import com.gs.common.Pager;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/9/18.
 */
@Repository
public interface HeroDAO {

    /**
     *
     * @return
     */
    List<Hero> listByPager(Pager pager);

}
