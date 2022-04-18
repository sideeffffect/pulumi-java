// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.outputs;

import com.pulumi.azurenative.logic.outputs.AzureResourceErrorInfoResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExpressionResponse {
    /**
     * The azure resource error info.
     * 
     */
    private final @Nullable AzureResourceErrorInfoResponse error;
    /**
     * The sub expressions.
     * 
     */
    private final @Nullable List<ExpressionResponse> subexpressions;
    /**
     * The text.
     * 
     */
    private final @Nullable String text;
    private final @Nullable Object value;

    @CustomType.Constructor
    private ExpressionResponse(
        @CustomType.Parameter("error") @Nullable AzureResourceErrorInfoResponse error,
        @CustomType.Parameter("subexpressions") @Nullable List<ExpressionResponse> subexpressions,
        @CustomType.Parameter("text") @Nullable String text,
        @CustomType.Parameter("value") @Nullable Object value) {
        this.error = error;
        this.subexpressions = subexpressions;
        this.text = text;
        this.value = value;
    }

    /**
     * The azure resource error info.
     * 
    */
    public Optional<AzureResourceErrorInfoResponse> error() {
        return Optional.ofNullable(this.error);
    }
    /**
     * The sub expressions.
     * 
    */
    public List<ExpressionResponse> subexpressions() {
        return this.subexpressions == null ? List.of() : this.subexpressions;
    }
    /**
     * The text.
     * 
    */
    public Optional<String> text() {
        return Optional.ofNullable(this.text);
    }
    public Optional<Object> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AzureResourceErrorInfoResponse error;
        private @Nullable List<ExpressionResponse> subexpressions;
        private @Nullable String text;
        private @Nullable Object value;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
    	      this.subexpressions = defaults.subexpressions;
    	      this.text = defaults.text;
    	      this.value = defaults.value;
        }

        public Builder error(@Nullable AzureResourceErrorInfoResponse error) {
            this.error = error;
            return this;
        }
        public Builder subexpressions(@Nullable List<ExpressionResponse> subexpressions) {
            this.subexpressions = subexpressions;
            return this;
        }
        public Builder subexpressions(ExpressionResponse... subexpressions) {
            return subexpressions(List.of(subexpressions));
        }
        public Builder text(@Nullable String text) {
            this.text = text;
            return this;
        }
        public Builder value(@Nullable Object value) {
            this.value = value;
            return this;
        }        public ExpressionResponse build() {
            return new ExpressionResponse(error, subexpressions, text, value);
        }
    }
}
