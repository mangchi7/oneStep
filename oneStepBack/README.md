git으로 불러 온 후에
프로젝트 우클릭 -> Gradle -> Refresh Gradle Project

// mac mysql

https://whitepaek.tistory.com/16

// window mysql

https://goddaehee.tistory.com/277

mysql 설치
암호는 2100

create database boardTest;

CREATE TABLE `board` (
  `id` int NOT NULL,
  `title` char(25) DEFAULT NULL,
  `insert_name` char(25) DEFAULT NULL,
  PRIMARY KEY (`id`)
)

insert into board values(1, 'test1','test-1');
