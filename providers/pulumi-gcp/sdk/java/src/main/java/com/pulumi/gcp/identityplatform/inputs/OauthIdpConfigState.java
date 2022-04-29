// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.identityplatform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OauthIdpConfigState extends ResourceArgs {

    public static final OauthIdpConfigState Empty = new OauthIdpConfigState();

    /**
     * The client id of an OAuth client.
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    /**
     * @return The client id of an OAuth client.
     * 
     */
    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * The client secret of the OAuth client, to enable OIDC code flow.
     * 
     */
    @Import(name="clientSecret")
    private @Nullable Output<String> clientSecret;

    /**
     * @return The client secret of the OAuth client, to enable OIDC code flow.
     * 
     */
    public Optional<Output<String>> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    /**
     * Human friendly display name.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Human friendly display name.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * If this config allows users to sign in with the provider.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return If this config allows users to sign in with the provider.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * For OIDC Idps, the issuer identifier.
     * 
     */
    @Import(name="issuer")
    private @Nullable Output<String> issuer;

    /**
     * @return For OIDC Idps, the issuer identifier.
     * 
     */
    public Optional<Output<String>> issuer() {
        return Optional.ofNullable(this.issuer);
    }

    /**
     * The name of the OauthIdpConfig. Must start with `oidc.`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the OauthIdpConfig. Must start with `oidc.`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private OauthIdpConfigState() {}

    private OauthIdpConfigState(OauthIdpConfigState $) {
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.displayName = $.displayName;
        this.enabled = $.enabled;
        this.issuer = $.issuer;
        this.name = $.name;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OauthIdpConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OauthIdpConfigState $;

        public Builder() {
            $ = new OauthIdpConfigState();
        }

        public Builder(OauthIdpConfigState defaults) {
            $ = new OauthIdpConfigState(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientId The client id of an OAuth client.
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The client id of an OAuth client.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientSecret The client secret of the OAuth client, to enable OIDC code flow.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(@Nullable Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret The client secret of the OAuth client, to enable OIDC code flow.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        /**
         * @param displayName Human friendly display name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Human friendly display name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param enabled If this config allows users to sign in with the provider.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled If this config allows users to sign in with the provider.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param issuer For OIDC Idps, the issuer identifier.
         * 
         * @return builder
         * 
         */
        public Builder issuer(@Nullable Output<String> issuer) {
            $.issuer = issuer;
            return this;
        }

        /**
         * @param issuer For OIDC Idps, the issuer identifier.
         * 
         * @return builder
         * 
         */
        public Builder issuer(String issuer) {
            return issuer(Output.of(issuer));
        }

        /**
         * @param name The name of the OauthIdpConfig. Must start with `oidc.`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the OauthIdpConfig. Must start with `oidc.`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public OauthIdpConfigState build() {
            return $;
        }
    }

}
