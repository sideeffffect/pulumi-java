// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudasset.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudasset.v1.outputs.PubsubDestinationResponse;
import java.util.Objects;

@CustomType
public final class FeedOutputConfigResponse {
    /**
     * @return Destination on Pub/Sub.
     * 
     */
    private final PubsubDestinationResponse pubsubDestination;

    @CustomType.Constructor
    private FeedOutputConfigResponse(@CustomType.Parameter("pubsubDestination") PubsubDestinationResponse pubsubDestination) {
        this.pubsubDestination = pubsubDestination;
    }

    /**
     * @return Destination on Pub/Sub.
     * 
     */
    public PubsubDestinationResponse pubsubDestination() {
        return this.pubsubDestination;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeedOutputConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PubsubDestinationResponse pubsubDestination;

        public Builder() {
    	      // Empty
        }

        public Builder(FeedOutputConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsubDestination = defaults.pubsubDestination;
        }

        public Builder pubsubDestination(PubsubDestinationResponse pubsubDestination) {
            this.pubsubDestination = Objects.requireNonNull(pubsubDestination);
            return this;
        }        public FeedOutputConfigResponse build() {
            return new FeedOutputConfigResponse(pubsubDestination);
        }
    }
}
