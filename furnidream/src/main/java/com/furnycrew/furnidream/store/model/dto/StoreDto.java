package com.furnycrew.furnidream.store.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StoreDto {
    private int storeId;
    private String businessNum;
    private String storeName;
    private String ceoName;
    private String ceoPhone;
    private String ceoEmail;
    private String businessAddress;
    private String businessStatus;
    private String businessCategory;
    private String stampImage;
    private char mailOrderYn;
    private String mailOrderNum;
}
