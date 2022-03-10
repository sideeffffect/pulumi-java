// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ApplicationGatewayPrivateLinkIpConfigurationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationGatewayPrivateLinkConfigurationResponse {
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
     * An array of application gateway private link ip configurations.
     * 
     */
    private final @Nullable List<ApplicationGatewayPrivateLinkIpConfigurationResponse> ipConfigurations;
    /**
     * Name of the private link configuration that is unique within an Application Gateway.
     * 
     */
    private final @Nullable String name;
    /**
     * The provisioning state of the application gateway private link configuration.
     * 
     */
    private final String provisioningState;
    /**
     * Type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private ApplicationGatewayPrivateLinkConfigurationResponse(
        @OutputCustomType.Parameter("etag") String etag,
        @OutputCustomType.Parameter("id") @Nullable String id,
        @OutputCustomType.Parameter("ipConfigurations") @Nullable List<ApplicationGatewayPrivateLinkIpConfigurationResponse> ipConfigurations,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("type") String type) {
        this.etag = etag;
        this.id = id;
        this.ipConfigurations = ipConfigurations;
        this.name = name;
        this.provisioningState = provisioningState;
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
     * An array of application gateway private link ip configurations.
     * 
    */
    public List<ApplicationGatewayPrivateLinkIpConfigurationResponse> getIpConfigurations() {
        return this.ipConfigurations == null ? List.of() : this.ipConfigurations;
    }
    /**
     * Name of the private link configuration that is unique within an Application Gateway.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The provisioning state of the application gateway private link configuration.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayPrivateLinkConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String id;
        private @Nullable List<ApplicationGatewayPrivateLinkIpConfigurationResponse> ipConfigurations;
        private @Nullable String name;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayPrivateLinkConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
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

        public Builder ipConfigurations(@Nullable List<ApplicationGatewayPrivateLinkIpConfigurationResponse> ipConfigurations) {
            this.ipConfigurations = ipConfigurations;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ApplicationGatewayPrivateLinkConfigurationResponse build() {
            return new ApplicationGatewayPrivateLinkConfigurationResponse(etag, id, ipConfigurations, name, provisioningState, type);
        }
    }
}
