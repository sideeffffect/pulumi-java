// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudasset_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A Pub/Sub destination.
 * 
 */
public final class PubsubDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final PubsubDestinationArgs Empty = new PubsubDestinationArgs();

    /**
     * The name of the Pub/Sub topic to publish to. Example: `projects/PROJECT_ID/topics/TOPIC_ID`.
     * 
     */
    @InputImport(name="topic")
      private final @Nullable Input<String> topic;

    public Input<String> getTopic() {
        return this.topic == null ? Input.empty() : this.topic;
    }

    public PubsubDestinationArgs(@Nullable Input<String> topic) {
        this.topic = topic;
    }

    private PubsubDestinationArgs() {
        this.topic = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PubsubDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> topic;

        public Builder() {
    	      // Empty
        }

        public Builder(PubsubDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.topic = defaults.topic;
        }

        public Builder topic(@Nullable Input<String> topic) {
            this.topic = topic;
            return this;
        }

        public Builder topic(@Nullable String topic) {
            this.topic = Input.ofNullable(topic);
            return this;
        }
        public PubsubDestinationArgs build() {
            return new PubsubDestinationArgs(topic);
        }
    }
}
