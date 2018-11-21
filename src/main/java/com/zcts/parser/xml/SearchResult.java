
package com.zcts.parser.xml;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="References">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Airports">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Item" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Lat" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="Lng" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="Country" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="City" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Airlines">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Item" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Matrix">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Item">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Flights">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Item" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Segment">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="AviaCompany" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="BookingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="BookingCounts" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                                                         &lt;attribute name="DestinationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="Fare" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                                         &lt;attribute name="Group" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                                         &lt;attribute name="id_Segment" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                                         &lt;attribute name="Key" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                                         &lt;attribute name="OriginCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="IsConnection" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                         &lt;attribute name="ProviderCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="FareName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Num" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                               &lt;attribute name="Origin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Depart" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                                               &lt;attribute name="Arrive" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                                               &lt;attribute name="Leg" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Route" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="DurationMS" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                               &lt;attribute name="Airplane" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Sys" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                               &lt;attribute name="SystemAccessId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                               &lt;attribute name="OrderNum" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                               &lt;attribute name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                               &lt;attribute name="BookingClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="OperatingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="CharterVariantId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                               &lt;attribute name="Places" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                               &lt;attribute name="PlacesCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="TechStopCount" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                               &lt;attribute name="Confirmed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="Sign" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="IsCombined" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="ValidatorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="tariff_adult" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="charter" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="IsCharterSpecFare" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="DirectionType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Offers">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Item" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Flights">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Item" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="FareName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Num" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                               &lt;attribute name="Origin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Depart" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                                               &lt;attribute name="Arrive" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                                               &lt;attribute name="Leg" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Route" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="DurationMS" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                               &lt;attribute name="Airplane" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Sys" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                               &lt;attribute name="SystemAccessId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                               &lt;attribute name="OrderNum" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                               &lt;attribute name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                               &lt;attribute name="BookingClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="OperatingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="CharterVariantId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                               &lt;attribute name="Places" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                               &lt;attribute name="PlacesCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="TechStopCount" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                               &lt;attribute name="Confirmed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="Sign" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="IsCombined" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="ValidatorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="tariff_adult" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="charter" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="IsCharterSpecFare" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="DirectionType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="HotelVaucher" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Request">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Fare" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "references",
    "matrix",
    "offers",
    "request"
})
@XmlRootElement(name = "SearchResult")
public class SearchResult {

    @XmlElement(name = "References", required = true)
    protected SearchResult.References references;
    @XmlElement(name = "Matrix", required = true)
    protected SearchResult.Matrix matrix;
    @XmlElement(name = "Offers", required = true)
    protected SearchResult.Offers offers;
    @XmlElement(name = "Request", required = true)
    protected SearchResult.Request request;

    /**
     * Gets the value of the references property.
     *
     * @return
     *     possible object is
     *     {@link SearchResult.References }
     *
     */
    public SearchResult.References getReferences() {
        return references;
    }

    /**
     * Sets the value of the references property.
     *
     * @param value
     *     allowed object is
     *     {@link SearchResult.References }
     *
     */
    public void setReferences(SearchResult.References value) {
        this.references = value;
    }

    /**
     * Gets the value of the matrix property.
     *
     * @return
     *     possible object is
     *     {@link SearchResult.Matrix }
     *
     */
    public SearchResult.Matrix getMatrix() {
        return matrix;
    }

    /**
     * Sets the value of the matrix property.
     *
     * @param value
     *     allowed object is
     *     {@link SearchResult.Matrix }
     *
     */
    public void setMatrix(SearchResult.Matrix value) {
        this.matrix = value;
    }

    /**
     * Gets the value of the offers property.
     *
     * @return
     *     possible object is
     *     {@link SearchResult.Offers }
     *
     */
    public SearchResult.Offers getOffers() {
        return offers;
    }

    /**
     * Sets the value of the offers property.
     *
     * @param value
     *     allowed object is
     *     {@link SearchResult.Offers }
     *
     */
    public void setOffers(SearchResult.Offers value) {
        this.offers = value;
    }

    /**
     * Gets the value of the request property.
     *
     * @return
     *     possible object is
     *     {@link SearchResult.Request }
     *
     */
    public SearchResult.Request getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     *
     * @param value
     *     allowed object is
     *     {@link SearchResult.Request }
     *
     */
    public void setRequest(SearchResult.Request value) {
        this.request = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Item">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Flights">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Item" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Segment">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="AviaCompany" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="BookingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="BookingCounts" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                                               &lt;attribute name="DestinationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="Fare" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                               &lt;attribute name="Group" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                               &lt;attribute name="id_Segment" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                               &lt;attribute name="Key" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                               &lt;attribute name="OriginCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="IsConnection" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                               &lt;attribute name="ProviderCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="FareName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Num" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="Origin" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Depart" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                                     &lt;attribute name="Arrive" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                                     &lt;attribute name="Leg" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Route" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="DurationMS" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="Airplane" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Sys" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="SystemAccessId" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="OrderNum" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="BookingClass" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="OperatingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="CharterVariantId" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="Places" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="PlacesCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="TechStopCount" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="Confirmed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="Sign" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="IsCombined" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="ValidatorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="tariff_adult" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="charter" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="IsCharterSpecFare" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="DirectionType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class Matrix {

        @XmlElement(name = "Item", required = true)
        protected SearchResult.Matrix.Item item;

        /**
         * Gets the value of the item property.
         *
         * @return
         *     possible object is
         *     {@link SearchResult.Matrix.Item }
         *
         */
        public SearchResult.Matrix.Item getItem() {
            return item;
        }

        /**
         * Sets the value of the item property.
         *
         * @param value
         *     allowed object is
         *     {@link SearchResult.Matrix.Item }
         *
         */
        public void setItem(SearchResult.Matrix.Item value) {
            this.item = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Flights">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Item" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Segment">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="AviaCompany" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="BookingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="BookingCounts" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *                                     &lt;attribute name="DestinationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="Fare" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                                     &lt;attribute name="Group" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                                     &lt;attribute name="id_Segment" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                                     &lt;attribute name="Key" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                                     &lt;attribute name="OriginCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="IsConnection" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                     &lt;attribute name="ProviderCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="FareName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Num" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="Origin" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Depart" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *                           &lt;attribute name="Arrive" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *                           &lt;attribute name="Leg" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Route" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="DurationMS" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="Airplane" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Sys" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="SystemAccessId" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="OrderNum" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="BookingClass" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="OperatingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="CharterVariantId" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="Places" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="PlacesCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="TechStopCount" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="Confirmed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="Sign" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="IsCombined" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="ValidatorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="tariff_adult" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="charter" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="IsCharterSpecFare" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="DirectionType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "flights"
        })
        public static class Item {

            @XmlElement(name = "Flights", required = true)
            protected SearchResult.Matrix.Item.Flights flights;
            @XmlAttribute(name = "Price")
            protected String price;
            @XmlAttribute(name = "IsCombined")
            protected Boolean isCombined;
            @XmlAttribute(name = "ValidatorCode")
            protected String validatorCode;
            @XmlAttribute(name = "tariff_adult")
            protected Integer tariffAdult;
            @XmlAttribute(name = "charter")
            protected Boolean charter;
            @XmlAttribute(name = "IsCharterSpecFare")
            protected Boolean isCharterSpecFare;
            @XmlAttribute(name = "DirectionType")
            protected String directionType;

            /**
             * Gets the value of the flights property.
             *
             * @return
             *     possible object is
             *     {@link SearchResult.Matrix.Item.Flights }
             *
             */
            public SearchResult.Matrix.Item.Flights getFlights() {
                return flights;
            }

            /**
             * Sets the value of the flights property.
             *
             * @param value
             *     allowed object is
             *     {@link SearchResult.Matrix.Item.Flights }
             *
             */
            public void setFlights(SearchResult.Matrix.Item.Flights value) {
                this.flights = value;
            }

            /**
             * Gets the value of the price property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getPrice() {
                return price;
            }

            /**
             * Sets the value of the price property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPrice(String value) {
                this.price = value;
            }

            /**
             * Gets the value of the isCombined property.
             *
             * @return
             *     possible object is
             *     {@link Boolean }
             *
             */
            public Boolean isIsCombined() {
                return isCombined;
            }

            /**
             * Sets the value of the isCombined property.
             *
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *
             */
            public void setIsCombined(Boolean value) {
                this.isCombined = value;
            }

            /**
             * Gets the value of the validatorCode property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getValidatorCode() {
                return validatorCode;
            }

            /**
             * Sets the value of the validatorCode property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setValidatorCode(String value) {
                this.validatorCode = value;
            }

            /**
             * Gets the value of the tariffAdult property.
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getTariffAdult() {
                return tariffAdult;
            }

            /**
             * Sets the value of the tariffAdult property.
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setTariffAdult(Integer value) {
                this.tariffAdult = value;
            }

            /**
             * Gets the value of the charter property.
             *
             * @return
             *     possible object is
             *     {@link Boolean }
             *
             */
            public Boolean isCharter() {
                return charter;
            }

            /**
             * Sets the value of the charter property.
             *
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *
             */
            public void setCharter(Boolean value) {
                this.charter = value;
            }

            /**
             * Gets the value of the isCharterSpecFare property.
             *
             * @return
             *     possible object is
             *     {@link Boolean }
             *
             */
            public Boolean isIsCharterSpecFare() {
                return isCharterSpecFare;
            }

            /**
             * Sets the value of the isCharterSpecFare property.
             *
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *
             */
            public void setIsCharterSpecFare(Boolean value) {
                this.isCharterSpecFare = value;
            }

            /**
             * Gets the value of the directionType property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDirectionType() {
                return directionType;
            }

            /**
             * Sets the value of the directionType property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDirectionType(String value) {
                this.directionType = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Item" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Segment">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="AviaCompany" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="BookingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="BookingCounts" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
             *                           &lt;attribute name="DestinationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="Fare" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                           &lt;attribute name="Group" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                           &lt;attribute name="id_Segment" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                           &lt;attribute name="Key" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                           &lt;attribute name="OriginCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="IsConnection" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                           &lt;attribute name="ProviderCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="FareName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Num" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="Origin" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Depart" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
             *                 &lt;attribute name="Arrive" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
             *                 &lt;attribute name="Leg" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Route" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="DurationMS" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="Airplane" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Sys" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="SystemAccessId" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="OrderNum" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="BookingClass" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="OperatingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="CharterVariantId" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="Places" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="PlacesCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="TechStopCount" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="Confirmed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="Sign" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "item"
            })
            public static class Flights {

                @XmlElement(name = "Item", required = true)
                protected List<FlightsItem> item;

                /**
                 * Gets the value of the item property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the item property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getItem().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FlightsItem }
                 *
                 *
                 */
                public List<FlightsItem> getItem() {
                    if (item == null) {
                        item = new ArrayList<FlightsItem>();
                    }
                    return this.item;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 *
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Segment">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="AviaCompany" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="BookingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="BookingCounts" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
                 *                 &lt;attribute name="DestinationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="Fare" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *                 &lt;attribute name="Group" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *                 &lt;attribute name="id_Segment" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *                 &lt;attribute name="Key" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *                 &lt;attribute name="OriginCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="IsConnection" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *                 &lt;attribute name="ProviderCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="FareName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Num" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="Origin" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Depart" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
                 *       &lt;attribute name="Arrive" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
                 *       &lt;attribute name="Leg" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Route" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="DurationMS" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="Airplane" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Sys" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="SystemAccessId" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="OrderNum" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="BookingClass" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="OperatingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="CharterVariantId" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="Places" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="PlacesCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="TechStopCount" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="Confirmed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="Sign" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "segment"
                })
                public static class FlightsItem {

                    @XmlElement(name = "Segment", required = true)
                    protected FlightsItem.Segment segment;
                    @XmlAttribute(name = "Code")
                    protected String code;
                    @XmlAttribute(name = "FareName")
                    protected String fareName;
                    @XmlAttribute(name = "Num")
                    protected Integer num;
                    @XmlAttribute(name = "Origin")
                    protected String origin;
                    @XmlAttribute(name = "Destination")
                    protected String destination;
                    @XmlAttribute(name = "Depart")
                    @XmlSchemaType(name = "dateTime")
                    protected XMLGregorianCalendar depart;
                    @XmlAttribute(name = "Arrive")
                    @XmlSchemaType(name = "dateTime")
                    protected XMLGregorianCalendar arrive;
                    @XmlAttribute(name = "Leg")
                    protected String leg;
                    @XmlAttribute(name = "Route")
                    protected String route;
                    @XmlAttribute(name = "Duration")
                    protected String duration;
                    @XmlAttribute(name = "DurationMS")
                    protected Integer durationMS;
                    @XmlAttribute(name = "Airplane")
                    protected String airplane;
                    @XmlAttribute(name = "Sys")
                    protected Integer sys;
                    @XmlAttribute(name = "SystemAccessId")
                    protected Integer systemAccessId;
                    @XmlAttribute(name = "OrderNum")
                    protected Integer orderNum;
                    @XmlAttribute(name = "SegmentId")
                    protected Integer segmentId;
                    @XmlAttribute(name = "BookingClass")
                    protected String bookingClass;
                    @XmlAttribute(name = "OperatingCode")
                    protected String operatingCode;
                    @XmlAttribute(name = "CharterVariantId")
                    protected Integer charterVariantId;
                    @XmlAttribute(name = "Places")
                    protected Integer places;
                    @XmlAttribute(name = "PlacesCode")
                    protected String placesCode;
                    @XmlAttribute(name = "TechStopCount")
                    protected Integer techStopCount;
                    @XmlAttribute(name = "Confirmed")
                    protected Boolean confirmed;
                    @XmlAttribute(name = "Sign")
                    protected String sign;

                    /**
                     * Gets the value of the segment property.
                     *
                     * @return
                     *     possible object is
                     *     {@link FlightsItem.Segment }
                     *
                     */
                    public FlightsItem.Segment getSegment() {
                        return segment;
                    }

                    /**
                     * Sets the value of the segment property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link FlightsItem.Segment }
                     *
                     */
                    public void setSegment(FlightsItem.Segment value) {
                        this.segment = value;
                    }

                    /**
                     * Gets the value of the code property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getCode() {
                        return code;
                    }

                    /**
                     * Sets the value of the code property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setCode(String value) {
                        this.code = value;
                    }

                    /**
                     * Gets the value of the fareName property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getFareName() {
                        return fareName;
                    }

                    /**
                     * Sets the value of the fareName property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setFareName(String value) {
                        this.fareName = value;
                    }

                    /**
                     * Gets the value of the num property.
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getNum() {
                        return num;
                    }

                    /**
                     * Sets the value of the num property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setNum(Integer value) {
                        this.num = value;
                    }

                    /**
                     * Gets the value of the origin property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getOrigin() {
                        return origin;
                    }

                    /**
                     * Sets the value of the origin property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setOrigin(String value) {
                        this.origin = value;
                    }

                    /**
                     * Gets the value of the destination property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getDestination() {
                        return destination;
                    }

                    /**
                     * Sets the value of the destination property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setDestination(String value) {
                        this.destination = value;
                    }

                    /**
                     * Gets the value of the depart property.
                     *
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public XMLGregorianCalendar getDepart() {
                        return depart;
                    }

                    /**
                     * Sets the value of the depart property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public void setDepart(XMLGregorianCalendar value) {
                        this.depart = value;
                    }

                    /**
                     * Gets the value of the arrive property.
                     *
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public XMLGregorianCalendar getArrive() {
                        return arrive;
                    }

                    /**
                     * Sets the value of the arrive property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public void setArrive(XMLGregorianCalendar value) {
                        this.arrive = value;
                    }

                    /**
                     * Gets the value of the leg property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getLeg() {
                        return leg;
                    }

                    /**
                     * Sets the value of the leg property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setLeg(String value) {
                        this.leg = value;
                    }

                    /**
                     * Gets the value of the route property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getRoute() {
                        return route;
                    }

                    /**
                     * Sets the value of the route property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setRoute(String value) {
                        this.route = value;
                    }

                    /**
                     * Gets the value of the duration property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getDuration() {
                        return duration;
                    }

                    /**
                     * Sets the value of the duration property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setDuration(String value) {
                        this.duration = value;
                    }

                    /**
                     * Gets the value of the durationMS property.
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getDurationMS() {
                        return durationMS;
                    }

                    /**
                     * Sets the value of the durationMS property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setDurationMS(Integer value) {
                        this.durationMS = value;
                    }

                    /**
                     * Gets the value of the airplane property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getAirplane() {
                        return airplane;
                    }

                    /**
                     * Sets the value of the airplane property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setAirplane(String value) {
                        this.airplane = value;
                    }

                    /**
                     * Gets the value of the sys property.
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getSys() {
                        return sys;
                    }

                    /**
                     * Sets the value of the sys property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setSys(Integer value) {
                        this.sys = value;
                    }

                    /**
                     * Gets the value of the systemAccessId property.
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getSystemAccessId() {
                        return systemAccessId;
                    }

                    /**
                     * Sets the value of the systemAccessId property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setSystemAccessId(Integer value) {
                        this.systemAccessId = value;
                    }

                    /**
                     * Gets the value of the orderNum property.
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getOrderNum() {
                        return orderNum;
                    }

                    /**
                     * Sets the value of the orderNum property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setOrderNum(Integer value) {
                        this.orderNum = value;
                    }

                    /**
                     * Gets the value of the segmentId property.
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getSegmentId() {
                        return segmentId;
                    }

                    /**
                     * Sets the value of the segmentId property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setSegmentId(Integer value) {
                        this.segmentId = value;
                    }

                    /**
                     * Gets the value of the bookingClass property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getBookingClass() {
                        return bookingClass;
                    }

                    /**
                     * Sets the value of the bookingClass property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setBookingClass(String value) {
                        this.bookingClass = value;
                    }

                    /**
                     * Gets the value of the operatingCode property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getOperatingCode() {
                        return operatingCode;
                    }

                    /**
                     * Sets the value of the operatingCode property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setOperatingCode(String value) {
                        this.operatingCode = value;
                    }

                    /**
                     * Gets the value of the charterVariantId property.
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getCharterVariantId() {
                        return charterVariantId;
                    }

                    /**
                     * Sets the value of the charterVariantId property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setCharterVariantId(Integer value) {
                        this.charterVariantId = value;
                    }

                    /**
                     * Gets the value of the places property.
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getPlaces() {
                        return places;
                    }

                    /**
                     * Sets the value of the places property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setPlaces(Integer value) {
                        this.places = value;
                    }

                    /**
                     * Gets the value of the placesCode property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getPlacesCode() {
                        return placesCode;
                    }

                    /**
                     * Sets the value of the placesCode property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setPlacesCode(String value) {
                        this.placesCode = value;
                    }

                    /**
                     * Gets the value of the techStopCount property.
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getTechStopCount() {
                        return techStopCount;
                    }

                    /**
                     * Sets the value of the techStopCount property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setTechStopCount(Integer value) {
                        this.techStopCount = value;
                    }

                    /**
                     * Gets the value of the confirmed property.
                     *
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *
                     */
                    public Boolean isConfirmed() {
                        return confirmed;
                    }

                    /**
                     * Sets the value of the confirmed property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *
                     */
                    public void setConfirmed(Boolean value) {
                        this.confirmed = value;
                    }

                    /**
                     * Gets the value of the sign property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getSign() {
                        return sign;
                    }

                    /**
                     * Sets the value of the sign property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setSign(String value) {
                        this.sign = value;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     *
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     *
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;attribute name="AviaCompany" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="BookingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="BookingCounts" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
                     *       &lt;attribute name="DestinationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="Fare" type="{http://www.w3.org/2001/XMLSchema}int" />
                     *       &lt;attribute name="Group" type="{http://www.w3.org/2001/XMLSchema}int" />
                     *       &lt;attribute name="id_Segment" type="{http://www.w3.org/2001/XMLSchema}int" />
                     *       &lt;attribute name="Key" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}int" />
                     *       &lt;attribute name="OriginCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="IsConnection" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *       &lt;attribute name="ProviderCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     *
                     *
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Segment {

                        @XmlAttribute(name = "AviaCompany")
                        protected String aviaCompany;
                        @XmlAttribute(name = "BookingCode")
                        protected String bookingCode;
                        @XmlAttribute(name = "BookingCounts")
                        protected String bookingCounts;
                        @XmlAttribute(name = "Carrier")
                        protected String carrier;
                        @XmlAttribute(name = "Date")
                        @XmlSchemaType(name = "dateTime")
                        protected XMLGregorianCalendar date;
                        @XmlAttribute(name = "DestinationCode")
                        protected String destinationCode;
                        @XmlAttribute(name = "Fare")
                        protected Integer fare;
                        @XmlAttribute(name = "Group")
                        protected Integer group;
                        @XmlAttribute(name = "id_Segment")
                        protected Integer idSegment;
                        @XmlAttribute(name = "Key")
                        protected String key;
                        @XmlAttribute(name = "Name")
                        protected String name;
                        @XmlAttribute(name = "Number")
                        protected Integer number;
                        @XmlAttribute(name = "OriginCode")
                        protected String originCode;
                        @XmlAttribute(name = "IsConnection")
                        protected Boolean isConnection;
                        @XmlAttribute(name = "ProviderCode")
                        protected String providerCode;

                        /**
                         * Gets the value of the aviaCompany property.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getAviaCompany() {
                            return aviaCompany;
                        }

                        /**
                         * Sets the value of the aviaCompany property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setAviaCompany(String value) {
                            this.aviaCompany = value;
                        }

                        /**
                         * Gets the value of the bookingCode property.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getBookingCode() {
                            return bookingCode;
                        }

                        /**
                         * Sets the value of the bookingCode property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setBookingCode(String value) {
                            this.bookingCode = value;
                        }

                        /**
                         * Gets the value of the bookingCounts property.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getBookingCounts() {
                            return bookingCounts;
                        }

                        /**
                         * Sets the value of the bookingCounts property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setBookingCounts(String value) {
                            this.bookingCounts = value;
                        }

                        /**
                         * Gets the value of the carrier property.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getCarrier() {
                            return carrier;
                        }

                        /**
                         * Sets the value of the carrier property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setCarrier(String value) {
                            this.carrier = value;
                        }

                        /**
                         * Gets the value of the date property.
                         *
                         * @return
                         *     possible object is
                         *     {@link XMLGregorianCalendar }
                         *
                         */
                        public XMLGregorianCalendar getDate() {
                            return date;
                        }

                        /**
                         * Sets the value of the date property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link XMLGregorianCalendar }
                         *
                         */
                        public void setDate(XMLGregorianCalendar value) {
                            this.date = value;
                        }

                        /**
                         * Gets the value of the destinationCode property.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getDestinationCode() {
                            return destinationCode;
                        }

                        /**
                         * Sets the value of the destinationCode property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setDestinationCode(String value) {
                            this.destinationCode = value;
                        }

                        /**
                         * Gets the value of the fare property.
                         *
                         * @return
                         *     possible object is
                         *     {@link Integer }
                         *
                         */
                        public Integer getFare() {
                            return fare;
                        }

                        /**
                         * Sets the value of the fare property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link Integer }
                         *
                         */
                        public void setFare(Integer value) {
                            this.fare = value;
                        }

                        /**
                         * Gets the value of the group property.
                         *
                         * @return
                         *     possible object is
                         *     {@link Integer }
                         *
                         */
                        public Integer getGroup() {
                            return group;
                        }

                        /**
                         * Sets the value of the group property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link Integer }
                         *
                         */
                        public void setGroup(Integer value) {
                            this.group = value;
                        }

                        /**
                         * Gets the value of the idSegment property.
                         *
                         * @return
                         *     possible object is
                         *     {@link Integer }
                         *
                         */
                        public Integer getIdSegment() {
                            return idSegment;
                        }

                        /**
                         * Sets the value of the idSegment property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link Integer }
                         *
                         */
                        public void setIdSegment(Integer value) {
                            this.idSegment = value;
                        }

                        /**
                         * Gets the value of the key property.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getKey() {
                            return key;
                        }

                        /**
                         * Sets the value of the key property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setKey(String value) {
                            this.key = value;
                        }

                        /**
                         * Gets the value of the name property.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getName() {
                            return name;
                        }

                        /**
                         * Sets the value of the name property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setName(String value) {
                            this.name = value;
                        }

                        /**
                         * Gets the value of the number property.
                         *
                         * @return
                         *     possible object is
                         *     {@link Integer }
                         *
                         */
                        public Integer getNumber() {
                            return number;
                        }

                        /**
                         * Sets the value of the number property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link Integer }
                         *
                         */
                        public void setNumber(Integer value) {
                            this.number = value;
                        }

                        /**
                         * Gets the value of the originCode property.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getOriginCode() {
                            return originCode;
                        }

                        /**
                         * Sets the value of the originCode property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setOriginCode(String value) {
                            this.originCode = value;
                        }

                        /**
                         * Gets the value of the isConnection property.
                         *
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *
                         */
                        public Boolean isIsConnection() {
                            return isConnection;
                        }

                        /**
                         * Sets the value of the isConnection property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *
                         */
                        public void setIsConnection(Boolean value) {
                            this.isConnection = value;
                        }

                        /**
                         * Gets the value of the providerCode property.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getProviderCode() {
                            return providerCode;
                        }

                        /**
                         * Sets the value of the providerCode property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setProviderCode(String value) {
                            this.providerCode = value;
                        }

                    }

                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Item" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Flights">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Item" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="FareName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Num" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="Origin" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Depart" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                                     &lt;attribute name="Arrive" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                                     &lt;attribute name="Leg" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Route" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="DurationMS" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="Airplane" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Sys" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="SystemAccessId" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="OrderNum" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="BookingClass" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="OperatingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="CharterVariantId" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="Places" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="PlacesCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="TechStopCount" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="Confirmed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="Sign" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="IsCombined" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="ValidatorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="tariff_adult" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="charter" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="IsCharterSpecFare" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="DirectionType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="HotelVaucher" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class Offers {

        @XmlElement(name = "Item", required = true)
        protected List<Item> item;

        /**
         * Gets the value of the item property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SearchResult.Offers.Item }
         *
         *
         */
        public List<Item> getItem() {
            if (item == null) {
                item = new ArrayList<Item>();
            }
            return this.item;
        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Flights">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Item" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="FareName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Num" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="Origin" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Depart" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *                           &lt;attribute name="Arrive" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *                           &lt;attribute name="Leg" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Route" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="DurationMS" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="Airplane" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Sys" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="SystemAccessId" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="OrderNum" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="BookingClass" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="OperatingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="CharterVariantId" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="Places" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="PlacesCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="TechStopCount" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="Confirmed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="Sign" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="IsCombined" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="ValidatorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="tariff_adult" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="charter" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="IsCharterSpecFare" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="DirectionType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="HotelVaucher" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "flights"
        })
        public static class Item {

            @XmlElement(name = "Flights", required = true)
            protected SearchResult.Offers.Item.Flights flights;
            @XmlAttribute(name = "Price")
            protected String price;
            @XmlAttribute(name = "IsCombined")
            protected String isCombined;
            @XmlAttribute(name = "ValidatorCode")
            protected String validatorCode;
            @XmlAttribute(name = "tariff_adult")
            protected Integer tariffAdult;
            @XmlAttribute(name = "charter")
            protected Boolean charter;
            @XmlAttribute(name = "IsCharterSpecFare")
            protected Boolean isCharterSpecFare;
            @XmlAttribute(name = "DirectionType")
            protected String directionType;
            @XmlAttribute(name = "Number")
            protected Integer number;
            @XmlAttribute(name = "HotelVaucher")
            protected Boolean hotelVaucher;

            /**
             * Gets the value of the flights property.
             *
             * @return
             *     possible object is
             *     {@link SearchResult.Offers.Item.Flights }
             *
             */
            public SearchResult.Offers.Item.Flights getFlights() {
                return flights;
            }

            /**
             * Sets the value of the flights property.
             *
             * @param value
             *     allowed object is
             *     {@link SearchResult.Offers.Item.Flights }
             *
             */
            public void setFlights(SearchResult.Offers.Item.Flights value) {
                this.flights = value;
            }

            /**
             * Gets the value of the price property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public Float getPrice() {
                return new Float(price.replace(",","."));
            }

            /**
             * Sets the value of the price property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPrice(String value) {
                this.price = value;
            }

            /**
             * Gets the value of the isCombined property.
             *
             * @return
             *     possible object is
             *     {@link Boolean }
             *
             */
            public Boolean isIsCombined() {
                return Boolean.parseBoolean(isCombined);
            }

            /**
             * Sets the value of the isCombined property.
             *
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *
             */
            public void setIsCombined(String value) {
                this.isCombined = value.toLowerCase();
            }

            /**
             * Gets the value of the validatorCode property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getValidatorCode() {
                return validatorCode;
            }

            /**
             * Sets the value of the validatorCode property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setValidatorCode(String value) {
                this.validatorCode = value;
            }

            /**
             * Gets the value of the tariffAdult property.
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getTariffAdult() {
                return tariffAdult;
            }

            /**
             * Sets the value of the tariffAdult property.
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setTariffAdult(Integer value) {
                this.tariffAdult = value;
            }

            /**
             * Gets the value of the charter property.
             *
             * @return
             *     possible object is
             *     {@link Boolean }
             *
             */
            public Boolean isCharter() {
                return charter;
            }

            /**
             * Sets the value of the charter property.
             *
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *
             */
            public void setCharter(Boolean value) {
                this.charter = value;
            }

            /**
             * Gets the value of the isCharterSpecFare property.
             *
             * @return
             *     possible object is
             *     {@link Boolean }
             *
             */
            public Boolean isIsCharterSpecFare() {
                return isCharterSpecFare;
            }

            /**
             * Sets the value of the isCharterSpecFare property.
             *
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *
             */
            public void setIsCharterSpecFare(Boolean value) {
                this.isCharterSpecFare = value;
            }

            /**
             * Gets the value of the directionType property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDirectionType() {
                return directionType;
            }

            /**
             * Sets the value of the directionType property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDirectionType(String value) {
                this.directionType = value;
            }

            /**
             * Gets the value of the number property.
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getNumber() {
                return number;
            }

            /**
             * Sets the value of the number property.
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setNumber(Integer value) {
                this.number = value;
            }

            /**
             * Gets the value of the hotelVaucher property.
             *
             * @return
             *     possible object is
             *     {@link Boolean }
             *
             */
            public Boolean isHotelVaucher() {
                return hotelVaucher;
            }

            /**
             * Sets the value of the hotelVaucher property.
             *
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *
             */
            public void setHotelVaucher(Boolean value) {
                this.hotelVaucher = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Item" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="FareName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Num" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="Origin" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Depart" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
             *                 &lt;attribute name="Arrive" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
             *                 &lt;attribute name="Leg" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Route" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="DurationMS" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="Airplane" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Sys" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="SystemAccessId" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="OrderNum" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="BookingClass" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="OperatingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="CharterVariantId" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="Places" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="PlacesCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="TechStopCount" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="Confirmed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="Sign" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "item"
            })
            public static class Flights {

                @XmlElement(name = "Item", required = true)
                protected List<FlightsItem> item;

                /**
                 * Gets the value of the item property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the item property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getItem().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FlightsItem }
                 *
                 *
                 */
                public List<FlightsItem> getItem() {
                    if (item == null) {
                        item = new ArrayList<FlightsItem>();
                    }
                    return this.item;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 *
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="FareName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Num" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="Origin" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Depart" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
                 *       &lt;attribute name="Arrive" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
                 *       &lt;attribute name="Leg" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Route" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="DurationMS" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="Airplane" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Sys" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="SystemAccessId" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="OrderNum" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="BookingClass" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="OperatingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="CharterVariantId" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="Places" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="PlacesCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="TechStopCount" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="Confirmed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="Sign" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class FlightsItem {

                    @XmlAttribute(name = "Code")
                    protected String code;
                    @XmlAttribute(name = "FareName")
                    protected String fareName;
                    @XmlAttribute(name = "Num")
                    protected Integer num;
                    @XmlAttribute(name = "Origin")
                    protected String origin;
                    @XmlAttribute(name = "Destination")
                    protected String destination;
                    @XmlAttribute(name = "Depart")
                    @XmlSchemaType(name = "dateTime")
                    protected XMLGregorianCalendar depart;
                    @XmlAttribute(name = "Arrive")
                    @XmlSchemaType(name = "dateTime")
                    protected XMLGregorianCalendar arrive;
                    @XmlAttribute(name = "Leg")
                    protected String leg;
                    @XmlAttribute(name = "Route")
                    protected String route;
                    @XmlAttribute(name = "Duration")
                    protected String duration;
                    @XmlAttribute(name = "DurationMS")
                    protected Integer durationMS;
                    @XmlAttribute(name = "Airplane")
                    protected String airplane;
                    @XmlAttribute(name = "Sys")
                    protected Integer sys;
                    @XmlAttribute(name = "SystemAccessId")
                    protected Integer systemAccessId;
                    @XmlAttribute(name = "OrderNum")
                    protected Integer orderNum;
                    @XmlAttribute(name = "SegmentId")
                    protected Integer segmentId;
                    @XmlAttribute(name = "BookingClass")
                    protected String bookingClass;
                    @XmlAttribute(name = "OperatingCode")
                    protected String operatingCode;
                    @XmlAttribute(name = "CharterVariantId")
                    protected Integer charterVariantId;
                    @XmlAttribute(name = "Places")
                    protected Integer places;
                    @XmlAttribute(name = "PlacesCode")
                    protected String placesCode;
                    @XmlAttribute(name = "TechStopCount")
                    protected Integer techStopCount;
                    @XmlAttribute(name = "Confirmed")
                    protected Boolean confirmed;
                    @XmlAttribute(name = "Sign")
                    protected String sign;

                    /**
                     * Gets the value of the code property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getCode() {
                        return code;
                    }

                    /**
                     * Sets the value of the code property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setCode(String value) {
                        this.code = value;
                    }

                    /**
                     * Gets the value of the fareName property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getFareName() {
                        return fareName;
                    }

                    /**
                     * Sets the value of the fareName property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setFareName(String value) {
                        this.fareName = value;
                    }

                    /**
                     * Gets the value of the num property.
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getNum() {
                        return num;
                    }

                    /**
                     * Sets the value of the num property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setNum(Integer value) {
                        this.num = value;
                    }

                    /**
                     * Gets the value of the origin property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getOrigin() {
                        return origin;
                    }

                    /**
                     * Sets the value of the origin property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setOrigin(String value) {
                        this.origin = value;
                    }

                    /**
                     * Gets the value of the destination property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getDestination() {
                        return destination;
                    }

                    /**
                     * Sets the value of the destination property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setDestination(String value) {
                        this.destination = value;
                    }

                    /**
                     * Gets the value of the depart property.
                     *
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public XMLGregorianCalendar getDepart() {
                        return depart;
                    }

                    /**
                     * Sets the value of the depart property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public void setDepart(XMLGregorianCalendar value) {
                        this.depart = value;
                    }

                    /**
                     * Gets the value of the arrive property.
                     *
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public XMLGregorianCalendar getArrive() {
                        return arrive;
                    }

                    /**
                     * Sets the value of the arrive property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public void setArrive(XMLGregorianCalendar value) {
                        this.arrive = value;
                    }

                    /**
                     * Gets the value of the leg property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getLeg() {
                        return leg;
                    }

                    /**
                     * Sets the value of the leg property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setLeg(String value) {
                        this.leg = value;
                    }

                    /**
                     * Gets the value of the route property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getRoute() {
                        return route;
                    }

                    /**
                     * Sets the value of the route property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setRoute(String value) {
                        this.route = value;
                    }

                    /**
                     * Gets the value of the duration property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getDuration() {
                        return duration;
                    }

                    /**
                     * Sets the value of the duration property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setDuration(String value) {
                        this.duration = value;
                    }

                    /**
                     * Gets the value of the durationMS property.
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getDurationMS() {
                        return durationMS;
                    }

                    /**
                     * Sets the value of the durationMS property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setDurationMS(Integer value) {
                        this.durationMS = value;
                    }

                    /**
                     * Gets the value of the airplane property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getAirplane() {
                        return airplane;
                    }

                    /**
                     * Sets the value of the airplane property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setAirplane(String value) {
                        this.airplane = value;
                    }

                    /**
                     * Gets the value of the sys property.
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getSys() {
                        return sys;
                    }

                    /**
                     * Sets the value of the sys property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setSys(Integer value) {
                        this.sys = value;
                    }

                    /**
                     * Gets the value of the systemAccessId property.
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getSystemAccessId() {
                        return systemAccessId;
                    }

                    /**
                     * Sets the value of the systemAccessId property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setSystemAccessId(Integer value) {
                        this.systemAccessId = value;
                    }

                    /**
                     * Gets the value of the orderNum property.
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getOrderNum() {
                        return orderNum;
                    }

                    /**
                     * Sets the value of the orderNum property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setOrderNum(Integer value) {
                        this.orderNum = value;
                    }

                    /**
                     * Gets the value of the segmentId property.
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getSegmentId() {
                        return segmentId;
                    }

                    /**
                     * Sets the value of the segmentId property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setSegmentId(Integer value) {
                        this.segmentId = value;
                    }

                    /**
                     * Gets the value of the bookingClass property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getBookingClass() {
                        return bookingClass;
                    }

                    /**
                     * Sets the value of the bookingClass property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setBookingClass(String value) {
                        this.bookingClass = value;
                    }

                    /**
                     * Gets the value of the operatingCode property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getOperatingCode() {
                        return operatingCode;
                    }

                    /**
                     * Sets the value of the operatingCode property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setOperatingCode(String value) {
                        this.operatingCode = value;
                    }

                    /**
                     * Gets the value of the charterVariantId property.
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getCharterVariantId() {
                        return charterVariantId;
                    }

                    /**
                     * Sets the value of the charterVariantId property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setCharterVariantId(Integer value) {
                        this.charterVariantId = value;
                    }

                    /**
                     * Gets the value of the places property.
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getPlaces() {
                        return places;
                    }

                    /**
                     * Sets the value of the places property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setPlaces(Integer value) {
                        this.places = value;
                    }

                    /**
                     * Gets the value of the placesCode property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getPlacesCode() {
                        return placesCode;
                    }

                    /**
                     * Sets the value of the placesCode property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setPlacesCode(String value) {
                        this.placesCode = value;
                    }

                    /**
                     * Gets the value of the techStopCount property.
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getTechStopCount() {
                        return techStopCount;
                    }

                    /**
                     * Sets the value of the techStopCount property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setTechStopCount(Integer value) {
                        this.techStopCount = value;
                    }

                    /**
                     * Gets the value of the confirmed property.
                     *
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *
                     */
                    public Boolean isConfirmed() {
                        return confirmed;
                    }

                    /**
                     * Sets the value of the confirmed property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *
                     */
                    public void setConfirmed(Boolean value) {
                        this.confirmed = value;
                    }

                    /**
                     * Gets the value of the sign property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getSign() {
                        return sign;
                    }

                    /**
                     * Sets the value of the sign property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setSign(String value) {
                        this.sign = value;
                    }

                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Airports">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Item" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Lat" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="Lng" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="Country" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="City" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Airlines">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Item" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "airports",
        "airlines"
    })
    public static class References {

        @XmlElement(name = "Airports", required = true)
        protected SearchResult.References.Airports airports;
        @XmlElement(name = "Airlines", required = true)
        protected SearchResult.References.Airlines airlines;

        /**
         * Gets the value of the airports property.
         *
         * @return
         *     possible object is
         *     {@link SearchResult.References.Airports }
         *
         */
        public SearchResult.References.Airports getAirports() {
            return airports;
        }

        /**
         * Sets the value of the airports property.
         *
         * @param value
         *     allowed object is
         *     {@link SearchResult.References.Airports }
         *
         */
        public void setAirports(SearchResult.References.Airports value) {
            this.airports = value;
        }

        /**
         * Gets the value of the airlines property.
         *
         * @return
         *     possible object is
         *     {@link SearchResult.References.Airlines }
         *
         */
        public SearchResult.References.Airlines getAirlines() {
            return airlines;
        }

        /**
         * Sets the value of the airlines property.
         *
         * @param value
         *     allowed object is
         *     {@link SearchResult.References.Airlines }
         *
         */
        public void setAirlines(SearchResult.References.Airlines value) {
            this.airlines = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Item" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "item"
        })
        public static class Airlines {

            @XmlElement(name = "Item", required = true)
            protected List<Item> item;

            /**
             * Gets the value of the item property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the item property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItem().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SearchResult.References.Airlines.Item }
             *
             *
             */
            public List<Item> getItem() {
                if (item == null) {
                    item = new ArrayList<Item>();
                }
                return this.item;
            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Item {

                @XmlAttribute(name = "Code")
                protected String code;
                @XmlAttribute(name = "Name")
                protected String name;

                /**
                 * Gets the value of the code property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the name property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setName(String value) {
                    this.name = value;
                }

                @Override
                public String toString() {
                    return name;
                }
            }
        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Item" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Lat" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="Lng" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="Country" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="City" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "item"
        })
        public static class Airports {

            @XmlElement(name = "Item", required = true)
            protected List<Item> item;

            /**
             * Gets the value of the item property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the item property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItem().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SearchResult.References.Airports.Item }
             *
             *
             */
            public List<Item> getItem() {
                if (item == null) {
                    item = new ArrayList<Item>();
                }
                return this.item;
            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Lat" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="Lng" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="Country" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="City" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Item {

                @XmlAttribute(name = "Code")
                protected String code;
                @XmlAttribute(name = "Name")
                protected String name;
                @XmlAttribute(name = "Lat")
                protected String lat;
                @XmlAttribute(name = "Lng")
                protected String lng;
                @XmlAttribute(name = "Country")
                protected String country;
                @XmlAttribute(name = "City")
                protected String city;

                /**
                 * Gets the value of the code property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the name property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the lat property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getLat() {
                    return lat;
                }

                /**
                 * Sets the value of the lat property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setLat(String value) {
                    this.lat = value;
                }

                /**
                 * Gets the value of the lng property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getLng() {
                    return lng;
                }

                /**
                 * Sets the value of the lng property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setLng(String value) {
                    this.lng = value;
                }

                /**
                 * Gets the value of the country property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getCountry() {
                    return country;
                }

                /**
                 * Sets the value of the country property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setCountry(String value) {
                    this.country = value;
                }

                /**
                 * Gets the value of the city property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getCity() {
                    return city;
                }

                /**
                 * Sets the value of the city property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setCity(String value) {
                    this.city = value;
                }

                @Override
                public String toString() {
                    return name;
                }
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="Fare" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Request {

        @XmlAttribute(name = "Fare")
        protected String fare;

        /**
         * Gets the value of the fare property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFare() {
            return fare;
        }

        /**
         * Sets the value of the fare property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFare(String value) {
            this.fare = value;
        }

    }

}
