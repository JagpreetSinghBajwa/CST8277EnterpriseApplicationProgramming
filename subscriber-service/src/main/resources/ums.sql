Create Database ums;
Use ums;

CREATE TABLE last_visit (
                            id binary(16) NOT NULL,
                            `in` int DEFAULT NULL,
                            `out` int DEFAULT NULL,
                            PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE roles (
                       id binary(16) NOT NULL,
                       name varchar(45) DEFAULT NULL,
                       description varchar(45) DEFAULT NULL,
                       PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE user (
                      userId binary(16) NOT NULL,
                      userName varchar(45) NOT NULL,
                      firstName varchar(45) NOT NULL,
                      lastName varchar(45) NOT NULL,
                      email varchar(45) NOT NULL,
                      password varchar(45) NOT NULL,
                      created int NOT NULL,
                      last_visit_id binary(16) DEFAULT NULL,
                      PRIMARY KEY (userId),
                      UNIQUE KEY email_key (email) USING BTREE,
                      KEY fk_users_last_visit1_idx (last_visit_id),
                      CONSTRAINT users_ibfk_1 FOREIGN KEY (last_visit_id) REFERENCES last_visit (id) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE users_has_roles (
                                 users_id binary(16) NOT NULL,
                                 roles_id binary(16) NOT NULL,
                                 PRIMARY KEY (users_id,roles_id),
                                 KEY fk_users_has_roles_roles1_idx (roles_id),
                                 KEY fk_users_has_roles_users_idx (users_id),
                                 CONSTRAINT fk_users_has_roles_roles1 FOREIGN KEY (roles_id) REFERENCES roles (id) ON DELETE CASCADE ON UPDATE CASCADE,
                                 CONSTRAINT fk_users_has_roles_users FOREIGN KEY (users_id) REFERENCES users (id) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
