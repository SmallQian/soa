
package cn.com.jandar.soa.xwsoa;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for vehicleAlarmIn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vehicleAlarmIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fdId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="channelType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="channleId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="channelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alarmTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="plateNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plateColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plateCharacterColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleLong" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="recordedSpeed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="speedMin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="speedMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="vehicleFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="factoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceFrom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="detail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storageAreaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="centerStoreKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monitorLocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alarmTypeMinor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="monitorLocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="images" type="{http://www.w3.org/2001/XMLSchema}base64Binary" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleAlarmIn", propOrder = {
    "fdId",
    "channelType",
    "channleId",
    "channelName",
    "alarmTime",
    "plateNo",
    "url",
    "plateType",
    "plateColor",
    "plateCharacterColor",
    "vehicleColor",
    "vehicleType",
    "vehicleLong",
    "recordedSpeed",
    "speedMin",
    "speedMax",
    "longitude",
    "latitude",
    "vehicleFrom",
    "vehicleChannel",
    "factoryCode",
    "sourceFrom",
    "detail",
    "storageAreaId",
    "centerStoreKey",
    "monitorLocationId",
    "alarmTypeMinor",
    "monitorLocationName",
    "images"
})
public class VehicleAlarmIn {

    protected String fdId;
    protected int channelType;
    protected int channleId;
    protected String channelName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar alarmTime;
    protected String plateNo;
    protected String url;
    protected String plateType;
    protected String plateColor;
    protected String plateCharacterColor;
    protected String vehicleColor;
    protected String vehicleType;
    protected int vehicleLong;
    protected int recordedSpeed;
    protected int speedMin;
    protected int speedMax;
    protected double longitude;
    protected double latitude;
    protected String vehicleFrom;
    protected String vehicleChannel;
    protected String factoryCode;
    protected int sourceFrom;
    protected String detail;
    protected String storageAreaId;
    protected String centerStoreKey;
    protected String monitorLocationId;
    protected int alarmTypeMinor;
    protected String monitorLocationName;
    @XmlElement(nillable = true)
    protected List<byte[]> images;

    /**
     * Gets the value of the fdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFdId() {
        return fdId;
    }

    /**
     * Sets the value of the fdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFdId(String value) {
        this.fdId = value;
    }

    /**
     * Gets the value of the channelType property.
     * 
     */
    public int getChannelType() {
        return channelType;
    }

    /**
     * Sets the value of the channelType property.
     * 
     */
    public void setChannelType(int value) {
        this.channelType = value;
    }

    /**
     * Gets the value of the channleId property.
     * 
     */
    public int getChannleId() {
        return channleId;
    }

    /**
     * Sets the value of the channleId property.
     * 
     */
    public void setChannleId(int value) {
        this.channleId = value;
    }

    /**
     * Gets the value of the channelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * Sets the value of the channelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelName(String value) {
        this.channelName = value;
    }

    /**
     * Gets the value of the alarmTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAlarmTime() {
        return alarmTime;
    }

    /**
     * Sets the value of the alarmTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAlarmTime(XMLGregorianCalendar value) {
        this.alarmTime = value;
    }

    /**
     * Gets the value of the plateNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlateNo() {
        return plateNo;
    }

    /**
     * Sets the value of the plateNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlateNo(String value) {
        this.plateNo = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the plateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlateType() {
        return plateType;
    }

    /**
     * Sets the value of the plateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlateType(String value) {
        this.plateType = value;
    }

    /**
     * Gets the value of the plateColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlateColor() {
        return plateColor;
    }

    /**
     * Sets the value of the plateColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlateColor(String value) {
        this.plateColor = value;
    }

    /**
     * Gets the value of the plateCharacterColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlateCharacterColor() {
        return plateCharacterColor;
    }

    /**
     * Sets the value of the plateCharacterColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlateCharacterColor(String value) {
        this.plateCharacterColor = value;
    }

    /**
     * Gets the value of the vehicleColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleColor() {
        return vehicleColor;
    }

    /**
     * Sets the value of the vehicleColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleColor(String value) {
        this.vehicleColor = value;
    }

    /**
     * Gets the value of the vehicleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * Sets the value of the vehicleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleType(String value) {
        this.vehicleType = value;
    }

    /**
     * Gets the value of the vehicleLong property.
     * 
     */
    public int getVehicleLong() {
        return vehicleLong;
    }

    /**
     * Sets the value of the vehicleLong property.
     * 
     */
    public void setVehicleLong(int value) {
        this.vehicleLong = value;
    }

    /**
     * Gets the value of the recordedSpeed property.
     * 
     */
    public int getRecordedSpeed() {
        return recordedSpeed;
    }

    /**
     * Sets the value of the recordedSpeed property.
     * 
     */
    public void setRecordedSpeed(int value) {
        this.recordedSpeed = value;
    }

    /**
     * Gets the value of the speedMin property.
     * 
     */
    public int getSpeedMin() {
        return speedMin;
    }

    /**
     * Sets the value of the speedMin property.
     * 
     */
    public void setSpeedMin(int value) {
        this.speedMin = value;
    }

    /**
     * Gets the value of the speedMax property.
     * 
     */
    public int getSpeedMax() {
        return speedMax;
    }

    /**
     * Sets the value of the speedMax property.
     * 
     */
    public void setSpeedMax(int value) {
        this.speedMax = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     */
    public void setLongitude(double value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     */
    public void setLatitude(double value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the vehicleFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleFrom() {
        return vehicleFrom;
    }

    /**
     * Sets the value of the vehicleFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleFrom(String value) {
        this.vehicleFrom = value;
    }

    /**
     * Gets the value of the vehicleChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleChannel() {
        return vehicleChannel;
    }

    /**
     * Sets the value of the vehicleChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleChannel(String value) {
        this.vehicleChannel = value;
    }

    /**
     * Gets the value of the factoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactoryCode() {
        return factoryCode;
    }

    /**
     * Sets the value of the factoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactoryCode(String value) {
        this.factoryCode = value;
    }

    /**
     * Gets the value of the sourceFrom property.
     * 
     */
    public int getSourceFrom() {
        return sourceFrom;
    }

    /**
     * Sets the value of the sourceFrom property.
     * 
     */
    public void setSourceFrom(int value) {
        this.sourceFrom = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetail(String value) {
        this.detail = value;
    }

    /**
     * Gets the value of the storageAreaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageAreaId() {
        return storageAreaId;
    }

    /**
     * Sets the value of the storageAreaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageAreaId(String value) {
        this.storageAreaId = value;
    }

    /**
     * Gets the value of the centerStoreKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCenterStoreKey() {
        return centerStoreKey;
    }

    /**
     * Sets the value of the centerStoreKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCenterStoreKey(String value) {
        this.centerStoreKey = value;
    }

    /**
     * Gets the value of the monitorLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonitorLocationId() {
        return monitorLocationId;
    }

    /**
     * Sets the value of the monitorLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonitorLocationId(String value) {
        this.monitorLocationId = value;
    }

    /**
     * Gets the value of the alarmTypeMinor property.
     * 
     */
    public int getAlarmTypeMinor() {
        return alarmTypeMinor;
    }

    /**
     * Sets the value of the alarmTypeMinor property.
     * 
     */
    public void setAlarmTypeMinor(int value) {
        this.alarmTypeMinor = value;
    }

    /**
     * Gets the value of the monitorLocationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonitorLocationName() {
        return monitorLocationName;
    }

    /**
     * Sets the value of the monitorLocationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonitorLocationName(String value) {
        this.monitorLocationName = value;
    }

    /**
     * Gets the value of the images property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the images property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     */
    public List<byte[]> getImages() {
        if (images == null) {
            images = new ArrayList<byte[]>();
        }
        return this.images;
    }

}
