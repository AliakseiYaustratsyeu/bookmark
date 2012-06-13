use bookmark;

create table users (
	user_id      int unsigned  not null auto_increment,    
	username     varchar(50) not null,
	password     varchar(50) not null,		
	first_name   varchar(50) not null,
	last_name    varchar(50) not null,
	email        varchar(100) not null,
	phone_number varchar(20) null,
    interests    varchar(255) null,	
	country      varchar(50) null,
	city         varchar(50) null,	
	street       varchar(50) null,
    state        varchar(2) null,
    zip          varchar(10) null,    
    account_enabled boolean not null,	  
    account_expired boolean not null,	 
    account_locked boolean not null,	 
    credentials_expired boolean not null,
	password_encrypted boolean not null,
	version int unsigned not null,
    created date not null,
    primary key (user_id),
    unique (username),
    unique (email)
) auto_increment = 1000001;
