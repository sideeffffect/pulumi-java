// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.outputs;

import com.pulumi.azurenative.databoxedge.outputs.EdgeProfileSubscriptionResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EdgeProfileResponse {
    /**
     * Edge Profile Subscription
     * 
     */
    private final @Nullable EdgeProfileSubscriptionResponse subscription;

    @CustomType.Constructor
    private EdgeProfileResponse(@CustomType.Parameter("subscription") @Nullable EdgeProfileSubscriptionResponse subscription) {
        this.subscription = subscription;
    }

    /**
     * Edge Profile Subscription
     * 
    */
    public Optional<EdgeProfileSubscriptionResponse> subscription() {
        return Optional.ofNullable(this.subscription);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EdgeProfileSubscriptionResponse subscription;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subscription = defaults.subscription;
        }

        public Builder subscription(@Nullable EdgeProfileSubscriptionResponse subscription) {
            this.subscription = subscription;
            return this;
        }        public EdgeProfileResponse build() {
            return new EdgeProfileResponse(subscription);
        }
    }
}
