use bookmark;

create table persistent_logins (
    username varchar(50) not null,
    series varchar(64) not null,    
    token varchar(64) not null,
    last_used timestamp not null,
    primary key (series),
    foreign key (username) references users (username) on delete cascade
);