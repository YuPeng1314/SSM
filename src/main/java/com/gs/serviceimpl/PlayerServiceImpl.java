package com.gs.service.impl;

import com.gs.bean.Player;
import com.gs.common.Pager;
import com.gs.dao.PlayerDAO;
import com.gs.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/9/18.
 */
@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerDAO playerDAO;

    public Player getByName(String realname) {
        return playerDAO.getByName(realname);
    }

    public List<Player> listByPager(Pager pager) {
        return playerDAO.listByPager(pager);
    }
}
