/*
 * CreateOperationDocFlowPluginFactory.java
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
package com.mg.merp.finance.support;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.mg.framework.api.orm.PersistentManager;
import com.mg.framework.service.ApplicationDictionaryLocator;
import com.mg.framework.support.ui.MaintenanceHelper;
import com.mg.framework.utils.ServerUtils;
import com.mg.framework.utils.StringUtils;
import com.mg.merp.docflow.DocFlowPlugin;
import com.mg.merp.docflow.generic.AbstractDocFlowPlugin;
import com.mg.merp.docflow.generic.AbstractDocFlowPluginFactory;
import com.mg.merp.docprocess.model.DocHeadState;
import com.mg.merp.document.CreateDocumentDocFlowListener;
import com.mg.merp.document.model.DocSection;
import com.mg.merp.finance.FinOperProcessorServiceLocal;
import com.mg.merp.finance.OperationServiceLocal;
import com.mg.merp.finance.model.FinOperation;

/**
 * Реализация фабрики реализаций этапа ДО "Создание финансовой операции"
 * 
 * @author Oleg V. Safonov
 * @version $Id: CreateOperationDocFlowPluginFactory.java,v 1.2 2007/11/30 13:01:38 alikaev Exp $
 */
public class CreateOperationDocFlowPluginFactory extends AbstractDocFlowPluginFactory {
	public final static int FACTORY_IDENTIFIER = 35;

	/* (non-Javadoc)
	 * @see com.mg.merp.docflow.DocFlowPluginFactory#createPlugin()
	 */
	protected DocFlowPlugin doCreatePlugin() {
		return new AbstractDocFlowPlugin() {

			/*
			 * (non-Javadoc)
			 * @see com.mg.merp.docflow.generic.AbstractDocFlowPlugin#doExecute()
			 */
			@Override
			protected void doExecute() throws Exception {
				FinOperProcessorServiceLocal service = (FinOperProcessorServiceLocal) ApplicationDictionaryLocator.locate()
						.getBusinessService(FinOperProcessorServiceLocal.LOCAL_SERVICE_NAME);
				service.processCreateFinOper(getParams(), new CreateDocumentDocFlowListener() {

				public void canceled() {
					cancel();
				}

				public void completed() {
					complete();
				}
			});
				
			}

			/*
			 * (non-Javadoc)
			 * @see com.mg.merp.docflow.generic.AbstractDocFlowPlugin#doRoolback()
			 */
			@Override
			protected void doRoolback() throws Exception {
				FinOperProcessorServiceLocal service = (FinOperProcessorServiceLocal) ApplicationDictionaryLocator.locate()
						.getBusinessService(FinOperProcessorServiceLocal.LOCAL_SERVICE_NAME);
				service.rollbackCreateFinOper(getParams());
				complete();
			}

			/*
			 * (non-Javadoc)
			 * @see com.mg.merp.docflow.generic.AbstractDocFlowPlugin#doGetDocActionResultTextRepresentation(com.mg.merp.docprocess.model.DocHeadState)
			 */
			@Override
			protected String doGetDocActionResultTextRepresentation(DocHeadState docHeadState) {
				PersistentManager manager = ServerUtils.getPersistentManager();
				DocSection docSection = manager.find(DocSection.class, docHeadState.getData1());
				FinOperation economicOper = manager.find(FinOperation.class, docHeadState.getData2());
				if (docSection == null || economicOper == null)
					return StringUtils.BLANK_STRING;
				
				return StringUtils.format(Messages.getInstance().getMessage(Messages.OPERATION_TITLE), docSection.getDSName(), SimpleDateFormat.getDateInstance(DateFormat.MEDIUM, ServerUtils.getUserLocale()).format(economicOper.getKeepDate()), economicOper.getComment(), economicOper.getSumCur(), economicOper.getCurrency().getCode());
			}

			/*
			 * (non-Javadoc)
			 * @see com.mg.merp.docflow.generic.AbstractDocFlowPlugin#doShowDocActionResult(com.mg.merp.docprocess.model.DocHeadState)
			 */
			@Override
			protected void doShowDocActionResult(DocHeadState docHeadState) {
				MaintenanceHelper.view((OperationServiceLocal) ApplicationDictionaryLocator.locate().getBusinessService("merp/finance/Operation"),
						docHeadState.getData2(), null, null);
			}
			
		};
	}

	/* (non-Javadoc)
	 * @see com.mg.merp.docflow.DocFlowPluginFactory#getIdentifier()
	 */
	public int getIdentifier() {
		return FACTORY_IDENTIFIER;
	}

	/* (non-Javadoc)
	 * @see com.mg.merp.docflow.DocFlowPluginFactory#getName()
	 */
	public String getName() {
		return "Create finance operation";
	}

}
