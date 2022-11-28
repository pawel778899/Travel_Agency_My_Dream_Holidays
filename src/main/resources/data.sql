INSERT INTO continent (id, name) VALUES (1, 'Europe');
INSERT INTO continent (id, name) VALUES (2, 'Asia');
INSERT INTO continent (id, name) VALUES (3, 'Africa');
INSERT INTO continent (id, name) VALUES (4, 'Australia');

INSERT INTO country (id, name, continent_id) VALUES (1, 'Poland',1);
INSERT INTO country (id, name, continent_id) VALUES (2, 'Egypt', 3);
INSERT INTO country (id, name, continent_id) VALUES (3, 'Spain',1);
INSERT INTO country (id, name, continent_id) VALUES (4, 'Sansibar', 3);
INSERT INTO country (id, name, continent_id) VALUES (5, 'Japan', 2);
INSERT INTO country (id, name, continent_id) VALUES (6, 'Australia', 4);

INSERT INTO city (id, name, country_id) VALUES (1, 'Warsaw', 1);
INSERT INTO city (id, name, country_id) VALUES (2, 'Marsa Alam', 2);
INSERT INTO city (id, name, country_id) VALUES (3, 'Barcelona', 3);
INSERT INTO city (id, name, country_id) VALUES (4, 'Unguja', 4);
INSERT INTO city (id, name, country_id) VALUES (5, 'Tokyo', 5);
INSERT INTO city (id, name, country_id) VALUES (6, 'Sydney', 6);


INSERT INTO hotel (id, name, standard, description, city_id) values (1, 'Hotel in Warsaw', 4, 'Description: Beautiful hotel', 1);
INSERT INTO hotel (id, name, standard, description, city_id) values (2, 'Hotel in Marsa Alam', 5, 'Description: Excellent hotel', 2);
INSERT INTO hotel (id, name, standard, description, city_id) values (3, 'Hotel in Barcelona', 3, 'Description: Medium hotel', 3);
INSERT INTO hotel (id, name, standard, description, city_id) values (4, 'Hotel in Unguja', 4, 'Description: Beautiful hotel.', 4);
INSERT INTO hotel (id, name, standard, description, city_id) values (5, 'Hotel in Tokyo', 3, 'Description: Medium hotel', 5);
INSERT INTO hotel (id, name, standard, description, city_id) values (6, 'Hotel in Sydney', 3, 'Description: Medium hotel', 6);

INSERT INTO airport (id, name, city_id) VALUES (1, 'Airport in Wasaw',1);
INSERT INTO airport (id, name, city_id) VALUES (2, 'Airport in Marsa Alam',2);
INSERT INTO airport (id, name, city_id) VALUES (3, 'Airport in Barcelona',3);
INSERT INTO airport (id, name, city_id) VALUES (4, 'Airport in Unguja',4);
INSERT INTO airport (id, name, city_id) VALUES (5, 'Airport in Tokyo',5);
INSERT INTO airport (id, name, city_id) VALUES (6, 'Airport in Sydney',6);

INSERT INTO trip(origin_city_id, origin_airport_id, destination_city_id, destination_airport_id, destination_hotel_id, start_date, end_date, duration_time, adult_price, child_price, promoted, number_places_adults , number_places_children , destination_country_id , destination_continent_id)VALUES (1, 1, 2, 2, 2, '2023-07-1', '2023-07-8', 7, 3000, 2800, 1, 15, 10, 2 ,3);
INSERT INTO trip(origin_city_id, origin_airport_id, destination_city_id, destination_airport_id, destination_hotel_id, start_date, end_date, duration_time, adult_price, child_price, promoted, number_places_adults, number_places_children , destination_country_id , destination_continent_id)VALUES (1, 1, 3, 3, 3, '2023-07-9', '2023-07-9', 7, 3100, 2900, 0, 20, 11, 3, 1);
INSERT INTO trip(origin_city_id, origin_airport_id, destination_city_id, destination_airport_id, destination_hotel_id, start_date, end_date, duration_time, adult_price, child_price, promoted, number_places_adults, number_places_children , destination_country_id , destination_continent_id)values (1, 1, 4, 4, 4, '2023-07-10', '2023-07-10', 7, 3200, 3000, 1, 25, 12, 4, 3);
INSERT INTO trip(origin_city_id, origin_airport_id, destination_city_id, destination_airport_id, destination_hotel_id, start_date, end_date, duration_time, adult_price, child_price, promoted, number_places_adults, number_places_children , destination_country_id , destination_continent_id)VALUES (1, 1, 5, 5, 5, '2023-07-4', '2023-07-11', 7, 3300, 3100, 0, 30, 13, 5, 2);
INSERT INTO trip(origin_city_id, origin_airport_id, destination_city_id, destination_airport_id, destination_hotel_id, start_date, end_date, duration_time, adult_price, child_price, promoted, number_places_adults, number_places_children , destination_country_id , destination_continent_id)VALUES (1, 1, 6, 6, 6, '2023-07-5', '2023-07-12', 7, 3400, 3000, 1, 35, 15, 6, 4);
INSERT INTO trip(origin_city_id, origin_airport_id, destination_city_id, destination_airport_id, destination_hotel_id, start_date, end_date, duration_time, adult_price, child_price, promoted, number_places_adults, number_places_children , destination_country_id , destination_continent_id)VALUES (1, 1, 1, 1, 1, '2023-07-1', '2023-07-13', 7, 3500, 3000, 1, 20, 10, 1, 1);
INSERT INTO trip(origin_city_id, origin_airport_id, destination_city_id, destination_airport_id, destination_hotel_id, start_date, end_date, duration_time, adult_price, child_price, promoted, number_places_adults, number_places_children , destination_country_id , destination_continent_id)VALUES (1, 1, 2, 2, 2, '2023-07-1', '2023-07-14', 7, 3000, 2800, 0, 25, 12, 2, 3);