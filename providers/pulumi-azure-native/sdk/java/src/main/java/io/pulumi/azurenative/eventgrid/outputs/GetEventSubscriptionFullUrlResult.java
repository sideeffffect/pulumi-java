// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetEventSubscriptionFullUrlResult {
    /**
     * The URL that represents the endpoint of the destination of an event subscription.
     * 
     */
    private final @Nullable String endpointUrl;

    @OutputCustomType.Constructor
    private GetEventSubscriptionFullUrlResult(@OutputCustomType.Parameter("endpointUrl") @Nullable String endpointUrl) {
        this.endpointUrl = endpointUrl;
    }

    /**
     * The URL that represents the endpoint of the destination of an event subscription.
     * 
    */
    public Optional<String> getEndpointUrl() {
        return Optional.ofNullable(this.endpointUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventSubscriptionFullUrlResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endpointUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEventSubscriptionFullUrlResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointUrl = defaults.endpointUrl;
        }

        public Builder endpointUrl(@Nullable String endpointUrl) {
            this.endpointUrl = endpointUrl;
            return this;
        }
        public GetEventSubscriptionFullUrlResult build() {
            return new GetEventSubscriptionFullUrlResult(endpointUrl);
        }
    }
}
