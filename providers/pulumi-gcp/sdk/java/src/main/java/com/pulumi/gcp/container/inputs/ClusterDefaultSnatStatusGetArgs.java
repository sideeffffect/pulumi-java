// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class ClusterDefaultSnatStatusGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterDefaultSnatStatusGetArgs Empty = new ClusterDefaultSnatStatusGetArgs();

    /**
     * The status of the Istio addon, which makes it easy to set up Istio for services in a
     * cluster. It is disabled by default. Set `disabled = false` to enable.
     * 
     */
    @Import(name="disabled", required=true)
    private Output<Boolean> disabled;

    public Output<Boolean> disabled() {
        return this.disabled;
    }

    private ClusterDefaultSnatStatusGetArgs() {}

    private ClusterDefaultSnatStatusGetArgs(ClusterDefaultSnatStatusGetArgs $) {
        this.disabled = $.disabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterDefaultSnatStatusGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterDefaultSnatStatusGetArgs $;

        public Builder() {
            $ = new ClusterDefaultSnatStatusGetArgs();
        }

        public Builder(ClusterDefaultSnatStatusGetArgs defaults) {
            $ = new ClusterDefaultSnatStatusGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder disabled(Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        public ClusterDefaultSnatStatusGetArgs build() {
            $.disabled = Objects.requireNonNull($.disabled, "expected parameter 'disabled' to be non-null");
            return $;
        }
    }

}
