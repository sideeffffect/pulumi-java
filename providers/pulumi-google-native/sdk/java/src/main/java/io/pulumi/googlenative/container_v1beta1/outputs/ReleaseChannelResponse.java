// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ReleaseChannelResponse {
    /**
     * channel specifies which release channel the cluster is subscribed to.
     * 
     */
    private final String channel;

    @OutputCustomType.Constructor
    private ReleaseChannelResponse(@OutputCustomType.Parameter("channel") String channel) {
        this.channel = channel;
    }

    /**
     * channel specifies which release channel the cluster is subscribed to.
     * 
    */
    public String getChannel() {
        return this.channel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReleaseChannelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String channel;

        public Builder() {
    	      // Empty
        }

        public Builder(ReleaseChannelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channel = defaults.channel;
        }

        public Builder channel(String channel) {
            this.channel = Objects.requireNonNull(channel);
            return this;
        }
        public ReleaseChannelResponse build() {
            return new ReleaseChannelResponse(channel);
        }
    }
}
