
CREATE TABLE developer(
  id SERIAL PRIMARY KEY,
  first_name VARCHAR NOT NULL,
  last_name VARCHAR NOT NULL,
  language_id INT NOT NULL REFERENCES language(id)
);

INSERT INTO developer VALUES(0, 'Larry', 'Bambelle', 0);
INSERT INTO developer VALUES(1, 'Juda', 'Bricot', 3);
INSERT INTO developer VALUES(2, 'Axel', 'Aire', 1);
INSERT INTO developer VALUES(3, 'Simon', 'Strueux', 2);
