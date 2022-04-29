// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediapackage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PackagingGroupLogConfigurationArgs extends ResourceArgs {

    public static final PackagingGroupLogConfigurationArgs Empty = new PackagingGroupLogConfigurationArgs();

    /**
     * Sets a custom AWS CloudWatch log group name for egress logs. If a log group name isn&#39;t specified, the default name is used: /aws/MediaPackage/VodEgressAccessLogs.
     * 
     */
    @Import(name="logGroupName")
    private @Nullable Output<String> logGroupName;

    /**
     * @return Sets a custom AWS CloudWatch log group name for egress logs. If a log group name isn&#39;t specified, the default name is used: /aws/MediaPackage/VodEgressAccessLogs.
     * 
     */
    public Optional<Output<String>> logGroupName() {
        return Optional.ofNullable(this.logGroupName);
    }

    private PackagingGroupLogConfigurationArgs() {}

    private PackagingGroupLogConfigurationArgs(PackagingGroupLogConfigurationArgs $) {
        this.logGroupName = $.logGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PackagingGroupLogConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PackagingGroupLogConfigurationArgs $;

        public Builder() {
            $ = new PackagingGroupLogConfigurationArgs();
        }

        public Builder(PackagingGroupLogConfigurationArgs defaults) {
            $ = new PackagingGroupLogConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param logGroupName Sets a custom AWS CloudWatch log group name for egress logs. If a log group name isn&#39;t specified, the default name is used: /aws/MediaPackage/VodEgressAccessLogs.
         * 
         * @return builder
         * 
         */
        public Builder logGroupName(@Nullable Output<String> logGroupName) {
            $.logGroupName = logGroupName;
            return this;
        }

        /**
         * @param logGroupName Sets a custom AWS CloudWatch log group name for egress logs. If a log group name isn&#39;t specified, the default name is used: /aws/MediaPackage/VodEgressAccessLogs.
         * 
         * @return builder
         * 
         */
        public Builder logGroupName(String logGroupName) {
            return logGroupName(Output.of(logGroupName));
        }

        public PackagingGroupLogConfigurationArgs build() {
            return $;
        }
    }

}
