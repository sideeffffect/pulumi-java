// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Settings that determine the Lambda function that Amazon Lex uses for processing user responses.
 * 
 */
public final class BotDialogCodeHookSettingArgs extends com.pulumi.resources.ResourceArgs {

    public static final BotDialogCodeHookSettingArgs Empty = new BotDialogCodeHookSettingArgs();

    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }

    private BotDialogCodeHookSettingArgs() {}

    private BotDialogCodeHookSettingArgs(BotDialogCodeHookSettingArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotDialogCodeHookSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotDialogCodeHookSettingArgs $;

        public Builder() {
            $ = new BotDialogCodeHookSettingArgs();
        }

        public Builder(BotDialogCodeHookSettingArgs defaults) {
            $ = new BotDialogCodeHookSettingArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public BotDialogCodeHookSettingArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
