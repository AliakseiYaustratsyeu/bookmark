@echo off

echo Schema creation...

set _SUCC_MSG=Scheme has been created successfully.
set _FAIL_MSG=Failed to create schema.

mysql -u root -pmysql < build_all.sql

if not "%errorlevel%" == "0" goto failure

set _MSG=%_SUCC_MSG%

goto end

:failure
set _MSG="%_FAIL_MSG% with errorlevel=%errorlevel%."

:end
echo %_MSG%