// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blockchain.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApiKeyResponse {
    /**
     * Gets or sets the API key name.
     * 
     */
    private final @Nullable String keyName;
    /**
     * Gets or sets the API key value.
     * 
     */
    private final @Nullable String value;

    @OutputCustomType.Constructor
    private ApiKeyResponse(
        @OutputCustomType.Parameter("keyName") @Nullable String keyName,
        @OutputCustomType.Parameter("value") @Nullable String value) {
        this.keyName = keyName;
        this.value = value;
    }

    /**
     * Gets or sets the API key name.
     * 
    */
    public Optional<String> getKeyName() {
        return Optional.ofNullable(this.keyName);
    }
    /**
     * Gets or sets the API key value.
     * 
    */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyName;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.value = defaults.value;
        }

        public Builder keyName(@Nullable String keyName) {
            this.keyName = keyName;
            return this;
        }

        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public ApiKeyResponse build() {
            return new ApiKeyResponse(keyName, value);
        }
    }
}
