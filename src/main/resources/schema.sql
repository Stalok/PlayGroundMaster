drop database if exists main_db;
drop database if exists mirror_db;
drop database if exists playground_db;

create database if not exists main_db;
create database if not exists mirror_db;
create database if not exists playground_db;

drop table if exists playground_db.quizzes;
create table if not exists playground_db.quizzes (
    id int primary key auto_increment comment 'quiz id',
    playground_id int not null comment 'playground id',
    playground_quiz_id int not null comment '用于在playground中排序',    -- 用于在playground中排序
    prerequisite_sql varchar(3000) comment 'sql to run before the quiz',      -- sql to run before the quiz
    question varchar(255) not null,     -- 问题
    type varchar(255) not null,         -- 类型 (multi_choice, query, changes)
    choice1 varchar(355),
    choice2 varchar(355),
    choice3 varchar(355),
    choice4 varchar(355),
    answer varchar(2000) not null
    -- multi_choice: 1, 2, 3, 4
    -- query: select ...
    -- changes: make changes to mirror_db and query both db to compare
);

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



