package com.gs.service;

import com.gs.bean.Hero;
import com.gs.common.Pager;

import java.util.List;

/**
 * Created by Administrator on 2017/9/18.
 */
public interface HeroService {

    /**
     *
     * @return
     */
    List<Hero> listByPager(Pager pager);

}
