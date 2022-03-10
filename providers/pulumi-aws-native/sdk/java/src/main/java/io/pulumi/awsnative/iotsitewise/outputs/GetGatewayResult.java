// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.outputs;

import io.pulumi.awsnative.iotsitewise.outputs.GatewayCapabilitySummary;
import io.pulumi.awsnative.iotsitewise.outputs.GatewayTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetGatewayResult {
    /**
     * A list of gateway capability summaries that each contain a namespace and status.
     * 
     */
    private final @Nullable List<GatewayCapabilitySummary> gatewayCapabilitySummaries;
    /**
     * The ID of the gateway device.
     * 
     */
    private final @Nullable String gatewayId;
    /**
     * A unique, friendly name for the gateway.
     * 
     */
    private final @Nullable String gatewayName;
    /**
     * A list of key-value pairs that contain metadata for the gateway.
     * 
     */
    private final @Nullable List<GatewayTag> tags;

    @OutputCustomType.Constructor
    private GetGatewayResult(
        @OutputCustomType.Parameter("gatewayCapabilitySummaries") @Nullable List<GatewayCapabilitySummary> gatewayCapabilitySummaries,
        @OutputCustomType.Parameter("gatewayId") @Nullable String gatewayId,
        @OutputCustomType.Parameter("gatewayName") @Nullable String gatewayName,
        @OutputCustomType.Parameter("tags") @Nullable List<GatewayTag> tags) {
        this.gatewayCapabilitySummaries = gatewayCapabilitySummaries;
        this.gatewayId = gatewayId;
        this.gatewayName = gatewayName;
        this.tags = tags;
    }

    /**
     * A list of gateway capability summaries that each contain a namespace and status.
     * 
    */
    public List<GatewayCapabilitySummary> getGatewayCapabilitySummaries() {
        return this.gatewayCapabilitySummaries == null ? List.of() : this.gatewayCapabilitySummaries;
    }
    /**
     * The ID of the gateway device.
     * 
    */
    public Optional<String> getGatewayId() {
        return Optional.ofNullable(this.gatewayId);
    }
    /**
     * A unique, friendly name for the gateway.
     * 
    */
    public Optional<String> getGatewayName() {
        return Optional.ofNullable(this.gatewayName);
    }
    /**
     * A list of key-value pairs that contain metadata for the gateway.
     * 
    */
    public List<GatewayTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GatewayCapabilitySummary> gatewayCapabilitySummaries;
        private @Nullable String gatewayId;
        private @Nullable String gatewayName;
        private @Nullable List<GatewayTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGatewayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatewayCapabilitySummaries = defaults.gatewayCapabilitySummaries;
    	      this.gatewayId = defaults.gatewayId;
    	      this.gatewayName = defaults.gatewayName;
    	      this.tags = defaults.tags;
        }

        public Builder gatewayCapabilitySummaries(@Nullable List<GatewayCapabilitySummary> gatewayCapabilitySummaries) {
            this.gatewayCapabilitySummaries = gatewayCapabilitySummaries;
            return this;
        }

        public Builder gatewayId(@Nullable String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        public Builder gatewayName(@Nullable String gatewayName) {
            this.gatewayName = gatewayName;
            return this;
        }

        public Builder tags(@Nullable List<GatewayTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetGatewayResult build() {
            return new GetGatewayResult(gatewayCapabilitySummaries, gatewayId, gatewayName, tags);
        }
    }
}
