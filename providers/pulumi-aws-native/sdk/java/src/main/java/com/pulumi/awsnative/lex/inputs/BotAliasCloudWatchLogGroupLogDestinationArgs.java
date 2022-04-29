// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


public final class BotAliasCloudWatchLogGroupLogDestinationArgs extends ResourceArgs {

    public static final BotAliasCloudWatchLogGroupLogDestinationArgs Empty = new BotAliasCloudWatchLogGroupLogDestinationArgs();

    /**
     * A string used to identify this tag
     * 
     */
    @Import(name="cloudWatchLogGroupArn", required=true)
    private Output<String> cloudWatchLogGroupArn;

    /**
     * @return A string used to identify this tag
     * 
     */
    public Output<String> cloudWatchLogGroupArn() {
        return this.cloudWatchLogGroupArn;
    }

    /**
     * A string containing the value for the tag
     * 
     */
    @Import(name="logPrefix", required=true)
    private Output<String> logPrefix;

    /**
     * @return A string containing the value for the tag
     * 
     */
    public Output<String> logPrefix() {
        return this.logPrefix;
    }

    private BotAliasCloudWatchLogGroupLogDestinationArgs() {}

    private BotAliasCloudWatchLogGroupLogDestinationArgs(BotAliasCloudWatchLogGroupLogDestinationArgs $) {
        this.cloudWatchLogGroupArn = $.cloudWatchLogGroupArn;
        this.logPrefix = $.logPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotAliasCloudWatchLogGroupLogDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotAliasCloudWatchLogGroupLogDestinationArgs $;

        public Builder() {
            $ = new BotAliasCloudWatchLogGroupLogDestinationArgs();
        }

        public Builder(BotAliasCloudWatchLogGroupLogDestinationArgs defaults) {
            $ = new BotAliasCloudWatchLogGroupLogDestinationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudWatchLogGroupArn A string used to identify this tag
         * 
         * @return builder
         * 
         */
        public Builder cloudWatchLogGroupArn(Output<String> cloudWatchLogGroupArn) {
            $.cloudWatchLogGroupArn = cloudWatchLogGroupArn;
            return this;
        }

        /**
         * @param cloudWatchLogGroupArn A string used to identify this tag
         * 
         * @return builder
         * 
         */
        public Builder cloudWatchLogGroupArn(String cloudWatchLogGroupArn) {
            return cloudWatchLogGroupArn(Output.of(cloudWatchLogGroupArn));
        }

        /**
         * @param logPrefix A string containing the value for the tag
         * 
         * @return builder
         * 
         */
        public Builder logPrefix(Output<String> logPrefix) {
            $.logPrefix = logPrefix;
            return this;
        }

        /**
         * @param logPrefix A string containing the value for the tag
         * 
         * @return builder
         * 
         */
        public Builder logPrefix(String logPrefix) {
            return logPrefix(Output.of(logPrefix));
        }

        public BotAliasCloudWatchLogGroupLogDestinationArgs build() {
            $.cloudWatchLogGroupArn = Objects.requireNonNull($.cloudWatchLogGroupArn, "expected parameter 'cloudWatchLogGroupArn' to be non-null");
            $.logPrefix = Objects.requireNonNull($.logPrefix, "expected parameter 'logPrefix' to be non-null");
            return $;
        }
    }

}
