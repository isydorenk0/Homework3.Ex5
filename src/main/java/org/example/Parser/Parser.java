package org.example.Parser;

import org.example.Model.Periodical;
import org.example.Model.Periodicals;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.Arrays;

public class Parser {

    public static void parse(File file) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Periodicals.class);
        Unmarshaller unMarshaller = jaxbContext.createUnmarshaller();
        Periodicals periodicals = (Periodicals) unMarshaller.unmarshal(file);
        periodicals.getPeriodicals().forEach(System.out::println);
    }

}
