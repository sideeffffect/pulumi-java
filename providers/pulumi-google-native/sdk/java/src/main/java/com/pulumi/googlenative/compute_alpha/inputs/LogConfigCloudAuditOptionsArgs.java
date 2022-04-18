// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.compute_alpha.enums.LogConfigCloudAuditOptionsLogName;
import com.pulumi.googlenative.compute_alpha.inputs.AuthorizationLoggingOptionsArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This is deprecated and has no effect. Do not use.
 * 
 */
public final class LogConfigCloudAuditOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogConfigCloudAuditOptionsArgs Empty = new LogConfigCloudAuditOptionsArgs();

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="authorizationLoggingOptions")
      private final @Nullable Output<AuthorizationLoggingOptionsArgs> authorizationLoggingOptions;

    public Output<AuthorizationLoggingOptionsArgs> authorizationLoggingOptions() {
        return this.authorizationLoggingOptions == null ? Codegen.empty() : this.authorizationLoggingOptions;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="logName")
      private final @Nullable Output<LogConfigCloudAuditOptionsLogName> logName;

    public Output<LogConfigCloudAuditOptionsLogName> logName() {
        return this.logName == null ? Codegen.empty() : this.logName;
    }

    public LogConfigCloudAuditOptionsArgs(
        @Nullable Output<AuthorizationLoggingOptionsArgs> authorizationLoggingOptions,
        @Nullable Output<LogConfigCloudAuditOptionsLogName> logName) {
        this.authorizationLoggingOptions = authorizationLoggingOptions;
        this.logName = logName;
    }

    private LogConfigCloudAuditOptionsArgs() {
        this.authorizationLoggingOptions = Codegen.empty();
        this.logName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogConfigCloudAuditOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AuthorizationLoggingOptionsArgs> authorizationLoggingOptions;
        private @Nullable Output<LogConfigCloudAuditOptionsLogName> logName;

        public Builder() {
    	      // Empty
        }

        public Builder(LogConfigCloudAuditOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationLoggingOptions = defaults.authorizationLoggingOptions;
    	      this.logName = defaults.logName;
        }

        public Builder authorizationLoggingOptions(@Nullable Output<AuthorizationLoggingOptionsArgs> authorizationLoggingOptions) {
            this.authorizationLoggingOptions = authorizationLoggingOptions;
            return this;
        }
        public Builder authorizationLoggingOptions(@Nullable AuthorizationLoggingOptionsArgs authorizationLoggingOptions) {
            this.authorizationLoggingOptions = Codegen.ofNullable(authorizationLoggingOptions);
            return this;
        }
        public Builder logName(@Nullable Output<LogConfigCloudAuditOptionsLogName> logName) {
            this.logName = logName;
            return this;
        }
        public Builder logName(@Nullable LogConfigCloudAuditOptionsLogName logName) {
            this.logName = Codegen.ofNullable(logName);
            return this;
        }        public LogConfigCloudAuditOptionsArgs build() {
            return new LogConfigCloudAuditOptionsArgs(authorizationLoggingOptions, logName);
        }
    }
}
