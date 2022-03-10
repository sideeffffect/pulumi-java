// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedZonePeeringConfigTargetNetworkArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedZonePeeringConfigTargetNetworkArgs Empty = new ManagedZonePeeringConfigTargetNetworkArgs();

    /**
     * The time at which the zone was deactivated, in RFC 3339 date-time format. An empty string indicates that the peering connection is active. The producer network can deactivate a zone. The zone is automatically deactivated if the producer network that the zone targeted is deleted. Output only.
     * 
     */
    @InputImport(name="deactivateTime")
      private final @Nullable Input<String> deactivateTime;

    public Input<String> getDeactivateTime() {
        return this.deactivateTime == null ? Input.empty() : this.deactivateTime;
    }

    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * The fully qualified URL of the VPC network to forward queries to. This should be formatted like https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}
     * 
     */
    @InputImport(name="networkUrl")
      private final @Nullable Input<String> networkUrl;

    public Input<String> getNetworkUrl() {
        return this.networkUrl == null ? Input.empty() : this.networkUrl;
    }

    public ManagedZonePeeringConfigTargetNetworkArgs(
        @Nullable Input<String> deactivateTime,
        @Nullable Input<String> kind,
        @Nullable Input<String> networkUrl) {
        this.deactivateTime = deactivateTime;
        this.kind = kind;
        this.networkUrl = networkUrl;
    }

    private ManagedZonePeeringConfigTargetNetworkArgs() {
        this.deactivateTime = Input.empty();
        this.kind = Input.empty();
        this.networkUrl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZonePeeringConfigTargetNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> deactivateTime;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> networkUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZonePeeringConfigTargetNetworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deactivateTime = defaults.deactivateTime;
    	      this.kind = defaults.kind;
    	      this.networkUrl = defaults.networkUrl;
        }

        public Builder deactivateTime(@Nullable Input<String> deactivateTime) {
            this.deactivateTime = deactivateTime;
            return this;
        }

        public Builder deactivateTime(@Nullable String deactivateTime) {
            this.deactivateTime = Input.ofNullable(deactivateTime);
            return this;
        }

        public Builder kind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder networkUrl(@Nullable Input<String> networkUrl) {
            this.networkUrl = networkUrl;
            return this;
        }

        public Builder networkUrl(@Nullable String networkUrl) {
            this.networkUrl = Input.ofNullable(networkUrl);
            return this;
        }
        public ManagedZonePeeringConfigTargetNetworkArgs build() {
            return new ManagedZonePeeringConfigTargetNetworkArgs(deactivateTime, kind, networkUrl);
        }
    }
}
