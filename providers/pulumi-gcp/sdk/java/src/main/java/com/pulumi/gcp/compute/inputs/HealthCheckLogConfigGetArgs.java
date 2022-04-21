// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HealthCheckLogConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final HealthCheckLogConfigGetArgs Empty = new HealthCheckLogConfigGetArgs();

    /**
     * Indicates whether or not to export logs. This is false by default,
     * which means no health check logging will be done.
     * 
     */
    @Import(name="enable")
    private @Nullable Output<Boolean> enable;

    public Optional<Output<Boolean>> enable() {
        return Optional.ofNullable(this.enable);
    }

    private HealthCheckLogConfigGetArgs() {}

    private HealthCheckLogConfigGetArgs(HealthCheckLogConfigGetArgs $) {
        this.enable = $.enable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HealthCheckLogConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HealthCheckLogConfigGetArgs $;

        public Builder() {
            $ = new HealthCheckLogConfigGetArgs();
        }

        public Builder(HealthCheckLogConfigGetArgs defaults) {
            $ = new HealthCheckLogConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder enable(@Nullable Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        public HealthCheckLogConfigGetArgs build() {
            return $;
        }
    }

}
