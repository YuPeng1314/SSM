CREATE DATABASE ssm DEFAULT charset utf8;

use ssm;

create table t_admin(
  id INT PRIMARY KEY auto_increment,
  phone VARCHAR(11),
  password VARCHAR(50),
  gender tinyint,
  address VARCHAR(200)
) ENGINE = InnoDB DEFAULT charset utf8;

create table t_user(
  id int primary key auto_increment,
  name varchar(20),
  password varchar(50)
) ENGINE = InnoDB DEFAULT charset utf8;

create table t_product(
  id int primary key auto_increment,
  title varchar(50),
  price decimal
) ENGINE = InnoDB DEFAULT charset utf8;

create table t_order(
 id int primary key auto_increment,
 user_id int,
 order_time datetime
) ENGINE = InnoDB DEFAULT charset utf8;

create table t_order_item(
  id int primary key auto_increment,
  order_id int,
  product_id int,
  quantity int,
  unit_price decimal,
  total_cost decimal
) ENGINE = InnoDB DEFAULT charset utf8;


create table t_player(
  id int primary key auto_increment,
  realname varchar(10),
  gender tinyint
) ENGINE = InnoDB DEFAULT charset utf8;

create table t_hero(
  id int primary key auto_increment,
  name varchar(10)
) ENGINE = InnoDB DEFAULT charset utf8;

create table t_player_hero(
  id int PRIMARY key auto_increment,
  player_id int,
  hero_id int
) ENGINE = InnoDB DEFAULT charset utf8;

create table t_prop(
  id int primary key auto_increment,
  name varchar(10),
  price decimal
) ENGINE = InnoDB DEFAULT charset utf8;

create table t_trade(
  id int primary key auto_increment,
  player_id int,
  trade_time datetime,
  spent decimal
) ENGINE = InnoDB DEFAULT charset utf8;

create table t_trade_item(
  id int primary key auto_increment,
  trade_id int,
  prop_id int,
  quantity int
) ENGINE = InnoDB DEFAULT charset utf8;

