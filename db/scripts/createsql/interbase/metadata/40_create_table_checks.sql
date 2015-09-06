ALTER TABLE ANLPLAN ADD CONSTRAINT C_ANLPLAN_RANGELEVEL CHECK ((anllevel>=1) and (anllevel<6));
ALTER TABLE FINANL ADD CONSTRAINT C_FINANL_RANGELEVEL CHECK ((anllevel>=1) and (anllevel<6));
ALTER TABLE FINPERIOD ADD CONSTRAINT C_FINPERIOD_FROMD_LESS_TOD check(datefrom < dateto);
ALTER TABLE PERIOD ADD CONSTRAINT C_PERIOD_FROMD_LESS_TOD check(datefrom < dateto);
ALTER TABLE SETOFGOOD ADD CONSTRAINT C_SETOFGOOD_GOOD_NQ_COMP check (good_id <> component_id);
ALTER TABLE REF_CURRENCY_RATE ADD CONSTRAINT C_REF_CURRENCY_RATE check (CURRENCY_CODE1 <> CURRENCY_CODE2);
ALTER TABLE WF_ACTIVITY_MODEL ADD CONSTRAINT C_WF_ACTIVITY_MODEL_LOOP check ((SUBPROCESS_MGR_ID is null) or (WF_PROCESS_MGR_ID <> SUBPROCESS_MGR_ID));
ALTER TABLE PP_ITEM_FAMILY ADD CONSTRAINT C_PP_ITEM_FAMILY_CHILD_PAR check (PARENT_GENERIC_ITEM <> CHILD_GENERIC_ITEM);
ALTER TABLE PP_PLANNING_FORECAST ADD CONSTRAINT CHK_PP_PLAN_FRCT_GEN_CAT check ((planning_item_id is null) and (catalog_id is not null) or (planning_item_id is not null) and (catalog_id is null));
