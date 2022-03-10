// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The status of an Azure resource at the time the operation was called.
 * 
 */
public final class StatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final StatusResponse Empty = new StatusResponse();

    /**
     * The short label for the status.
     * 
     */
    @InputImport(name="displayStatus", required=true)
      private final String displayStatus;

    public String getDisplayStatus() {
        return this.displayStatus;
    }

    /**
     * The detailed message for the status, including alerts and error messages.
     * 
     */
    @InputImport(name="message", required=true)
      private final String message;

    public String getMessage() {
        return this.message;
    }

    /**
     * The timestamp when the status was changed to the current value.
     * 
     */
    @InputImport(name="timestamp", required=true)
      private final String timestamp;

    public String getTimestamp() {
        return this.timestamp;
    }

    public StatusResponse(
        String displayStatus,
        String message,
        String timestamp) {
        this.displayStatus = Objects.requireNonNull(displayStatus, "expected parameter 'displayStatus' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
        this.timestamp = Objects.requireNonNull(timestamp, "expected parameter 'timestamp' to be non-null");
    }

    private StatusResponse() {
        this.displayStatus = null;
        this.message = null;
        this.timestamp = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayStatus;
        private String message;
        private String timestamp;

        public Builder() {
    	      // Empty
        }

        public Builder(StatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayStatus = defaults.displayStatus;
    	      this.message = defaults.message;
    	      this.timestamp = defaults.timestamp;
        }

        public Builder displayStatus(String displayStatus) {
            this.displayStatus = Objects.requireNonNull(displayStatus);
            return this;
        }

        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder timestamp(String timestamp) {
            this.timestamp = Objects.requireNonNull(timestamp);
            return this;
        }
        public StatusResponse build() {
            return new StatusResponse(displayStatus, message, timestamp);
        }
    }
}
