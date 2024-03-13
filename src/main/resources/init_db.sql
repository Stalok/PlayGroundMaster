create database if not exists main_db;

create database if not exists mirror_db;

create table if not exists main_db.user (
    id int primary key auto_increment,
    name varchar(255) not null,
    age int not null
);

create table if not exists mirror_db.user (
    id int primary key auto_increment,
    name varchar(255) not null,
    age int not null
);

-- ------------------------------
create database if not exists playground_db;

create table if not exists playground_db.quizzes (
    id int primary key auto_increment,
    question varchar(255) not null, -- 问题
    type varchar(255) not null,     -- 类型 (multi_choice, query, changes)
    choice1 varchar(255),
    choice2 varchar(255),
    choice3 varchar(255),
    choice4 varchar(255),
    answer varchar(255) not null
    -- multi_choice: 1, 2, 3, 4
    -- query: select ...
    -- changes: make changes to mirror_db and query both db to compare
);


-- ------------------------------

insert into main_db.user (name, age) values ('张三', 20);
insert into main_db.user (name, age) values ('李四', 21);
insert into main_db.user (name, age) values ('王五', 22);
insert into main_db.user (name, age) values ('赵六', 23);
insert into main_db.user (name, age) values ('孙七', 24);
insert into main_db.user (name, age) values ('周八', 25);
insert into main_db.user (name, age) values ('吴九', 26);
insert into main_db.user (name, age) values ('郑十', 27);

insert into mirror_db.user (name, age) values ('张三', 20);
insert into mirror_db.user (name, age) values ('李四', 21);
insert into mirror_db.user (name, age) values ('王五', 22);
insert into mirror_db.user (name, age) values ('赵六', 23);
insert into mirror_db.user (name, age) values ('孙七', 24);
insert into mirror_db.user (name, age) values ('周八', 25);
insert into mirror_db.user (name, age) values ('吴九', 26);
insert into mirror_db.user (name, age) values ('郑十', 27);
