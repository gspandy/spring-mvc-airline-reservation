insert into airdb.location values (1,'JFK','John F Kennedy Intl','New York', 'USA');
insert into airdb.location values (2,'SFO','San Francisco International','San Francisco', 'USA');
insert into airdb.location values (3,'LHR','London Heathrow','London', 'UK');
insert into airdb.location values (4,'CDG','Charles De Gaulle','Paris', 'FR');

insert into airdb.flights (airline, start_airport, start_time, end_airport, end_time, stops,return_start_airport,return_start_time,return_end_airport,return_end_time,return_stops,	price) values ('DELTA', 'JFK', '9.35AM', 'LHR', '1.35PM', 1, 'LHR', '9.35AM', 'JFK', '1.35PM', 0,1200);
insert into airdb.flights (airline, start_airport, start_time, end_airport, end_time, stops,return_start_airport,return_start_time,return_end_airport,return_end_time,return_stops,	price) values ('US AIR','JFK', '11.35AM', 'LHR','3.35PM', 1, 'LHR', '11.35AM', 'JFK', '1.35PM', 0,1450);
insert into airdb.flights (airline, start_airport, start_time, end_airport, end_time, stops,return_start_airport,return_start_time,return_end_airport,return_end_time,return_stops,	price) values ('CONTINENTAL','JFK', '12.35PM','LHR','7.35PM', 2, 'LHR', '7.35AM', 'JFK', '6.35PM', 2,1300);	

insert into airdb.flights (airline, start_airport, start_time, end_airport, end_time, stops,return_start_airport,return_start_time,return_end_airport,return_end_time,return_stops,	price) values ('DELTA', 'SFO', '9.35AM', 'LHR', '1.35PM', 1, 'LHR', '9.35AM', 'SFO', '1.35PM', 0,1110);
insert into airdb.flights (airline, start_airport, start_time, end_airport, end_time, stops,return_start_airport,return_start_time,return_end_airport,return_end_time,return_stops,	price) values ('US AIR','SFO', '11.35AM', 'LHR','3.35PM', 1, 'LHR', '11.35AM', 'SFO', '1.35PM', 0,1220);
insert into airdb.flights (airline, start_airport, start_time, end_airport, end_time, stops,return_start_airport,return_start_time,return_end_airport,return_end_time,return_stops,	price) values ('CONTINENTAL','SFO', '12.35PM','LHR','7.35PM', 2, 'LHR', '7.35AM', 'SFO', '6.35PM', 2,1330);	

insert into airdb.flights (airline, start_airport, start_time, end_airport, end_time, stops,return_start_airport,return_start_time,return_end_airport,return_end_time,return_stops,	price) values ('DELTA', 'JFK', '9.35AM', 'CDG', '1.35PM', 1, 'CDG', '9.35AM', 'JFK', '1.35PM', 0,1200);
insert into airdb.flights (airline, start_airport, start_time, end_airport, end_time, stops,return_start_airport,return_start_time,return_end_airport,return_end_time,return_stops,	price) values ('US AIR','JFK', '11.35AM', 'CDG','3.35PM', 1, 'CDG', '11.35AM', 'JFK', '1.35PM', 0,1450);
insert into airdb.flights (airline, start_airport, start_time, end_airport, end_time, stops,return_start_airport,return_start_time,return_end_airport,return_end_time,return_stops,	price) values ('CONTINENTAL','JFK', '12.35PM','CDG','7.35PM', 2, 'CDG', '7.35AM', 'JFK', '6.35PM', 2,1300);	

insert into airdb.flights (airline, start_airport, start_time, end_airport, end_time, stops,return_start_airport,return_start_time,return_end_airport,return_end_time,return_stops,	price) values ('DELTA', 'SFO', '9.35AM', 'CDG', '1.35PM', 1, 'CDG', '9.35AM', 'SFO', '1.35PM', 0,1110);
insert into airdb.flights (airline, start_airport, start_time, end_airport, end_time, stops,return_start_airport,return_start_time,return_end_airport,return_end_time,return_stops,	price) values ('US AIR','SFO', '11.35AM', 'CDG','3.35PM', 1, 'CDG', '11.35AM', 'SFO', '1.35PM', 0,1220);
insert into airdb.flights (airline, start_airport, start_time, end_airport, end_time, stops,return_start_airport,return_start_time,return_end_airport,return_end_time,return_stops,	price) values ('CONTINENTAL','SFO', '12.35PM','CDG','7.35PM', 2, 'CDG', '7.35AM', 'SFO', '6.35PM', 2,1330);	

insert into airdb.flights (airline, start_airport, start_time, end_airport, end_time, stops,return_start_airport,return_start_time,return_end_airport,return_end_time,return_stops,	price) values ('DELTA', 'JFK', '9.35AM', 'SFO', '1.35PM', 1, 'SFO', '4.35PM', 'JFK', '10.35PM', 0,1110);
insert into airdb.flights (airline, start_airport, start_time, end_airport, end_time, stops,return_start_airport,return_start_time,return_end_airport,return_end_time,return_stops,	price) values ('US AIR','JFK', '10.15AM', 'SFO','2.35PM', 1, 'SFO', '5.35PM', 'JFK', '11.35PM', 0,1220);
insert into airdb.flights (airline, start_airport, start_time, end_airport, end_time, stops,return_start_airport,return_start_time,return_end_airport,return_end_time,return_stops,	price) values ('CONTINENTAL','JFK', '11.15AM','SFO','4.35PM', 2, 'SFO', '7.35AM', 'JFK', '6.35PM', 2,1330);	
insert into airdb.flights (airline, start_airport, start_time, end_airport, end_time, stops,return_start_airport,return_start_time,return_end_airport,return_end_time,return_stops,	price) values ('JET AIR', 'JFK', '12.28PM', 'SFO', '5.35PM', 1, 'SFO', '9.35AM', 'JFK', '1.35PM', 0,1110);
insert into airdb.flights (airline, start_airport, start_time, end_airport, end_time, stops,return_start_airport,return_start_time,return_end_airport,return_end_time,return_stops,	price) values ('BRITISH AIR','JFK', '2.48AM', 'SFO','6.35PM', 1, 'SFO', '11.35AM', 'JFK', '1.35PM', 0,1220);
insert into airdb.flights (airline, start_airport, start_time, end_airport, end_time, stops,return_start_airport,return_start_time,return_end_airport,return_end_time,return_stops,	price) values ('LUFTHANSA','JFK', '4.36PM','SFO','7.35PM', 2, 'SFO', '7.35AM', 'JFK', '6.35PM', 2,1330);	

insert into airdb.deals (location_code, price, discount, event, dates, place) values ('LHR', 299, 25, '<a href="http://www.london2012.com/archery/schedule-and-results/index.html" target="_blank">Athletics</a>', 'August 3 to August 12', 'London, United Kingdom');
insert into airdb.deals (location_code, price, discount, event, dates, place) values ('LHR', 399, 15, '<a href="http://www.london2012.com/basketball/schedule-and-results/index.html" target="_blank">BasketBall</a>', 'July 25 to August 13', 'London, United Kingdom');
insert into airdb.deals (location_code, price, discount, event, dates, place) values ('LHR', 111, 11, '<a href="http://www.london2012.com/diving/schedule-and-results/index.html" target="_blank">Diving</a>', 'August 1 to August 7', 'London, United Kingdom');
insert into airdb.deals (location_code, price, discount, event, dates, place) values ('LHR', 222, 12, '<a href="http://www.london2012.com/beach-volleyball/schedule-and-results/index.html" target="_blank">Beach Volleyball</a>', 'August 15 to August 16', 'London, United Kingdom');
insert into airdb.deals (location_code, price, discount, event, dates, place) values ('LHR', 333, 13, '<a href="http://www.london2012.com/boxing/schedule-and-results/index.html" target="_blank">Boxing</a>', 'August 13 to August 16', 'London, United Kingdom');
insert into airdb.deals (location_code, price, discount, event, dates, place) values ('LHR', 444, 14, '<a href="http://www.london2012.com/football/schedule-and-results/index.html" target="_blank">Football</a>', 'August 12 to August 16', 'London, United Kingdom');

insert into airdb.deals (location_code, price, discount, event, dates, place) values ('CDG', 150, 15, 'Cycling', 'August 1 to August 6', 'Paris, France');
insert into airdb.deals (location_code, price, discount, event, dates, place) values ('CDG', 250, 16, 'Diving', 'July 29 to August 3', 'Paris, France');
insert into airdb.deals (location_code, price, discount, event, dates, place) values ('CDG', 350, 11, 'Equestrian', 'August 3 to August 7', 'Paris, France');
insert into airdb.deals (location_code, price, discount, event, dates, place) values ('CDG', 175, 12, 'Fencing', 'August 5 to August 10', 'Paris, France');
insert into airdb.deals (location_code, price, discount, event, dates, place) values ('CDG', 185, 13, 'Gymnastics', 'August 11 to August 21', 'Paris, France');
insert into airdb.deals (location_code, price, discount, event, dates, place) values ('CDG', 495, 14, 'Judo', 'August 12 to August 16', 'Paris, France');

insert into airdb.deals (location_code, price, discount, event, dates, place) values ('SFO', 310.99, 5, 'Marin Headlands', 'August 1 to August 6', 'San Francisco, USA');
insert into airdb.deals (location_code, price, discount, event, dates, place) values ('SFO', 21.990, 6, 'Marrakech Magic Theater', 'July 29 to August 3', 'San Francisco, USA');
insert into airdb.deals (location_code, price, discount, event, dates, place) values ('SFO', 110.99, 7, 'Golden Gate Bridge', 'August 3 to August 7', 'San Francisco, USA');
insert into airdb.deals (location_code, price, discount, event, dates, place) values ('SFO', 155.99, 8, 'Alcatraz', 'August 5 to August 10', 'San Francisco, USA');
insert into airdb.deals (location_code, price, discount, event, dates, place) values ('SFO', 365.99, 9, 'San Francisco Bay', 'August 11 to August 21', 'San Francisco, USA');
insert into airdb.deals (location_code, price, discount, event, dates, place) values ('SFO', 345.99, 10, 'Lands End', 'August 12 to August 16', 'San Francisco, USA');
