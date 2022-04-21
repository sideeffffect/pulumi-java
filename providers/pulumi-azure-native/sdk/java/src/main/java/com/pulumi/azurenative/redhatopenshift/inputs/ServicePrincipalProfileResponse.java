// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.redhatopenshift.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ServicePrincipalProfile represents a service principal profile.
 * 
 */
public final class ServicePrincipalProfileResponse extends com.pulumi.resources.InvokeArgs {

    public static final ServicePrincipalProfileResponse Empty = new ServicePrincipalProfileResponse();

    /**
     * The client ID used for the cluster (immutable).
     * 
     */
    @Import(name="clientId")
    private @Nullable String clientId;

    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * The client secret used for the cluster (immutable).
     * 
     */
    @Import(name="clientSecret")
    private @Nullable String clientSecret;

    public Optional<String> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    private ServicePrincipalProfileResponse() {}

    private ServicePrincipalProfileResponse(ServicePrincipalProfileResponse $) {
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicePrincipalProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicePrincipalProfileResponse $;

        public Builder() {
            $ = new ServicePrincipalProfileResponse();
        }

        public Builder(ServicePrincipalProfileResponse defaults) {
            $ = new ServicePrincipalProfileResponse(Objects.requireNonNull(defaults));
        }

        public Builder clientId(@Nullable String clientId) {
            $.clientId = clientId;
            return this;
        }

        public Builder clientSecret(@Nullable String clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        public ServicePrincipalProfileResponse build() {
            return $;
        }
    }

}
