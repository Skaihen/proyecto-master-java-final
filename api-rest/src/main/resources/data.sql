DROP TABLE IF EXISTS pokemons;

CREATE TABLE pokemons (
	id INT NOT NULL AUTO_INCREMENT,
	name VARCHAR(50) NOT NULL DEFAULT 'NA',
	type1 VARCHAR(50),
	type2 VARCHAR(50),
	level INT,
	hp INT,
	attack INT,
	defense INT,
	specialAttack INT,
	specialDefense INT,
	speed INT,
	PRIMARY KEY (id));

INSERT INTO Pokemons (id, name, type1, type2, level, hp, attack, defense, specialAttack, specialDefense, speed) VALUES (1, 'Bulbasaur', 'planta', 'veneno', 1, 45, 49, 49, 65, 65, 45);
INSERT INTO Pokemons (id, name, type1, type2, level, hp, attack, defense, specialAttack, specialDefense, speed) VALUES (4, 'Charmander', 'fuego', NULL, 1, 39, 52, 43, 60, 50, 65);
INSERT INTO Pokemons (id, name, type1, type2, level, hp, attack, defense, specialAttack, specialDefense, speed) VALUES (7, 'Squirtle', 'agua', NULL, 1, 44, 48, 65, 50, 64, 43);
INSERT INTO Pokemons (id, name, type1, type2, level, hp, attack, defense, specialAttack, specialDefense, speed) VALUES (25, 'Pikachu', 'electrico', NULL, 1, 35, 55, 40, 50, 50, 90);