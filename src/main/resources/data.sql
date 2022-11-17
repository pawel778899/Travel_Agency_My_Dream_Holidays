insert into CONTINENT (ID, NAME) values (1, 'Europe');
insert into CONTINENT (ID, NAME) values (2, 'Asia');
insert into CONTINENT (ID, NAME) values (3, 'Africa');
insert into CONTINENT (ID, NAME) values (4, 'Australia');

INSERT INTO COUNTRY (ID, NAME, continent_id) VALUES (1, 'Poland',1);
INSERT INTO COUNTRY (ID, NAME, continent_id) VALUES (2, 'Egypt', 3);
INSERT INTO COUNTRY (ID, NAME, continent_id) VALUES (3, 'Spain',1);
INSERT INTO COUNTRY (ID, NAME, continent_id) VALUES (4, 'Sansibar', 3);
INSERT INTO COUNTRY (ID, NAME, continent_id) VALUES (5, 'Japan', 2);
INSERT INTO COUNTRY (ID, NAME, continent_id) VALUES (6, 'Australia', 4);

insert into CITY (ID, NAME, COUNTRY_ID) values (1, 'Warsaw', 1);
insert into CITY (ID, NAME, COUNTRY_ID) values (2, 'Mars Alam', 2);
insert into CITY (ID, NAME, COUNTRY_ID) values (3, 'Barcelona', 3);
insert into CITY (ID, NAME, COUNTRY_ID) values (4, 'Unguja', 4);
insert into CITY (ID, NAME, COUNTRY_ID) values (5, 'Tokyo', 5);
insert into CITY (ID, NAME, COUNTRY_ID) values (6, 'Sydney', 6);

