// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class RouteSpecGrpcRouteTimeoutPerRequestArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteSpecGrpcRouteTimeoutPerRequestArgs Empty = new RouteSpecGrpcRouteTimeoutPerRequestArgs();

    /**
     * The unit of time. Valid values: `ms`, `s`.
     * 
     */
    @Import(name="unit", required=true)
    private Output<String> unit;

    public Output<String> unit() {
        return this.unit;
    }

    /**
     * The number of time units. Minimum value of `0`.
     * 
     */
    @Import(name="value", required=true)
    private Output<Integer> value;

    public Output<Integer> value() {
        return this.value;
    }

    private RouteSpecGrpcRouteTimeoutPerRequestArgs() {}

    private RouteSpecGrpcRouteTimeoutPerRequestArgs(RouteSpecGrpcRouteTimeoutPerRequestArgs $) {
        this.unit = $.unit;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteSpecGrpcRouteTimeoutPerRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteSpecGrpcRouteTimeoutPerRequestArgs $;

        public Builder() {
            $ = new RouteSpecGrpcRouteTimeoutPerRequestArgs();
        }

        public Builder(RouteSpecGrpcRouteTimeoutPerRequestArgs defaults) {
            $ = new RouteSpecGrpcRouteTimeoutPerRequestArgs(Objects.requireNonNull(defaults));
        }

        public Builder unit(Output<String> unit) {
            $.unit = unit;
            return this;
        }

        public Builder unit(String unit) {
            return unit(Output.of(unit));
        }

        public Builder value(Output<Integer> value) {
            $.value = value;
            return this;
        }

        public Builder value(Integer value) {
            return value(Output.of(value));
        }

        public RouteSpecGrpcRouteTimeoutPerRequestArgs build() {
            $.unit = Objects.requireNonNull($.unit, "expected parameter 'unit' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
