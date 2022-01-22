package io.gauee.numismatist.items.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
public class Item {
    @Id
    private String id;
    private String name;
    private ItemType type;
    @OneToOne
    private Alloy alloy;
    private int nominal;
    private int issueVolume;
    private Date issueDate;
    private BigDecimal issuePrice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public Alloy getAlloy() {
        return alloy;
    }

    public void setAlloy(Alloy alloy) {
        this.alloy = alloy;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getIssueVolume() {
        return issueVolume;
    }

    public void setIssueVolume(int issueVolume) {
        this.issueVolume = issueVolume;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public BigDecimal getIssuePrice() {
        return issuePrice;
    }

    public void setIssuePrice(BigDecimal issuePrice) {
        this.issuePrice = issuePrice;
    }


    public Item withId(String id) {
        this.id = id;
        return this;
    }

    public Item withName(String name) {
        this.name = name;
        return this;
    }

    public Item withType(ItemType type) {
        this.type = type;
        return this;
    }

    public Item withAlloy(Alloy alloy) {
        this.alloy = alloy;
        return this;
    }

    public Item withNominal(int nominal) {
        this.nominal = nominal;
        return this;
    }

    public Item withIssueVolume(int issueVolume) {
        this.issueVolume = issueVolume;
        return this;
    }

    public Item withIssueDate(Date issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    public Item withIssuePrice(BigDecimal issuePrice) {
        this.issuePrice = issuePrice;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return nominal == item.nominal && issueVolume == item.issueVolume && Objects.equals(id, item.id) && Objects.equals(name, item.name) && type == item.type && Objects.equals(alloy, item.alloy) && Objects.equals(issueDate, item.issueDate) && Objects.equals(issuePrice, item.issuePrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, alloy, nominal, issueVolume, issueDate, issuePrice);
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", alloy=" + alloy +
                ", nominal=" + nominal +
                ", issueVolume=" + issueVolume +
                ", issueDate=" + issueDate +
                ", issuePrice=" + issuePrice +
                '}';
    }
}
