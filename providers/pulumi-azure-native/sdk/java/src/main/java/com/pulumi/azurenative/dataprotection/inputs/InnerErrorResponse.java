// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Inner Error
 * 
 */
public final class InnerErrorResponse extends com.pulumi.resources.InvokeArgs {

    public static final InnerErrorResponse Empty = new InnerErrorResponse();

    /**
     * Any Key value pairs that can be provided to the client for additional  verbose information.
     * 
     */
    @Import(name="additionalInfo")
      private final @Nullable Map<String,String> additionalInfo;

    public Map<String,String> additionalInfo() {
        return this.additionalInfo == null ? Map.of() : this.additionalInfo;
    }

    /**
     * Unique code for this error
     * 
     */
    @Import(name="code")
      private final @Nullable String code;

    public Optional<String> code() {
        return this.code == null ? Optional.empty() : Optional.ofNullable(this.code);
    }

    /**
     * Child Inner Error, to allow Nesting.
     * 
     */
    @Import(name="embeddedInnerError")
      private final @Nullable InnerErrorResponse embeddedInnerError;

    public Optional<InnerErrorResponse> embeddedInnerError() {
        return this.embeddedInnerError == null ? Optional.empty() : Optional.ofNullable(this.embeddedInnerError);
    }

    public InnerErrorResponse(
        @Nullable Map<String,String> additionalInfo,
        @Nullable String code,
        @Nullable InnerErrorResponse embeddedInnerError) {
        this.additionalInfo = additionalInfo;
        this.code = code;
        this.embeddedInnerError = embeddedInnerError;
    }

    private InnerErrorResponse() {
        this.additionalInfo = Map.of();
        this.code = null;
        this.embeddedInnerError = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InnerErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> additionalInfo;
        private @Nullable String code;
        private @Nullable InnerErrorResponse embeddedInnerError;

        public Builder() {
    	      // Empty
        }

        public Builder(InnerErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalInfo = defaults.additionalInfo;
    	      this.code = defaults.code;
    	      this.embeddedInnerError = defaults.embeddedInnerError;
        }

        public Builder additionalInfo(@Nullable Map<String,String> additionalInfo) {
            this.additionalInfo = additionalInfo;
            return this;
        }
        public Builder code(@Nullable String code) {
            this.code = code;
            return this;
        }
        public Builder embeddedInnerError(@Nullable InnerErrorResponse embeddedInnerError) {
            this.embeddedInnerError = embeddedInnerError;
            return this;
        }        public InnerErrorResponse build() {
            return new InnerErrorResponse(additionalInfo, code, embeddedInnerError);
        }
    }
}
