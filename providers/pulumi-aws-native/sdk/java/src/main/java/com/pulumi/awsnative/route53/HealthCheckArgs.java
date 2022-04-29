// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53;

import com.pulumi.awsnative.route53.inputs.HealthCheckConfigPropertiesArgs;
import com.pulumi.awsnative.route53.inputs.HealthCheckTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HealthCheckArgs extends ResourceArgs {

    public static final HealthCheckArgs Empty = new HealthCheckArgs();

    /**
     * A complex type that contains information about the health check.
     * 
     */
    @Import(name="healthCheckConfig", required=true)
    private Output<HealthCheckConfigPropertiesArgs> healthCheckConfig;

    /**
     * @return A complex type that contains information about the health check.
     * 
     */
    public Output<HealthCheckConfigPropertiesArgs> healthCheckConfig() {
        return this.healthCheckConfig;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="healthCheckTags")
    private @Nullable Output<List<HealthCheckTagArgs>> healthCheckTags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Optional<Output<List<HealthCheckTagArgs>>> healthCheckTags() {
        return Optional.ofNullable(this.healthCheckTags);
    }

    private HealthCheckArgs() {}

    private HealthCheckArgs(HealthCheckArgs $) {
        this.healthCheckConfig = $.healthCheckConfig;
        this.healthCheckTags = $.healthCheckTags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HealthCheckArgs $;

        public Builder() {
            $ = new HealthCheckArgs();
        }

        public Builder(HealthCheckArgs defaults) {
            $ = new HealthCheckArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param healthCheckConfig A complex type that contains information about the health check.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckConfig(Output<HealthCheckConfigPropertiesArgs> healthCheckConfig) {
            $.healthCheckConfig = healthCheckConfig;
            return this;
        }

        /**
         * @param healthCheckConfig A complex type that contains information about the health check.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckConfig(HealthCheckConfigPropertiesArgs healthCheckConfig) {
            return healthCheckConfig(Output.of(healthCheckConfig));
        }

        /**
         * @param healthCheckTags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckTags(@Nullable Output<List<HealthCheckTagArgs>> healthCheckTags) {
            $.healthCheckTags = healthCheckTags;
            return this;
        }

        /**
         * @param healthCheckTags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckTags(List<HealthCheckTagArgs> healthCheckTags) {
            return healthCheckTags(Output.of(healthCheckTags));
        }

        /**
         * @param healthCheckTags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckTags(HealthCheckTagArgs... healthCheckTags) {
            return healthCheckTags(List.of(healthCheckTags));
        }

        public HealthCheckArgs build() {
            $.healthCheckConfig = Objects.requireNonNull($.healthCheckConfig, "expected parameter 'healthCheckConfig' to be non-null");
            return $;
        }
    }

}
