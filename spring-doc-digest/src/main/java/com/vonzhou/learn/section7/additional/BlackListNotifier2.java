package com.vonzhou.learn.section7.additional;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 注解
 *
 * 可以异步处理事件
 * 
 * Be aware of the following limitations when using asynchronous events:
 * 1) If the event listener throws an Exception it will not be propagated to the caller, check AsyncUncaughtExceptionHandler for more details.
 * 2) Such event listener cannot send replies. If you need to send another event as the result of the processing, inject ApplicationEventPublisher to send the event manually.
 * 
 * @version 2017/3/29.
 */
@Service
public class BlackListNotifier2 {

    private String notificationAddress;

    public void setNotificationAddress(String notificationAddress) {
        this.notificationAddress = notificationAddress;
    }

    @EventListener
    @Async
    public void processBlackListEvent(BlackListEvent event) {
        // notify appropriate parties via notificationAddress...
        System.out.println("Async BlackListEvent handle ...");
    }

}
