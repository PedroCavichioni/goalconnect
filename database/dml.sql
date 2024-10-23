/*INSERTING DATA TO TEAM TABLE*/
INSERT INTO team (name, state, photo_url) VALUES 
('Flamengo', 'RJ', 'https://upload.wikimedia.org/wikipedia/commons/thumb/9/93/Flamengo-RJ_%28BRA%29.png/734px-Flamengo-RJ_%28BRA%29.png'),
('Vasco', 'RJ', 'https://upload.wikimedia.org/wikipedia/pt/thumb/a/ac/CRVascodaGama.png/180px-CRVascodaGama.png'),
('Atlético Mineiro', 'MG', 'https://upload.wikimedia.org/wikipedia/commons/thumb/5/5f/Atletico_mineiro_galo.png/180px-Atletico_mineiro_galo.png'),
('Cruzeiro', 'MG', 'https://upload.wikimedia.org/wikipedia/commons/thumb/9/90/Cruzeiro_Esporte_Clube_%28logo%29.svg/180px-Cruzeiro_Esporte_Clube_%28logo%29.svg.png'),
('Fortaleza', 'CE', 'https://upload.wikimedia.org/wikipedia/commons/thumb/e/e9/Fortaleza_EC_2018.png/180px-Fortaleza_EC_2018.png'),
('Ponte Preta', 'SP', 'https://upload.wikimedia.org/wikipedia/commons/thumb/7/7e/Escudo_Oficial_Ponte_Preta.png/180px-Escudo_Oficial_Ponte_Preta.png'),
('Corinthians', 'SP', 'https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/Corinthianssccp2023.png/180px-Corinthianssccp2023.png'),
('Santos', 'SP', 'https://upload.wikimedia.org/wikipedia/commons/thumb/1/15/Santos_Logo.png/180px-Santos_Logo.png'),
('Grêmio', 'RS', 'https://upload.wikimedia.org/wikipedia/commons/thumb/0/08/Gremio_logo.svg/180px-Gremio_logo.svg.png'),
('Internacional', 'RS', 'https://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/Scinternacional1909.png/180px-Scinternacional1909.png');

/*INSERTING DATA TO MATCH TABLE (FORMAT 'DD-MM-YYYY')*/
INSERT INTO match (date, team_one_id, score_team_one, team_two_id, score_team_two, team_suported_id) VALUES 
('01-10-2024', 1, 2, 2, 1, 1),
('02-10-2024', 3, 1, 4, 1, 3),
('03-10-2024', 5, 3, 6, 2, 5),
('04-10-2024', 7, 0, 8, 2, 8),
('05-10-2024', 9, 1, 10, 3, 9),
('06-10-2024', 2, 1, 5, 2, 5),
('07-10-2024', 4, 0, 1, 2, 1),
('08-10-2024', 3, 3, 6, 0, 3),
('09-10-2024', 8, 2, 9, 2, 8),
('10-10-2024', 10, 1, 7, 1, 7);
