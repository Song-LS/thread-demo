package com.sls.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sls
 **/
@Service
public class TicketService{
    /**
     * 票总数
     */
    private static int ticketNumber = 100;

    private Lock lock = new ReentrantLock();


    /**
     * 买票
     */
    public void buy() {
        // 获取锁
        lock.lock();
        try {
            if (ticketNumber > 0) {
                System.out.println( Thread.currentThread().getName() +"正在发售第" + ticketNumber + "张票哦");
                ticketNumber --;
            }
        } finally {
            // 手动释放锁
            lock.unlock();
        }

    }

}
