// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.gameservices_v1.outputs.AuthorizationLoggingOptionsResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CloudAuditOptionsResponse {
    /**
     * Information used by the Cloud Audit Logging pipeline.
     * 
     */
    private final AuthorizationLoggingOptionsResponse authorizationLoggingOptions;
    /**
     * The log_name to populate in the Cloud Audit Record.
     * 
     */
    private final String logName;

    @OutputCustomType.Constructor
    private CloudAuditOptionsResponse(
        @OutputCustomType.Parameter("authorizationLoggingOptions") AuthorizationLoggingOptionsResponse authorizationLoggingOptions,
        @OutputCustomType.Parameter("logName") String logName) {
        this.authorizationLoggingOptions = authorizationLoggingOptions;
        this.logName = logName;
    }

    /**
     * Information used by the Cloud Audit Logging pipeline.
     * 
    */
    public AuthorizationLoggingOptionsResponse getAuthorizationLoggingOptions() {
        return this.authorizationLoggingOptions;
    }
    /**
     * The log_name to populate in the Cloud Audit Record.
     * 
    */
    public String getLogName() {
        return this.logName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudAuditOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthorizationLoggingOptionsResponse authorizationLoggingOptions;
        private String logName;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudAuditOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationLoggingOptions = defaults.authorizationLoggingOptions;
    	      this.logName = defaults.logName;
        }

        public Builder authorizationLoggingOptions(AuthorizationLoggingOptionsResponse authorizationLoggingOptions) {
            this.authorizationLoggingOptions = Objects.requireNonNull(authorizationLoggingOptions);
            return this;
        }

        public Builder logName(String logName) {
            this.logName = Objects.requireNonNull(logName);
            return this;
        }
        public CloudAuditOptionsResponse build() {
            return new CloudAuditOptionsResponse(authorizationLoggingOptions, logName);
        }
    }
}
