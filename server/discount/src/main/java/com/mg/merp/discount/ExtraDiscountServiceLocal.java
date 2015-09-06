/*
 * ExtraDiscountServiceLocal.java
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
package com.mg.merp.discount;

import com.mg.merp.discount.model.ExtraDiscount;

/**
 * Бизнес-компонент "Дополнительные скидки дисконтной карты"
 *
 * @author leonova
 * @author Artem V. Sharapov
 * @version $Id: ExtraDiscountServiceLocal.java,v 1.3 2007/10/30 13:55:56 sharapov Exp $
 */
public interface ExtraDiscountServiceLocal extends com.mg.framework.api.DataBusinessObjectService<ExtraDiscount, Integer> {

  /**
   * имя сервиса
   */
  final static String SERVICE_NAME = "merp/discount/ExtraDiscount"; //$NON-NLS-1$

}
