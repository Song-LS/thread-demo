package com.sls.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sls
 **/
@Service
@Slf4j
public class Ticket2Service {

    private static int number = 20;
    private static int count = 0;

    private Lock lock = new ReentrantLock();


    private void buy() {
        lock.lock();
        if (number == 1 && count < 4) {
            number = 30;
            ++ count;
            log.info("执行完一次");
        } else if (number > 1) {
            try {
                System.out.println(Thread.currentThread().getName() + "正在发售第"+number+"张票啊啊啊");
                number --;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        lock.unlock();
    }

    public void execute() {
        Executors.newFixedThreadPool(10).submit(() -> {
            while (number != 0) {
                buy();
            }
        });
    }
}
