// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerRuleConditionQueryStringGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerRuleConditionQueryStringGetArgs Empty = new ListenerRuleConditionQueryStringGetArgs();

    /**
     * Query string key pattern to match.
     * 
     */
    @InputImport(name="key")
      private final @Nullable Input<String> key;

    public Input<String> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    /**
     * Query string value pattern to match.
     * 
     */
    @InputImport(name="value", required=true)
      private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public ListenerRuleConditionQueryStringGetArgs(
        @Nullable Input<String> key,
        Input<String> value) {
        this.key = key;
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private ListenerRuleConditionQueryStringGetArgs() {
        this.key = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleConditionQueryStringGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> key;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleConditionQueryStringGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(@Nullable Input<String> key) {
            this.key = key;
            return this;
        }

        public Builder key(@Nullable String key) {
            this.key = Input.ofNullable(key);
            return this;
        }

        public Builder value(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder value(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }
        public ListenerRuleConditionQueryStringGetArgs build() {
            return new ListenerRuleConditionQueryStringGetArgs(key, value);
        }
    }
}
