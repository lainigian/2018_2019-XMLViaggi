//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.05 alle 02:50:35 PM CET 
//


package viaggi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="viaggio" type="{}tipoViaggio" maxOccurs="unbounded" minOccurs="0"/>
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
    "viaggio"
})
@XmlRootElement(name = "viaggi")
public class Viaggi {

    protected List<TipoViaggio> viaggio;

    public Viaggi()
    {
    	viaggio=new ArrayList<TipoViaggio>();
    }
    
    public TipoViaggio getSingoloViaggio(int posizione)
    {
    	return viaggio.get(posizione);
    }
    
    public void add(int posizione, TipoViaggio viaggio)
    {
    	this.viaggio.add(posizione, viaggio);
    }
    
    public void add(TipoViaggio viaggio)
    {
    	this.viaggio.add(viaggio);
    }
    
    public void remove (int posizione)
    {
    	viaggio.remove(posizione);
    }
    
    public void set(int posizione, TipoViaggio viaggio)
    {
    	this.viaggio.set(posizione, viaggio);
    }
    
    public int getNumeroElementi()
    {
    	return viaggio.size();
    }
    
    public String toString()
    {
    	return viaggio.toString();
    }
    
    //metodo che ordina l'array list "viaggio"
    public void ordinaPerId()
    {
    	Collections.sort(viaggio);
    }
    
    
    /**
     * Gets the value of the viaggio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the viaggio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViaggio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoViaggio }
     * 
     * 
     */
    public List<TipoViaggio> getViaggio() {
        if (viaggio == null) {
            viaggio = new ArrayList<TipoViaggio>();
        }
        return this.viaggio;
    }

}
