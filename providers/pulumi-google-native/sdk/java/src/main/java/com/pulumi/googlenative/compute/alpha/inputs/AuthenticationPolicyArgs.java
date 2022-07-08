// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute.alpha.enums.AuthenticationPolicyPrincipalBinding;
import com.pulumi.googlenative.compute.alpha.inputs.OriginAuthenticationMethodArgs;
import com.pulumi.googlenative.compute.alpha.inputs.PeerAuthenticationMethodArgs;
import com.pulumi.googlenative.compute.alpha.inputs.TlsContextArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * [Deprecated] The authentication settings for the backend service. The authentication settings for the backend service.
 * 
 */
public final class AuthenticationPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthenticationPolicyArgs Empty = new AuthenticationPolicyArgs();

    /**
     * List of authentication methods that can be used for origin authentication. Similar to peers, these will be evaluated in order the first valid one will be used to set origin identity. If none of these methods pass, the request will be rejected with authentication failed error (401). Leave the list empty if origin authentication is not required.
     * 
     */
    @Import(name="origins")
    private @Nullable Output<List<OriginAuthenticationMethodArgs>> origins;

    /**
     * @return List of authentication methods that can be used for origin authentication. Similar to peers, these will be evaluated in order the first valid one will be used to set origin identity. If none of these methods pass, the request will be rejected with authentication failed error (401). Leave the list empty if origin authentication is not required.
     * 
     */
    public Optional<Output<List<OriginAuthenticationMethodArgs>>> origins() {
        return Optional.ofNullable(this.origins);
    }

    /**
     * List of authentication methods that can be used for peer authentication. They will be evaluated in order the first valid one will be used to set peer identity. If none of these methods pass, the request will be rejected with authentication failed error (401). Leave the list empty if peer authentication is not required.
     * 
     */
    @Import(name="peers")
    private @Nullable Output<List<PeerAuthenticationMethodArgs>> peers;

    /**
     * @return List of authentication methods that can be used for peer authentication. They will be evaluated in order the first valid one will be used to set peer identity. If none of these methods pass, the request will be rejected with authentication failed error (401). Leave the list empty if peer authentication is not required.
     * 
     */
    public Optional<Output<List<PeerAuthenticationMethodArgs>>> peers() {
        return Optional.ofNullable(this.peers);
    }

    /**
     * Define whether peer or origin identity should be used for principal. Default value is USE_PEER. If peer (or origin) identity is not available, either because peer/origin authentication is not defined, or failed, principal will be left unset. In other words, binding rule does not affect the decision to accept or reject request. This field can be set to one of the following: USE_PEER: Principal will be set to the identity from peer authentication. USE_ORIGIN: Principal will be set to the identity from origin authentication.
     * 
     */
    @Import(name="principalBinding")
    private @Nullable Output<AuthenticationPolicyPrincipalBinding> principalBinding;

    /**
     * @return Define whether peer or origin identity should be used for principal. Default value is USE_PEER. If peer (or origin) identity is not available, either because peer/origin authentication is not defined, or failed, principal will be left unset. In other words, binding rule does not affect the decision to accept or reject request. This field can be set to one of the following: USE_PEER: Principal will be set to the identity from peer authentication. USE_ORIGIN: Principal will be set to the identity from origin authentication.
     * 
     */
    public Optional<Output<AuthenticationPolicyPrincipalBinding>> principalBinding() {
        return Optional.ofNullable(this.principalBinding);
    }

    /**
     * Configures the mechanism to obtain server-side security certificates and identity information.
     * 
     */
    @Import(name="serverTlsContext")
    private @Nullable Output<TlsContextArgs> serverTlsContext;

    /**
     * @return Configures the mechanism to obtain server-side security certificates and identity information.
     * 
     */
    public Optional<Output<TlsContextArgs>> serverTlsContext() {
        return Optional.ofNullable(this.serverTlsContext);
    }

    private AuthenticationPolicyArgs() {}

    private AuthenticationPolicyArgs(AuthenticationPolicyArgs $) {
        this.origins = $.origins;
        this.peers = $.peers;
        this.principalBinding = $.principalBinding;
        this.serverTlsContext = $.serverTlsContext;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthenticationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthenticationPolicyArgs $;

        public Builder() {
            $ = new AuthenticationPolicyArgs();
        }

        public Builder(AuthenticationPolicyArgs defaults) {
            $ = new AuthenticationPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param origins List of authentication methods that can be used for origin authentication. Similar to peers, these will be evaluated in order the first valid one will be used to set origin identity. If none of these methods pass, the request will be rejected with authentication failed error (401). Leave the list empty if origin authentication is not required.
         * 
         * @return builder
         * 
         */
        public Builder origins(@Nullable Output<List<OriginAuthenticationMethodArgs>> origins) {
            $.origins = origins;
            return this;
        }

        /**
         * @param origins List of authentication methods that can be used for origin authentication. Similar to peers, these will be evaluated in order the first valid one will be used to set origin identity. If none of these methods pass, the request will be rejected with authentication failed error (401). Leave the list empty if origin authentication is not required.
         * 
         * @return builder
         * 
         */
        public Builder origins(List<OriginAuthenticationMethodArgs> origins) {
            return origins(Output.of(origins));
        }

        /**
         * @param origins List of authentication methods that can be used for origin authentication. Similar to peers, these will be evaluated in order the first valid one will be used to set origin identity. If none of these methods pass, the request will be rejected with authentication failed error (401). Leave the list empty if origin authentication is not required.
         * 
         * @return builder
         * 
         */
        public Builder origins(OriginAuthenticationMethodArgs... origins) {
            return origins(List.of(origins));
        }

        /**
         * @param peers List of authentication methods that can be used for peer authentication. They will be evaluated in order the first valid one will be used to set peer identity. If none of these methods pass, the request will be rejected with authentication failed error (401). Leave the list empty if peer authentication is not required.
         * 
         * @return builder
         * 
         */
        public Builder peers(@Nullable Output<List<PeerAuthenticationMethodArgs>> peers) {
            $.peers = peers;
            return this;
        }

        /**
         * @param peers List of authentication methods that can be used for peer authentication. They will be evaluated in order the first valid one will be used to set peer identity. If none of these methods pass, the request will be rejected with authentication failed error (401). Leave the list empty if peer authentication is not required.
         * 
         * @return builder
         * 
         */
        public Builder peers(List<PeerAuthenticationMethodArgs> peers) {
            return peers(Output.of(peers));
        }

        /**
         * @param peers List of authentication methods that can be used for peer authentication. They will be evaluated in order the first valid one will be used to set peer identity. If none of these methods pass, the request will be rejected with authentication failed error (401). Leave the list empty if peer authentication is not required.
         * 
         * @return builder
         * 
         */
        public Builder peers(PeerAuthenticationMethodArgs... peers) {
            return peers(List.of(peers));
        }

        /**
         * @param principalBinding Define whether peer or origin identity should be used for principal. Default value is USE_PEER. If peer (or origin) identity is not available, either because peer/origin authentication is not defined, or failed, principal will be left unset. In other words, binding rule does not affect the decision to accept or reject request. This field can be set to one of the following: USE_PEER: Principal will be set to the identity from peer authentication. USE_ORIGIN: Principal will be set to the identity from origin authentication.
         * 
         * @return builder
         * 
         */
        public Builder principalBinding(@Nullable Output<AuthenticationPolicyPrincipalBinding> principalBinding) {
            $.principalBinding = principalBinding;
            return this;
        }

        /**
         * @param principalBinding Define whether peer or origin identity should be used for principal. Default value is USE_PEER. If peer (or origin) identity is not available, either because peer/origin authentication is not defined, or failed, principal will be left unset. In other words, binding rule does not affect the decision to accept or reject request. This field can be set to one of the following: USE_PEER: Principal will be set to the identity from peer authentication. USE_ORIGIN: Principal will be set to the identity from origin authentication.
         * 
         * @return builder
         * 
         */
        public Builder principalBinding(AuthenticationPolicyPrincipalBinding principalBinding) {
            return principalBinding(Output.of(principalBinding));
        }

        /**
         * @param serverTlsContext Configures the mechanism to obtain server-side security certificates and identity information.
         * 
         * @return builder
         * 
         */
        public Builder serverTlsContext(@Nullable Output<TlsContextArgs> serverTlsContext) {
            $.serverTlsContext = serverTlsContext;
            return this;
        }

        /**
         * @param serverTlsContext Configures the mechanism to obtain server-side security certificates and identity information.
         * 
         * @return builder
         * 
         */
        public Builder serverTlsContext(TlsContextArgs serverTlsContext) {
            return serverTlsContext(Output.of(serverTlsContext));
        }

        public AuthenticationPolicyArgs build() {
            return $;
        }
    }

}
