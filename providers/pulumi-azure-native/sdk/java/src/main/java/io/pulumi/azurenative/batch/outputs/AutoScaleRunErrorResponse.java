// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class AutoScaleRunErrorResponse {
    /**
     * An identifier for the error. Codes are invariant and are intended to be consumed programmatically.
     * 
     */
    private final String code;
    private final @Nullable List<AutoScaleRunErrorResponse> details;
    /**
     * A message describing the error, intended to be suitable for display in a user interface.
     * 
     */
    private final String message;

    @OutputCustomType.Constructor({"code","details","message"})
    private AutoScaleRunErrorResponse(
        String code,
        @Nullable List<AutoScaleRunErrorResponse> details,
        String message) {
        this.code = code;
        this.details = details;
        this.message = message;
    }

    /**
     * An identifier for the error. Codes are invariant and are intended to be consumed programmatically.
     * 
    */
    public String getCode() {
        return this.code;
    }
    public List<AutoScaleRunErrorResponse> getDetails() {
        return this.details == null ? List.of() : this.details;
    }
    /**
     * A message describing the error, intended to be suitable for display in a user interface.
     * 
    */
    public String getMessage() {
        return this.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoScaleRunErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private @Nullable List<AutoScaleRunErrorResponse> details;
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoScaleRunErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.message = defaults.message;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setDetails(@Nullable List<AutoScaleRunErrorResponse> details) {
            this.details = details;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public AutoScaleRunErrorResponse build() {
            return new AutoScaleRunErrorResponse(code, details, message);
        }
    }
}
