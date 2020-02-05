/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * An environment, which is essentially an ARM template deployment.
 */
@JsonFlatten
public class DtlEnvironmentFragment extends UpdateResource {
    /**
     * The deployment properties of the environment.
     */
    @JsonProperty(value = "properties.deploymentProperties")
    private EnvironmentDeploymentPropertiesFragment deploymentProperties;

    /**
     * The display name of the Azure Resource Manager template that produced
     * the environment.
     */
    @JsonProperty(value = "properties.armTemplateDisplayName")
    private String armTemplateDisplayName;

    /**
     * Get the deployment properties of the environment.
     *
     * @return the deploymentProperties value
     */
    public EnvironmentDeploymentPropertiesFragment deploymentProperties() {
        return this.deploymentProperties;
    }

    /**
     * Set the deployment properties of the environment.
     *
     * @param deploymentProperties the deploymentProperties value to set
     * @return the DtlEnvironmentFragment object itself.
     */
    public DtlEnvironmentFragment withDeploymentProperties(EnvironmentDeploymentPropertiesFragment deploymentProperties) {
        this.deploymentProperties = deploymentProperties;
        return this;
    }

    /**
     * Get the display name of the Azure Resource Manager template that produced the environment.
     *
     * @return the armTemplateDisplayName value
     */
    public String armTemplateDisplayName() {
        return this.armTemplateDisplayName;
    }

    /**
     * Set the display name of the Azure Resource Manager template that produced the environment.
     *
     * @param armTemplateDisplayName the armTemplateDisplayName value to set
     * @return the DtlEnvironmentFragment object itself.
     */
    public DtlEnvironmentFragment withArmTemplateDisplayName(String armTemplateDisplayName) {
        this.armTemplateDisplayName = armTemplateDisplayName;
        return this;
    }

}