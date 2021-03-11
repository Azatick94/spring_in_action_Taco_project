DELETE
FROM ingredient;
DELETE
FROM taco;
DELETE
FROM taco_ingredients;
DELETE
FROM taco_order;
DELETE
FROM taco_order_tacos;

INSERT INTO Ingredient (id, name, type)
VALUES ('FLTO', 'Flour Tortilla', 'WRAP'),
       ('COTO', 'Corn Tortilla', 'WRAP'),
       ('GRBF', 'Ground Beef', 'PROTEIN'),
       ('CARN', 'Carnitas', 'PROTEIN'),
       ('TMTO', 'Diced Tomatoes', 'VEGGIES'),
       ('LETC', 'Lettuce', 'VEGGIES'),
       ('CHED', 'Cheddar', 'CHEESE'),
       ('JACK', 'Monterrey Jack', 'CHEESE'),
       ('SLSA', 'Salsa', 'SAUCE'),
       ('SRCR', 'Sour Cream', 'SAUCE');

INSERT INTO Taco (name, created_at)
VALUES ('Barbacoa', '2021-03-11 10:00'),
       ('Carne asada', '2021-03-11 12:00'),
       ('Barbacoa', '2021-03-11 14:00');

INSERT INTO Taco_ingredients (taco, ingredient)
VALUES (1, 'FLTO'),
       (1, 'CARN'),
       (1, 'SLSA'),
       (2, 'COTO'),
       (2, 'SRCR'),
       (3, 'FLTO'),
       (3, 'CARN'),
       (3, 'LETC'),
       (3, 'SLSA');

INSERT INTO Taco_order (delivery_name, delivery_street, delivery_city, delivery_state, delivery_zip, cc_number,
                        cc_expiration, cc_cvv, placed_at)
VALUES ('Want taco', 'Gagarina', 'Moscow', 'MS', '432523', '3354325', '2022', '123', '2021-11-11'),
       ('Want taco2', 'Chertanovskay', 'Moscow', 'MS', '432523', '3354325', '2022', '123', '2021-11-11'),
       ('Want taco3', 'Kirova', 'Moscow', 'MS', '432523', '3354325', '2022', '123', '2021-11-11'),
       ('Want taco4', 'Tsentralnaya', 'Moscow', 'MS', '432523', '3354325', '2022', '123', '2021-11-11'),
       ('Want taco5', 'Kiyevskaya', 'Moscow', 'MS', '432523', '3354325', '2022', '123', '2021-11-11');

INSERT INTO taco_order_tacos (taco_order, taco)
VALUES (1, 1),
--        (2, 2),
       (2, 3);

