/*
 * ExportProcessorServiceLocal.java
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
package com.mg.merp.exchange;

/**
 * 
 * @author leonova
 * @version $Id: ExportProcessorServiceLocal.java,v 1.1 2006/03/14 11:49:47 safonov Exp $
 */
public interface ExportProcessorServiceLocal
   extends com.mg.framework.api.BusinessObjectService
{

   public void doExport( java.lang.String siteCode ) throws com.mg.framework.api.ApplicationException;

   public void enqueue( java.lang.String siteCode,java.lang.String beanName,java.lang.Object[] keys ) throws com.mg.framework.api.ApplicationException;

}
