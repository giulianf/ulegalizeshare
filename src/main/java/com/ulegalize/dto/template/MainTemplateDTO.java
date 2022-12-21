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
     * The Image 1.
     */
    @Getter
    @Setter
    private ImageLogo image1;
    /**
     * The Image 2.
     */
    @Getter
    @Setter
    private ImageLogo image2;
    /**
     * The Image 3.
     */
    @Getter
    @Setter
    private ImageLogo image3;
    /**
     * The Image 4.
     */
    @Getter
    @Setter
    private ImageLogo image4;
    /**
     * The Image 5.
     */
    @Getter
    @Setter
    private ImageLogo image5;
    /**
     * The Image 6.
     */
    @Getter
    @Setter
    private ImageLogo image6;
    /**
     * The Image 7.
     */
    @Getter
    @Setter
    private ImageLogo image7;
    /**
     * The Image 8.
     */
    @Getter
    @Setter
    private ImageLogo image8;
    /**
     * The Image 9.
     */
    @Getter
    @Setter
    private ImageLogo image9;
    /**
     * The Image 10.
     */
    @Getter
    @Setter
    private ImageLogo image10;
    /**
     * The Image 11.
     */
    @Getter
    @Setter
    private ImageLogo image11;

    /**
     * The Lawfirm.
     */
    @Getter
    @Setter
    private LawfirmDTO lawfirm;
}
