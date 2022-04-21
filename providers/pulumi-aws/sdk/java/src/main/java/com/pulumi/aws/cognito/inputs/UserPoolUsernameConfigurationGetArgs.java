// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class UserPoolUsernameConfigurationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserPoolUsernameConfigurationGetArgs Empty = new UserPoolUsernameConfigurationGetArgs();

    /**
     * Whether username case sensitivity will be applied for all users in the user pool through Cognito APIs.
     * 
     */
    @Import(name="caseSensitive", required=true)
    private Output<Boolean> caseSensitive;

    public Output<Boolean> caseSensitive() {
        return this.caseSensitive;
    }

    private UserPoolUsernameConfigurationGetArgs() {}

    private UserPoolUsernameConfigurationGetArgs(UserPoolUsernameConfigurationGetArgs $) {
        this.caseSensitive = $.caseSensitive;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserPoolUsernameConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserPoolUsernameConfigurationGetArgs $;

        public Builder() {
            $ = new UserPoolUsernameConfigurationGetArgs();
        }

        public Builder(UserPoolUsernameConfigurationGetArgs defaults) {
            $ = new UserPoolUsernameConfigurationGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder caseSensitive(Output<Boolean> caseSensitive) {
            $.caseSensitive = caseSensitive;
            return this;
        }

        public Builder caseSensitive(Boolean caseSensitive) {
            return caseSensitive(Output.of(caseSensitive));
        }

        public UserPoolUsernameConfigurationGetArgs build() {
            $.caseSensitive = Objects.requireNonNull($.caseSensitive, "expected parameter 'caseSensitive' to be non-null");
            return $;
        }
    }

}
