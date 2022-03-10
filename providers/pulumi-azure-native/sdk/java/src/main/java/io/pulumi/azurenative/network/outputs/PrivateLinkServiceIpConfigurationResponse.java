// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.SubnetResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PrivateLinkServiceIpConfigurationResponse {
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * The name of private link service ip configuration.
     * 
     */
    private final @Nullable String name;
    /**
     * Whether the ip configuration is primary or not.
     * 
     */
    private final @Nullable Boolean primary;
    /**
     * The private IP address of the IP configuration.
     * 
     */
    private final @Nullable String privateIPAddress;
    /**
     * Whether the specific IP configuration is IPv4 or IPv6. Default is IPv4.
     * 
     */
    private final @Nullable String privateIPAddressVersion;
    /**
     * The private IP address allocation method.
     * 
     */
    private final @Nullable String privateIPAllocationMethod;
    /**
     * The provisioning state of the private link service IP configuration resource.
     * 
     */
    private final String provisioningState;
    /**
     * The reference to the subnet resource.
     * 
     */
    private final @Nullable SubnetResponse subnet;
    /**
     * The resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private PrivateLinkServiceIpConfigurationResponse(
        @OutputCustomType.Parameter("etag") String etag,
        @OutputCustomType.Parameter("id") @Nullable String id,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("primary") @Nullable Boolean primary,
        @OutputCustomType.Parameter("privateIPAddress") @Nullable String privateIPAddress,
        @OutputCustomType.Parameter("privateIPAddressVersion") @Nullable String privateIPAddressVersion,
        @OutputCustomType.Parameter("privateIPAllocationMethod") @Nullable String privateIPAllocationMethod,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("subnet") @Nullable SubnetResponse subnet,
        @OutputCustomType.Parameter("type") String type) {
        this.etag = etag;
        this.id = id;
        this.name = name;
        this.primary = primary;
        this.privateIPAddress = privateIPAddress;
        this.privateIPAddressVersion = privateIPAddressVersion;
        this.privateIPAllocationMethod = privateIPAllocationMethod;
        this.provisioningState = provisioningState;
        this.subnet = subnet;
        this.type = type;
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The name of private link service ip configuration.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Whether the ip configuration is primary or not.
     * 
    */
    public Optional<Boolean> getPrimary() {
        return Optional.ofNullable(this.primary);
    }
    /**
     * The private IP address of the IP configuration.
     * 
    */
    public Optional<String> getPrivateIPAddress() {
        return Optional.ofNullable(this.privateIPAddress);
    }
    /**
     * Whether the specific IP configuration is IPv4 or IPv6. Default is IPv4.
     * 
    */
    public Optional<String> getPrivateIPAddressVersion() {
        return Optional.ofNullable(this.privateIPAddressVersion);
    }
    /**
     * The private IP address allocation method.
     * 
    */
    public Optional<String> getPrivateIPAllocationMethod() {
        return Optional.ofNullable(this.privateIPAllocationMethod);
    }
    /**
     * The provisioning state of the private link service IP configuration resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The reference to the subnet resource.
     * 
    */
    public Optional<SubnetResponse> getSubnet() {
        return Optional.ofNullable(this.subnet);
    }
    /**
     * The resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceIpConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable Boolean primary;
        private @Nullable String privateIPAddress;
        private @Nullable String privateIPAddressVersion;
        private @Nullable String privateIPAllocationMethod;
        private String provisioningState;
        private @Nullable SubnetResponse subnet;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceIpConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.primary = defaults.primary;
    	      this.privateIPAddress = defaults.privateIPAddress;
    	      this.privateIPAddressVersion = defaults.privateIPAddressVersion;
    	      this.privateIPAllocationMethod = defaults.privateIPAllocationMethod;
    	      this.provisioningState = defaults.provisioningState;
    	      this.subnet = defaults.subnet;
    	      this.type = defaults.type;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder primary(@Nullable Boolean primary) {
            this.primary = primary;
            return this;
        }

        public Builder privateIPAddress(@Nullable String privateIPAddress) {
            this.privateIPAddress = privateIPAddress;
            return this;
        }

        public Builder privateIPAddressVersion(@Nullable String privateIPAddressVersion) {
            this.privateIPAddressVersion = privateIPAddressVersion;
            return this;
        }

        public Builder privateIPAllocationMethod(@Nullable String privateIPAllocationMethod) {
            this.privateIPAllocationMethod = privateIPAllocationMethod;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder subnet(@Nullable SubnetResponse subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public PrivateLinkServiceIpConfigurationResponse build() {
            return new PrivateLinkServiceIpConfigurationResponse(etag, id, name, primary, privateIPAddress, privateIPAddressVersion, privateIPAllocationMethod, provisioningState, subnet, type);
        }
    }
}
