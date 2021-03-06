/* CreatePaymentTransactionDocFlowPluginFactory.java
 *
 * Copyright (c) 1998 - 2007 BusinessTechnology, Ltd.
 * All rights reserved
 *
 * This program is the proprietary and confidential information
 * of BusinessTechnology, Ltd. and may be used and disclosed only
 * as authorized in a license agreement authorizing and
 * controlling such use and disclosure
 *
 * Millennium Business Suite Anywhere System.
 *
 */
package com.mg.merp.paymentalloc.support;

import com.mg.framework.service.ApplicationDictionaryLocator;
import com.mg.merp.docflow.DocFlowPlugin;
import com.mg.merp.docflow.generic.AbstractDocFlowPlugin;
import com.mg.merp.docflow.generic.AbstractDocFlowPluginFactory;
import com.mg.merp.paymentalloc.PaymentallocProcessorListener;
import com.mg.merp.paymentalloc.PaymentallocProcessorServiceLocal;

/**
 * Реализация фабрики реализации этапа ДО "Создать запись в журнале платежей"
 *
 * @author Denis V. Arychkov
 * @author Artem V. Sharapov
 * @version $Id: CreatePaymentTransactionDocFlowPluginFactory.java,v 1.2 2007/05/25 08:42:08
 *          sharapov Exp $
 */
public class CreatePaymentTransactionDocFlowPluginFactory extends AbstractDocFlowPluginFactory {

  public final static int FACTORY_IDENTIFIER = 13000;

  /*
   * (non-Javadoc)
   * @see com.mg.merp.docflow.generic.AbstractDocFlowPluginFactory#doCreatePlugin()
   */
  @Override
  protected DocFlowPlugin doCreatePlugin() {
    return new AbstractDocFlowPlugin() {

      /*
       * (non-Javadoc)
       * @see com.mg.merp.docflow.generic.AbstractDocFlowPlugin#doExecute()
       */
      @Override
      protected void doExecute() throws Exception {
        PaymentallocProcessorServiceLocal service = (PaymentallocProcessorServiceLocal) ApplicationDictionaryLocator.locate().getBusinessService(PaymentallocProcessorServiceLocal.LOCAL_SERVICE_NAME);
        service.createPayment(getParams(), new PaymentallocProcessorListener() {

          public void canceled() {
            cancel();
          }

          public void completed() {
            complete();
          }
        });
      }

      /*
       * (non-Javadoc)
       * @see com.mg.merp.docflow.generic.AbstractDocFlowPlugin#doRoolback()
       */
      @Override
      protected void doRoolback() throws Exception {
        PaymentallocProcessorServiceLocal service = (PaymentallocProcessorServiceLocal) ApplicationDictionaryLocator.locate().getBusinessService(PaymentallocProcessorServiceLocal.LOCAL_SERVICE_NAME);
        service.rollBackCreatePayment(getParams());
        complete();
      }
    };
  }

  /*
   * (non-Javadoc)
   * @see com.mg.merp.docflow.generic.AbstractDocFlowPluginFactory#getIdentifier()
   */
  @Override
  public int getIdentifier() {
    return FACTORY_IDENTIFIER;
  }

  /*
   * (non-Javadoc)
   * @see com.mg.merp.docflow.generic.AbstractDocFlowPluginFactory#getName()
   */
  @Override
  public String getName() {
    return "Payment Allocation transaction"; //$NON-NLS-1$
  }

}
