set foreign_key_checks = 0;
source drop_users_table.sql;
source drop_users_roles_table.sql;
source drop_roles_table.sql;
source drop_persistent_logins_table.sql
set foreign_key_checks = 1;
