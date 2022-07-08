// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager.alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Basic Auth used as a credential.
 * 
 */
public final class BasicAuthArgs extends com.pulumi.resources.ResourceArgs {

    public static final BasicAuthArgs Empty = new BasicAuthArgs();

    @Import(name="password")
    private @Nullable Output<String> password;

    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    @Import(name="user")
    private @Nullable Output<String> user;

    public Optional<Output<String>> user() {
        return Optional.ofNullable(this.user);
    }

    private BasicAuthArgs() {}

    private BasicAuthArgs(BasicAuthArgs $) {
        this.password = $.password;
        this.user = $.user;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BasicAuthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BasicAuthArgs $;

        public Builder() {
            $ = new BasicAuthArgs();
        }

        public Builder(BasicAuthArgs defaults) {
            $ = new BasicAuthArgs(Objects.requireNonNull(defaults));
        }

        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        public Builder password(String password) {
            return password(Output.of(password));
        }

        public Builder user(@Nullable Output<String> user) {
            $.user = user;
            return this;
        }

        public Builder user(String user) {
            return user(Output.of(user));
        }

        public BasicAuthArgs build() {
            return $;
        }
    }

}
