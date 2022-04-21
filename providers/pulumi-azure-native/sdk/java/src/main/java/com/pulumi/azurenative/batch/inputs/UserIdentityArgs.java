// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.azurenative.batch.inputs.AutoUserSpecificationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specify either the userName or autoUser property, but not both.
 * 
 */
public final class UserIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserIdentityArgs Empty = new UserIdentityArgs();

    /**
     * The userName and autoUser properties are mutually exclusive; you must specify one but not both.
     * 
     */
    @Import(name="autoUser")
    private @Nullable Output<AutoUserSpecificationArgs> autoUser;

    public Optional<Output<AutoUserSpecificationArgs>> autoUser() {
        return Optional.ofNullable(this.autoUser);
    }

    /**
     * The userName and autoUser properties are mutually exclusive; you must specify one but not both.
     * 
     */
    @Import(name="userName")
    private @Nullable Output<String> userName;

    public Optional<Output<String>> userName() {
        return Optional.ofNullable(this.userName);
    }

    private UserIdentityArgs() {}

    private UserIdentityArgs(UserIdentityArgs $) {
        this.autoUser = $.autoUser;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserIdentityArgs $;

        public Builder() {
            $ = new UserIdentityArgs();
        }

        public Builder(UserIdentityArgs defaults) {
            $ = new UserIdentityArgs(Objects.requireNonNull(defaults));
        }

        public Builder autoUser(@Nullable Output<AutoUserSpecificationArgs> autoUser) {
            $.autoUser = autoUser;
            return this;
        }

        public Builder autoUser(AutoUserSpecificationArgs autoUser) {
            return autoUser(Output.of(autoUser));
        }

        public Builder userName(@Nullable Output<String> userName) {
            $.userName = userName;
            return this;
        }

        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public UserIdentityArgs build() {
            return $;
        }
    }

}
