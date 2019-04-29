package com.common;

class Person1{
    private String name;
    private String country;
    private boolean flag = false;//默认数据为空


    synchronized void setData(String name,String country)
    {
        if(flag) {//如果数据不为空
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.name = name;
        this.country = country;
        System.out.println("写入数据");
        flag = true;//写入数据后将flag置为true
        this.notify();

    }


    synchronized void getData( )
    {
        if(!flag) {//如果数据为空
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("name:  "+name+"---country:  "+country);
        flag = false;
        this.notify();
    }
}


class Input implements Runnable
{
    Person1 p;
    Input(Person1 p)
    {
        this.p = p;
    }
    public void run()
    {
        int i = 0;
        while(true)
        {
            if(i == 0)//随机产生不同的数据
            p.setData("女娲","中国");
            else
            p.setData("God","American");
            i=(i+1)%2;
        }
    }
}


class Output implements Runnable
{
    Person1 p;
    Output(Person1 p)
    {
        this.p = p;
    }
    public void run()
    {
        while(true)
        {
            p.getData();
        }
    }
}

public class PAC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        Person1 p = new Person1();

        Input in = new Input(p);
        Output out = new Output(p);

        Thread t1 = new Thread(in);
        Thread t2 = new Thread(out);

        t1.start();
        t2.start();

	}

}
