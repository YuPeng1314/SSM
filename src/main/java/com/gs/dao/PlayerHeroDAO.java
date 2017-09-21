package com.gs.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/9/18.
 */
@Repository
public interface PlayerHeroDAO {

    /**
     * 玩家一次性选择多个英雄
     * @param playerId
     * @param heroIds
     */
    void saveHeros(@Param("playerId") int playerId, @Param("heroIds") int[] heroIds);

}
