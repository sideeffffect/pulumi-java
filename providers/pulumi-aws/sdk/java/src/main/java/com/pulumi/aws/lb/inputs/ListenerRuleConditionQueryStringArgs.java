// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerRuleConditionQueryStringArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerRuleConditionQueryStringArgs Empty = new ListenerRuleConditionQueryStringArgs();

    /**
     * Query string key pattern to match.
     * 
     */
    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> key() {
        return this.key == null ? Codegen.empty() : this.key;
    }

    /**
     * Query string value pattern to match.
     * 
     */
    @Import(name="value", required=true)
      private final Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    public ListenerRuleConditionQueryStringArgs(
        @Nullable Output<String> key,
        Output<String> value) {
        this.key = key;
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private ListenerRuleConditionQueryStringArgs() {
        this.key = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleConditionQueryStringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> key;
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleConditionQueryStringArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = Codegen.ofNullable(key);
            return this;
        }
        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }        public ListenerRuleConditionQueryStringArgs build() {
            return new ListenerRuleConditionQueryStringArgs(key, value);
        }
    }
}
