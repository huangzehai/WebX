create table addresses (
    address_id int not null,
    country varchar(32) not null,
    province varchar(32) not null,
    city varchar(32) not null,
    street varchar(32) not null,
    zip_code varchar(32) not null,
    constraint pk_address primary key (address_id)
);

create table orders (
    order_id int not null,
    address_id int not null,
    -- item_id int not null,
    --quantity int not null,
    --amount DECIMAL not null,
    constraint pk_order primary key (order_id)
);