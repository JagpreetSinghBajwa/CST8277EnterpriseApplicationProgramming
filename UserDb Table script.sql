Create database userDB;
use userDB;

CREATE TABLE users (
  userId int NOT NULL primary key,
  username varchar(40) NOT NULL unique,
  email varchar(255) NOT NULL unique,
  firstName varchar(40) NOT NULL,
  lastName varchar(255) NOT NULL,
  bio varchar(140) NOT NULL DEFAULT ''
);


CREATE TABLE followers (
  followed_id INT REFERENCES users(userId),
  follower_id INT REFERENCES users(userId),
  PRIMARY KEY (followed_id, follower_id)
);




select * from followers;
select * from users;