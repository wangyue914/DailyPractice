package com.skiplist;

import java.util.Random;

/**
 * @author wangyue
 * @date 2019/5/6 17:19
 **/
public class SkipList <T> {
    private SkipListNode<T> head, tail;
    private int nodes;
    private int listLevel;
    private Random random;
    private static final double PROBABILITY = 0.5;

    public SkipList() {
        random = new Random();
        clear();
    }

    public void clear(){
        head=new SkipListNode<T>(SkipListNode.HEAD_KEY, null);
        tail=new SkipListNode<T>(SkipListNode.TAIL_KEY, null);
        horizontalLink(head, tail);
        listLevel=0;
        nodes=0;
    }

    //在最底层节点，找到插入位置前面的那个节点
    private SkipListNode findNode(int key) {
        SkipListNode p =head;
        while (true) {
            while (p.getRight().getKey() <= key && p.getRight().getKey() != SkipListNode.TAIL_KEY) {
                p = p.getRight();
            }
            if (p.getDown() != null) {
                p = p.getDown();
            } else {
                break;
            }
        }
        return p;
    }

    public SkipListNode getNode(int key) {
        SkipListNode result = findNode(key);
        if (result.getKey() != key) {
            return null;
        }
        return result;
    }


    public void put(int key, T value) {
        SkipListNode p = findNode(key);
        if (p.getKey() == key){
            p.setValue(value);
            return;
        }


    }

    public void horizontalLink(SkipListNode<T> head, SkipListNode<T> tail){

    }





}
