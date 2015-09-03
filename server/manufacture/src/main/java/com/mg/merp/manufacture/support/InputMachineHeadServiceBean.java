/*
 * InputMachineHeadServiceBean.java
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

package com.mg.merp.manufacture.support;

import javax.ejb.Stateless;

import com.mg.framework.api.validator.ValidationContext;
import com.mg.framework.support.validator.MandatoryAttribute;
import com.mg.merp.manufacture.InputMachineHeadServiceLocal;
import com.mg.merp.manufacture.InputMachineModelServiceLocal;
import com.mg.merp.manufacture.InputMachineSpecServiceLocal;
import com.mg.merp.manufacture.model.InputDocumentHead;

/**
 * Бизнес-компонент "Акты на списание времени, отработанного оборудование в НЗП" 
 * 
 * @author leonova
 * @version $Id: InputMachineHeadServiceBean.java,v 1.6 2006/09/20 10:56:37 safonov Exp $
 */
@Stateless(name="merp/manufacture/InputMachineHeadService")
public class InputMachineHeadServiceBean extends com.mg.merp.manufacture.generic.InputDocumentHeadServiceBean<InputDocumentHead, Integer, InputMachineModelServiceLocal, InputMachineSpecServiceLocal> implements InputMachineHeadServiceLocal{

	/* (non-Javadoc)
	 * @see com.mg.merp.document.generic.GoodsDocumentServiceBean#onValidate(com.mg.framework.api.validator.ValidationContext, T)
	 */
	@Override
	protected void onValidate(ValidationContext context, InputDocumentHead entity) {
		super.onValidate(context, entity);
		
		context.addRule(new MandatoryAttribute(entity, "To"));
		context.addRule(new MandatoryAttribute(entity, "From"));		
	}
	
	@Override
	protected int getDocSectionIdentifier() {
		return InputMachineHeadServiceLocal.DOCSECTION;
	}

}
