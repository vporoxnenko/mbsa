/*
 * @AnlPlanKtAnlLevel5SearchHelp.java
 *
 * Copyright (c) 1998 - 2006 BusinessTechnology, Ltd.
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
package com.mg.merp.account.support.ui;

/**
 * SearchHelp для аналитики пятого уровня счета по кредиту
 *
 * @author leonova
 * @version $Id: AnlPlanKtAnlLevel5SearchHelp.java,v 1.1 2006/10/04 06:15:37 leonova Exp $
 */
public class AnlPlanKtAnlLevel5SearchHelp extends AnlPlanAccKtSearchHelp {

  /* (non-Javadoc)
   * @see com.mg.merp.account.support.ui.AnlPlanSearchHelp#getAnalitikaLevel()
   */
  @Override
  protected short getAnalitikaLevel() {
    return (short) 5;
  }

}
