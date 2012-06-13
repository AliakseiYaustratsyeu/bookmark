use bookmark;

create table users_roles (
	user_role_id int unsigned  not null auto_increment,    
	user_id int unsigned  not null,
    role_id int unsigned  not null,
    primary key (user_role_id),
    foreign key (user_id) references users (user_id) on delete cascade,
    foreign key (role_id) references roles (role_id) on delete cascade
);