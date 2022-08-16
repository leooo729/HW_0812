INSERT INTO meals(name,price,description)VALUES('cake',40,'it is good');
INSERT INTO meals(name,price,description)VALUES('milk',20,'it is cold');
INSERT INTO meals(name,price,description)VALUES('hamburger',100,'it is big');
INSERT INTO meals(name,price,description)VALUES('fries',60,'it is hot');
INSERT INTO meals(name,price,description)VALUES('soup',50,'it is spicy');

INSERT INTO orders(id,total_Price,waiter)VALUES(1,70,'Leo');
INSERT INTO orders(id,total_Price,waiter)VALUES(2,160,'Ken');

INSERT INTO order_meals(order_id, meal_id) VALUES(1, 1);
INSERT INTO order_meals(order_id, meal_id) VALUES(1, 2);

INSERT INTO order_meals(order_id, meal_id) VALUES(2, 3);
INSERT INTO order_meals(order_id, meal_id) VALUES(2, 4);




