package com.ulegalize.dto;

import com.ulegalize.enumeration.EnumAccountType;
import com.ulegalize.enumeration.EnumLanguage;
import com.ulegalize.utils.Utils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankAccountDTO {

    private Integer compteId;
    private String vcKey;
    private String accountNumber;
    private String accountRef;
    private String userUpd;
    private Date dateUpd;
    private boolean archived;

    private Integer accountTypeId;
    private ItemDto accountTypeIdItem;

    public BankAccountDTO(Integer compteId, String vcKey, String accountNumber, String accountRef,
                          String userUpd, Date dateUpd, boolean archived, EnumAccountType enumAccountType, String enumLanguageCode) {
        this.compteId = compteId;
        this.vcKey = vcKey;
        this.accountNumber = accountNumber;
        this.accountRef = accountRef;
        this.userUpd = userUpd;
        this.dateUpd = dateUpd;
        this.archived = archived;
        this.accountTypeId = enumAccountType.getId();

        EnumLanguage enumLanguage = EnumLanguage.fromshortCode(enumLanguageCode);
        accountTypeIdItem = new ItemDto(enumAccountType.getId(), Utils.getLabel(enumLanguage, enumAccountType.name(), null));
    }
}
