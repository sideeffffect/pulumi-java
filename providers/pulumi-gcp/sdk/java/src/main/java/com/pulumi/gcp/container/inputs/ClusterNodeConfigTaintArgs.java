// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ClusterNodeConfigTaintArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterNodeConfigTaintArgs Empty = new ClusterNodeConfigTaintArgs();

    /**
     * Effect for taint. Accepted values are `NO_SCHEDULE`, `PREFER_NO_SCHEDULE`, and `NO_EXECUTE`.
     * 
     */
    @Import(name="effect", required=true)
    private Output<String> effect;

    public Output<String> effect() {
        return this.effect;
    }

    /**
     * Key for taint.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    /**
     * Value for taint.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private ClusterNodeConfigTaintArgs() {}

    private ClusterNodeConfigTaintArgs(ClusterNodeConfigTaintArgs $) {
        this.effect = $.effect;
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterNodeConfigTaintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterNodeConfigTaintArgs $;

        public Builder() {
            $ = new ClusterNodeConfigTaintArgs();
        }

        public Builder(ClusterNodeConfigTaintArgs defaults) {
            $ = new ClusterNodeConfigTaintArgs(Objects.requireNonNull(defaults));
        }

        public Builder effect(Output<String> effect) {
            $.effect = effect;
            return this;
        }

        public Builder effect(String effect) {
            return effect(Output.of(effect));
        }

        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ClusterNodeConfigTaintArgs build() {
            $.effect = Objects.requireNonNull($.effect, "expected parameter 'effect' to be non-null");
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
