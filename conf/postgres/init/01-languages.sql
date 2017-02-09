
CREATE TABLE language(
  id SERIAL PRIMARY KEY,
  name VARCHAR NOT NULL,
  creator VARCHAR NOT NULL
);

INSERT INTO language VALUES (0, 'Java', 'Sun Microsystems');
INSERT INTO language VALUES (1, 'Scala', 'EPFL');
INSERT INTO language VALUES (2, 'Python', 'Python Software Foundation');
INSERT INTO language VALUES (3, 'OCaml', 'Inria');
