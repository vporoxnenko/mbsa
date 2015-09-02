/*
 * OrgUnitType.java
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
package com.mg.merp.reference.model;

import com.mg.framework.api.annotations.DataItemName;
import com.mg.framework.api.annotations.EnumConstantText;

/**
 * ���� �������������
 * 
 * @author leonova
 * @version $Id: OrgUnitType.java,v 1.1 2006/03/29 13:06:23 safonov Exp $
 */
@DataItemName ("Reference.OrgUnit.OrgUnitType")
public enum OrgUnitType {
	/**
	 * �������� �����������
	 */
	@EnumConstantText ("resource://com.mg.merp.reference.resources.dataitemlabels#OrgUnit.Type.Organization")
	ORGANIZATION,
	
	/**
	 * ������
	 */
	@EnumConstantText ("resource://com.mg.merp.reference.resources.dataitemlabels#OrgUnit.Type.Branch")
	BRANCH,
	
	/**
	 * �������������
	 */
	@EnumConstantText ("resource://com.mg.merp.reference.resources.dataitemlabels#OrgUnit.Type.OrgUnit")
	ORGUNIT,
	
	/**
	 * �����, ������
	 */
	@EnumConstantText ("resource://com.mg.merp.reference.resources.dataitemlabels#OrgUnit.Type.Department")
	DEPARTMENT
}
