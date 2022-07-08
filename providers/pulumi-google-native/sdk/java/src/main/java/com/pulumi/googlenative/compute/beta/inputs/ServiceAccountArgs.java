// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.inputs;

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
     * Email address of the service account.
     * 
     */
    @Import(name="email")
    private @Nullable Output<String> email;

    /**
     * @return Email address of the service account.
     * 
     */
    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
    }

    /**
     * The list of scopes to be made available for this service account.
     * 
     */
    @Import(name="scopes")
    private @Nullable Output<List<String>> scopes;

    /**
     * @return The list of scopes to be made available for this service account.
     * 
     */
    public Optional<Output<List<String>>> scopes() {
        return Optional.ofNullable(this.scopes);
    }

    private ServiceAccountArgs() {}

    private ServiceAccountArgs(ServiceAccountArgs $) {
        this.email = $.email;
        this.scopes = $.scopes;
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

        /**
         * @param email Email address of the service account.
         * 
         * @return builder
         * 
         */
        public Builder email(@Nullable Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email Email address of the service account.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param scopes The list of scopes to be made available for this service account.
         * 
         * @return builder
         * 
         */
        public Builder scopes(@Nullable Output<List<String>> scopes) {
            $.scopes = scopes;
            return this;
        }

        /**
         * @param scopes The list of scopes to be made available for this service account.
         * 
         * @return builder
         * 
         */
        public Builder scopes(List<String> scopes) {
            return scopes(Output.of(scopes));
        }

        /**
         * @param scopes The list of scopes to be made available for this service account.
         * 
         * @return builder
         * 
         */
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }

        public ServiceAccountArgs build() {
            return $;
        }
    }

}
