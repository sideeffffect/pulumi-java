// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualHubIdResponse {
    /**
     * The resource URI for the Virtual Hub where the ExpressRoute gateway is or will be deployed. The Virtual Hub resource and the ExpressRoute gateway resource reside in the same subscription.
     * 
     */
    private final @Nullable String id;

    @OutputCustomType.Constructor
    private VirtualHubIdResponse(@OutputCustomType.Parameter("id") @Nullable String id) {
        this.id = id;
    }

    /**
     * The resource URI for the Virtual Hub where the ExpressRoute gateway is or will be deployed. The Virtual Hub resource and the ExpressRoute gateway resource reside in the same subscription.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualHubIdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualHubIdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public VirtualHubIdResponse build() {
            return new VirtualHubIdResponse(id);
        }
    }
}
