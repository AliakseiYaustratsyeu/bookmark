use bookmark;

insert into users 
    (           
    username,
    password,		
    first_name,
    last_name,
    email,
    phone_number,
    interests,	
    country,
    city,	
    street,
    state,
    zip,    
    account_enabled,	  
    account_expired,	 
    account_locked,	 
    credentials_expired,
    password_encrypted,
    version,
    created
    ) values ('admin', 'admin', 'First_Name_admin', 'Last_Name_admin', 'admin@bookmark.by', null, null, null, null, null, null, null, 1, 0, 0, 0, 0, 1, curdate()); 
    
insert into users 
    (           
    username,
    password,		
    first_name,
    last_name,
    email,
    phone_number,
    interests,	
    country,
    city,	
    street,
    state,
    zip,    
    account_enabled,	  
    account_expired,	 
    account_locked,	 
    credentials_expired,
    password_encrypted,
    version,
    created
    ) values('guest', 'guest', 'First_Name_guest', 'Last_Name_guest', 'guest@bookmark.by', null, null, null, null, null, null, null, 1, 0, 0, 0, 0, 1, curdate());
    
commit;


insert into roles 
    (    
    name,
    description
    ) values('admin', 'Administrator'); 
    
insert into roles 
    (    
    name,
    description
    ) values('user', 'User'); 
    
commit;



insert into users_roles 
    (    
    user_id,
    role_id
    ) values(1000001, 1); 
    
insert into users_roles     
    (    
    user_id,
    role_id
    ) values(1000002, 2);
    
commit;