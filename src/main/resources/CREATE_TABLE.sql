CREATE TABLE groups (id INTEGER NOT NULL,
                    number INTEGER DEFAULT NULL,
                    faculty VARCHAR(200) DEFAULT NULL,
                    PRIMARY KEY (id));
CREATE TABLE students (id INTEGER NOT NULL,
                      firstname VARCHAR(50) DEFAULT NULL,
                      lastname VARCHAR(50) DEFAULT NULL,
                      secondname VARCHAR(50) DEFAULT NULL,
                      dob DATE DEFAULT NULL,
                      group_id INTEGER DEFAULT NULL,
                      FOREIGN KEY (group_id) REFERENCES groups(id));