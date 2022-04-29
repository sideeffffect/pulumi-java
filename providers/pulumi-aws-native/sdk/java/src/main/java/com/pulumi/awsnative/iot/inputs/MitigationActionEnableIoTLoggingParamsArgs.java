// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.awsnative.iot.enums.MitigationActionEnableIoTLoggingParamsLogLevel;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


/**
 * Parameters to define a mitigation action that enables AWS IoT logging at a specified level of detail.
 * 
 */
public final class MitigationActionEnableIoTLoggingParamsArgs extends ResourceArgs {

    public static final MitigationActionEnableIoTLoggingParamsArgs Empty = new MitigationActionEnableIoTLoggingParamsArgs();

    /**
     *  Specifies which types of information are logged.
     * 
     */
    @Import(name="logLevel", required=true)
    private Output<MitigationActionEnableIoTLoggingParamsLogLevel> logLevel;

    /**
     * @return  Specifies which types of information are logged.
     * 
     */
    public Output<MitigationActionEnableIoTLoggingParamsLogLevel> logLevel() {
        return this.logLevel;
    }

    /**
     *  The ARN of the IAM role used for logging.
     * 
     */
    @Import(name="roleArnForLogging", required=true)
    private Output<String> roleArnForLogging;

    /**
     * @return  The ARN of the IAM role used for logging.
     * 
     */
    public Output<String> roleArnForLogging() {
        return this.roleArnForLogging;
    }

    private MitigationActionEnableIoTLoggingParamsArgs() {}

    private MitigationActionEnableIoTLoggingParamsArgs(MitigationActionEnableIoTLoggingParamsArgs $) {
        this.logLevel = $.logLevel;
        this.roleArnForLogging = $.roleArnForLogging;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MitigationActionEnableIoTLoggingParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MitigationActionEnableIoTLoggingParamsArgs $;

        public Builder() {
            $ = new MitigationActionEnableIoTLoggingParamsArgs();
        }

        public Builder(MitigationActionEnableIoTLoggingParamsArgs defaults) {
            $ = new MitigationActionEnableIoTLoggingParamsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param logLevel  Specifies which types of information are logged.
         * 
         * @return builder
         * 
         */
        public Builder logLevel(Output<MitigationActionEnableIoTLoggingParamsLogLevel> logLevel) {
            $.logLevel = logLevel;
            return this;
        }

        /**
         * @param logLevel  Specifies which types of information are logged.
         * 
         * @return builder
         * 
         */
        public Builder logLevel(MitigationActionEnableIoTLoggingParamsLogLevel logLevel) {
            return logLevel(Output.of(logLevel));
        }

        /**
         * @param roleArnForLogging  The ARN of the IAM role used for logging.
         * 
         * @return builder
         * 
         */
        public Builder roleArnForLogging(Output<String> roleArnForLogging) {
            $.roleArnForLogging = roleArnForLogging;
            return this;
        }

        /**
         * @param roleArnForLogging  The ARN of the IAM role used for logging.
         * 
         * @return builder
         * 
         */
        public Builder roleArnForLogging(String roleArnForLogging) {
            return roleArnForLogging(Output.of(roleArnForLogging));
        }

        public MitigationActionEnableIoTLoggingParamsArgs build() {
            $.logLevel = Objects.requireNonNull($.logLevel, "expected parameter 'logLevel' to be non-null");
            $.roleArnForLogging = Objects.requireNonNull($.roleArnForLogging, "expected parameter 'roleArnForLogging' to be non-null");
            return $;
        }
    }

}
