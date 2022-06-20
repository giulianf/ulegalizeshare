package com.ulegalize.dto.template;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TemplateDTO {

    private String templateName;
    private String templateDescription;
    private Long idTemplate;
    private boolean purchased;

    public TemplateDTO(String templateName, String templateDescription, Long idTemplate, Long idTemplateFromTable) {
        this.templateName = templateName;
        this.templateDescription = templateDescription;
        this.idTemplate = idTemplate;
        this.purchased = idTemplateFromTable != null;
    }
}
