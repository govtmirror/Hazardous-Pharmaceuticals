COLUMN LOAD_STATUS FORMAT A50
SET LINESIZE 150
SELECT LOAD_STATUS, COUNT(*) FROM PPSNEPL.HAZARD_DISPOSE_INPUT
GROUP BY LOAD_STATUS;

SELECT LOAD_STATUS, COUNT(*) FROM PPSNEPL.HAZARD_HANDLE_INPUT
GROUP BY LOAD_STATUS;