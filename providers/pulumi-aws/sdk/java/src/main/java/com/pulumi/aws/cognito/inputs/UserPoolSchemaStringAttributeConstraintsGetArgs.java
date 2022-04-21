// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserPoolSchemaStringAttributeConstraintsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserPoolSchemaStringAttributeConstraintsGetArgs Empty = new UserPoolSchemaStringAttributeConstraintsGetArgs();

    /**
     * Maximum length of an attribute value of the string type.
     * 
     */
    @Import(name="maxLength")
    private @Nullable Output<String> maxLength;

    public Optional<Output<String>> maxLength() {
        return Optional.ofNullable(this.maxLength);
    }

    /**
     * Minimum length of an attribute value of the string type.
     * 
     */
    @Import(name="minLength")
    private @Nullable Output<String> minLength;

    public Optional<Output<String>> minLength() {
        return Optional.ofNullable(this.minLength);
    }

    private UserPoolSchemaStringAttributeConstraintsGetArgs() {}

    private UserPoolSchemaStringAttributeConstraintsGetArgs(UserPoolSchemaStringAttributeConstraintsGetArgs $) {
        this.maxLength = $.maxLength;
        this.minLength = $.minLength;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserPoolSchemaStringAttributeConstraintsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserPoolSchemaStringAttributeConstraintsGetArgs $;

        public Builder() {
            $ = new UserPoolSchemaStringAttributeConstraintsGetArgs();
        }

        public Builder(UserPoolSchemaStringAttributeConstraintsGetArgs defaults) {
            $ = new UserPoolSchemaStringAttributeConstraintsGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder maxLength(@Nullable Output<String> maxLength) {
            $.maxLength = maxLength;
            return this;
        }

        public Builder maxLength(String maxLength) {
            return maxLength(Output.of(maxLength));
        }

        public Builder minLength(@Nullable Output<String> minLength) {
            $.minLength = minLength;
            return this;
        }

        public Builder minLength(String minLength) {
            return minLength(Output.of(minLength));
        }

        public UserPoolSchemaStringAttributeConstraintsGetArgs build() {
            return $;
        }
    }

}
