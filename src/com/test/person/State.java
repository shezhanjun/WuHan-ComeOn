package com.test.person;

/**
 * @Description 人的几种状态
 * @Author
 * @Date 2020/2/7 6:38 PM
 */
public interface State{
    int NORMAL = 0; // 正常状态
    int SUSPECTED = NORMAL+1; // 有嫌疑
    int SHADOW = SUSPECTED+1; // 潜伏期

    int CONFIRMED = SHADOW+1; // 被确诊
    int FREEZE = CONFIRMED+1; // 严重状
    int CURED = FREEZE+1; // 治愈出院
}
