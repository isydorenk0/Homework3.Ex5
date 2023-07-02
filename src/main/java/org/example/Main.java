package org.example;

import javax.xml.bind.JAXBException;
import java.io.File;

import static org.example.Parser.Parser.parse;

public class Main {
    public static void main(String[] args) throws JAXBException {
        parse(new File("src/main/java/org/example/Files/ex1.xml"));
    }
}