package com.examplebackend.Backend.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class AminoAcid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private String name;
    @NotNull
    private String abbreviatedName;
    @NotNull
    private String symbolName;
    @NotNull
    private String R_groupClass;
    private String imageUrl;
    @NotNull
    private float occurrenceInProteins;
    // In AMUs
    @NotNull
    private int molecularWeight;
    @NotNull
    private float pk1_COOH;
    @NotNull
    private float pk2_NH3;
    private float pkR;
    @NotNull
    private float pI;

    public AminoAcid() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviatedName() {
        return abbreviatedName;
    }

    public void setAbbreviatedName(String abbreviatedName) {
        this.abbreviatedName = abbreviatedName;
    }

    public String getSymbolName() {
        return symbolName;
    }

    public void setSymbolName(String symbolName) {
        this.symbolName = symbolName;
    }

    public String getR_groupClass() {
        return R_groupClass;
    }

    public void setR_groupClass(String r_groupClass) {
        R_groupClass = r_groupClass;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public float getOccurrenceInProteins() {
        return occurrenceInProteins;
    }

    public void setOccurrenceInProteins(float occurrenceInProteins) {
        this.occurrenceInProteins = occurrenceInProteins;
    }

    public int getMolecularWeight() {
        return molecularWeight;
    }

    public void setMolecularWeight(int molecularWeight) {
        this.molecularWeight = molecularWeight;
    }

    public float getPk1_COOH() {
        return pk1_COOH;
    }

    public void setPk1_COOH(float pk1_COOH) {
        this.pk1_COOH = pk1_COOH;
    }

    public float getPk2_NH3() {
        return pk2_NH3;
    }

    public void setPk2_NH3(float pk2_NH3) {
        this.pk2_NH3 = pk2_NH3;
    }

    public float getPkR() {
        return pkR;
    }

    public void setPkR(float pkR) {
        this.pkR = pkR;
    }

    public float getpI() {
        return pI;
    }

    public void setpI(float pI) {
        this.pI = pI;
    }
}
