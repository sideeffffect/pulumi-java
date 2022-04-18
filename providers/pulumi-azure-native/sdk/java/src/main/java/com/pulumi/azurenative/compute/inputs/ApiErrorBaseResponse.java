// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Api error base.
 * 
 */
public final class ApiErrorBaseResponse extends com.pulumi.resources.InvokeArgs {

    public static final ApiErrorBaseResponse Empty = new ApiErrorBaseResponse();

    /**
     * The error code.
     * 
     */
    @Import(name="code")
      private final @Nullable String code;

    public Optional<String> code() {
        return this.code == null ? Optional.empty() : Optional.ofNullable(this.code);
    }

    /**
     * The error message.
     * 
     */
    @Import(name="message")
      private final @Nullable String message;

    public Optional<String> message() {
        return this.message == null ? Optional.empty() : Optional.ofNullable(this.message);
    }

    /**
     * The target of the particular error.
     * 
     */
    @Import(name="target")
      private final @Nullable String target;

    public Optional<String> target() {
        return this.target == null ? Optional.empty() : Optional.ofNullable(this.target);
    }

    public ApiErrorBaseResponse(
        @Nullable String code,
        @Nullable String message,
        @Nullable String target) {
        this.code = code;
        this.message = message;
        this.target = target;
    }

    private ApiErrorBaseResponse() {
        this.code = null;
        this.message = null;
        this.target = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiErrorBaseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String code;
        private @Nullable String message;
        private @Nullable String target;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiErrorBaseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
    	      this.target = defaults.target;
        }

        public Builder code(@Nullable String code) {
            this.code = code;
            return this;
        }
        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }
        public Builder target(@Nullable String target) {
            this.target = target;
            return this;
        }        public ApiErrorBaseResponse build() {
            return new ApiErrorBaseResponse(code, message, target);
        }
    }
}
