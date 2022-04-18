// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.outputs;

import com.pulumi.azurenative.appplatform.outputs.NetworkProfileResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterResourcePropertiesResponse {
    /**
     * Network profile of the Service
     * 
     */
    private final @Nullable NetworkProfileResponse networkProfile;
    /**
     * Provisioning state of the Service
     * 
     */
    private final String provisioningState;
    /**
     * ServiceInstanceEntity GUID which uniquely identifies a created resource
     * 
     */
    private final String serviceId;
    /**
     * Version of the Service
     * 
     */
    private final Integer version;

    @CustomType.Constructor
    private ClusterResourcePropertiesResponse(
        @CustomType.Parameter("networkProfile") @Nullable NetworkProfileResponse networkProfile,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("serviceId") String serviceId,
        @CustomType.Parameter("version") Integer version) {
        this.networkProfile = networkProfile;
        this.provisioningState = provisioningState;
        this.serviceId = serviceId;
        this.version = version;
    }

    /**
     * Network profile of the Service
     * 
    */
    public Optional<NetworkProfileResponse> networkProfile() {
        return Optional.ofNullable(this.networkProfile);
    }
    /**
     * Provisioning state of the Service
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * ServiceInstanceEntity GUID which uniquely identifies a created resource
     * 
    */
    public String serviceId() {
        return this.serviceId;
    }
    /**
     * Version of the Service
     * 
    */
    public Integer version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterResourcePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable NetworkProfileResponse networkProfile;
        private String provisioningState;
        private String serviceId;
        private Integer version;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterResourcePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkProfile = defaults.networkProfile;
    	      this.provisioningState = defaults.provisioningState;
    	      this.serviceId = defaults.serviceId;
    	      this.version = defaults.version;
        }

        public Builder networkProfile(@Nullable NetworkProfileResponse networkProfile) {
            this.networkProfile = networkProfile;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder serviceId(String serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }
        public Builder version(Integer version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public ClusterResourcePropertiesResponse build() {
            return new ClusterResourcePropertiesResponse(networkProfile, provisioningState, serviceId, version);
        }
    }
}
