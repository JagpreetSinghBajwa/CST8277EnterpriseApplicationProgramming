
INSERT INTO tweets(userId, tweetTxt) VALUES (1, 'other users are great!');
INSERT INTO tweets(userId, tweetTxt) VALUES (2, 'The need for forgiveness is an illusion. There is nothing to forgive.');
INSERT INTO tweets(userId, tweetTxt) VALUES (3,'I am going to be president!');
INSERT INTO tweets(userId, tweetTxt) VALUES (1, 'What a tweet');
INSERT INTO tweets(userId, tweetTxt) VALUES (2, 'slaying while playin');
INSERT INTO tweets(userId, tweetTxt) VALUES (3,'pffff! smh lol');



INSERT INTO reply(replyId, tweetId) VALUES (1,1);
INSERT INTO reply(replyId, tweetId)  VALUES (3,1);
INSERT INTO reply(replyId, tweetId)  VALUES (2,3);


INSERT INTO retweet(retweetId, tweetId) VALUES (4,1);
INSERT INTO retweet(retweetId, tweetId) VALUES (5,1);
INSERT INTO retweet(retweetId, tweetId) VALUES (6,3);


INSERT INTO favorites(tweetId, userId) VALUES (2,1);
INSERT INTO favorites VALUES (3,1);
INSERT INTO favorites VALUES (1,2);







