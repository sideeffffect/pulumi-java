// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UsagePlanApiStageThrottleGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final UsagePlanApiStageThrottleGetArgs Empty = new UsagePlanApiStageThrottleGetArgs();

    /**
     * The API request burst limit, the maximum rate limit over a time ranging from one to a few seconds, depending upon whether the underlying token bucket is at its full capacity.
     * 
     */
    @Import(name="burstLimit")
    private @Nullable Output<Integer> burstLimit;

    public Optional<Output<Integer>> burstLimit() {
        return Optional.ofNullable(this.burstLimit);
    }

    /**
     * The method to apply the throttle settings for. Specfiy the path and method, for example `/test/GET`.
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    public Output<String> path() {
        return this.path;
    }

    /**
     * The API request steady-state rate limit.
     * 
     */
    @Import(name="rateLimit")
    private @Nullable Output<Double> rateLimit;

    public Optional<Output<Double>> rateLimit() {
        return Optional.ofNullable(this.rateLimit);
    }

    private UsagePlanApiStageThrottleGetArgs() {}

    private UsagePlanApiStageThrottleGetArgs(UsagePlanApiStageThrottleGetArgs $) {
        this.burstLimit = $.burstLimit;
        this.path = $.path;
        this.rateLimit = $.rateLimit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UsagePlanApiStageThrottleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UsagePlanApiStageThrottleGetArgs $;

        public Builder() {
            $ = new UsagePlanApiStageThrottleGetArgs();
        }

        public Builder(UsagePlanApiStageThrottleGetArgs defaults) {
            $ = new UsagePlanApiStageThrottleGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder burstLimit(@Nullable Output<Integer> burstLimit) {
            $.burstLimit = burstLimit;
            return this;
        }

        public Builder burstLimit(Integer burstLimit) {
            return burstLimit(Output.of(burstLimit));
        }

        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        public Builder path(String path) {
            return path(Output.of(path));
        }

        public Builder rateLimit(@Nullable Output<Double> rateLimit) {
            $.rateLimit = rateLimit;
            return this;
        }

        public Builder rateLimit(Double rateLimit) {
            return rateLimit(Output.of(rateLimit));
        }

        public UsagePlanApiStageThrottleGetArgs build() {
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            return $;
        }
    }

}
