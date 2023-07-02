package org.example.Model;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Periodical {
    private String title;
    @XmlElement(name="type")
    private String type;
    private String frequency;
    @XmlElement(name="chars")
    private Characteristics characteristics;

    public Characteristics getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(Characteristics characteristics) {
        this.characteristics = characteristics;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Periodical{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", frequency='" + frequency + '\'' +
                ", color=" + characteristics.isColor() +
                ", gloss=" + characteristics.isGloss() +
                ", pages=" + characteristics.getPages() +
                ", index='" + characteristics.getIndex() + '\'' +
                '}';
    }
}
