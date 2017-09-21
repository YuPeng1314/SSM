package com.gs.service.impl;

import com.gs.bean.Hero;
import com.gs.common.Pager;
import com.gs.dao.HeroDAO;
import com.gs.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/9/18.
 */
@Service
public class HeroServiceImpl implements HeroService {

    @Autowired
    private HeroDAO heroDAO;

    public List<Hero> listByPager(Pager pager) {
        return heroDAO.listByPager(pager);
    }
}
