DROP TABLE IF EXISTS book;


CREATE TABLE book (
  id INTEGER AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  subject VARCHAR(250) DEFAULT NULL,
  numPages INTEGER DEFAULT NULL
);