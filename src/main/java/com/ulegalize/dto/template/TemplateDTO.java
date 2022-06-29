package com.ulegalize.dto.template;

import com.ulegalize.dto.ItemLongDto;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TemplateDTO {

    private String templateName;
    private String templateDescription;
    private Long idTemplate;
    private boolean purchased;

    private String categoryTemplate;

    private String templateUid;
    
    private Long idTemplateCategory;

    public TemplateDTO(String templateName, String templateDescription, Long idTemplate, Long idTemplateFromTable) {
        this.templateName = templateName;
        this.templateDescription = templateDescription;
        this.idTemplate = idTemplate;
        this.purchased = idTemplateFromTable != null;
    }

    public TemplateDTO(String templateName, String templateDescription, String categoryTemplate, String templateUid) {
        this.templateName = templateName;
        this.templateDescription = templateDescription;
        this.categoryTemplate = categoryTemplate;
        this.templateUid = templateUid;
    }
}
