/*
 * RemnAccServiceLocal.java
 *
 * Copyright (c) 1998 - 2006 BusinessTechnology, Ltd.
 * All rights reserved
 *
 * This program is the proprietary and confidential information
 * of BusinessTechnology, Ltd. and may be used and disclosed only
 * as authorized in a license agreement authorizing and
 * controlling such use and disclosure
 *
 * Millennium ERP system.
 *
 */
package com.mg.merp.account;

import com.mg.merp.account.model.RemnAcc;

/**
 * 
 * @author leonova
 * @version $Id: RemnAccServiceLocal.java,v 1.1 2006/03/14 11:49:47 safonov Exp $
 */
public interface RemnAccServiceLocal
   extends com.mg.framework.api.DataBusinessObjectService<RemnAcc, Integer>, com.mg.merp.account.Remn
{

   public void overestimationCurAcc( com.mg.framework.api.AttributeMap rec ) throws com.mg.framework.api.ApplicationException;

}
