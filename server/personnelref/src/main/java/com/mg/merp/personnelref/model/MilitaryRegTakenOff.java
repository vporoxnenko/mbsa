/*
 * MilitaryRegTakenOff.java
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
package com.mg.merp.personnelref.model;

import com.mg.framework.api.annotations.DataItemName;
import com.mg.framework.api.annotations.EnumConstantText;

/**
 * Отметка о снятии с учета
 * 
 * @author leonova
 * @version $Id: MilitaryRegTakenOff.java,v 1.1 2006/04/13 10:23:53 safonov Exp $
 */
@DataItemName("PersonnelRef.Personnel.MilIsTakenOff")
public enum MilitaryRegTakenOff {
	/**
	 * Не снят
	 */
	@EnumConstantText ("resource://com.mg.merp.personnelref.resources.dataitemlabels#MilitaryRegTakenOff.NotOff")
	NOTOFF,
	
	/**
	 * Снят с воинского учета по возрасту
	 */
	@EnumConstantText ("resource://com.mg.merp.personnelref.resources.dataitemlabels#MilitaryRegTakenOff.OffAge")
	OFFAGE,
	
	/**
	 * Снят с воинского учета по состоянию здоровья
	 */
	@EnumConstantText ("resource://com.mg.merp.personnelref.resources.dataitemlabels#MilitaryRegTakenOff.OffHealth")
	OFFHEALTH
}
