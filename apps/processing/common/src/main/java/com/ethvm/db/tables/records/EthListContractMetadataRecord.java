/*
 * This file is generated by jOOQ.
 */
package com.ethvm.db.tables.records;


import com.ethvm.db.tables.EthListContractMetadata;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.12"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EthListContractMetadataRecord extends UpdatableRecordImpl<EthListContractMetadataRecord> implements Record10<String, String, String, Integer, String, String, String, String, String, String> {

    private static final long serialVersionUID = 486844336;

    /**
     * Setter for <code>public.eth_list_contract_metadata.address</code>.
     */
    public EthListContractMetadataRecord setAddress(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.eth_list_contract_metadata.address</code>.
     */
    public String getAddress() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.eth_list_contract_metadata.name</code>.
     */
    public EthListContractMetadataRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.eth_list_contract_metadata.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.eth_list_contract_metadata.symbol</code>.
     */
    public EthListContractMetadataRecord setSymbol(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.eth_list_contract_metadata.symbol</code>.
     */
    public String getSymbol() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.eth_list_contract_metadata.decimals</code>.
     */
    public EthListContractMetadataRecord setDecimals(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.eth_list_contract_metadata.decimals</code>.
     */
    public Integer getDecimals() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.eth_list_contract_metadata.ens_address</code>.
     */
    public EthListContractMetadataRecord setEnsAddress(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.eth_list_contract_metadata.ens_address</code>.
     */
    public String getEnsAddress() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.eth_list_contract_metadata.type</code>.
     */
    public EthListContractMetadataRecord setType(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.eth_list_contract_metadata.type</code>.
     */
    public String getType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.eth_list_contract_metadata.logo</code>.
     */
    public EthListContractMetadataRecord setLogo(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.eth_list_contract_metadata.logo</code>.
     */
    public String getLogo() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.eth_list_contract_metadata.support</code>.
     */
    public EthListContractMetadataRecord setSupport(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.eth_list_contract_metadata.support</code>.
     */
    public String getSupport() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.eth_list_contract_metadata.social</code>.
     */
    public EthListContractMetadataRecord setSocial(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.eth_list_contract_metadata.social</code>.
     */
    public String getSocial() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.eth_list_contract_metadata.website</code>.
     */
    public EthListContractMetadataRecord setWebsite(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.eth_list_contract_metadata.website</code>.
     */
    public String getWebsite() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, String, String, Integer, String, String, String, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, String, String, Integer, String, String, String, String, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return EthListContractMetadata.ETH_LIST_CONTRACT_METADATA.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return EthListContractMetadata.ETH_LIST_CONTRACT_METADATA.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return EthListContractMetadata.ETH_LIST_CONTRACT_METADATA.SYMBOL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return EthListContractMetadata.ETH_LIST_CONTRACT_METADATA.DECIMALS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return EthListContractMetadata.ETH_LIST_CONTRACT_METADATA.ENS_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return EthListContractMetadata.ETH_LIST_CONTRACT_METADATA.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return EthListContractMetadata.ETH_LIST_CONTRACT_METADATA.LOGO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return EthListContractMetadata.ETH_LIST_CONTRACT_METADATA.SUPPORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return EthListContractMetadata.ETH_LIST_CONTRACT_METADATA.SOCIAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return EthListContractMetadata.ETH_LIST_CONTRACT_METADATA.WEBSITE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSymbol();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getDecimals();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getEnsAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getLogo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getSupport();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getSocial();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getWebsite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSymbol();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getDecimals();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getEnsAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getLogo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getSupport();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getSocial();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getWebsite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EthListContractMetadataRecord value1(String value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EthListContractMetadataRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EthListContractMetadataRecord value3(String value) {
        setSymbol(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EthListContractMetadataRecord value4(Integer value) {
        setDecimals(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EthListContractMetadataRecord value5(String value) {
        setEnsAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EthListContractMetadataRecord value6(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EthListContractMetadataRecord value7(String value) {
        setLogo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EthListContractMetadataRecord value8(String value) {
        setSupport(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EthListContractMetadataRecord value9(String value) {
        setSocial(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EthListContractMetadataRecord value10(String value) {
        setWebsite(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EthListContractMetadataRecord values(String value1, String value2, String value3, Integer value4, String value5, String value6, String value7, String value8, String value9, String value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EthListContractMetadataRecord
     */
    public EthListContractMetadataRecord() {
        super(EthListContractMetadata.ETH_LIST_CONTRACT_METADATA);
    }

    /**
     * Create a detached, initialised EthListContractMetadataRecord
     */
    public EthListContractMetadataRecord(String address, String name, String symbol, Integer decimals, String ensAddress, String type, String logo, String support, String social, String website) {
        super(EthListContractMetadata.ETH_LIST_CONTRACT_METADATA);

        set(0, address);
        set(1, name);
        set(2, symbol);
        set(3, decimals);
        set(4, ensAddress);
        set(5, type);
        set(6, logo);
        set(7, support);
        set(8, social);
        set(9, website);
    }
}