CREATE DEFINER=`sp20`@`%` PROCEDURE `add_common_column`( IN tablename VARCHAR ( 30 ) )
BEGIN

SET @SQL = concat( 'alter table ', tablename, ' add column (created_at datetime, created_by varchar(30), modified_at datetime, modified_by varchar(30))' );
PREPARE stms
FROM
	@SQL;
EXECUTE stms;
DEALLOCATE PREPARE stms;

END