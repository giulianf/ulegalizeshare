package com.ulegalize.dto;

import com.ulegalize.enumeration.EnumVCOwner;
import lombok.Data;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.List;

@Data
public class ShareAffaireDTO implements Serializable {

    private Long id;
    private Long affaireId;
    private String vcKey;
    private List<String> vcKeyList;
    private ItemStringDto vcKeyItem;
    private boolean allMembers;
    private List<Long> userIdSelected;
    private Long userId;
    private EnumVCOwner enumVCOwner;
    private String userEmail;
    private String fullname;
    private ZonedDateTime sharedDate;

    public ShareAffaireDTO() {
    }

    public ShareAffaireDTO(Long id,
                           Long affaireId,
                           Long userId,
                           String vcKey,
                           EnumVCOwner enumVCOwner,
                           String userEmail,
                           String fullname,
                           ZonedDateTime sharedDate) {
        this.id = id;
        this.affaireId = affaireId;
        this.userId = userId;
        this.vcKey = vcKey;
        this.vcKeyItem = new ItemStringDto(vcKey, vcKey);
        this.enumVCOwner = enumVCOwner;
        this.userEmail = userEmail;
        this.fullname = fullname;
        this.sharedDate = sharedDate;
    }
}
