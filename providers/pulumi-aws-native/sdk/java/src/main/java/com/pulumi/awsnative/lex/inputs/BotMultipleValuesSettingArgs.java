// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Indicates whether a slot can return multiple values.
 * 
 */
public final class BotMultipleValuesSettingArgs extends ResourceArgs {

    public static final BotMultipleValuesSettingArgs Empty = new BotMultipleValuesSettingArgs();

    @Import(name="allowMultipleValues")
    private @Nullable Output<Boolean> allowMultipleValues;

    public Optional<Output<Boolean>> allowMultipleValues() {
        return Optional.ofNullable(this.allowMultipleValues);
    }

    private BotMultipleValuesSettingArgs() {}

    private BotMultipleValuesSettingArgs(BotMultipleValuesSettingArgs $) {
        this.allowMultipleValues = $.allowMultipleValues;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotMultipleValuesSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotMultipleValuesSettingArgs $;

        public Builder() {
            $ = new BotMultipleValuesSettingArgs();
        }

        public Builder(BotMultipleValuesSettingArgs defaults) {
            $ = new BotMultipleValuesSettingArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowMultipleValues(@Nullable Output<Boolean> allowMultipleValues) {
            $.allowMultipleValues = allowMultipleValues;
            return this;
        }

        public Builder allowMultipleValues(Boolean allowMultipleValues) {
            return allowMultipleValues(Output.of(allowMultipleValues));
        }

        public BotMultipleValuesSettingArgs build() {
            return $;
        }
    }

}
