// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of an Azure Resource Manager template parameter.
 * 
 */
public final class ArmTemplateParameterPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ArmTemplateParameterPropertiesArgs Empty = new ArmTemplateParameterPropertiesArgs();

    /**
     * The name of the template parameter.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The value of the template parameter.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private ArmTemplateParameterPropertiesArgs() {}

    private ArmTemplateParameterPropertiesArgs(ArmTemplateParameterPropertiesArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ArmTemplateParameterPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ArmTemplateParameterPropertiesArgs $;

        public Builder() {
            $ = new ArmTemplateParameterPropertiesArgs();
        }

        public Builder(ArmTemplateParameterPropertiesArgs defaults) {
            $ = new ArmTemplateParameterPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ArmTemplateParameterPropertiesArgs build() {
            return $;
        }
    }

}
