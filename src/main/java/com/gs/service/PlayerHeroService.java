package com.gs.service;

/**
 * Created by Administrator on 2017/9/18.
 */
public interface PlayerHeroService {

    /**
     * 玩家一次性选择多个英雄
     * @param playerId
     * @param heroIds
     */
    void saveHeros(int playerId, int[] heroIds);

}
