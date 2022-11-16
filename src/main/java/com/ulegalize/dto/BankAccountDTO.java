package com.ulegalize.dto;

import com.ulegalize.enumeration.EnumAccountType;
import com.ulegalize.enumeration.EnumLanguage;
import com.ulegalize.utils.Utils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


/**
 * The type Bank account dto.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankAccountDTO {

    /**
     * The Compte id.
     */
    private Integer compteId;
    /**
     * The Vc key.
     */
    private String vcKey;
    /**
     * The Account number.
     */
    private String accountNumber;
    /**
     * The Account ref.
     */
    private String accountRef;
    /**
     * The User upd.
     */
    private String userUpd;
    /**
     * The Date upd.
     */
    private Date dateUpd;
    /**
     * The Archived.
     */
    private boolean archived;

    /**
     * The Account type id.
     */
    private Integer accountTypeId;
    /**
     * The Account type id item.
     */
    private ItemDto accountTypeIdItem;

    /**
     * Instantiates a new Bank account dto.
     *
     * @param compteId         the compte id
     * @param vcKey            the vc key
     * @param accountNumber    the account number
     * @param accountRef       the account ref
     * @param userUpd          the user upd
     * @param dateUpd          the date upd
     * @param archived         the archived
     * @param enumAccountType  the enum account type
     * @param enumLanguageCode the enum language code
     */
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
