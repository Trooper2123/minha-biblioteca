DROP TABLE IF EXISTS book;
DROP TABLE IF EXISTS subjects;

CREATE TABLE subject(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  theme VARCHAR(250) NOT NULL
);

CREATE TABLE books (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  subject Int DEFAULT NULL,
  n_pages INT DEFAULT NULL,
  FOREIGN KEY (subject) REFERENCES subject (id)
);

INSERT INTO subject (theme) VALUES
  ('Classico'),
  ('Terror'),
  ('Romance');

INSERT INTO BOOKS (name,subject, n_pages) VALUES
  ('O Aparicionista',1, 150),
  ('Cujo',2, 400),
  ('O Iluminado',2,  350),
  ('A Princesa da Lapa',3,  200),
  ('Dracula',1, 500);

