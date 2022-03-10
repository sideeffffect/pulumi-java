// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.connectors_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.connectors_v1.inputs.SecretResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * ConfigVariable represents a configuration variable present in a Connection. or AuthConfig.
 * 
 */
public final class ConfigVariableResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConfigVariableResponse Empty = new ConfigVariableResponse();

    /**
     * Value is a bool.
     * 
     */
    @InputImport(name="boolValue", required=true)
      private final Boolean boolValue;

    public Boolean getBoolValue() {
        return this.boolValue;
    }

    /**
     * Value is an integer
     * 
     */
    @InputImport(name="intValue", required=true)
      private final String intValue;

    public String getIntValue() {
        return this.intValue;
    }

    /**
     * Key of the config variable.
     * 
     */
    @InputImport(name="key", required=true)
      private final String key;

    public String getKey() {
        return this.key;
    }

    /**
     * Value is a secret.
     * 
     */
    @InputImport(name="secretValue", required=true)
      private final SecretResponse secretValue;

    public SecretResponse getSecretValue() {
        return this.secretValue;
    }

    /**
     * Value is a string.
     * 
     */
    @InputImport(name="stringValue", required=true)
      private final String stringValue;

    public String getStringValue() {
        return this.stringValue;
    }

    public ConfigVariableResponse(
        Boolean boolValue,
        String intValue,
        String key,
        SecretResponse secretValue,
        String stringValue) {
        this.boolValue = Objects.requireNonNull(boolValue, "expected parameter 'boolValue' to be non-null");
        this.intValue = Objects.requireNonNull(intValue, "expected parameter 'intValue' to be non-null");
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.secretValue = Objects.requireNonNull(secretValue, "expected parameter 'secretValue' to be non-null");
        this.stringValue = Objects.requireNonNull(stringValue, "expected parameter 'stringValue' to be non-null");
    }

    private ConfigVariableResponse() {
        this.boolValue = null;
        this.intValue = null;
        this.key = null;
        this.secretValue = null;
        this.stringValue = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigVariableResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean boolValue;
        private String intValue;
        private String key;
        private SecretResponse secretValue;
        private String stringValue;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigVariableResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boolValue = defaults.boolValue;
    	      this.intValue = defaults.intValue;
    	      this.key = defaults.key;
    	      this.secretValue = defaults.secretValue;
    	      this.stringValue = defaults.stringValue;
        }

        public Builder boolValue(Boolean boolValue) {
            this.boolValue = Objects.requireNonNull(boolValue);
            return this;
        }

        public Builder intValue(String intValue) {
            this.intValue = Objects.requireNonNull(intValue);
            return this;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder secretValue(SecretResponse secretValue) {
            this.secretValue = Objects.requireNonNull(secretValue);
            return this;
        }

        public Builder stringValue(String stringValue) {
            this.stringValue = Objects.requireNonNull(stringValue);
            return this;
        }
        public ConfigVariableResponse build() {
            return new ConfigVariableResponse(boolValue, intValue, key, secretValue, stringValue);
        }
    }
}
