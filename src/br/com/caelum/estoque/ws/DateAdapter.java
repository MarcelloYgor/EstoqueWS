package br.com.caelum.estoque.ws;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DateAdapter extends XmlAdapter<String, Date> {

	private String pattern = "dd/MM/yyyy";
	
	public Date unmarshal(String dateString) throws Exception {
		return new SimpleDateFormat(pattern).parse(dateString);
	}
	
	public String marshal(Date dateString) throws Exception {
		System.out.println(dateString);
		return new SimpleDateFormat(pattern).format(dateString);
	}
}