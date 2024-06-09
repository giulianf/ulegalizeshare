package com.ulegalize.dto.template;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Template dto.
 */
@Data
@NoArgsConstructor
public class TemplateDTO {

    /**
     * The Template name.
     */
    private String templateName;
    /**
     * The Template description.
     */
    private String templateDescription;
    /**
     * The Id template.
     */
    private Long idTemplate;
    /**
     * The Purchased.
     */
    private boolean purchased;

    /**
     * The Category template.
     */
    private String categoryTemplate;

    /**
     * The Template uid.
     */
    private String templateUid;

    /**
     * The Id template category.
     */
    private Long idTemplateCategory;

    /**
     * The Vckey.
     */
    private String vckey;

    /**
     * The Is active.
     */
    private boolean isActive;

    /**
     * The contentHtml
     */
    private String contentHtml;
    /**
     * The subject
     */
    private String subject;

    /**
     * ContactID
     */
    private Long contactId;

    /**
     * Instantiates a new Template dto.
     *
     * @param templateName        the template name
     * @param templateDescription the template description
     * @param idTemplate          the id template
     * @param idTemplateFromTable the id template from table
     */
    public TemplateDTO(String templateName, String templateDescription, Long idTemplate, Long idTemplateFromTable) {
        this.templateName = templateName;
        this.templateDescription = templateDescription;
        this.idTemplate = idTemplate;
        this.purchased = idTemplateFromTable != null;
    }

    /**
     * Instantiates a new Template dto.
     *
     * @param templateName        the template name
     * @param templateDescription the template description
     * @param categoryTemplate    the category template
     * @param templateUid         the template uid
     */
    public TemplateDTO(String templateName, String templateDescription, String categoryTemplate, String templateUid) {
        this.templateName = templateName;
        this.templateDescription = templateDescription;
        this.categoryTemplate = categoryTemplate;
        this.templateUid = templateUid;
    }
}
