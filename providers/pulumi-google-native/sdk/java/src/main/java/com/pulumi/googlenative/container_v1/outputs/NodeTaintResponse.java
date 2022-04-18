// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NodeTaintResponse {
    /**
     * Effect for taint.
     * 
     */
    private final String effect;
    /**
     * Key for taint.
     * 
     */
    private final String key;
    /**
     * Value for taint.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private NodeTaintResponse(
        @CustomType.Parameter("effect") String effect,
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("value") String value) {
        this.effect = effect;
        this.key = key;
        this.value = value;
    }

    /**
     * Effect for taint.
     * 
    */
    public String effect() {
        return this.effect;
    }
    /**
     * Key for taint.
     * 
    */
    public String key() {
        return this.key;
    }
    /**
     * Value for taint.
     * 
    */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeTaintResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String effect;
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeTaintResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder effect(String effect) {
            this.effect = Objects.requireNonNull(effect);
            return this;
        }
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public NodeTaintResponse build() {
            return new NodeTaintResponse(effect, key, value);
        }
    }
}
