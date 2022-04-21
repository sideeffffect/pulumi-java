// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TrafficMirrorFilterRuleSourcePortRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final TrafficMirrorFilterRuleSourcePortRangeArgs Empty = new TrafficMirrorFilterRuleSourcePortRangeArgs();

    /**
     * Starting port of the range
     * 
     */
    @Import(name="fromPort")
    private @Nullable Output<Integer> fromPort;

    public Optional<Output<Integer>> fromPort() {
        return Optional.ofNullable(this.fromPort);
    }

    /**
     * Ending port of the range
     * 
     */
    @Import(name="toPort")
    private @Nullable Output<Integer> toPort;

    public Optional<Output<Integer>> toPort() {
        return Optional.ofNullable(this.toPort);
    }

    private TrafficMirrorFilterRuleSourcePortRangeArgs() {}

    private TrafficMirrorFilterRuleSourcePortRangeArgs(TrafficMirrorFilterRuleSourcePortRangeArgs $) {
        this.fromPort = $.fromPort;
        this.toPort = $.toPort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TrafficMirrorFilterRuleSourcePortRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TrafficMirrorFilterRuleSourcePortRangeArgs $;

        public Builder() {
            $ = new TrafficMirrorFilterRuleSourcePortRangeArgs();
        }

        public Builder(TrafficMirrorFilterRuleSourcePortRangeArgs defaults) {
            $ = new TrafficMirrorFilterRuleSourcePortRangeArgs(Objects.requireNonNull(defaults));
        }

        public Builder fromPort(@Nullable Output<Integer> fromPort) {
            $.fromPort = fromPort;
            return this;
        }

        public Builder fromPort(Integer fromPort) {
            return fromPort(Output.of(fromPort));
        }

        public Builder toPort(@Nullable Output<Integer> toPort) {
            $.toPort = toPort;
            return this;
        }

        public Builder toPort(Integer toPort) {
            return toPort(Output.of(toPort));
        }

        public TrafficMirrorFilterRuleSourcePortRangeArgs build() {
            return $;
        }
    }

}
