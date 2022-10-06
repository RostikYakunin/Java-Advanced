package task4;

import task4.model.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws JAXBException {
        City city = new City("Kiev", new Street("Balzaka str."), new Size("Big"), new Numbers(19));
        City city1 = new City("Irpin", new Street("Pyshkinska str."), new Size("Small"), new Numbers(12));
        Cities cities = new Cities(List.of(city, city1));

        JAXBContext jaxbContext = JAXBContext.newInstance(Cities.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(cities, new File("city.xml"));
//        marshaller.marshal(shop, System.out);

//        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
//        shop = (Shop) unmarshaller.unmarshal(new File("shops.xml"));
//        System.out.println(shop);

    }
}