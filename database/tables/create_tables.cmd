@echo off

set _SUCC_MSG=Tables have been created successfully.
set _FAIL_MSG=Failed to create tables.

echo Tables creation...

mysql -u root -pmysql < build_all.sql

if not "%errorlevel%" == "0" goto failure

set _MSG=%_SUCC_MSG%

goto end

:failure
set _MSG="%_FAIL_MSG% with errorlevel=%errorlevel%."

:end
echo %_MSG%