/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.2.2.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.keyvault.models;

import com.microsoft.rest.Base64Url;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The key restore parameters.
 */
public class KeyRestoreParameters {
    /**
     * The backup blob associated with a key bundle.
     */
    @JsonProperty(value = "value", required = true)
    private Base64Url keyBundleBackup;

    /**
     * Get the keyBundleBackup value.
     *
     * @return the keyBundleBackup value
     */
    public byte[] keyBundleBackup() {
        if (this.keyBundleBackup == null) {
            return null;
        }
        return this.keyBundleBackup.decodedBytes();
    }

    /**
     * Set the keyBundleBackup value.
     *
     * @param keyBundleBackup the keyBundleBackup value to set
     * @return the KeyRestoreParameters object itself.
     */
    public KeyRestoreParameters withKeyBundleBackup(byte[] keyBundleBackup) {
        if (keyBundleBackup == null) {
            this.keyBundleBackup = null;
        } else {
            this.keyBundleBackup = Base64Url.encode(keyBundleBackup);
        }
        return this;
    }

}
