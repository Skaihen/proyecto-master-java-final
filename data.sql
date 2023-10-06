DROP TABLE IF EXISTS animales;

CREATE TABLE animales (
	id INT NOT NULL,
	name VARCHAR(50) NOT NULL DEFAULT 'NA',
	intelligence INT,
	power INT,
	defense INT,
	speed INT,
	hp INT,
	stealth INT,
	PRIMARY KEY (id)
);

INSERT INTO Animales (id, name, intelligence, power, defense, speed, hp, stealth) VALUES (1, 'Hipopótamo', 60, 80, 78, 70, 85, 60);
INSERT INTO Animales (id, name, intelligence, power, defense, speed, hp, stealth) VALUES (2, 'Elefante', 86, 88, 80, 40, 88, 42);
INSERT INTO Animales (id, name, intelligence, power, defense, speed, hp, stealth) VALUES (3, 'Cocodrilo', 68, 100, 42, 50, 60, 80);
INSERT INTO Animales (id, name, intelligence, power, defense, speed, hp, stealth) VALUES (4, 'Ratón', 80, 15, 20, 60, 20, 64);