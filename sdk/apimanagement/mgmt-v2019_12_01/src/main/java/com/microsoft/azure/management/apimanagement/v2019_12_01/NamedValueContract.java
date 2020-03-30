/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.apimanagement.v2019_12_01.implementation.NamedValueContractInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.apimanagement.v2019_12_01.implementation.ApiManagementManager;
import java.util.List;

/**
 * Type representing NamedValueContract.
 */
public interface NamedValueContract extends HasInner<NamedValueContractInner>, Indexable, Updatable<NamedValueContract.Update>, HasManager<ApiManagementManager> {
    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the secret value.
     */
    Boolean secret();

    /**
     * @return the tags value.
     */
    List<String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the value value.
     */
    String value();

    /**
     * The entirety of the NamedValueContract definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithResourceGroupName, DefinitionStages.WithServiceName, DefinitionStages.WithIfMatch, DefinitionStages.WithDisplayName, DefinitionStages.WithValue, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of NamedValueContract definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a NamedValueContract definition.
         */
        interface Blank extends WithResourceGroupName {
        }

        /**
         * The stage of the namedvaluecontract definition allowing to specify ResourceGroupName.
         */
        interface WithResourceGroupName {
           /**
            * Specifies resourceGroupName.
            * @param resourceGroupName The name of the resource group
            * @return the next definition stage
            */
            WithServiceName withResourceGroupName(String resourceGroupName);
        }

        /**
         * The stage of the namedvaluecontract definition allowing to specify ServiceName.
         */
        interface WithServiceName {
           /**
            * Specifies serviceName.
            * @param serviceName The name of the API Management service
            * @return the next definition stage
            */
            WithIfMatch withServiceName(String serviceName);
        }

        /**
         * The stage of the namedvaluecontract definition allowing to specify IfMatch.
         */
        interface WithIfMatch {
           /**
            * Specifies ifMatch.
            * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity
            * @return the next definition stage
            */
            WithDisplayName withIfMatch(String ifMatch);
        }

        /**
         * The stage of the namedvaluecontract definition allowing to specify DisplayName.
         */
        interface WithDisplayName {
           /**
            * Specifies displayName.
            * @param displayName Unique name of NamedValue. It may contain only letters, digits, period, dash, and underscore characters
            * @return the next definition stage
            */
            WithValue withDisplayName(String displayName);
        }

        /**
         * The stage of the namedvaluecontract definition allowing to specify Value.
         */
        interface WithValue {
           /**
            * Specifies value.
            * @param value Value of the NamedValue. Can contain policy expressions. It may not be empty or consist only of whitespace. This property will not be filled on 'GET' operations! Use '/listSecrets' POST request to get the value
            * @return the next definition stage
            */
            WithCreate withValue(String value);
        }

        /**
         * The stage of the namedvaluecontract definition allowing to specify Secret.
         */
        interface WithSecret {
            /**
             * Specifies secret.
             * @param secret Determines whether the value is a secret and should be encrypted or not. Default value is false
             * @return the next definition stage
             */
            WithCreate withSecret(Boolean secret);
        }

        /**
         * The stage of the namedvaluecontract definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Optional tags that when provided can be used to filter the NamedValue list
             * @return the next definition stage
             */
            WithCreate withTags(List<String> tags);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<NamedValueContract>, DefinitionStages.WithSecret, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a NamedValueContract update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<NamedValueContract>, UpdateStages.WithIfMatch, UpdateStages.WithDisplayName, UpdateStages.WithSecret, UpdateStages.WithTags, UpdateStages.WithValue {
    }

    /**
     * Grouping of NamedValueContract update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the namedvaluecontract update allowing to specify IfMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies ifMatch.
             * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET request or it should be * for unconditional update
             * @return the next update stage
             */
            Update withIfMatch(String ifMatch);
        }

        /**
         * The stage of the namedvaluecontract update allowing to specify DisplayName.
         */
        interface WithDisplayName {
            /**
             * Specifies displayName.
             * @param displayName Unique name of NamedValue. It may contain only letters, digits, period, dash, and underscore characters
             * @return the next update stage
             */
            Update withDisplayName(String displayName);
        }

        /**
         * The stage of the namedvaluecontract update allowing to specify Secret.
         */
        interface WithSecret {
            /**
             * Specifies secret.
             * @param secret Determines whether the value is a secret and should be encrypted or not. Default value is false
             * @return the next update stage
             */
            Update withSecret(Boolean secret);
        }

        /**
         * The stage of the namedvaluecontract update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Optional tags that when provided can be used to filter the NamedValue list
             * @return the next update stage
             */
            Update withTags(List<String> tags);
        }

        /**
         * The stage of the namedvaluecontract update allowing to specify Value.
         */
        interface WithValue {
            /**
             * Specifies value.
             * @param value Value of the NamedValue. Can contain policy expressions. It may not be empty or consist only of whitespace
             * @return the next update stage
             */
            Update withValue(String value);
        }

    }
}