// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class ErrorResponse {
    /**
     * @return Additional information about the error.
     * 
     */
    private final Map<String,String> details;
    /**
     * @return The time when the error occurred.
     * 
     */
    private final String errorTime;
    /**
     * @return A unique identifier for this specific error, allowing it to be traced throughout the system in logs and API responses.
     * 
     */
    private final String errorUuid;
    /**
     * @return A message containing more information about the error that occurred.
     * 
     */
    private final String message;
    /**
     * @return A title that explains the reason for the error.
     * 
     */
    private final String reason;

    @CustomType.Constructor
    private ErrorResponse(
        @CustomType.Parameter("details") Map<String,String> details,
        @CustomType.Parameter("errorTime") String errorTime,
        @CustomType.Parameter("errorUuid") String errorUuid,
        @CustomType.Parameter("message") String message,
        @CustomType.Parameter("reason") String reason) {
        this.details = details;
        this.errorTime = errorTime;
        this.errorUuid = errorUuid;
        this.message = message;
        this.reason = reason;
    }

    /**
     * @return Additional information about the error.
     * 
     */
    public Map<String,String> details() {
        return this.details;
    }
    /**
     * @return The time when the error occurred.
     * 
     */
    public String errorTime() {
        return this.errorTime;
    }
    /**
     * @return A unique identifier for this specific error, allowing it to be traced throughout the system in logs and API responses.
     * 
     */
    public String errorUuid() {
        return this.errorUuid;
    }
    /**
     * @return A message containing more information about the error that occurred.
     * 
     */
    public String message() {
        return this.message;
    }
    /**
     * @return A title that explains the reason for the error.
     * 
     */
    public String reason() {
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
        }        public ErrorResponse build() {
            return new ErrorResponse(details, errorTime, errorUuid, message, reason);
        }
    }
}
