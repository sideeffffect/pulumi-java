// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudasset.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.cloudasset.outputs.OrganizationFeedFeedOutputConfigPubsubDestination;
import java.util.Objects;

@OutputCustomType
public final class OrganizationFeedFeedOutputConfig {
    /**
     * Destination on Cloud Pubsub.
     * Structure is documented below.
     * 
     */
    private final OrganizationFeedFeedOutputConfigPubsubDestination pubsubDestination;

    @OutputCustomType.Constructor({"pubsubDestination"})
    private OrganizationFeedFeedOutputConfig(OrganizationFeedFeedOutputConfigPubsubDestination pubsubDestination) {
        this.pubsubDestination = pubsubDestination;
    }

    /**
     * Destination on Cloud Pubsub.
     * Structure is documented below.
     * 
    */
    public OrganizationFeedFeedOutputConfigPubsubDestination getPubsubDestination() {
        return this.pubsubDestination;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationFeedFeedOutputConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationFeedFeedOutputConfigPubsubDestination pubsubDestination;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationFeedFeedOutputConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsubDestination = defaults.pubsubDestination;
        }

        public Builder setPubsubDestination(OrganizationFeedFeedOutputConfigPubsubDestination pubsubDestination) {
            this.pubsubDestination = Objects.requireNonNull(pubsubDestination);
            return this;
        }
        public OrganizationFeedFeedOutputConfig build() {
            return new OrganizationFeedFeedOutputConfig(pubsubDestination);
        }
    }
}
