// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An object that contains the details about an environment's state.
 * 
 */
public final class EnvironmentStateDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final EnvironmentStateDetailsResponse Empty = new EnvironmentStateDetailsResponse();

    /**
     * Contains the code that represents the reason of an environment being in a particular state. Can be used to programmatically handle specific cases.
     * 
     */
    @InputImport(name="code")
      private final @Nullable String code;

    public Optional<String> getCode() {
        return this.code == null ? Optional.empty() : Optional.ofNullable(this.code);
    }

    /**
     * A message that describes the state in detail.
     * 
     */
    @InputImport(name="message")
      private final @Nullable String message;

    public Optional<String> getMessage() {
        return this.message == null ? Optional.empty() : Optional.ofNullable(this.message);
    }

    public EnvironmentStateDetailsResponse(
        @Nullable String code,
        @Nullable String message) {
        this.code = code;
        this.message = message;
    }

    private EnvironmentStateDetailsResponse() {
        this.code = null;
        this.message = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentStateDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String code;
        private @Nullable String message;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentStateDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
        }

        public Builder code(@Nullable String code) {
            this.code = code;
            return this;
        }

        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }
        public EnvironmentStateDetailsResponse build() {
            return new EnvironmentStateDetailsResponse(code, message);
        }
    }
}
