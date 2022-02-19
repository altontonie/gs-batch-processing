package com.example.batchprocessing;
//        `id` bigint(20) NOT NULL,
//        `created_by` varchar(50) NOT NULL,
//        `created_date` datetime(6) DEFAULT NULL,
//        `last_modified_by` varchar(50) DEFAULT NULL,
//        `last_modified_date` datetime(6) DEFAULT NULL,
//        `version` bigint(20) NOT NULL,
//        `amount` varchar(255) DEFAULT NULL,
//        `bill_reference` varchar(255) DEFAULT NULL,
//        `channel` varchar(255) DEFAULT NULL,
//        `msidsn` varchar(255) DEFAULT NULL,
//        `participant_ref` varchar(255) DEFAULT NULL,
//        `provider` varchar(255) DEFAULT NULL,
//        `provider_product` varchar(255) DEFAULT NULL,
//        `remote_ref` varchar(255) DEFAULT NULL,
//        `response` varchar(255) DEFAULT NULL,
//        `reversed` bit(1) DEFAULT NULL,
//        `status` varchar(255) DEFAULT NULL

import lombok.Data;

@Data
public class BillPayment {
    private String id;
    private String created_by;
    private String created_date;
    private String last_modified_by;
    private String last_modified_date;
    private String version;
    private String amount;
    private String bill_reference;
    private String channel;
    private String msidsn;
    private String participant_ref;
    private String provider;
    private String provider_product;
    private String remote_ref;
    private String response;
    private String reversed;
    private String status;

    public BillPayment(String id, String created_by, String created_date, String last_modified_by, String last_modified_date, String version, String amount, String bill_reference, String channel, String msidsn, String participant_ref, String provider, String provider_product, String remote_ref, String response, String reversed, String status) {
        this.id = id;
        this.created_by = created_by;
        this.created_date = created_date;
        this.last_modified_by = last_modified_by;
        this.last_modified_date = last_modified_date;
        this.version = version;
        this.amount = amount;
        this.bill_reference = bill_reference;
        this.channel = channel;
        this.msidsn = msidsn;
        this.participant_ref = participant_ref;
        this.provider = provider;
        this.provider_product = provider_product;
        this.remote_ref = remote_ref;
        this.response = response;
        this.reversed = reversed;
        this.status = status;
    }
    @Override
    public String toString() {
        return "BillPayment{" +
                "id='" + id + '\'' +
                ", created_by='" + created_by + '\'' +
                ", created_date='" + created_date + '\'' +
                ", last_modified_by='" + last_modified_by + '\'' +
                ", last_modified_date='" + last_modified_date + '\'' +
                ", version='" + version + '\'' +
                ", amount='" + amount + '\'' +
                ", bill_reference='" + bill_reference + '\'' +
                ", channel='" + channel + '\'' +
                ", msidsn='" + msidsn + '\'' +
                ", participant_ref='" + participant_ref + '\'' +
                ", provider='" + provider + '\'' +
                ", provider_product='" + provider_product + '\'' +
                ", remote_ref='" + remote_ref + '\'' +
                ", response='" + response + '\'' +
                ", reversed='" + reversed + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public BillPayment(String string, String rsString, String s, String string1, String rsString1, String s1, String string2, String rsString2, String s2, String string3, String rsString3, String s3, String string4, String rsString4, String s4, String string5) {
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getLast_modified_by() {
        return last_modified_by;
    }

    public void setLast_modified_by(String last_modified_by) {
        this.last_modified_by = last_modified_by;
    }

    public String getLast_modified_date() {
        return last_modified_date;
    }

    public void setLast_modified_date(String last_modified_date) {
        this.last_modified_date = last_modified_date;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getBill_reference() {
        return bill_reference;
    }

    public void setBill_reference(String bill_reference) {
        this.bill_reference = bill_reference;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getMsidsn() {
        return msidsn;
    }

    public void setMsidsn(String msidsn) {
        this.msidsn = msidsn;
    }

    public String getParticipant_ref() {
        return participant_ref;
    }

    public void setParticipant_ref(String participant_ref) {
        this.participant_ref = participant_ref;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getProvider_product() {
        return provider_product;
    }

    public void setProvider_product(String provider_product) {
        this.provider_product = provider_product;
    }

    public String getRemote_ref() {
        return remote_ref;
    }

    public void setRemote_ref(String remote_ref) {
        this.remote_ref = remote_ref;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getReversed() {
        return reversed;
    }

    public void setReversed(String reversed) {
        this.reversed = reversed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

