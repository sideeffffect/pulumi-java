// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AwsNodePoolConfigTaintGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AwsNodePoolConfigTaintGetArgs Empty = new AwsNodePoolConfigTaintGetArgs();

    /**
     * Required. The taint effect. Possible values: EFFECT_UNSPECIFIED, NO_SCHEDULE, PREFER_NO_SCHEDULE, NO_EXECUTE
     * 
     */
    @Import(name="effect", required=true)
    private Output<String> effect;

    public Output<String> effect() {
        return this.effect;
    }

    /**
     * Required. Key for the taint.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    /**
     * Required. Value for the taint.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private AwsNodePoolConfigTaintGetArgs() {}

    private AwsNodePoolConfigTaintGetArgs(AwsNodePoolConfigTaintGetArgs $) {
        this.effect = $.effect;
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsNodePoolConfigTaintGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsNodePoolConfigTaintGetArgs $;

        public Builder() {
            $ = new AwsNodePoolConfigTaintGetArgs();
        }

        public Builder(AwsNodePoolConfigTaintGetArgs defaults) {
            $ = new AwsNodePoolConfigTaintGetArgs(Objects.requireNonNull(defaults));
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

        public AwsNodePoolConfigTaintGetArgs build() {
            $.effect = Objects.requireNonNull($.effect, "expected parameter 'effect' to be non-null");
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
