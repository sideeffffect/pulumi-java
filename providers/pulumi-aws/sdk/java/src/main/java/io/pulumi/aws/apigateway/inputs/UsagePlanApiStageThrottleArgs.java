// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UsagePlanApiStageThrottleArgs extends io.pulumi.resources.ResourceArgs {

    public static final UsagePlanApiStageThrottleArgs Empty = new UsagePlanApiStageThrottleArgs();

    /**
     * The API request burst limit, the maximum rate limit over a time ranging from one to a few seconds, depending upon whether the underlying token bucket is at its full capacity.
     * 
     */
    @Import(name="burstLimit")
      private final @Nullable Output<Integer> burstLimit;

    public Output<Integer> burstLimit() {
        return this.burstLimit == null ? Codegen.empty() : this.burstLimit;
    }

    /**
     * The method to apply the throttle settings for. Specfiy the path and method, for example `/test/GET`.
     * 
     */
    @Import(name="path", required=true)
      private final Output<String> path;

    public Output<String> path() {
        return this.path;
    }

    /**
     * The API request steady-state rate limit.
     * 
     */
    @Import(name="rateLimit")
      private final @Nullable Output<Double> rateLimit;

    public Output<Double> rateLimit() {
        return this.rateLimit == null ? Codegen.empty() : this.rateLimit;
    }

    public UsagePlanApiStageThrottleArgs(
        @Nullable Output<Integer> burstLimit,
        Output<String> path,
        @Nullable Output<Double> rateLimit) {
        this.burstLimit = burstLimit;
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.rateLimit = rateLimit;
    }

    private UsagePlanApiStageThrottleArgs() {
        this.burstLimit = Codegen.empty();
        this.path = Codegen.empty();
        this.rateLimit = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UsagePlanApiStageThrottleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> burstLimit;
        private Output<String> path;
        private @Nullable Output<Double> rateLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(UsagePlanApiStageThrottleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.burstLimit = defaults.burstLimit;
    	      this.path = defaults.path;
    	      this.rateLimit = defaults.rateLimit;
        }

        public Builder burstLimit(@Nullable Output<Integer> burstLimit) {
            this.burstLimit = burstLimit;
            return this;
        }
        public Builder burstLimit(@Nullable Integer burstLimit) {
            this.burstLimit = Codegen.ofNullable(burstLimit);
            return this;
        }
        public Builder path(Output<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder path(String path) {
            this.path = Output.of(Objects.requireNonNull(path));
            return this;
        }
        public Builder rateLimit(@Nullable Output<Double> rateLimit) {
            this.rateLimit = rateLimit;
            return this;
        }
        public Builder rateLimit(@Nullable Double rateLimit) {
            this.rateLimit = Codegen.ofNullable(rateLimit);
            return this;
        }        public UsagePlanApiStageThrottleArgs build() {
            return new UsagePlanApiStageThrottleArgs(burstLimit, path, rateLimit);
        }
    }
}
