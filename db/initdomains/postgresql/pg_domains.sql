CREATE DOMAIN D_ADDR_BUILDING AS
VARCHAR(20);

CREATE DOMAIN D_ADDR_HOUSE AS
VARCHAR(20);

CREATE DOMAIN D_ADDR_PREFIX AS
VARCHAR(20);

CREATE DOMAIN D_ADDR_ROOM AS
VARCHAR(20);

CREATE DOMAIN D_ADDR_STREET AS
VARCHAR(128);

CREATE DOMAIN D_APP_LAYER AS
SMALLINT;

CREATE DOMAIN D_AUDIT_EVENT AS
SMALLINT;

CREATE DOMAIN D_BEAN_NAME AS
VARCHAR(128);

CREATE DOMAIN D_BIGCODE AS
VARCHAR(20);

CREATE DOMAIN D_BIGNAME AS
VARCHAR(256);

CREATE DOMAIN D_BIG_INT_IDEN AS
NUMERIC(18,0);

CREATE DOMAIN D_BOOLEAN AS
BOOLEAN;

CREATE DOMAIN D_CALCTAXESSUBJECT AS
SMALLINT
CHECK (value between 0 and 1);

CREATE DOMAIN D_CATALOG_GROUPS_TYPE AS
SMALLINT;

CREATE DOMAIN D_CLASS_IMPL_KIND AS
SMALLINT;

CREATE DOMAIN D_COMMENT AS
VARCHAR(256);

CREATE DOMAIN D_CONST_VAL AS
VARCHAR(80);

CREATE DOMAIN D_CONTARCT_CALC_SUM_KIND AS
SMALLINT;

CREATE DOMAIN D_CONTPHASE_CALC_SUM_KIND AS
SMALLINT;

CREATE DOMAIN D_CONTRACTORCARD_HIST_KIND AS
SMALLINT
CHECK(VALUE BETWEEN 0 AND 1);

CREATE DOMAIN D_CONTRACTORCARD_PLAN_KIND AS
SMALLINT
CHECK(VALUE BETWEEN 0 AND 1);

CREATE DOMAIN D_CONTRACTOR_KIND AS
SMALLINT
CHECK (value between 0 and 2);

CREATE DOMAIN D_CONTRACTSTATUS AS
SMALLINT;

CREATE DOMAIN D_CONTRACT_COMMENT AS
VARCHAR(2048);

CREATE DOMAIN D_CRM_SWOT AS
VARCHAR(1024);

CREATE DOMAIN D_CURCOURCE AS
NUMERIC(15,5);

CREATE DOMAIN D_CUSTOMALGORITHM AS
VARCHAR(8196);

CREATE DOMAIN D_DATE AS
DATE;

CREATE DOMAIN D_DATETIME AS
TIMESTAMP WITH TIME ZONE;

CREATE DOMAIN D_DESCRIPTION AS
VARCHAR(1024);

CREATE DOMAIN D_DISABLE_EXCEED_QUANT AS
SMALLINT
check (value between 0 and 2);

CREATE DOMAIN D_DOCDATE AS
DATE;

CREATE DOMAIN D_DOCKIND AS
SMALLINT;

CREATE DOMAIN D_DOCNUMBER AS
VARCHAR(20);

CREATE DOMAIN D_DOCSECTION AS
SMALLINT;

CREATE DOMAIN D_DOCTYPE AS
VARCHAR(15);

CREATE DOMAIN D_ECONSPEC_FEATURE_CODE AS
VARCHAR(10);

CREATE DOMAIN D_EMAIL AS
VARCHAR(50);

CREATE DOMAIN D_EXCH_EXPORT_STATUS AS
SMALLINT
check (value between 0 and 4);

CREATE DOMAIN D_EXP_DATE_CALC_KIND AS
SMALLINT
CHECK (value between 0 and 2);

CREATE DOMAIN D_FEATURE AS
VARCHAR(80);

CREATE DOMAIN D_FEATURE_INT AS
INTEGER;

CREATE DOMAIN D_FEATURE_STR AS
VARCHAR(2048);

CREATE DOMAIN D_FILENAME AS
VARCHAR(256);

CREATE DOMAIN D_FINANL_KIND AS
SMALLINT;

CREATE DOMAIN D_FINCENTER_KIND AS
SMALLINT;

CREATE DOMAIN D_FORMAT AS
VARCHAR(80);

CREATE DOMAIN D_FORMULA AS
VARCHAR(2048);

CREATE DOMAIN D_HOUR AS
NUMERIC(18,6);

CREATE DOMAIN D_INT AS
INTEGER;

CREATE DOMAIN D_INT_IDEN AS
INTEGER;

CREATE DOMAIN D_LARGECODE AS
VARCHAR(40);

CREATE DOMAIN D_MASS AS
NUMERIC(15,3);

CREATE DOMAIN D_MEASURE_CONTROL AS
SMALLINT;

CREATE DOMAIN D_MEASURE_CONVERSION AS
VARCHAR(512);

CREATE DOMAIN D_MEDIUMCODE AS
VARCHAR(10);

CREATE DOMAIN D_MF_BOM_STATUS AS
SMALLINT;

CREATE DOMAIN D_MF_BOM_TYPE AS
SMALLINT;

CREATE DOMAIN D_MF_CAPACITY AS
NUMERIC(18,0);

CREATE DOMAIN D_MF_JOB_STATUS AS
SMALLINT;

CREATE DOMAIN D_MF_LBR_OH_ALLOC_FLAG AS
SMALLINT;

CREATE DOMAIN D_MF_LBR_TIME_RATE_FLAG AS
SMALLINT;

CREATE DOMAIN D_MF_MCH_OH_ALLOCATION_FLAG AS
SMALLINT;

CREATE DOMAIN D_MF_MCH_RECOVERY_FLAG AS
SMALLINT;

CREATE DOMAIN D_MF_MTL_OH_ACCLOC_FLAG AS
SMALLINT;

CREATE DOMAIN D_MF_MTL_QUAN_RATE_FLAG AS
SMALLINT;

CREATE DOMAIN D_MF_RESOURCE_TYPE AS
SMALLINT;

CREATE DOMAIN D_MF_SCHEDULE_DIR AS
SMALLINT;

CREATE DOMAIN D_MF_TICK AS
NUMERIC(18,0);

CREATE DOMAIN D_MONTH AS
SMALLINT
CHECK (VALUE BETWEEN 1 AND 12);

CREATE DOMAIN D_NAME AS
VARCHAR(80);

CREATE DOMAIN D_ORDER_STATUS AS
SMALLINT;

CREATE DOMAIN D_ORIGINAL AS
bytea;

CREATE DOMAIN D_PASSWORD AS
VARCHAR(80);

CREATE DOMAIN D_PHASEITEMKIND AS
SMALLINT;

CREATE DOMAIN D_PHONE AS
VARCHAR(80);

CREATE DOMAIN D_PHONELIST AS
VARCHAR(40);

CREATE DOMAIN D_QUANTITY AS
NUMERIC(18,3);

CREATE DOMAIN D_QUANTITY_EXT AS
NUMERIC(18,6);

CREATE DOMAIN D_QUERY AS
VARCHAR(8192);

CREATE DOMAIN D_RATIO AS
NUMERIC(18,6);

CREATE DOMAIN D_RPT_ENUMVALUES AS
VARCHAR(1024);

CREATE DOMAIN D_SERIAL_NUMBER AS
VARCHAR(50);

CREATE DOMAIN D_SHORT AS
SMALLINT;

CREATE DOMAIN D_SIZE AS
VARCHAR(15);

CREATE DOMAIN D_SMALLCODE AS
VARCHAR(5);

CREATE DOMAIN D_SMALLESTCODE AS
VARCHAR(2);

CREATE DOMAIN D_SMALLNAME AS
VARCHAR(40);

CREATE DOMAIN D_STOCKBATCHHISTORY_KIND AS
SMALLINT
CHECK (VALUE BETWEEN 0 AND 1);

CREATE DOMAIN D_STOCKPOLICY AS
SMALLINT
check (value between 0 and 2);

CREATE DOMAIN D_SUMMA AS
NUMERIC(15,4);

CREATE DOMAIN D_SUMMA_EXT AS
NUMERIC(18,6);

CREATE DOMAIN D_SYS_DATAITEM_KIND AS
SMALLINT
CHECK (VALUE BETWEEN 0 AND 1);

CREATE DOMAIN D_TABLE_NAME AS
VARCHAR(40);

CREATE DOMAIN D_TIME_PERIOD_KIND AS
SMALLINT
CHECK (VALUE BETWEEN 0 AND 4);

CREATE DOMAIN D_USERNAME AS
VARCHAR(40);

CREATE DOMAIN D_VOLUME AS
NUMERIC(15,3);

CREATE DOMAIN D_WEIGHT AS
NUMERIC(15,3);

CREATE DOMAIN D_ZIPCODE AS
VARCHAR(30);

CREATE DOMAIN D_FLOAT8 AS
FLOAT8;

CREATE DOMAIN D_CHAR4 AS
VARCHAR(4);

CREATE DOMAIN D_CHAR15 AS
VARCHAR(15);

CREATE DOMAIN D_CHAR30 AS
VARCHAR(30);

CREATE DOMAIN D_CHAR50 AS
VARCHAR(50);

CREATE DOMAIN D_CHAR256 AS
VARCHAR(256);

CREATE DOMAIN D_TEXT AS
TEXT;

CREATE DOMAIN D_UUID AS
VARCHAR(40);

CREATE DOMAIN D_BINARY AS
BYTEA;