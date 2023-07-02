package org.example.Model;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name="Periodicals")
@XmlAccessorType(XmlAccessType.FIELD)
public class Periodicals {
    //@XmlElementWrapper(name="Periodicals")
    @XmlElement(name="periodical")
    private List<Periodical> periodicals;

    public List<Periodical> getPeriodicals() {
        return periodicals;
    }

    public void setPeriodicals(List<Periodical> periodicals) {
        this.periodicals = periodicals;
    }
}
