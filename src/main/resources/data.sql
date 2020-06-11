DROP TABLE IF EXISTS books;

CREATE TABLE books (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  subject VARCHAR(250) NOT NULL,
  n_pages INT DEFAULT NULL
);

INSERT INTO BOOKS (name, subject, n_pages) VALUES
  ('O Aparicionista', 'Ghotic', 200);