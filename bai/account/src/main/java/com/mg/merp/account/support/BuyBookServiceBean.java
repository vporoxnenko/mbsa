/*
 * BuyBookServiceBean.java
 *
 * Copyright (c) 1998 - 2004 BusinessTechnology, Ltd.
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

package com.mg.merp.account.support;

import com.mg.framework.api.ApplicationException;
import com.mg.framework.api.validator.ValidationContext;
import com.mg.framework.generic.AbstractPOJODataBusinessObjectServiceBean;
import com.mg.framework.support.validator.MandatoryAttribute;
import com.mg.framework.support.validator.MandatoryStringAttribute;
import com.mg.merp.account.BuyBookServiceLocal;
import com.mg.merp.account.model.BuyBook;

import javax.ejb.Stateless;

/**
 * Бизнес-компонент "Книга покупок"
 *
 * @author leonova
 * @version $Id: BuyBookServiceBean.java,v 1.4 2006/08/23 10:28:49 leonova Exp $
 */
@Stateless(name = "merp/account/BuyBookService")
public class BuyBookServiceBean extends AbstractPOJODataBusinessObjectServiceBean<BuyBook, Integer> implements BuyBookServiceLocal {

  /* (non-Javadoc)
   * @see com.mg.framework.generic.AbstractPOJODataBusinessObjectServiceBean#onValidate(com.mg.framework.api.validator.ValidationContext, T)
   */
  @Override
  protected void onValidate(ValidationContext context, BuyBook entity) {
    context.addRule(new MandatoryAttribute(entity, "DocType"));
    context.addRule(new MandatoryAttribute(entity, "DocDate"));
    context.addRule(new MandatoryStringAttribute(entity, "DocNumber"));
    context.addRule(new MandatoryAttribute(entity, "Provider"));
  }

  /**
   * @ejb.interface-method view-type = "local"
   */
  public void makeBuyBook(java.util.Date dateFrom, java.util.Date dateTill,
                          int folderId, int contractorId, String docType, String docNumber) throws ApplicationException {
    //		((BuyBookDomainImpl) getDomain()).makeBuyBook(dateFrom, dateTill, folderId, contractorId, docType, docNumber);
  }
}
