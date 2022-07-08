// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine.v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A service with basic scaling will create an instance when the application receives a request. The instance will be turned down when the app becomes idle. Basic scaling is ideal for work that is intermittent or driven by user activity.
 * 
 */
public final class BasicScalingArgs extends com.pulumi.resources.ResourceArgs {

    public static final BasicScalingArgs Empty = new BasicScalingArgs();

    /**
     * Duration of time after the last request that an instance must wait before the instance is shut down.
     * 
     */
    @Import(name="idleTimeout")
    private @Nullable Output<String> idleTimeout;

    /**
     * @return Duration of time after the last request that an instance must wait before the instance is shut down.
     * 
     */
    public Optional<Output<String>> idleTimeout() {
        return Optional.ofNullable(this.idleTimeout);
    }

    /**
     * Maximum number of instances to create for this version.
     * 
     */
    @Import(name="maxInstances")
    private @Nullable Output<Integer> maxInstances;

    /**
     * @return Maximum number of instances to create for this version.
     * 
     */
    public Optional<Output<Integer>> maxInstances() {
        return Optional.ofNullable(this.maxInstances);
    }

    private BasicScalingArgs() {}

    private BasicScalingArgs(BasicScalingArgs $) {
        this.idleTimeout = $.idleTimeout;
        this.maxInstances = $.maxInstances;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BasicScalingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BasicScalingArgs $;

        public Builder() {
            $ = new BasicScalingArgs();
        }

        public Builder(BasicScalingArgs defaults) {
            $ = new BasicScalingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param idleTimeout Duration of time after the last request that an instance must wait before the instance is shut down.
         * 
         * @return builder
         * 
         */
        public Builder idleTimeout(@Nullable Output<String> idleTimeout) {
            $.idleTimeout = idleTimeout;
            return this;
        }

        /**
         * @param idleTimeout Duration of time after the last request that an instance must wait before the instance is shut down.
         * 
         * @return builder
         * 
         */
        public Builder idleTimeout(String idleTimeout) {
            return idleTimeout(Output.of(idleTimeout));
        }

        /**
         * @param maxInstances Maximum number of instances to create for this version.
         * 
         * @return builder
         * 
         */
        public Builder maxInstances(@Nullable Output<Integer> maxInstances) {
            $.maxInstances = maxInstances;
            return this;
        }

        /**
         * @param maxInstances Maximum number of instances to create for this version.
         * 
         * @return builder
         * 
         */
        public Builder maxInstances(Integer maxInstances) {
            return maxInstances(Output.of(maxInstances));
        }

        public BasicScalingArgs build() {
            return $;
        }
    }

}
