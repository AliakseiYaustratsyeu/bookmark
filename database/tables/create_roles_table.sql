use bookmark;

create table roles (
    role_id int unsigned  not null auto_increment,    
	name    varchar(20),
    description varchar(64),
    primary key (role_id)
)