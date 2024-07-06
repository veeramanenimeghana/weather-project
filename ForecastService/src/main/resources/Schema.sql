

CREATE TABLE Forecast (
    forecastId BIGINT PRIMARY KEY,
    date VARCHAR(255),
    forecast VARCHAR(255)
    );
    
    INSERT INTO Forecast Values(1,"02-02-2024","Precipitation: 22% ,Humidity: 56% ,Wind: 28km/h");
    INSERT INTO Forecast Values(2,"03-02-2024","Precipitation: 26% ,Humidity: 56% ,Wind: 48km/h");
    INSERT INTO Forecast Values(3,"03-02-2024","Precipitation: 92% ,Humidity: 76% ,Wind: 28km/h");