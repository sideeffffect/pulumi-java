// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerRuleConditionQueryStringGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerRuleConditionQueryStringGetArgs Empty = new ListenerRuleConditionQueryStringGetArgs();

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

    public ListenerRuleConditionQueryStringGetArgs(
        @Nullable Output<String> key,
        Output<String> value) {
        this.key = key;
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private ListenerRuleConditionQueryStringGetArgs() {
        this.key = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleConditionQueryStringGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> key;
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleConditionQueryStringGetArgs defaults) {
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
        }        public ListenerRuleConditionQueryStringGetArgs build() {
            return new ListenerRuleConditionQueryStringGetArgs(key, value);
        }
    }
}
