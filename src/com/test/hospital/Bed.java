package com.test.hospital;

import com.test.model.Point;

/**
 * @Description 医院的床位
 * @Author 湛神
 * @Date 2020/2/7 6:16 PM
 */
public class Bed extends Point {
    public Bed(int x, int y) {
        super(x, y);
    }
    private boolean isEmpty=true;

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
