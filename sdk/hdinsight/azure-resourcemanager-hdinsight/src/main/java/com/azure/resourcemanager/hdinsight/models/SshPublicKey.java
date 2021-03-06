// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SSH public key for the cluster nodes. */
@Fluent
public final class SshPublicKey {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SshPublicKey.class);

    /*
     * The certificate for SSH.
     */
    @JsonProperty(value = "certificateData")
    private String certificateData;

    /**
     * Get the certificateData property: The certificate for SSH.
     *
     * @return the certificateData value.
     */
    public String certificateData() {
        return this.certificateData;
    }

    /**
     * Set the certificateData property: The certificate for SSH.
     *
     * @param certificateData the certificateData value to set.
     * @return the SshPublicKey object itself.
     */
    public SshPublicKey withCertificateData(String certificateData) {
        this.certificateData = certificateData;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
