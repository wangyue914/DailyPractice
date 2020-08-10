package com.skiplist;

/**
 * @author wangyue
 * @date 2019/5/6 17:13
 **/
public class SkipListNode <T>{
    private int key;
    private T value;

    private SkipListNode<T> left, right, up, down;

    public static final int HEAD_KEY = Integer.MIN_VALUE;
    public static final int TAIL_KEY = Integer.MAX_VALUE;

    public SkipListNode(){}

    public SkipListNode(int key, T value){
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public SkipListNode<T> getLeft() {
        return left;
    }

    public void setLeft(SkipListNode<T> left) {
        this.left = left;
    }

    public SkipListNode<T> getRight() {
        return right;
    }

    public void setRight(SkipListNode<T> right) {
        this.right = right;
    }

    public SkipListNode<T> getUp() {
        return up;
    }

    public void setUp(SkipListNode<T> up) {
        this.up = up;
    }

    public SkipListNode<T> getDown() {
        return down;
    }

    public void setDown(SkipListNode<T> down) {
        this.down = down;
    }

    public static int getHeadKey() {
        return HEAD_KEY;
    }

    public static int getTailKey() {
        return TAIL_KEY;
    }


    @Override
    public String toString() {
        return "SkipListNode{" +
                "key=" + key +
                ", value=" + value +
                ", left=" + left +
                ", right=" + right +
                ", up=" + up +
                ", down=" + down +
                '}';
    }
}
