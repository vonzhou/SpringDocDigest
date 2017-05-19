package com.vonzhou.learn.section17.programatic;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.util.Assert;

/**
 * Created by vonzhou on 2017/4/29.
 */
public class SimpleService2 implements Service {

    private PlatformTransactionManager txManager;

    // use constructor-injection to supply the PlatformTransactionManager
    public SimpleService2(PlatformTransactionManager transactionManager) {
        Assert.notNull(transactionManager, "The 'transactionManager' argument must not be null.");
        this.txManager = transactionManager;
    }

    public void doInTx() {
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        // explicitly setting the transaction name is something that can only be done
        // programmatically
        def.setName("SomeTxName");
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);

        TransactionStatus status = txManager.getTransaction(def);
        try {
            // execute your business logic here
            updateOperation2();
        } catch (SomeBusinessException ex) {
            txManager.rollback(status);
        }
        txManager.commit(status);
    }

    private void updateOperation1() {
    }

    private Object resultOfUpdateOperation2() {
        return null;
    }

    private void updateOperation2() throws SomeBusinessException {
    }
}
