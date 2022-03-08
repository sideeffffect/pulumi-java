// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ODataErrorResponse {
    /**
     * The machine-readable description of the error, such as 'InvalidRequest' or 'InternalServerError'
     * 
     */
    private final String code;
    /**
     * Inner errors that caused this error
     * 
     */
    private final List<ODataErrorResponse> details;
    /**
     * The human-readable description of the error
     * 
     */
    private final String message;

    @OutputCustomType.Constructor({"code","details","message"})
    private ODataErrorResponse(
        String code,
        List<ODataErrorResponse> details,
        String message) {
        this.code = code;
        this.details = details;
        this.message = message;
    }

    /**
     * The machine-readable description of the error, such as 'InvalidRequest' or 'InternalServerError'
     * 
    */
    public String getCode() {
        return this.code;
    }
    /**
     * Inner errors that caused this error
     * 
    */
    public List<ODataErrorResponse> getDetails() {
        return this.details;
    }
    /**
     * The human-readable description of the error
     * 
    */
    public String getMessage() {
        return this.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ODataErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private List<ODataErrorResponse> details;
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(ODataErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.message = defaults.message;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setDetails(List<ODataErrorResponse> details) {
            this.details = Objects.requireNonNull(details);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public ODataErrorResponse build() {
            return new ODataErrorResponse(code, details, message);
        }
    }
}
