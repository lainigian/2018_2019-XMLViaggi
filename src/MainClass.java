

import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import utility.XMLmarshaller;
import utility.XMLunmarshaller;
import viaggi.TipoViaggio;
import viaggi.Viaggi;

public class MainClass 
{

	public static void main(String[] args) throws DatatypeConfigurationException, JAXBException, IOException 
	{
		//Istanzio gli elementi di un nuovo viaggio
		XMLGregorianCalendar data_ora_partenza=DatatypeFactory.newInstance().newXMLGregorianCalendar();
		XMLGregorianCalendar data_ora_arrivo=DatatypeFactory.newInstance().newXMLGregorianCalendar();
		
		data_ora_partenza.setYear(2019);
		data_ora_partenza.setMonth(2);
		data_ora_partenza.setDay(5);
		data_ora_partenza.setHour(10);
		data_ora_partenza.setMinute(0);
		data_ora_partenza.setSecond(0);
		
		data_ora_arrivo.setYear(2019);
		data_ora_arrivo.setMonth(2);
		data_ora_arrivo.setDay(5);
		data_ora_arrivo.setHour(16);
		data_ora_arrivo.setMinute(0);
		data_ora_arrivo.setSecond(0);
		
		Duration durata=DatatypeFactory.newInstance().newDuration(true, 0,0,0,8,0,0); 
		
		
		BigInteger id_viaggio=BigInteger.valueOf(0);
		BigDecimal costo=BigDecimal.valueOf(48);
		TipoViaggio v1=new TipoViaggio(id_viaggio,"treno","Aosta",data_ora_partenza,"Ascoli",data_ora_arrivo,durata,costo);
		
		//Unmarshalling dei viaggi rappresentati dal file "viaggi.xml"
		Viaggi elencoViaggi=new Viaggi();
		System.out.println(elencoViaggi.toString());
		elencoViaggi=(Viaggi) XMLunmarshaller.unmarshal("viaggi.xml", "viaggi");
		
		
		//Aggingo il nuovo viaggio
		elencoViaggi.add(v1);
		System.out.println(elencoViaggi.toString());
		
		//ordino i viaggi in base all' id_viaggi
		elencoViaggi.ordinaPerId();
		System.out.println(elencoViaggi.toString());
		
		//Marshalling dei 3 viaggi
		XMLmarshaller.marshal("viaggi", elencoViaggi, "viaggi2.xml");
	}

}
