// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.inputs;

import com.pulumi.awsnative.lex.inputs.BotFulfillmentUpdatesSpecificationArgs;
import com.pulumi.awsnative.lex.inputs.BotPostFulfillmentStatusSpecificationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings that determine if a Lambda function should be invoked to fulfill a specific intent.
 * 
 */
public final class BotFulfillmentCodeHookSettingArgs extends ResourceArgs {

    public static final BotFulfillmentCodeHookSettingArgs Empty = new BotFulfillmentCodeHookSettingArgs();

    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }

    @Import(name="fulfillmentUpdatesSpecification")
    private @Nullable Output<BotFulfillmentUpdatesSpecificationArgs> fulfillmentUpdatesSpecification;

    public Optional<Output<BotFulfillmentUpdatesSpecificationArgs>> fulfillmentUpdatesSpecification() {
        return Optional.ofNullable(this.fulfillmentUpdatesSpecification);
    }

    @Import(name="postFulfillmentStatusSpecification")
    private @Nullable Output<BotPostFulfillmentStatusSpecificationArgs> postFulfillmentStatusSpecification;

    public Optional<Output<BotPostFulfillmentStatusSpecificationArgs>> postFulfillmentStatusSpecification() {
        return Optional.ofNullable(this.postFulfillmentStatusSpecification);
    }

    private BotFulfillmentCodeHookSettingArgs() {}

    private BotFulfillmentCodeHookSettingArgs(BotFulfillmentCodeHookSettingArgs $) {
        this.enabled = $.enabled;
        this.fulfillmentUpdatesSpecification = $.fulfillmentUpdatesSpecification;
        this.postFulfillmentStatusSpecification = $.postFulfillmentStatusSpecification;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotFulfillmentCodeHookSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotFulfillmentCodeHookSettingArgs $;

        public Builder() {
            $ = new BotFulfillmentCodeHookSettingArgs();
        }

        public Builder(BotFulfillmentCodeHookSettingArgs defaults) {
            $ = new BotFulfillmentCodeHookSettingArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder fulfillmentUpdatesSpecification(@Nullable Output<BotFulfillmentUpdatesSpecificationArgs> fulfillmentUpdatesSpecification) {
            $.fulfillmentUpdatesSpecification = fulfillmentUpdatesSpecification;
            return this;
        }

        public Builder fulfillmentUpdatesSpecification(BotFulfillmentUpdatesSpecificationArgs fulfillmentUpdatesSpecification) {
            return fulfillmentUpdatesSpecification(Output.of(fulfillmentUpdatesSpecification));
        }

        public Builder postFulfillmentStatusSpecification(@Nullable Output<BotPostFulfillmentStatusSpecificationArgs> postFulfillmentStatusSpecification) {
            $.postFulfillmentStatusSpecification = postFulfillmentStatusSpecification;
            return this;
        }

        public Builder postFulfillmentStatusSpecification(BotPostFulfillmentStatusSpecificationArgs postFulfillmentStatusSpecification) {
            return postFulfillmentStatusSpecification(Output.of(postFulfillmentStatusSpecification));
        }

        public BotFulfillmentCodeHookSettingArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
