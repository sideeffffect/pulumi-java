// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StandardAppVersionBasicScalingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final StandardAppVersionBasicScalingGetArgs Empty = new StandardAppVersionBasicScalingGetArgs();

    /**
     * Duration of time after the last request that an instance must wait before the instance is shut down.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s". Defaults to 900s.
     * 
     */
    @Import(name="idleTimeout")
      private final @Nullable Output<String> idleTimeout;

    public Output<String> idleTimeout() {
        return this.idleTimeout == null ? Codegen.empty() : this.idleTimeout;
    }

    /**
     * Maximum number of instances to create for this version. Must be in the range [1.0, 200.0].
     * 
     */
    @Import(name="maxInstances", required=true)
      private final Output<Integer> maxInstances;

    public Output<Integer> maxInstances() {
        return this.maxInstances;
    }

    public StandardAppVersionBasicScalingGetArgs(
        @Nullable Output<String> idleTimeout,
        Output<Integer> maxInstances) {
        this.idleTimeout = idleTimeout;
        this.maxInstances = Objects.requireNonNull(maxInstances, "expected parameter 'maxInstances' to be non-null");
    }

    private StandardAppVersionBasicScalingGetArgs() {
        this.idleTimeout = Codegen.empty();
        this.maxInstances = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardAppVersionBasicScalingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> idleTimeout;
        private Output<Integer> maxInstances;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardAppVersionBasicScalingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idleTimeout = defaults.idleTimeout;
    	      this.maxInstances = defaults.maxInstances;
        }

        public Builder idleTimeout(@Nullable Output<String> idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }
        public Builder idleTimeout(@Nullable String idleTimeout) {
            this.idleTimeout = Codegen.ofNullable(idleTimeout);
            return this;
        }
        public Builder maxInstances(Output<Integer> maxInstances) {
            this.maxInstances = Objects.requireNonNull(maxInstances);
            return this;
        }
        public Builder maxInstances(Integer maxInstances) {
            this.maxInstances = Output.of(Objects.requireNonNull(maxInstances));
            return this;
        }        public StandardAppVersionBasicScalingGetArgs build() {
            return new StandardAppVersionBasicScalingGetArgs(idleTimeout, maxInstances);
        }
    }
}
