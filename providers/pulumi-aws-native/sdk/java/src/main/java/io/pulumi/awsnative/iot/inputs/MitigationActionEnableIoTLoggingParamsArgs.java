// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.enums.MitigationActionEnableIoTLoggingParamsLogLevel;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Parameters to define a mitigation action that enables AWS IoT logging at a specified level of detail.
 * 
 */
public final class MitigationActionEnableIoTLoggingParamsArgs extends io.pulumi.resources.ResourceArgs {

    public static final MitigationActionEnableIoTLoggingParamsArgs Empty = new MitigationActionEnableIoTLoggingParamsArgs();

    /**
     *  Specifies which types of information are logged.
     * 
     */
    @InputImport(name="logLevel", required=true)
      private final Input<MitigationActionEnableIoTLoggingParamsLogLevel> logLevel;

    public Input<MitigationActionEnableIoTLoggingParamsLogLevel> getLogLevel() {
        return this.logLevel;
    }

    /**
     *  The ARN of the IAM role used for logging.
     * 
     */
    @InputImport(name="roleArnForLogging", required=true)
      private final Input<String> roleArnForLogging;

    public Input<String> getRoleArnForLogging() {
        return this.roleArnForLogging;
    }

    public MitigationActionEnableIoTLoggingParamsArgs(
        Input<MitigationActionEnableIoTLoggingParamsLogLevel> logLevel,
        Input<String> roleArnForLogging) {
        this.logLevel = Objects.requireNonNull(logLevel, "expected parameter 'logLevel' to be non-null");
        this.roleArnForLogging = Objects.requireNonNull(roleArnForLogging, "expected parameter 'roleArnForLogging' to be non-null");
    }

    private MitigationActionEnableIoTLoggingParamsArgs() {
        this.logLevel = Input.empty();
        this.roleArnForLogging = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MitigationActionEnableIoTLoggingParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<MitigationActionEnableIoTLoggingParamsLogLevel> logLevel;
        private Input<String> roleArnForLogging;

        public Builder() {
    	      // Empty
        }

        public Builder(MitigationActionEnableIoTLoggingParamsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logLevel = defaults.logLevel;
    	      this.roleArnForLogging = defaults.roleArnForLogging;
        }

        public Builder logLevel(Input<MitigationActionEnableIoTLoggingParamsLogLevel> logLevel) {
            this.logLevel = Objects.requireNonNull(logLevel);
            return this;
        }

        public Builder logLevel(MitigationActionEnableIoTLoggingParamsLogLevel logLevel) {
            this.logLevel = Input.of(Objects.requireNonNull(logLevel));
            return this;
        }

        public Builder roleArnForLogging(Input<String> roleArnForLogging) {
            this.roleArnForLogging = Objects.requireNonNull(roleArnForLogging);
            return this;
        }

        public Builder roleArnForLogging(String roleArnForLogging) {
            this.roleArnForLogging = Input.of(Objects.requireNonNull(roleArnForLogging));
            return this;
        }
        public MitigationActionEnableIoTLoggingParamsArgs build() {
            return new MitigationActionEnableIoTLoggingParamsArgs(logLevel, roleArnForLogging);
        }
    }
}
