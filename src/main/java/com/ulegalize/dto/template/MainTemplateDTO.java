package com.ulegalize.dto.template;

import com.ulegalize.dto.LawfirmDTO;
import lombok.Getter;
import lombok.Setter;

/**
 * The type Main template dto.
 */
public abstract class MainTemplateDTO {
    /**
     * The Id.
     */
    @Getter
    @Setter
    private Long id;

    /**
     * The Image logo.
     */
    @Getter
    @Setter
    private ImageLogo image_logo;

    /**
     * The Lawfirm.
     */
    @Getter
    @Setter
    private LawfirmDTO lawfirm;
}
