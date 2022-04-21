// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.inputs.AuthorizationLoggingOptionsResponse;
import java.lang.String;
import java.util.Objects;


/**
 * This is deprecated and has no effect. Do not use.
 * 
 */
public final class LogConfigCloudAuditOptionsResponse extends com.pulumi.resources.InvokeArgs {

    public static final LogConfigCloudAuditOptionsResponse Empty = new LogConfigCloudAuditOptionsResponse();

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="authorizationLoggingOptions", required=true)
    private AuthorizationLoggingOptionsResponse authorizationLoggingOptions;

    public AuthorizationLoggingOptionsResponse authorizationLoggingOptions() {
        return this.authorizationLoggingOptions;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="logName", required=true)
    private String logName;

    public String logName() {
        return this.logName;
    }

    private LogConfigCloudAuditOptionsResponse() {}

    private LogConfigCloudAuditOptionsResponse(LogConfigCloudAuditOptionsResponse $) {
        this.authorizationLoggingOptions = $.authorizationLoggingOptions;
        this.logName = $.logName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogConfigCloudAuditOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogConfigCloudAuditOptionsResponse $;

        public Builder() {
            $ = new LogConfigCloudAuditOptionsResponse();
        }

        public Builder(LogConfigCloudAuditOptionsResponse defaults) {
            $ = new LogConfigCloudAuditOptionsResponse(Objects.requireNonNull(defaults));
        }

        public Builder authorizationLoggingOptions(AuthorizationLoggingOptionsResponse authorizationLoggingOptions) {
            $.authorizationLoggingOptions = authorizationLoggingOptions;
            return this;
        }

        public Builder logName(String logName) {
            $.logName = logName;
            return this;
        }

        public LogConfigCloudAuditOptionsResponse build() {
            $.authorizationLoggingOptions = Objects.requireNonNull($.authorizationLoggingOptions, "expected parameter 'authorizationLoggingOptions' to be non-null");
            $.logName = Objects.requireNonNull($.logName, "expected parameter 'logName' to be non-null");
            return $;
        }
    }

}
