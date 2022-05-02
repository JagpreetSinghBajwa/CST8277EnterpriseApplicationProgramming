select * from userdb.users;


SELECT DISTINCT username, firstName, lastName FROM userdb.users JOIN tweetdb.tweets ON (userdb.users.userId = tweetdb.tweets.userId);

SELECT * FROM userdb.users  JOIN userdb.followers  ON (userdb.followers.follower_id = userdb.users.userId);

SELECT * FROM userdb.users  JOIN userdb.followers  ON (userdb.followers.follower_id = userdb.users.userId)
WHERE followed_id = 2;


select tweetTxt as Messages from tweetdb.tweets;


