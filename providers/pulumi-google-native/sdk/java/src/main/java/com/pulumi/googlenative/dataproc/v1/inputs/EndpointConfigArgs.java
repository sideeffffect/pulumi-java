// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Endpoint config for this cluster
 * 
 */
public final class EndpointConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointConfigArgs Empty = new EndpointConfigArgs();

    /**
     * Optional. If true, enable http access to specific ports on the cluster from external sources. Defaults to false.
     * 
     */
    @Import(name="enableHttpPortAccess")
    private @Nullable Output<Boolean> enableHttpPortAccess;

    /**
     * @return Optional. If true, enable http access to specific ports on the cluster from external sources. Defaults to false.
     * 
     */
    public Optional<Output<Boolean>> enableHttpPortAccess() {
        return Optional.ofNullable(this.enableHttpPortAccess);
    }

    private EndpointConfigArgs() {}

    private EndpointConfigArgs(EndpointConfigArgs $) {
        this.enableHttpPortAccess = $.enableHttpPortAccess;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointConfigArgs $;

        public Builder() {
            $ = new EndpointConfigArgs();
        }

        public Builder(EndpointConfigArgs defaults) {
            $ = new EndpointConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableHttpPortAccess Optional. If true, enable http access to specific ports on the cluster from external sources. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder enableHttpPortAccess(@Nullable Output<Boolean> enableHttpPortAccess) {
            $.enableHttpPortAccess = enableHttpPortAccess;
            return this;
        }

        /**
         * @param enableHttpPortAccess Optional. If true, enable http access to specific ports on the cluster from external sources. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder enableHttpPortAccess(Boolean enableHttpPortAccess) {
            return enableHttpPortAccess(Output.of(enableHttpPortAccess));
        }

        public EndpointConfigArgs build() {
            return $;
        }
    }

}
