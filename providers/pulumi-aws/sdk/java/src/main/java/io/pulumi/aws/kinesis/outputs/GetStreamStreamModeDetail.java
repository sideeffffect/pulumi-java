// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetStreamStreamModeDetail {
    /**
     * The capacity mode of the stream. Either `ON_DEMAND` or `PROVISIONED`.
     * 
     */
    private final String streamMode;

    @OutputCustomType.Constructor({"streamMode"})
    private GetStreamStreamModeDetail(String streamMode) {
        this.streamMode = streamMode;
    }

    /**
     * The capacity mode of the stream. Either `ON_DEMAND` or `PROVISIONED`.
     * 
    */
    public String getStreamMode() {
        return this.streamMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreamStreamModeDetail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String streamMode;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStreamStreamModeDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.streamMode = defaults.streamMode;
        }

        public Builder setStreamMode(String streamMode) {
            this.streamMode = Objects.requireNonNull(streamMode);
            return this;
        }
        public GetStreamStreamModeDetail build() {
            return new GetStreamStreamModeDetail(streamMode);
        }
    }
}
