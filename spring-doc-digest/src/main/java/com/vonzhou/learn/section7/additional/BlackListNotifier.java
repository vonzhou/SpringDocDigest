package com.vonzhou.learn.section7.additional;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * @version 2017/3/29.
 */
@Service
public class BlackListNotifier implements ApplicationListener<BlackListEvent> {

    private String notificationAddress;

    public void setNotificationAddress(String notificationAddress) {
        this.notificationAddress = notificationAddress;
    }

    public void onApplicationEvent(BlackListEvent event) {
        // notify appropriate parties via notificationAddress...
        System.out.println("BlackListEvent handle ...");
    }

}
