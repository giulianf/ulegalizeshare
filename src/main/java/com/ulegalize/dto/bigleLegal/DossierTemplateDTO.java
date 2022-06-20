package com.ulegalize.dto.bigleLegal;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;
import java.util.List;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@Data
@NoArgsConstructor
public class DossierTemplateDTO extends MainTemplateDTO {

    private List<Person> person;
    private List<Point> point;
    private List<Mediator> mediator;

}
