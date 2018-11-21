package com.zcts.parser;

import com.vaadin.server.VaadinService;
import com.zcts.parser.xml.SearchResult;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Parser {
    private List<Flight> result = new LinkedList<>();
    private SearchResult.References.Airlines airlines;
    private SearchResult.References.Airports airports;
    private long startTime;
    private long endTime;

    void parse(String fileName) {
        try {
            startTime = System.currentTimeMillis();
            JAXBContext jaxbContext = JAXBContext.newInstance(SearchResult.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            SearchResult res = (SearchResult) jaxbUnmarshaller.unmarshal(getFile(fileName));

            airlines = res.getReferences().getAirlines();
            airports = res.getReferences().getAirports();

            for (SearchResult.Offers.Item offer : res.getOffers().getItem()) {
                for (SearchResult.Offers.Item.Flights.FlightsItem flight : offer.getFlights().getItem()) {
                    result.add(new Flight(
                            flight.getCode(), // Код авиакомпании
                            flight.getOrigin(), // Аэропорт отправки
                            flight.getNum(), // Номер рейса
                            flight.getDepart(), // Время вылета
                            flight.getArrive(), // Время прилета
                            durationToString(flight.getDurationMS()), // Время в пути
                            offer.isIsCombined(), // Комбинированый
                            offer.isCharter(), // Чартерный
                            offer.getPrice() // Цена оффера
                    ));
                }
            }
            endTime = System.currentTimeMillis();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    List<Flight> getResult() {
        return result;
    }

    public List<SearchResult.References.Airlines.Item> getAirlines() {
        return airlines.getItem();
    }

    public List<SearchResult.References.Airports.Item> getAirports() {
        return airports.getItem();
    }

    public Long getParseTime() {
        return this.endTime - this.startTime;
    }

    private File getFile(String fileName) {
        String fileFolder = "\\WEB-INF\\classes\\";
        String applicationFolder = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();
        return new File(applicationFolder + fileFolder + fileName);
    }

    private String durationToString(Integer millis) {
        return String.format("%02d:%02d:%02d",
            TimeUnit.MILLISECONDS.toHours(millis),
            TimeUnit.MILLISECONDS.toMinutes(millis) -
                    TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis)),
            TimeUnit.MILLISECONDS.toSeconds(millis) -
                    TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis)));
    }
}
