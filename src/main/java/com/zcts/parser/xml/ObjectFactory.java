
package com.zcts.parser.xml;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchResult }
     * 
     */
    public SearchResult createSearchResult() {
        return new SearchResult();
    }

    /**
     * Create an instance of {@link SearchResult.Offers }
     * 
     */
    public SearchResult.Offers createSearchResultOffers() {
        return new SearchResult.Offers();
    }

    /**
     * Create an instance of {@link SearchResult.Offers.Item }
     * 
     */
    public SearchResult.Offers.Item createSearchResultOffersItem() {
        return new SearchResult.Offers.Item();
    }

    /**
     * Create an instance of {@link SearchResult.Offers.Item.Flights }
     * 
     */
    public SearchResult.Offers.Item.Flights createSearchResultOffersItemFlights() {
        return new SearchResult.Offers.Item.Flights();
    }

    /**
     * Create an instance of {@link SearchResult.Matrix }
     * 
     */
    public SearchResult.Matrix createSearchResultMatrix() {
        return new SearchResult.Matrix();
    }

    /**
     * Create an instance of {@link SearchResult.Matrix.Item }
     * 
     */
    public SearchResult.Matrix.Item createSearchResultMatrixItem() {
        return new SearchResult.Matrix.Item();
    }

    /**
     * Create an instance of {@link SearchResult.Matrix.Item.Flights }
     * 
     */
    public SearchResult.Matrix.Item.Flights createSearchResultMatrixItemFlights() {
        return new SearchResult.Matrix.Item.Flights();
    }

    /**
     * Create an instance of {@link SearchResult.Matrix.Item.Flights.FlightsItem }
     * 
     */
    public SearchResult.Matrix.Item.Flights.FlightsItem createSearchResultMatrixItemFlightsItem() {
        return new SearchResult.Matrix.Item.Flights.FlightsItem();
    }

    /**
     * Create an instance of {@link SearchResult.References }
     * 
     */
    public SearchResult.References createSearchResultReferences() {
        return new SearchResult.References();
    }

    /**
     * Create an instance of {@link SearchResult.References.Airlines }
     * 
     */
    public SearchResult.References.Airlines createSearchResultReferencesAirlines() {
        return new SearchResult.References.Airlines();
    }

    /**
     * Create an instance of {@link SearchResult.References.Airports }
     * 
     */
    public SearchResult.References.Airports createSearchResultReferencesAirports() {
        return new SearchResult.References.Airports();
    }

    /**
     * Create an instance of {@link SearchResult.Request }
     * 
     */
    public SearchResult.Request createSearchResultRequest() {
        return new SearchResult.Request();
    }

    /**
     * Create an instance of {@link SearchResult.Offers.Item.Flights.FlightsItem }
     * 
     */
    public SearchResult.Offers.Item.Flights.FlightsItem createSearchResultOffersItemFlightsItem() {
        return new SearchResult.Offers.Item.Flights.FlightsItem();
    }

    /**
     * Create an instance of {@link SearchResult.Matrix.Item.Flights.FlightsItem.Segment }
     * 
     */
    public SearchResult.Matrix.Item.Flights.FlightsItem.Segment createSearchResultMatrixItemFlightsItemSegment() {
        return new SearchResult.Matrix.Item.Flights.FlightsItem.Segment();
    }

    /**
     * Create an instance of {@link SearchResult.References.Airlines.Item }
     * 
     */
    public SearchResult.References.Airlines.Item createSearchResultReferencesAirlinesItem() {
        return new SearchResult.References.Airlines.Item();
    }

    /**
     * Create an instance of {@link SearchResult.References.Airports.Item }
     * 
     */
    public SearchResult.References.Airports.Item createSearchResultReferencesAirportsItem() {
        return new SearchResult.References.Airports.Item();
    }

}
