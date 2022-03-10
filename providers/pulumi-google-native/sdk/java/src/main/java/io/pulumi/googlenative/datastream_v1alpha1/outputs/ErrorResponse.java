// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class ErrorResponse {
    /**
     * Additional information about the error.
     * 
     */
    private final Map<String,String> details;
    /**
     * The time when the error occurred.
     * 
     */
    private final String errorTime;
    /**
     * A unique identifier for this specific error, allowing it to be traced throughout the system in logs and API responses.
     * 
     */
    private final String errorUuid;
    /**
     * A message containing more information about the error that occurred.
     * 
     */
    private final String message;
    /**
     * A title that explains the reason for the error.
     * 
     */
    private final String reason;

    @OutputCustomType.Constructor
    private ErrorResponse(
        @OutputCustomType.Parameter("details") Map<String,String> details,
        @OutputCustomType.Parameter("errorTime") String errorTime,
        @OutputCustomType.Parameter("errorUuid") String errorUuid,
        @OutputCustomType.Parameter("message") String message,
        @OutputCustomType.Parameter("reason") String reason) {
        this.details = details;
        this.errorTime = errorTime;
        this.errorUuid = errorUuid;
        this.message = message;
        this.reason = reason;
    }

    /**
     * Additional information about the error.
     * 
    */
    public Map<String,String> getDetails() {
        return this.details;
    }
    /**
     * The time when the error occurred.
     * 
    */
    public String getErrorTime() {
        return this.errorTime;
    }
    /**
     * A unique identifier for this specific error, allowing it to be traced throughout the system in logs and API responses.
     * 
    */
    public String getErrorUuid() {
        return this.errorUuid;
    }
    /**
     * A message containing more information about the error that occurred.
     * 
    */
    public String getMessage() {
        return this.message;
    }
    /**
     * A title that explains the reason for the error.
     * 
    */
    public String getReason() {
        return this.reason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> details;
        private String errorTime;
        private String errorUuid;
        private String message;
        private String reason;

        public Builder() {
    	      // Empty
        }

        public Builder(ErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.details = defaults.details;
    	      this.errorTime = defaults.errorTime;
    	      this.errorUuid = defaults.errorUuid;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
        }

        public Builder details(Map<String,String> details) {
            this.details = Objects.requireNonNull(details);
            return this;
        }

        public Builder errorTime(String errorTime) {
            this.errorTime = Objects.requireNonNull(errorTime);
            return this;
        }

        public Builder errorUuid(String errorUuid) {
            this.errorUuid = Objects.requireNonNull(errorUuid);
            return this;
        }

        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder reason(String reason) {
            this.reason = Objects.requireNonNull(reason);
            return this;
        }
        public ErrorResponse build() {
            return new ErrorResponse(details, errorTime, errorUuid, message, reason);
        }
    }
}
