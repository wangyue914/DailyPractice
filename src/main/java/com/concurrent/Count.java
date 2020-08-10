package com.concurrent;

/**
 * @author wangyue
 * @date 2019/7/5 11:30
 **/
public class Count {

    Integer index;
    FairLock fairLock;

    public Count() {}

    public Count(Integer index, FairLock fairLock) {
        this.index = index;
        this.fairLock = fairLock;
    }

    public Integer addCount(Integer value) {

        try {
            this.fairLock.lock();
        } catch (Exception e) {
            e.printStackTrace();
        }
        index = index + value;
        this.fairLock.unLock();
        return index;

    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
}
