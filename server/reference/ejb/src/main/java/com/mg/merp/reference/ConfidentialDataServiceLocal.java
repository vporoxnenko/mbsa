/*
 * ConfidentialDataServiceLocal.java
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
package com.mg.merp.reference;

import com.mg.merp.reference.model.ConfidentialData;

/**
 * @author leonova
 * @version $Id: ConfidentialDataServiceLocal.java,v 1.1 2006/03/14 11:49:49 safonov Exp $
 */
public interface ConfidentialDataServiceLocal
    extends com.mg.framework.api.DataBusinessObjectService<ConfidentialData, Integer> {

  public byte[] getConfData(int id) throws com.mg.framework.api.ApplicationException;

  public void setConfData(byte[] confData, int id) throws com.mg.framework.api.ApplicationException;

}
