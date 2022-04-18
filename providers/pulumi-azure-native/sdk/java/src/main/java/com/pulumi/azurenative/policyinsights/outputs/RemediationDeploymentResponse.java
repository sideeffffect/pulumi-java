// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.policyinsights.outputs;

import com.pulumi.azurenative.policyinsights.outputs.ErrorDefinitionResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RemediationDeploymentResponse {
    /**
     * The time at which the remediation was created.
     * 
     */
    private final String createdOn;
    /**
     * Resource ID of the template deployment that will remediate the resource.
     * 
     */
    private final String deploymentId;
    /**
     * Error encountered while remediated the resource.
     * 
     */
    private final ErrorDefinitionResponse error;
    /**
     * The time at which the remediation deployment was last updated.
     * 
     */
    private final String lastUpdatedOn;
    /**
     * Resource ID of the resource that is being remediated by the deployment.
     * 
     */
    private final String remediatedResourceId;
    /**
     * Location of the resource that is being remediated.
     * 
     */
    private final String resourceLocation;
    /**
     * Status of the remediation deployment.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private RemediationDeploymentResponse(
        @CustomType.Parameter("createdOn") String createdOn,
        @CustomType.Parameter("deploymentId") String deploymentId,
        @CustomType.Parameter("error") ErrorDefinitionResponse error,
        @CustomType.Parameter("lastUpdatedOn") String lastUpdatedOn,
        @CustomType.Parameter("remediatedResourceId") String remediatedResourceId,
        @CustomType.Parameter("resourceLocation") String resourceLocation,
        @CustomType.Parameter("status") String status) {
        this.createdOn = createdOn;
        this.deploymentId = deploymentId;
        this.error = error;
        this.lastUpdatedOn = lastUpdatedOn;
        this.remediatedResourceId = remediatedResourceId;
        this.resourceLocation = resourceLocation;
        this.status = status;
    }

    /**
     * The time at which the remediation was created.
     * 
    */
    public String createdOn() {
        return this.createdOn;
    }
    /**
     * Resource ID of the template deployment that will remediate the resource.
     * 
    */
    public String deploymentId() {
        return this.deploymentId;
    }
    /**
     * Error encountered while remediated the resource.
     * 
    */
    public ErrorDefinitionResponse error() {
        return this.error;
    }
    /**
     * The time at which the remediation deployment was last updated.
     * 
    */
    public String lastUpdatedOn() {
        return this.lastUpdatedOn;
    }
    /**
     * Resource ID of the resource that is being remediated by the deployment.
     * 
    */
    public String remediatedResourceId() {
        return this.remediatedResourceId;
    }
    /**
     * Location of the resource that is being remediated.
     * 
    */
    public String resourceLocation() {
        return this.resourceLocation;
    }
    /**
     * Status of the remediation deployment.
     * 
    */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RemediationDeploymentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdOn;
        private String deploymentId;
        private ErrorDefinitionResponse error;
        private String lastUpdatedOn;
        private String remediatedResourceId;
        private String resourceLocation;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(RemediationDeploymentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdOn = defaults.createdOn;
    	      this.deploymentId = defaults.deploymentId;
    	      this.error = defaults.error;
    	      this.lastUpdatedOn = defaults.lastUpdatedOn;
    	      this.remediatedResourceId = defaults.remediatedResourceId;
    	      this.resourceLocation = defaults.resourceLocation;
    	      this.status = defaults.status;
        }

        public Builder createdOn(String createdOn) {
            this.createdOn = Objects.requireNonNull(createdOn);
            return this;
        }
        public Builder deploymentId(String deploymentId) {
            this.deploymentId = Objects.requireNonNull(deploymentId);
            return this;
        }
        public Builder error(ErrorDefinitionResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }
        public Builder lastUpdatedOn(String lastUpdatedOn) {
            this.lastUpdatedOn = Objects.requireNonNull(lastUpdatedOn);
            return this;
        }
        public Builder remediatedResourceId(String remediatedResourceId) {
            this.remediatedResourceId = Objects.requireNonNull(remediatedResourceId);
            return this;
        }
        public Builder resourceLocation(String resourceLocation) {
            this.resourceLocation = Objects.requireNonNull(resourceLocation);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public RemediationDeploymentResponse build() {
            return new RemediationDeploymentResponse(createdOn, deploymentId, error, lastUpdatedOn, remediatedResourceId, resourceLocation, status);
        }
    }
}
