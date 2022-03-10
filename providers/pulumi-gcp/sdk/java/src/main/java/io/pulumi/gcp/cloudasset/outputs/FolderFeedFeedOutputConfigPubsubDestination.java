// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudasset.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FolderFeedFeedOutputConfigPubsubDestination {
    /**
     * Destination on Cloud Pubsub topic.
     * 
     */
    private final String topic;

    @OutputCustomType.Constructor
    private FolderFeedFeedOutputConfigPubsubDestination(@OutputCustomType.Parameter("topic") String topic) {
        this.topic = topic;
    }

    /**
     * Destination on Cloud Pubsub topic.
     * 
    */
    public String getTopic() {
        return this.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FolderFeedFeedOutputConfigPubsubDestination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String topic;

        public Builder() {
    	      // Empty
        }

        public Builder(FolderFeedFeedOutputConfigPubsubDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.topic = defaults.topic;
        }

        public Builder topic(String topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }
        public FolderFeedFeedOutputConfigPubsubDestination build() {
            return new FolderFeedFeedOutputConfigPubsubDestination(topic);
        }
    }
}
