// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionHealthCheckLogConfigArgs extends ResourceArgs {

    public static final RegionHealthCheckLogConfigArgs Empty = new RegionHealthCheckLogConfigArgs();

    /**
     * Indicates whether or not to export logs. This is false by default,
     * which means no health check logging will be done.
     * 
     */
    @Import(name="enable")
    private @Nullable Output<Boolean> enable;

    /**
     * @return Indicates whether or not to export logs. This is false by default,
     * which means no health check logging will be done.
     * 
     */
    public Optional<Output<Boolean>> enable() {
        return Optional.ofNullable(this.enable);
    }

    private RegionHealthCheckLogConfigArgs() {}

    private RegionHealthCheckLogConfigArgs(RegionHealthCheckLogConfigArgs $) {
        this.enable = $.enable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionHealthCheckLogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionHealthCheckLogConfigArgs $;

        public Builder() {
            $ = new RegionHealthCheckLogConfigArgs();
        }

        public Builder(RegionHealthCheckLogConfigArgs defaults) {
            $ = new RegionHealthCheckLogConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enable Indicates whether or not to export logs. This is false by default,
         * which means no health check logging will be done.
         * 
         * @return builder
         * 
         */
        public Builder enable(@Nullable Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        /**
         * @param enable Indicates whether or not to export logs. This is false by default,
         * which means no health check logging will be done.
         * 
         * @return builder
         * 
         */
        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        public RegionHealthCheckLogConfigArgs build() {
            return $;
        }
    }

}
