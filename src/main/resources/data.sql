INSERT INTO car(car_id,mark,model) VALUES(1,'Fiat','Panda'),(2,'Volvo','S40'),(3,'Nissan','Almera');
INSERT INTO part_group(part_group_id,name,car_id) VALUES(1,'Swiece Fiat',1),(2,'Pompy paliwowe Fiat',1),(3,'Sprzegla Fiat',1),(4,'Swiece Volvo',2),(5,'Pompy paliwowe Volvo',2),(6,'Sprzegla Volvo',2);
INSERT INTO part(part_id,name,code,part_group_id) VALUES(1,'Swieca typu 1',123,1),(2,'Swieca typu 2',321,4),(3,'Pompa paliwowa Typu 2',231,5);
INSERT INTO customer(customer_id,first_name,last_name) VALUES(1,'Pafko','Kowalczyk'),(2,'Ciastek','Kremowy');