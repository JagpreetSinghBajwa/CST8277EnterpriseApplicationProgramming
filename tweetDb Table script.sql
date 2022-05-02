Create database tweetDB;
Use tweetDB;


CREATE TABLE tweets (
  tweetId INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  userId INT NOT NULL,
  tweetTxt VARCHAR(140) NOT NULL,
  FOREIGN KEY userId(userId) REFERENCES userdb.users(userId) 
);

CREATE TABLE reply (
  replyId int NOT NULL PRIMARY KEY,
  tweetId INT NOT NULL,
  FOREIGN KEY tweetId(tweetId) REFERENCES tweets(tweetId)
);

CREATE TABLE retweet (
  retweetId int PRIMARY KEY,
  tweetId int NOT NULL,
FOREIGN KEY tweetId(tweetId) REFERENCES tweets(tweetId) 
);

CREATE TABLE favorites (
  tweetId int PRIMARY KEY,
  userId int NOT NULL,
FOREIGN KEY tweetId(tweetId) REFERENCES tweets(tweetId),
FOREIGN KEY userId(userId) REFERENCES userdb.users(userId)
);