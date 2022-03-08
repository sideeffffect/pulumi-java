// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudasset_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudasset_v1.outputs.PubsubDestinationResponse;
import java.util.Objects;

@OutputCustomType
public final class FeedOutputConfigResponse {
    /**
     * Destination on Pub/Sub.
     * 
     */
    private final PubsubDestinationResponse pubsubDestination;

    @OutputCustomType.Constructor({"pubsubDestination"})
    private FeedOutputConfigResponse(PubsubDestinationResponse pubsubDestination) {
        this.pubsubDestination = pubsubDestination;
    }

    /**
     * Destination on Pub/Sub.
     * 
    */
    public PubsubDestinationResponse getPubsubDestination() {
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

        public Builder setPubsubDestination(PubsubDestinationResponse pubsubDestination) {
            this.pubsubDestination = Objects.requireNonNull(pubsubDestination);
            return this;
        }
        public FeedOutputConfigResponse build() {
            return new FeedOutputConfigResponse(pubsubDestination);
        }
    }
}
