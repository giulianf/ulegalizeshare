
package com.ulegalize.dto.template;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;
import java.util.List;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@Data
@NoArgsConstructor
public class Content {

    private String fileName;
    private List<String> type;
    private String value;

}
