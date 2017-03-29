package me.lishuo.interf;

import me.lishuo.interf.impl.CountObserver;
import me.lishuo.interf.impl.CountObserver1;
import me.lishuo.interf.impl.CountSubject;

/**
 * Created by lis on 17/3/12.
 */
public class TestObserver {

    public static void main(String[] args) {
        Subject subject = new CountSubject();

        Observer observer = new CountObserver();
        Observer observer1 = new CountObserver1();

        subject.registerObserver(observer);
        subject.registerObserver(observer1);
//        subject.removerObserver(observer1);
        subject.notifyObserver();
    }
}
