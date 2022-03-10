// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.chaos.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class KeyValuePairResponse {
    /**
     * The name of the setting for the action.
     * 
     */
    private final String key;
    /**
     * The value of the setting for the action.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor
    private KeyValuePairResponse(
        @OutputCustomType.Parameter("key") String key,
        @OutputCustomType.Parameter("value") String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * The name of the setting for the action.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * The value of the setting for the action.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyValuePairResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyValuePairResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public KeyValuePairResponse build() {
            return new KeyValuePairResponse(key, value);
        }
    }
}
