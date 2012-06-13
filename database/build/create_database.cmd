@echo off

echo ================================================
echo        Bookmark database creation...
echo ================================================

cd  ../schema/
call create_schema.cmd

cd  ../tables/
call create_tables.cmd

if not "%errorlevel%" == "0" goto failure

cd ../build/

set _SUCC_MSG=Bookmark database has created successfully.
set _FAIL_MSG=Failed to create Bookmark database.

set _MSG=%_SUCC_MSG%

goto end

:failure
set _MSG="%_FAIL_MSG% with errorlevel=%errorlevel%."

echo %_MSG%

:end

echo ================================================
echo Bookmark database has been created successfully.
echo ================================================

:quit

if exist lf del /F lf