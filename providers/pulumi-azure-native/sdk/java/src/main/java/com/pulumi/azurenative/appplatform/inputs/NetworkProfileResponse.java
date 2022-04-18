// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.inputs;

import com.pulumi.azurenative.appplatform.inputs.NetworkProfileResponseOutboundIPs;
import com.pulumi.azurenative.appplatform.inputs.RequiredTrafficResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Service network profile payload
 * 
 */
public final class NetworkProfileResponse extends com.pulumi.resources.InvokeArgs {

    public static final NetworkProfileResponse Empty = new NetworkProfileResponse();

    /**
     * Name of the resource group containing network resources of Azure Spring Cloud Apps
     * 
     */
    @Import(name="appNetworkResourceGroup")
      private final @Nullable String appNetworkResourceGroup;

    public Optional<String> appNetworkResourceGroup() {
        return this.appNetworkResourceGroup == null ? Optional.empty() : Optional.ofNullable(this.appNetworkResourceGroup);
    }

    /**
     * Fully qualified resource Id of the subnet to host Azure Spring Cloud Apps
     * 
     */
    @Import(name="appSubnetId")
      private final @Nullable String appSubnetId;

    public Optional<String> appSubnetId() {
        return this.appSubnetId == null ? Optional.empty() : Optional.ofNullable(this.appSubnetId);
    }

    /**
     * Desired outbound IP resources for Azure Spring Cloud instance.
     * 
     */
    @Import(name="outboundIPs", required=true)
      private final NetworkProfileResponseOutboundIPs outboundIPs;

    public NetworkProfileResponseOutboundIPs outboundIPs() {
        return this.outboundIPs;
    }

    /**
     * Required inbound or outbound traffics for Azure Spring Cloud instance.
     * 
     */
    @Import(name="requiredTraffics", required=true)
      private final List<RequiredTrafficResponse> requiredTraffics;

    public List<RequiredTrafficResponse> requiredTraffics() {
        return this.requiredTraffics;
    }

    /**
     * Azure Spring Cloud service reserved CIDR
     * 
     */
    @Import(name="serviceCidr")
      private final @Nullable String serviceCidr;

    public Optional<String> serviceCidr() {
        return this.serviceCidr == null ? Optional.empty() : Optional.ofNullable(this.serviceCidr);
    }

    /**
     * Name of the resource group containing network resources of Azure Spring Cloud Service Runtime
     * 
     */
    @Import(name="serviceRuntimeNetworkResourceGroup")
      private final @Nullable String serviceRuntimeNetworkResourceGroup;

    public Optional<String> serviceRuntimeNetworkResourceGroup() {
        return this.serviceRuntimeNetworkResourceGroup == null ? Optional.empty() : Optional.ofNullable(this.serviceRuntimeNetworkResourceGroup);
    }

    /**
     * Fully qualified resource Id of the subnet to host Azure Spring Cloud Service Runtime
     * 
     */
    @Import(name="serviceRuntimeSubnetId")
      private final @Nullable String serviceRuntimeSubnetId;

    public Optional<String> serviceRuntimeSubnetId() {
        return this.serviceRuntimeSubnetId == null ? Optional.empty() : Optional.ofNullable(this.serviceRuntimeSubnetId);
    }

    public NetworkProfileResponse(
        @Nullable String appNetworkResourceGroup,
        @Nullable String appSubnetId,
        NetworkProfileResponseOutboundIPs outboundIPs,
        List<RequiredTrafficResponse> requiredTraffics,
        @Nullable String serviceCidr,
        @Nullable String serviceRuntimeNetworkResourceGroup,
        @Nullable String serviceRuntimeSubnetId) {
        this.appNetworkResourceGroup = appNetworkResourceGroup;
        this.appSubnetId = appSubnetId;
        this.outboundIPs = Objects.requireNonNull(outboundIPs, "expected parameter 'outboundIPs' to be non-null");
        this.requiredTraffics = Objects.requireNonNull(requiredTraffics, "expected parameter 'requiredTraffics' to be non-null");
        this.serviceCidr = serviceCidr;
        this.serviceRuntimeNetworkResourceGroup = serviceRuntimeNetworkResourceGroup;
        this.serviceRuntimeSubnetId = serviceRuntimeSubnetId;
    }

    private NetworkProfileResponse() {
        this.appNetworkResourceGroup = null;
        this.appSubnetId = null;
        this.outboundIPs = null;
        this.requiredTraffics = List.of();
        this.serviceCidr = null;
        this.serviceRuntimeNetworkResourceGroup = null;
        this.serviceRuntimeSubnetId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String appNetworkResourceGroup;
        private @Nullable String appSubnetId;
        private NetworkProfileResponseOutboundIPs outboundIPs;
        private List<RequiredTrafficResponse> requiredTraffics;
        private @Nullable String serviceCidr;
        private @Nullable String serviceRuntimeNetworkResourceGroup;
        private @Nullable String serviceRuntimeSubnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appNetworkResourceGroup = defaults.appNetworkResourceGroup;
    	      this.appSubnetId = defaults.appSubnetId;
    	      this.outboundIPs = defaults.outboundIPs;
    	      this.requiredTraffics = defaults.requiredTraffics;
    	      this.serviceCidr = defaults.serviceCidr;
    	      this.serviceRuntimeNetworkResourceGroup = defaults.serviceRuntimeNetworkResourceGroup;
    	      this.serviceRuntimeSubnetId = defaults.serviceRuntimeSubnetId;
        }

        public Builder appNetworkResourceGroup(@Nullable String appNetworkResourceGroup) {
            this.appNetworkResourceGroup = appNetworkResourceGroup;
            return this;
        }
        public Builder appSubnetId(@Nullable String appSubnetId) {
            this.appSubnetId = appSubnetId;
            return this;
        }
        public Builder outboundIPs(NetworkProfileResponseOutboundIPs outboundIPs) {
            this.outboundIPs = Objects.requireNonNull(outboundIPs);
            return this;
        }
        public Builder requiredTraffics(List<RequiredTrafficResponse> requiredTraffics) {
            this.requiredTraffics = Objects.requireNonNull(requiredTraffics);
            return this;
        }
        public Builder requiredTraffics(RequiredTrafficResponse... requiredTraffics) {
            return requiredTraffics(List.of(requiredTraffics));
        }
        public Builder serviceCidr(@Nullable String serviceCidr) {
            this.serviceCidr = serviceCidr;
            return this;
        }
        public Builder serviceRuntimeNetworkResourceGroup(@Nullable String serviceRuntimeNetworkResourceGroup) {
            this.serviceRuntimeNetworkResourceGroup = serviceRuntimeNetworkResourceGroup;
            return this;
        }
        public Builder serviceRuntimeSubnetId(@Nullable String serviceRuntimeSubnetId) {
            this.serviceRuntimeSubnetId = serviceRuntimeSubnetId;
            return this;
        }        public NetworkProfileResponse build() {
            return new NetworkProfileResponse(appNetworkResourceGroup, appSubnetId, outboundIPs, requiredTraffics, serviceCidr, serviceRuntimeNetworkResourceGroup, serviceRuntimeSubnetId);
        }
    }
}
