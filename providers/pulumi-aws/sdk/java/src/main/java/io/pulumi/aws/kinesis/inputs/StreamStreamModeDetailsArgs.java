// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class StreamStreamModeDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final StreamStreamModeDetailsArgs Empty = new StreamStreamModeDetailsArgs();

    /**
     * Specifies the capacity mode of the stream. Must be either `PROVISIONED` or `ON_DEMAND`.
     * 
     */
    @Import(name="streamMode", required=true)
      private final Output<String> streamMode;

    public Output<String> streamMode() {
        return this.streamMode;
    }

    public StreamStreamModeDetailsArgs(Output<String> streamMode) {
        this.streamMode = Objects.requireNonNull(streamMode, "expected parameter 'streamMode' to be non-null");
    }

    private StreamStreamModeDetailsArgs() {
        this.streamMode = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamStreamModeDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> streamMode;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamStreamModeDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.streamMode = defaults.streamMode;
        }

        public Builder streamMode(Output<String> streamMode) {
            this.streamMode = Objects.requireNonNull(streamMode);
            return this;
        }
        public Builder streamMode(String streamMode) {
            this.streamMode = Output.of(Objects.requireNonNull(streamMode));
            return this;
        }        public StreamStreamModeDetailsArgs build() {
            return new StreamStreamModeDetailsArgs(streamMode);
        }
    }
}
