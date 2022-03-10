// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudasset.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ProjectFeedFeedOutputConfigPubsubDestinationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectFeedFeedOutputConfigPubsubDestinationGetArgs Empty = new ProjectFeedFeedOutputConfigPubsubDestinationGetArgs();

    /**
     * Destination on Cloud Pubsub topic.
     * 
     */
    @InputImport(name="topic", required=true)
      private final Input<String> topic;

    public Input<String> getTopic() {
        return this.topic;
    }

    public ProjectFeedFeedOutputConfigPubsubDestinationGetArgs(Input<String> topic) {
        this.topic = Objects.requireNonNull(topic, "expected parameter 'topic' to be non-null");
    }

    private ProjectFeedFeedOutputConfigPubsubDestinationGetArgs() {
        this.topic = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectFeedFeedOutputConfigPubsubDestinationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> topic;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectFeedFeedOutputConfigPubsubDestinationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.topic = defaults.topic;
        }

        public Builder topic(Input<String> topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }

        public Builder topic(String topic) {
            this.topic = Input.of(Objects.requireNonNull(topic));
            return this;
        }
        public ProjectFeedFeedOutputConfigPubsubDestinationGetArgs build() {
            return new ProjectFeedFeedOutputConfigPubsubDestinationGetArgs(topic);
        }
    }
}
