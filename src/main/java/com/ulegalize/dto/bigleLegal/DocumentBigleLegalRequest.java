
package com.ulegalize.dto.bigleLegal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocumentBigleLegalRequest<T> {

    private String documentName;
    private String userEmail;
    private String templateUid;
    private String clientId;
    private T main;

}
