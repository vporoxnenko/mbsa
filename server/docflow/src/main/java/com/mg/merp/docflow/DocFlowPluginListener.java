/*
 * DocFlowPluginListener.java
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
package com.mg.merp.docflow;

import java.util.EventListener;

/**
 * @author Oleg V. Safonov
 * @version $Id: DocFlowPluginListener.java,v 1.1 2006/03/01 15:03:50 safonov Exp $
 */
public interface DocFlowPluginListener extends EventListener {

  public void performed(DocFlowPluginEvent event);

  public void canceled();

}
