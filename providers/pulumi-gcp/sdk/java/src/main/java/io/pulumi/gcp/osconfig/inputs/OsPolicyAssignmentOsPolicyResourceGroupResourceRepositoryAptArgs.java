// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptArgs();

    /**
     * Required. Type of archive files in this repository. Possible values: ARCHIVE_TYPE_UNSPECIFIED, DEB, DEB_SRC
     * 
     */
    @Import(name="archiveType", required=true)
      private final Output<String> archiveType;

    public Output<String> archiveType() {
        return this.archiveType;
    }

    /**
     * Required. List of components for this repository. Must contain at least one item.
     * 
     */
    @Import(name="components", required=true)
      private final Output<List<String>> components;

    public Output<List<String>> components() {
        return this.components;
    }

    /**
     * Required. Distribution of this repository.
     * 
     */
    @Import(name="distribution", required=true)
      private final Output<String> distribution;

    public Output<String> distribution() {
        return this.distribution;
    }

    /**
     * URI of the key file for this repository. The agent maintains a keyring at `/etc/apt/trusted.gpg.d/osconfig_agent_managed.gpg`.
     * 
     */
    @Import(name="gpgKey")
      private final @Nullable Output<String> gpgKey;

    public Output<String> gpgKey() {
        return this.gpgKey == null ? Codegen.empty() : this.gpgKey;
    }

    /**
     * Required. URI for this repository.
     * 
     */
    @Import(name="uri", required=true)
      private final Output<String> uri;

    public Output<String> uri() {
        return this.uri;
    }

    public OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptArgs(
        Output<String> archiveType,
        Output<List<String>> components,
        Output<String> distribution,
        @Nullable Output<String> gpgKey,
        Output<String> uri) {
        this.archiveType = Objects.requireNonNull(archiveType, "expected parameter 'archiveType' to be non-null");
        this.components = Objects.requireNonNull(components, "expected parameter 'components' to be non-null");
        this.distribution = Objects.requireNonNull(distribution, "expected parameter 'distribution' to be non-null");
        this.gpgKey = gpgKey;
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptArgs() {
        this.archiveType = Codegen.empty();
        this.components = Codegen.empty();
        this.distribution = Codegen.empty();
        this.gpgKey = Codegen.empty();
        this.uri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> archiveType;
        private Output<List<String>> components;
        private Output<String> distribution;
        private @Nullable Output<String> gpgKey;
        private Output<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveType = defaults.archiveType;
    	      this.components = defaults.components;
    	      this.distribution = defaults.distribution;
    	      this.gpgKey = defaults.gpgKey;
    	      this.uri = defaults.uri;
        }

        public Builder archiveType(Output<String> archiveType) {
            this.archiveType = Objects.requireNonNull(archiveType);
            return this;
        }
        public Builder archiveType(String archiveType) {
            this.archiveType = Output.of(Objects.requireNonNull(archiveType));
            return this;
        }
        public Builder components(Output<List<String>> components) {
            this.components = Objects.requireNonNull(components);
            return this;
        }
        public Builder components(List<String> components) {
            this.components = Output.of(Objects.requireNonNull(components));
            return this;
        }
        public Builder components(String... components) {
            return components(List.of(components));
        }
        public Builder distribution(Output<String> distribution) {
            this.distribution = Objects.requireNonNull(distribution);
            return this;
        }
        public Builder distribution(String distribution) {
            this.distribution = Output.of(Objects.requireNonNull(distribution));
            return this;
        }
        public Builder gpgKey(@Nullable Output<String> gpgKey) {
            this.gpgKey = gpgKey;
            return this;
        }
        public Builder gpgKey(@Nullable String gpgKey) {
            this.gpgKey = Codegen.ofNullable(gpgKey);
            return this;
        }
        public Builder uri(Output<String> uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Output.of(Objects.requireNonNull(uri));
            return this;
        }        public OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptArgs build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptArgs(archiveType, components, distribution, gpgKey, uri);
        }
    }
}
