package com.developer.compsTFT.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "Item")
@Table(name = "items")
public @Data class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_item")
    private Integer idItem;
    @Column(name = "id_item_tft")
    private Integer idItemTft;
    @Column(name = "item_name")
    private String itemName;
    @Column(name = "item_description")
    private String itemDescription;
    @Column(name = "active")
    private Boolean active;
    @Column(name = "in_store")
    private Boolean inStore;
    @Column(name = "max_stacks")
    private Integer maxStacks;
    @Column(name = "required_champion")
    private String requiredChampion;
    @Column(name = "required_ally")
    private String requiredAlly;
    @Column(name = "required_buff_currency_name")
    private String requiredBuffCurrencyName;
    @Column(name = "required_buff_currency_cost")
    private Integer requiredBuffCurrencyCost;
    @Column(name = "special_recipe")
    private Integer specialRecipe;
    @Column(name = "is_enchantment")
    private Boolean isEnchantment;
    @Column(name = "price")
    private Integer price;
    @Column(name = "price_total")
    private Integer priceTotal;
    @Column(name = "display_in_item_sets")
    private Boolean displayInItemSets;
    @Column(name = "icon_path")
    private String iconPath;

}
