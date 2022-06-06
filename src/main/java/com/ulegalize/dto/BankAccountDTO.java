package com.ulegalize.dto;

import com.ulegalize.enumeration.EnumAccountType;
import com.ulegalize.enumeration.EnumLanguage;
import com.ulegalize.utils.Utils;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;


@Data
@AllArgsConstructor
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

    public BankAccountDTO() {
    }

    public BankAccountDTO(Integer compteId, String vcKey, String accountNumber, String accountRef,
                          String userUpd, Date dateUpd, boolean archived, EnumAccountType enumAccountType, EnumLanguage enumLanguage) {
        this.compteId = compteId;
        this.vcKey = vcKey;
        this.accountNumber = accountNumber;
        this.accountRef = accountRef;
        this.userUpd = userUpd;
        this.dateUpd = dateUpd;
        this.archived = archived;
        this.accountTypeId = enumAccountType.getId();
        String label = Utils.getLabel(enumLanguage, enumAccountType.name(), null);

        accountTypeIdItem = new ItemDto(enumAccountType.getId(), label);
    }
}
