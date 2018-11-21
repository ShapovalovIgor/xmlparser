package com.zcts.parser;

import com.vaadin.annotations.Theme;
import com.vaadin.data.HasValue;
import com.vaadin.data.provider.ListDataProvider;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;
import com.zcts.parser.xml.SearchResult;

@SuppressWarnings("serial")
@Theme("vaadinbutton")
public class MainUI extends UI {
    private Grid<Flight> grid = new Grid();
    private ComboBox<SearchResult.References.Airports.Item> airportsComboBox = new ComboBox();
    private ComboBox<SearchResult.References.Airlines.Item> airlinesComboBox = new ComboBox();

    @Override
    protected void init(VaadinRequest request) {
        VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);

        grid.setSizeFull();
        grid.setSelectionMode(Grid.SelectionMode.SINGLE);
        grid.addColumn(Flight::getCode).setCaption("Код авиакомпании");
        grid.addColumn(Flight::getNumber).setCaption("Номер рейса");
        grid.addColumn(Flight::getDepart).setCaption("Время вылета");
        grid.addColumn(Flight::getArrive).setCaption("Время прилета");
        grid.addColumn(Flight::getDuration).setCaption("Время в пути");
        grid.addColumn(Flight::getCombine).setCaption("Комбинированый");
        grid.addColumn(Flight::getCharter).setCaption("Чартерный");
        grid.addColumn(Flight::getPrice).setCaption("Цена оффера");

        Parser parser = new Parser();
        parser.parse("backend_xml_responce.xml");

        HorizontalLayout filterLayout = new HorizontalLayout();
        filterLayout.setMargin(true);

        filterLayout.addComponent(new Label("Аэропорты"));
        airportsComboBox.setItems(parser.getAirports());
        airportsComboBox.addValueChangeListener(this::onFilterChange);
        filterLayout.addComponent(airportsComboBox);

        filterLayout.addComponent(new Label("Авиакомпании"));
        airlinesComboBox.setItems(parser.getAirlines());
        airlinesComboBox.addValueChangeListener(this::onFilterChange);
        filterLayout.addComponent(airlinesComboBox);

        filterLayout.setHeight("50px");
        layout.addComponent(filterLayout);

        long startTime = System.currentTimeMillis();
        grid.setItems(parser.getResult());
        layout.addComponent(grid);
        long endTime = System.currentTimeMillis();

        layout.addComponent(new Label("время разбора XML файла : " + timeToString(parser.getParseTime()) + " сек."));
        layout.addComponent(new Label("время отработки скрипта вывода данных : " + timeToString(endTime - startTime) + " сек."));

        this.setContent(layout);
    }

    private void onFilterChange(HasValue.ValueChangeEvent event) {
        ListDataProvider<Flight> dataProvider = (ListDataProvider<Flight>) grid.getDataProvider();
        dataProvider.clearFilters();
        SearchResult.References.Airports.Item airport = airportsComboBox.getValue();
        SearchResult.References.Airlines.Item airline = airlinesComboBox.getValue();
        dataProvider.setFilter( flight -> (airport == null || flight.getAirport().equals(airport.getCode())) &&
                                          (airline == null || flight.getCode().equals(airline.getCode()))
        );
        dataProvider.refreshAll();
    }

    private String timeToString(Long time) {
        return String.format("%.3f",  time / 1000.0);
    }
}