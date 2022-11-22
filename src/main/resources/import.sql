-- menu item
INSERT INTO restaurant.menu_item (description,"name","number")
	VALUES ('Dog completo com muitos ingredientes','Dog Completo',1);
INSERT INTO restaurant.menu_item (description,"name","number")
	VALUES ('Dog completo com duas salsichas','Dog Duplo',2);
INSERT INTO restaurant.menu_item (description,"name","number")
	VALUES ('Dog completo do Marilia','Dog Marilia',3);
INSERT INTO restaurant.menu_item (description,"name","number")
	VALUES ('Dog Aricanduva','Dog Aricanduva',4);


-- shop
INSERT INTO restaurant.shop (id,address,"name")
	VALUES ('9dff45ff-5492-45cf-acb8-12baa9624d4a'::uuid,'Praça do Marilia, 15, Jd Marilia. São Paulo - SP','Loja do Marilia');
INSERT INTO restaurant.shop (id,address,"name")
	VALUES ('373369cf-3753-4056-99bc-073b184f41b8'::uuid,'Shopping Aricanduva, Praça de Alimentação 2.','Loja Shopping Aricanduva');

-- shop_menu_item
INSERT INTO restaurant.shop_menu_item (id_menu_item,id_shop)
	VALUES (1,'9dff45ff-5492-45cf-acb8-12baa9624d4a'::uuid);
INSERT INTO restaurant.shop_menu_item (id_menu_item,id_shop)
	VALUES (2,'9dff45ff-5492-45cf-acb8-12baa9624d4a'::uuid);
INSERT INTO restaurant.shop_menu_item (id_menu_item,id_shop)
	VALUES (3,'9dff45ff-5492-45cf-acb8-12baa9624d4a'::uuid);
INSERT INTO restaurant.shop_menu_item (id_menu_item,id_shop)
	VALUES (1,'373369cf-3753-4056-99bc-073b184f41b8'::uuid);
INSERT INTO restaurant.shop_menu_item (id_menu_item,id_shop)
	VALUES (2,'373369cf-3753-4056-99bc-073b184f41b8'::uuid);
INSERT INTO restaurant.shop_menu_item (id_menu_item,id_shop)
	VALUES (4,'373369cf-3753-4056-99bc-073b184f41b8'::uuid);

-- Ingredients
INSERT INTO restaurant.ingredients ("name")
	VALUES ('Maionese');
INSERT INTO restaurant.ingredients ("name")
	VALUES ('Salsicha');
INSERT INTO restaurant.ingredients ("name")
	VALUES ('Katchup');
INSERT INTO restaurant.ingredients ("name")
	VALUES ('Mostarda');
INSERT INTO restaurant.ingredients ("name")
	VALUES ('Purê de batata');

