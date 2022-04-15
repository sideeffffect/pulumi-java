// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.identityplatform.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.identityplatform.inputs.InboundSamlConfigIdpConfigGetArgs;
import io.pulumi.gcp.identityplatform.inputs.InboundSamlConfigSpConfigGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InboundSamlConfigState extends io.pulumi.resources.ResourceArgs {

    public static final InboundSamlConfigState Empty = new InboundSamlConfigState();

    /**
     * Human friendly display name.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * If this config allows users to sign in with the provider.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * SAML IdP configuration when the project acts as the relying party
     * Structure is documented below.
     * 
     */
    @Import(name="idpConfig")
      private final @Nullable Output<InboundSamlConfigIdpConfigGetArgs> idpConfig;

    public Output<InboundSamlConfigIdpConfigGetArgs> idpConfig() {
        return this.idpConfig == null ? Codegen.empty() : this.idpConfig;
    }

    /**
     * The name of the InboundSamlConfig resource. Must start with 'saml.' and can only have alphanumeric characters,
     * hyphens, underscores or periods. The part after 'saml.' must also start with a lowercase letter, end with an
     * alphanumeric character, and have at least 2 characters.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * SAML SP (Service Provider) configuration when the project acts as the relying party to receive
     * and accept an authentication assertion issued by a SAML identity provider.
     * Structure is documented below.
     * 
     */
    @Import(name="spConfig")
      private final @Nullable Output<InboundSamlConfigSpConfigGetArgs> spConfig;

    public Output<InboundSamlConfigSpConfigGetArgs> spConfig() {
        return this.spConfig == null ? Codegen.empty() : this.spConfig;
    }

    public InboundSamlConfigState(
        @Nullable Output<String> displayName,
        @Nullable Output<Boolean> enabled,
        @Nullable Output<InboundSamlConfigIdpConfigGetArgs> idpConfig,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<InboundSamlConfigSpConfigGetArgs> spConfig) {
        this.displayName = displayName;
        this.enabled = enabled;
        this.idpConfig = idpConfig;
        this.name = name;
        this.project = project;
        this.spConfig = spConfig;
    }

    private InboundSamlConfigState() {
        this.displayName = Codegen.empty();
        this.enabled = Codegen.empty();
        this.idpConfig = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.spConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InboundSamlConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> displayName;
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<InboundSamlConfigIdpConfigGetArgs> idpConfig;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<InboundSamlConfigSpConfigGetArgs> spConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(InboundSamlConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.enabled = defaults.enabled;
    	      this.idpConfig = defaults.idpConfig;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.spConfig = defaults.spConfig;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder idpConfig(@Nullable Output<InboundSamlConfigIdpConfigGetArgs> idpConfig) {
            this.idpConfig = idpConfig;
            return this;
        }
        public Builder idpConfig(@Nullable InboundSamlConfigIdpConfigGetArgs idpConfig) {
            this.idpConfig = Codegen.ofNullable(idpConfig);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder spConfig(@Nullable Output<InboundSamlConfigSpConfigGetArgs> spConfig) {
            this.spConfig = spConfig;
            return this;
        }
        public Builder spConfig(@Nullable InboundSamlConfigSpConfigGetArgs spConfig) {
            this.spConfig = Codegen.ofNullable(spConfig);
            return this;
        }        public InboundSamlConfigState build() {
            return new InboundSamlConfigState(displayName, enabled, idpConfig, name, project, spConfig);
        }
    }
}
