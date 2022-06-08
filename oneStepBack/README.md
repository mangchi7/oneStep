git으로 불러 온 후에
프로젝트 우클릭 -> Gradle -> Refresh Gradle Project

// mac mysql

https://whitepaek.tistory.com/16

// window mysql

https://goddaehee.tistory.com/277

mysql 설치
암호는 2100

mysql 들어간 후에


  1. create database boardTest;

  2. use boardTest;

  3. CREATE TABLE `board` (
  `id` int NOT NULL,
  `title` char(25) DEFAULT NULL,
  `insert_name` char(25) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

  4. insert into board values(1, 'test1','test-1');
