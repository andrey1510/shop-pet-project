INSERT INTO customer(first_name, last_name, balance, phone, email) VALUES ('John', 'Smith', '8 445 654', 'john-smith@inbox.net');
INSERT INTO customer(first_name, last_name, balance, phone, email) VALUES ('Sam', 'Black', '8 433 565', 'sam.black@test.com');
INSERT INTO customer(first_name, last_name, balance, phone, email) VALUES ('Michael', 'Green', '8 342 534', 'inbox@mail.com');
INSERT INTO address(customer_fk_id, country, postal_code, city, address_line) VALUES (1, 'Ireland', '343D3', 'Dublin', 'Red street 4');
INSERT INTO address(customer_fk_id, country, postal_code, city, address_line) VALUES (1, 'Italy', '54632', 'Milan', 'Green street 3');
INSERT INTO address(customer_fk_id, country, postal_code, city, address_line) VALUES (2, 'Japan', 'F3434', 'Tokyo', 'Brown street 4');
INSERT INTO address(customer_fk_id, country, postal_code, city, address_line) VALUES (3, 'Italy', '8454', 'Rome', 'Black street 4');