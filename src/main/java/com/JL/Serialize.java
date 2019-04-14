package com.JL;

import java.io.*;

public class Serialize {
    public static class User implements Serializable {
        private static String name;
        private transient String password;

        public User(){}
        public String getName() {
            return name;
        }

        public String getPassword() {
            return password;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

    public static void main(String[] args) {

        User user=new User();
        user.setName("jack");
        user.setPassword("123456");
        System.out.println("序列化之前 用户名"+user.getName()+" 密码 "+user.getPassword());

        try {
            ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("/home/wangyue/dir/seUser.txt"));
            os.writeObject(user);
            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        User user2=new User();
        try {
            user2.setName("qwe");
            ObjectInputStream is=new ObjectInputStream(new FileInputStream("/home/wangyue/dir/seUser.txt"));
            user2=(User)is.readObject();
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("序列化后 用户名:"+user2.getName()+" 密码:"+user2.getPassword());


    }
}
