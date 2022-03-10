// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.enums.FlowOperatorPropertiesKeys;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * An object used to store task related info
 * 
 */
public final class FlowTaskPropertiesObject extends io.pulumi.resources.InvokeArgs {

    public static final FlowTaskPropertiesObject Empty = new FlowTaskPropertiesObject();

    @InputImport(name="key", required=true)
      private final FlowOperatorPropertiesKeys key;

    public FlowOperatorPropertiesKeys getKey() {
        return this.key;
    }

    @InputImport(name="value", required=true)
      private final String value;

    public String getValue() {
        return this.value;
    }

    public FlowTaskPropertiesObject(
        FlowOperatorPropertiesKeys key,
        String value) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private FlowTaskPropertiesObject() {
        this.key = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowTaskPropertiesObject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowOperatorPropertiesKeys key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowTaskPropertiesObject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(FlowOperatorPropertiesKeys key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public FlowTaskPropertiesObject build() {
            return new FlowTaskPropertiesObject(key, value);
        }
    }
}
