// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.tpu_v2alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A service account.
 * 
 */
public final class ServiceAccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceAccountArgs Empty = new ServiceAccountArgs();

    /**
     * Email address of the service account. If empty, default Compute service account will be used.
     * 
     */
    @Import(name="email")
    private @Nullable Output<String> email;

    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
    }

    /**
     * The list of scopes to be made available for this service account. If empty, access to all Cloud APIs will be allowed.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<List<String>> scope;

    public Optional<Output<List<String>>> scope() {
        return Optional.ofNullable(this.scope);
    }

    private ServiceAccountArgs() {}

    private ServiceAccountArgs(ServiceAccountArgs $) {
        this.email = $.email;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceAccountArgs $;

        public Builder() {
            $ = new ServiceAccountArgs();
        }

        public Builder(ServiceAccountArgs defaults) {
            $ = new ServiceAccountArgs(Objects.requireNonNull(defaults));
        }

        public Builder email(@Nullable Output<String> email) {
            $.email = email;
            return this;
        }

        public Builder email(String email) {
            return email(Output.of(email));
        }

        public Builder scope(@Nullable Output<List<String>> scope) {
            $.scope = scope;
            return this;
        }

        public Builder scope(List<String> scope) {
            return scope(Output.of(scope));
        }

        public Builder scope(String... scope) {
            return scope(List.of(scope));
        }

        public ServiceAccountArgs build() {
            return $;
        }
    }

}
