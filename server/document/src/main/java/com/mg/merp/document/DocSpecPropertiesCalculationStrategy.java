/*
 * DocSpecPropertiesCalculationStrategy.java
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
package com.mg.merp.document;

import java.io.Serializable;

/**
 * Стратегия расчета свойств спецификации документа
 * 
 * @author Artem V. Sharapov
 * @version $Id: DocSpecPropertiesCalculationStrategy.java,v 1.1 2007/10/30 14:25:30 sharapov Exp $
 */
public interface DocSpecPropertiesCalculationStrategy extends Serializable {

	/**
	 * Рассчитать и установить свойства спецификации
	 */
	void adjust();
	
}