// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PublicIPAddressConfigurationResponse {
    /**
     * The number of IPs specified here limits the maximum size of the Pool - 100 dedicated nodes or 100 low-priority nodes can be allocated for each public IP. For example, a pool needing 250 dedicated VMs would need at least 3 public IPs specified. Each element of this collection is of the form: /subscriptions/{subscription}/resourceGroups/{group}/providers/Microsoft.Network/publicIPAddresses/{ip}.
     * 
     */
    private final @Nullable List<String> ipAddressIds;
    /**
     * The default value is BatchManaged
     * 
     */
    private final @Nullable String provision;

    @CustomType.Constructor
    private PublicIPAddressConfigurationResponse(
        @CustomType.Parameter("ipAddressIds") @Nullable List<String> ipAddressIds,
        @CustomType.Parameter("provision") @Nullable String provision) {
        this.ipAddressIds = ipAddressIds;
        this.provision = provision;
    }

    /**
     * The number of IPs specified here limits the maximum size of the Pool - 100 dedicated nodes or 100 low-priority nodes can be allocated for each public IP. For example, a pool needing 250 dedicated VMs would need at least 3 public IPs specified. Each element of this collection is of the form: /subscriptions/{subscription}/resourceGroups/{group}/providers/Microsoft.Network/publicIPAddresses/{ip}.
     * 
    */
    public List<String> ipAddressIds() {
        return this.ipAddressIds == null ? List.of() : this.ipAddressIds;
    }
    /**
     * The default value is BatchManaged
     * 
    */
    public Optional<String> provision() {
        return Optional.ofNullable(this.provision);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicIPAddressConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> ipAddressIds;
        private @Nullable String provision;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicIPAddressConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddressIds = defaults.ipAddressIds;
    	      this.provision = defaults.provision;
        }

        public Builder ipAddressIds(@Nullable List<String> ipAddressIds) {
            this.ipAddressIds = ipAddressIds;
            return this;
        }
        public Builder ipAddressIds(String... ipAddressIds) {
            return ipAddressIds(List.of(ipAddressIds));
        }
        public Builder provision(@Nullable String provision) {
            this.provision = provision;
            return this;
        }        public PublicIPAddressConfigurationResponse build() {
            return new PublicIPAddressConfigurationResponse(ipAddressIds, provision);
        }
    }
}
