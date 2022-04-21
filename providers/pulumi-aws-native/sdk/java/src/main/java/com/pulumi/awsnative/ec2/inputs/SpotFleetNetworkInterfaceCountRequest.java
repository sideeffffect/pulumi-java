// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpotFleetNetworkInterfaceCountRequest extends com.pulumi.resources.InvokeArgs {

    public static final SpotFleetNetworkInterfaceCountRequest Empty = new SpotFleetNetworkInterfaceCountRequest();

    @Import(name="max")
    private @Nullable Integer max;

    public Optional<Integer> max() {
        return Optional.ofNullable(this.max);
    }

    @Import(name="min")
    private @Nullable Integer min;

    public Optional<Integer> min() {
        return Optional.ofNullable(this.min);
    }

    private SpotFleetNetworkInterfaceCountRequest() {}

    private SpotFleetNetworkInterfaceCountRequest(SpotFleetNetworkInterfaceCountRequest $) {
        this.max = $.max;
        this.min = $.min;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpotFleetNetworkInterfaceCountRequest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpotFleetNetworkInterfaceCountRequest $;

        public Builder() {
            $ = new SpotFleetNetworkInterfaceCountRequest();
        }

        public Builder(SpotFleetNetworkInterfaceCountRequest defaults) {
            $ = new SpotFleetNetworkInterfaceCountRequest(Objects.requireNonNull(defaults));
        }

        public Builder max(@Nullable Integer max) {
            $.max = max;
            return this;
        }

        public Builder min(@Nullable Integer min) {
            $.min = min;
            return this;
        }

        public SpotFleetNetworkInterfaceCountRequest build() {
            return $;
        }
    }

}
