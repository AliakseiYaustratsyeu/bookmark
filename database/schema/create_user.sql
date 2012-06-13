use bookmark;
create user bmk@localhost identified by 'bmkpwd';
grant select, insert, update, delete, execute on bookmark.* to bmk@localhost;