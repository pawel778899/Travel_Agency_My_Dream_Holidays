INSERT INTO continent (id, name) VALUES (1, 'Europe');
INSERT INTO continent (id, name) VALUES (2, 'Asia');
INSERT INTO continent (id, name) VALUES (3, 'Africa');
INSERT INTO continent (id, name) VALUES (4, 'Australia');
INSERT INTO continent (id, name) VALUES (5, 'North America');
INSERT INTO continent (id, name) VALUES (6, 'South America');
INSERT INTO continent (id, name) VALUES (7, 'Antarctica');

INSERT INTO country (id, name, continent_id) VALUES (1, 'Spain',1);
INSERT INTO country (id, name, continent_id) VALUES (2, 'Japan', 2);
INSERT INTO country (id, name, continent_id) VALUES (3, 'Egypt', 3);
INSERT INTO country (id, name, continent_id) VALUES (4, 'Australia (Country)', 4);
INSERT INTO country (id, name, continent_id) VALUES (5, 'USA', 5);
INSERT INTO country (id, name, continent_id) VALUES (6, 'Argentina', 6);
INSERT INTO country (id, name, continent_id) VALUES (7, 'Country in Antarctica', 7);
INSERT INTO country (id, name, continent_id) VALUES (8, 'Poland',1);

INSERT INTO city (id, name, country_id) VALUES (1, 'Barcelona', 1);
INSERT INTO city (id, name, country_id) VALUES (2, 'Tokyo', 2);
INSERT INTO city (id, name, country_id) VALUES (3, 'Marsa Alam', 3);
INSERT INTO city (id, name, country_id) VALUES (4, 'Sydney', 4);
INSERT INTO city (id, name, country_id) VALUES (5, 'New York', 5);
INSERT INTO city (id, name, country_id) VALUES (6, 'Buenos Aires', 6);
INSERT INTO city (id, name, country_id) VALUES (7, 'City in Antarctica', 7);
INSERT INTO city (id, name, country_id) VALUES (8, 'Warsaw', 1);

INSERT INTO hotel (id, name, standard, description, city_id) values (1, 'Hotel in Barcelona', 3, 'Description: Medium hotel', 1);
INSERT INTO hotel (id, name, standard, description, city_id) values (2, 'Hotel in Tokyo', 3, 'Description: Medium hotel', 2);
INSERT INTO hotel (id, name, standard, description, city_id) values (3, 'Hotel in Marsa Alam', 5, 'Description: Excellent hotel', 3);
INSERT INTO hotel (id, name, standard, description, city_id) values (4, 'Hotel in Sydney', 3, 'Description: Medium hotel', 4);
INSERT INTO hotel (id, name, standard, description, city_id) values (5, 'Hotel in New York', 4, 'Description: Beautiful hotel', 5);
INSERT INTO hotel (id, name, standard, description, city_id) values (6, 'Hotel in Buenos Aires', 5, 'Description: Excellent hotel', 6);
INSERT INTO hotel (id, name, standard, description, city_id) values (7, 'Hotel in City in Antarctica', 3, 'Description: Medium hotel', 7);
INSERT INTO hotel (id, name, standard, description, city_id) values (8, 'Hotel in Warsaw', 4, 'Description: Beautiful hotel', 8);

INSERT INTO airport (id, name, city_id) VALUES (1, 'Airport in Barcelona',1);
INSERT INTO airport (id, name, city_id) VALUES (2, 'Airport in Tokyo',2);
INSERT INTO airport (id, name, city_id) VALUES (3, 'Airport in Marsa Alam',3);
INSERT INTO airport (id, name, city_id) VALUES (4, 'Airport in Sydney',4);
INSERT INTO airport (id, name, city_id) VALUES (5, 'Airport in New York',5);
INSERT INTO airport (id, name, city_id) VALUES (6, 'Airport in Buenos Aires',6);
INSERT INTO airport (id, name, city_id) VALUES (7, 'Airport in Antarctica',7);
INSERT INTO airport (id, name, city_id) VALUES (8, 'Airport in Wasaw',8);

INSERT INTO trip(origin_city_id, origin_airport_id, destination_city_id, destination_country_id , destination_continent_id, destination_airport_id, destination_hotel_id, start_date, end_date, duration_time, adult_price, child_price, promoted, number_places_adults , number_places_children)VALUES (8, 8, 1, 1, 1, 1, 1, '2023-07-1', '2023-07-9', 8, 3000, 2900, 1, 25, 15);
INSERT INTO trip(origin_city_id, origin_airport_id, destination_city_id, destination_country_id , destination_continent_id, destination_airport_id, destination_hotel_id, start_date, end_date, duration_time, adult_price, child_price, promoted, number_places_adults , number_places_children)VALUES (8, 8, 2, 2, 2, 2, 2, '2023-07-1', '2023-07-16', 15, 3200, 3000, 0, 40, 14);
INSERT INTO trip(origin_city_id, origin_airport_id, destination_city_id, destination_country_id , destination_continent_id, destination_airport_id, destination_hotel_id, start_date, end_date, duration_time, adult_price, child_price, promoted, number_places_adults , number_places_children)VALUES (8, 8, 3, 3, 3, 3, 3, '2023-07-1', '2023-07-9', 8, 3100, 2800, 0, 30, 20);
INSERT INTO trip(origin_city_id, origin_airport_id, destination_city_id, destination_country_id , destination_continent_id, destination_airport_id, destination_hotel_id, start_date, end_date, duration_time, adult_price, child_price, promoted, number_places_adults , number_places_children)VALUES (8, 8, 4, 4, 4, 4, 4, '2023-07-1', '2023-07-16', 15, 3500, 2500, 1, 20, 10);
INSERT INTO trip(origin_city_id, origin_airport_id, destination_city_id, destination_country_id , destination_continent_id, destination_airport_id, destination_hotel_id, start_date, end_date, duration_time, adult_price, child_price, promoted, number_places_adults , number_places_children)VALUES (8, 8, 5, 5, 5, 5, 5, '2023-07-2', '2023-07-17', 15, 3600, 2900, 1, 25, 15);
INSERT INTO trip(origin_city_id, origin_airport_id, destination_city_id, destination_country_id , destination_continent_id, destination_airport_id, destination_hotel_id, start_date, end_date, duration_time, adult_price, child_price, promoted, number_places_adults , number_places_children)VALUES (8, 8, 6, 6, 6, 6, 6, '2023-07-3', '2023-07-11', 8, 3300, 2700, 0, 30, 17);
INSERT INTO trip(origin_city_id, origin_airport_id, destination_city_id, destination_country_id , destination_continent_id, destination_airport_id, destination_hotel_id, start_date, end_date, duration_time, adult_price, child_price, promoted, number_places_adults , number_places_children)VALUES (8, 8, 7, 7, 7, 7, 7, '2023-07-1', '2023-07-9', 8, 3800, 2800, 1, 20, 18);
INSERT INTO trip(origin_city_id, origin_airport_id, destination_city_id, destination_country_id , destination_continent_id, destination_airport_id, destination_hotel_id, start_date, end_date, duration_time, adult_price, child_price, promoted, number_places_adults , number_places_children)VALUES (8, 8, 1, 1, 1, 1, 1, '2023-07-10', '2023-07-18', 8, 3000, 2900, 1, 25, 15);
INSERT INTO trip(origin_city_id, origin_airport_id, destination_city_id, destination_country_id , destination_continent_id, destination_airport_id, destination_hotel_id, start_date, end_date, duration_time, adult_price, child_price, promoted, number_places_adults , number_places_children)VALUES (8, 8, 2, 2, 2, 2, 2, '2023-07-11', '2023-07-26', 15, 3200, 3000, 0, 40, 14);
INSERT INTO trip(origin_city_id, origin_airport_id, destination_city_id, destination_country_id , destination_continent_id, destination_airport_id, destination_hotel_id, start_date, end_date, duration_time, adult_price, child_price, promoted, number_places_adults , number_places_children)VALUES (8, 8, 3, 3, 3, 3, 3, '2023-07-12', '2023-07-20', 8, 3100, 2800, 0, 30, 20);
INSERT INTO trip(origin_city_id, origin_airport_id, destination_city_id, destination_country_id , destination_continent_id, destination_airport_id, destination_hotel_id, start_date, end_date, duration_time, adult_price, child_price, promoted, number_places_adults , number_places_children)VALUES (8, 8, 4, 4, 4, 4, 4, '2023-07-13', '2023-07-28', 15, 3500, 2500, 1, 20, 10);
INSERT INTO trip(origin_city_id, origin_airport_id, destination_city_id, destination_country_id , destination_continent_id, destination_airport_id, destination_hotel_id, start_date, end_date, duration_time, adult_price, child_price, promoted, number_places_adults , number_places_children)VALUES (8, 8, 5, 5, 5, 5, 5, '2023-07-14', '2023-07-29', 15, 3600, 2900, 1, 25, 15);
INSERT INTO trip(origin_city_id, origin_airport_id, destination_city_id, destination_country_id , destination_continent_id, destination_airport_id, destination_hotel_id, start_date, end_date, duration_time, adult_price, child_price, promoted, number_places_adults , number_places_children)VALUES (8, 8, 6, 6, 6, 6, 6, '2023-07-15', '2023-07-23', 8, 3300, 2700, 0, 30, 17);
INSERT INTO trip(origin_city_id, origin_airport_id, destination_city_id, destination_country_id , destination_continent_id, destination_airport_id, destination_hotel_id, start_date, end_date, duration_time, adult_price, child_price, promoted, number_places_adults , number_places_children)VALUES (8, 8, 7, 7, 7, 7, 7, '2023-07-16', '2023-07-24', 8, 3800, 2800, 1, 20, 18);
INSERT INTO trip(origin_city_id, origin_airport_id, destination_city_id, destination_country_id , destination_continent_id, destination_airport_id, destination_hotel_id, start_date, end_date, duration_time, adult_price, child_price, promoted, number_places_adults , number_places_children)VALUES (8, 8, 1, 1, 1, 1, 1, '2023-08-1', '2023-08-9', 8, 3000, 2900, 1, 25, 15);
INSERT INTO trip(origin_city_id, origin_airport_id, destination_city_id, destination_country_id , destination_continent_id, destination_airport_id, destination_hotel_id, start_date, end_date, duration_time, adult_price, child_price, promoted, number_places_adults , number_places_children)VALUES (8, 8, 2, 2, 2, 2, 2, '2023-08-1', '2023-08-16', 15, 3200, 3000, 0, 40, 14);
INSERT INTO trip(origin_city_id, origin_airport_id, destination_city_id, destination_country_id , destination_continent_id, destination_airport_id, destination_hotel_id, start_date, end_date, duration_time, adult_price, child_price, promoted, number_places_adults , number_places_children)VALUES (8, 8, 3, 3, 3, 3, 3, '2023-08-1', '2023-08-9', 8, 3100, 2800, 0, 30, 20);
INSERT INTO trip(origin_city_id, origin_airport_id, destination_city_id, destination_country_id , destination_continent_id, destination_airport_id, destination_hotel_id, start_date, end_date, duration_time, adult_price, child_price, promoted, number_places_adults , number_places_children)VALUES (8, 8, 4, 4, 4, 4, 4, '2023-08-1', '2023-08-16', 15, 3500, 2500, 1, 20, 10);
INSERT INTO trip(origin_city_id, origin_airport_id, destination_city_id, destination_country_id , destination_continent_id, destination_airport_id, destination_hotel_id, start_date, end_date, duration_time, adult_price, child_price, promoted, number_places_adults , number_places_children)VALUES (8, 8, 5, 5, 5, 5, 5, '2023-08-2', '2023-08-17', 15, 3600, 2900, 1, 25, 15);
INSERT INTO trip(origin_city_id, origin_airport_id, destination_city_id, destination_country_id , destination_continent_id, destination_airport_id, destination_hotel_id, start_date, end_date, duration_time, adult_price, child_price, promoted, number_places_adults , number_places_children)VALUES (8, 8, 6, 6, 6, 6, 6, '2023-08-3', '2023-08-11', 8, 3300, 2700, 0, 30, 17);
INSERT INTO trip(origin_city_id, origin_airport_id, destination_city_id, destination_country_id , destination_continent_id, destination_airport_id, destination_hotel_id, start_date, end_date, duration_time, adult_price, child_price, promoted, number_places_adults , number_places_children)VALUES (8, 8, 7, 7, 7, 7, 7, '2023-08-1', '2023-08-9', 8, 3800, 2800, 1, 20, 18);
INSERT INTO trip(origin_city_id, origin_airport_id, destination_city_id, destination_country_id , destination_continent_id, destination_airport_id, destination_hotel_id, start_date, end_date, duration_time, adult_price, child_price, promoted, number_places_adults , number_places_children)VALUES (8, 8, 1, 1, 1, 1, 1, '2023-08-10', '2023-08-18', 8, 3000, 2900, 1, 25, 15);
INSERT INTO trip(origin_city_id, origin_airport_id, destination_city_id, destination_country_id , destination_continent_id, destination_airport_id, destination_hotel_id, start_date, end_date, duration_time, adult_price, child_price, promoted, number_places_adults , number_places_children)VALUES (8, 8, 2, 2, 2, 2, 2, '2023-08-11', '2023-08-26', 15, 3200, 3000, 0, 40, 14);
INSERT INTO trip(origin_city_id, origin_airport_id, destination_city_id, destination_country_id , destination_continent_id, destination_airport_id, destination_hotel_id, start_date, end_date, duration_time, adult_price, child_price, promoted, number_places_adults , number_places_children)VALUES (8, 8, 3, 3, 3, 3, 3, '2023-08-12', '2023-08-20', 8, 3100, 2800, 0, 30, 20);
INSERT INTO trip(origin_city_id, origin_airport_id, destination_city_id, destination_country_id , destination_continent_id, destination_airport_id, destination_hotel_id, start_date, end_date, duration_time, adult_price, child_price, promoted, number_places_adults , number_places_children)VALUES (8, 8, 4, 4, 4, 4, 4, '2023-08-13', '2023-08-28', 15, 3500, 2500, 1, 20, 10);
INSERT INTO trip(origin_city_id, origin_airport_id, destination_city_id, destination_country_id , destination_continent_id, destination_airport_id, destination_hotel_id, start_date, end_date, duration_time, adult_price, child_price, promoted, number_places_adults , number_places_children)VALUES (8, 8, 5, 5, 5, 5, 5, '2023-08-14', '2023-08-29', 15, 3600, 2900, 1, 25, 15);
INSERT INTO trip(origin_city_id, origin_airport_id, destination_city_id, destination_country_id , destination_continent_id, destination_airport_id, destination_hotel_id, start_date, end_date, duration_time, adult_price, child_price, promoted, number_places_adults , number_places_children)VALUES (8, 8, 6, 6, 6, 6, 6, '2023-08-15', '2023-08-23', 8, 3300, 2700, 0, 30, 17);
INSERT INTO trip(origin_city_id, origin_airport_id, destination_city_id, destination_country_id , destination_continent_id, destination_airport_id, destination_hotel_id, start_date, end_date, duration_time, adult_price, child_price, promoted, number_places_adults , number_places_children)VALUES (8, 8, 7, 7, 7, 7, 7, '2023-08-16', '2023-08-24', 8, 3800, 2800, 1, 20, 18);