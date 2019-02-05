//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.05 alle 02:50:35 PM CET 
//


package viaggi;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per tipoViaggio complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="tipoViaggio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_viaggio" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="mezzo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="auto"/>
 *               &lt;enumeration value="aereo"/>
 *               &lt;enumeration value="treno"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="luogo_partenza" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="data_ora_partenza" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="luogo_arrivo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="data_ora_arrivo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="durata" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *         &lt;element name="costo" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoViaggio", propOrder = {
    "idViaggio",
    "mezzo",
    "luogoPartenza",
    "dataOraPartenza",
    "luogoArrivo",
    "dataOraArrivo",
    "durata",
    "costo"
})
public class TipoViaggio implements Comparable<TipoViaggio>
{

    @XmlElement(name = "id_viaggio", required = true)
    protected BigInteger idViaggio;
    @XmlElement(required = true)
    protected String mezzo;
    @XmlElement(name = "luogo_partenza", required = true)
    protected String luogoPartenza;
    @XmlElement(name = "data_ora_partenza", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataOraPartenza;
    @XmlElement(name = "luogo_arrivo", required = true)
    protected String luogoArrivo;
    @XmlElement(name = "data_ora_arrivo", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataOraArrivo;
    @XmlElement(required = true)
    protected Duration durata;
    @XmlElement(required = true)
    protected BigDecimal costo;

    public TipoViaggio(BigInteger id_viaggio, String mezzo, String luogo_partenza, XMLGregorianCalendar data_ora_partenza,
    		String luogo_arrivo, XMLGregorianCalendar data_ora_arrivo, Duration durata, BigDecimal costo )
    {
    	setIdViaggio(id_viaggio);
    	setMezzo(mezzo);
    	setLuogoPartenza(luogo_partenza);
    	setDataOraPartenza(data_ora_partenza);
    	setLuogoArrivo(luogo_arrivo);
    	setDataOraArrivo(data_ora_arrivo);
    	setDurata(durata);
    	setCosto(costo);  	
    }
    
    public TipoViaggio()
    {
    	
    }
    
    
    
    @Override
	public String toString() {
		return "TipoViaggio [idViaggio=" + idViaggio + ", mezzo=" + mezzo + ", luogoPartenza=" + luogoPartenza
				+ ", dataOraPartenza=" + dataOraPartenza + ", luogoArrivo=" + luogoArrivo + ", dataOraArrivo="
				+ dataOraArrivo + ", durata=" + durata + ", costo=" + costo + "]";
	}

	/**
     * Recupera il valore della proprietà idViaggio.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdViaggio() {
        return idViaggio;
    }

    /**
     * Imposta il valore della proprietà idViaggio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdViaggio(BigInteger value) {
        this.idViaggio = value;
    }

    /**
     * Recupera il valore della proprietà mezzo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMezzo() {
        return mezzo;
    }

    /**
     * Imposta il valore della proprietà mezzo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMezzo(String value) {
        this.mezzo = value;
    }

    /**
     * Recupera il valore della proprietà luogoPartenza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLuogoPartenza() {
        return luogoPartenza;
    }

    /**
     * Imposta il valore della proprietà luogoPartenza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLuogoPartenza(String value) {
        this.luogoPartenza = value;
    }

    /**
     * Recupera il valore della proprietà dataOraPartenza.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataOraPartenza() {
        return dataOraPartenza;
    }

    /**
     * Imposta il valore della proprietà dataOraPartenza.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataOraPartenza(XMLGregorianCalendar value) {
        this.dataOraPartenza = value;
    }

    /**
     * Recupera il valore della proprietà luogoArrivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLuogoArrivo() {
        return luogoArrivo;
    }

    /**
     * Imposta il valore della proprietà luogoArrivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLuogoArrivo(String value) {
        this.luogoArrivo = value;
    }

    /**
     * Recupera il valore della proprietà dataOraArrivo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataOraArrivo() {
        return dataOraArrivo;
    }

    /**
     * Imposta il valore della proprietà dataOraArrivo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataOraArrivo(XMLGregorianCalendar value) {
        this.dataOraArrivo = value;
    }

    /**
     * Recupera il valore della proprietà durata.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDurata() {
        return durata;
    }

    /**
     * Imposta il valore della proprietà durata.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDurata(Duration value) {
        this.durata = value;
    }

    /**
     * Recupera il valore della proprietà costo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCosto() {
        return costo;
    }

    /**
     * Imposta il valore della proprietà costo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCosto(BigDecimal value) {
        this.costo = value;
    }

    //Criterio di confornto fra due oggetti di tipo TipoViaggio
	@Override
	public int compareTo(TipoViaggio o) 
	{
		
		return getIdViaggio().compareTo(o.getIdViaggio());
	}

}
