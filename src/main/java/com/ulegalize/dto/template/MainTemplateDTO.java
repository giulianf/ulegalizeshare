package com.ulegalize.dto.template;

import com.ulegalize.dto.LawfirmDTO;
import lombok.Getter;
import lombok.Setter;
import net.minidev.json.JSONObject;

public abstract class MainTemplateDTO extends JSONObject {
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private ImageLogo image_logo;

    @Getter
    @Setter
    private LawfirmDTO lawfirm;
}
