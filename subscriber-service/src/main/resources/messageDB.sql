create database messageDB;
use  messageDB;

create table publisher (
                           publisherId BINARY(16) NOT NULL,
                           comment VARCHAR(128) NULL,
                           PRIMARY KEY (publisherId)
)
    ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS message (
                                       id BINARY(16) NOT NULL,
                                       content VARCHAR(140) NULL,
                                       created INT(11) NOT NULL,
                                       publisherId BINARY(16) NOT NULL,
                                       PRIMARY KEY (id, publisherId),
                                       INDEX fk_tweets_producers1_idx (publisherId ASC) VISIBLE,
                                       CONSTRAINT fk_tweets_producers1
                                           FOREIGN KEY (publisherId)
                                               REFERENCES publisher (publisherId)
                                               ON DELETE NO ACTION
                                               ON UPDATE NO ACTION)
    ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS subscriber (
                                          subscriberId BINARY(16) NOT NULL,
                                          comment VARCHAR(128) NULL,
                                          PRIMARY KEY (subscriberId))
    ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS subscriptions (
                                             publisherId BINARY(16) NOT NULL,
                                             subscriberId BINARY(16) NOT NULL,
                                             PRIMARY KEY (publisherId, subscriberId),
                                             INDEX fk_producers_has_subscribers_subscribers1_idx (subscriberId ASC) VISIBLE,
                                             INDEX fk_producers_has_subscribers_producers_idx (subscriberId ASC) VISIBLE,
                                             CONSTRAINT fk_publisher_has_subscribers_producers
                                                 FOREIGN KEY (publisherId)
                                                     REFERENCES publisher (publisherId)
                                                     ON DELETE NO ACTION
                                                     ON UPDATE NO ACTION,
                                             CONSTRAINT fk_producers_has_subscribers_subscribers1
                                                 FOREIGN KEY (subscriberId)
                                                     REFERENCES subscriber (subscriberId)
                                                     ON DELETE NO ACTION
                                                     ON UPDATE NO ACTION)
    ENGINE = InnoDB;
