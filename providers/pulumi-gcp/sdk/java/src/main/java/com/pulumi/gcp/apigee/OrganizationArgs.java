// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigee;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrganizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationArgs Empty = new OrganizationArgs();

    /**
     * Primary GCP region for analytics data storage. For valid values, see [Create an Apigee organization](https://cloud.google.com/apigee/docs/api-platform/get-started/create-org).
     * 
     */
    @Import(name="analyticsRegion")
      private final @Nullable Output<String> analyticsRegion;

    public Output<String> analyticsRegion() {
        return this.analyticsRegion == null ? Codegen.empty() : this.analyticsRegion;
    }

    /**
     * Compute Engine network used for Service Networking to be peered with Apigee runtime instances.
     * See [Getting started with the Service Networking API](https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started).
     * Valid only when `RuntimeType` is set to CLOUD. The value can be updated only when there are no runtime instances. For example: "default".
     * 
     */
    @Import(name="authorizedNetwork")
      private final @Nullable Output<String> authorizedNetwork;

    public Output<String> authorizedNetwork() {
        return this.authorizedNetwork == null ? Codegen.empty() : this.authorizedNetwork;
    }

    /**
     * Description of the Apigee organization.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The display name of the Apigee organization.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * The project ID associated with the Apigee organization.
     * 
     */
    @Import(name="projectId", required=true)
      private final Output<String> projectId;

    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * Cloud KMS key name used for encrypting the data that is stored and replicated across runtime instances.
     * Update is not allowed after the organization is created.
     * If not specified, a Google-Managed encryption key will be used.
     * Valid only when `RuntimeType` is CLOUD. For example: `projects/foo/locations/us/keyRings/bar/cryptoKeys/baz`.
     * 
     */
    @Import(name="runtimeDatabaseEncryptionKeyName")
      private final @Nullable Output<String> runtimeDatabaseEncryptionKeyName;

    public Output<String> runtimeDatabaseEncryptionKeyName() {
        return this.runtimeDatabaseEncryptionKeyName == null ? Codegen.empty() : this.runtimeDatabaseEncryptionKeyName;
    }

    /**
     * Runtime type of the Apigee organization based on the Apigee subscription purchased.
     * Default value is `CLOUD`.
     * Possible values are `CLOUD` and `HYBRID`.
     * 
     */
    @Import(name="runtimeType")
      private final @Nullable Output<String> runtimeType;

    public Output<String> runtimeType() {
        return this.runtimeType == null ? Codegen.empty() : this.runtimeType;
    }

    public OrganizationArgs(
        @Nullable Output<String> analyticsRegion,
        @Nullable Output<String> authorizedNetwork,
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        Output<String> projectId,
        @Nullable Output<String> runtimeDatabaseEncryptionKeyName,
        @Nullable Output<String> runtimeType) {
        this.analyticsRegion = analyticsRegion;
        this.authorizedNetwork = authorizedNetwork;
        this.description = description;
        this.displayName = displayName;
        this.projectId = Objects.requireNonNull(projectId, "expected parameter 'projectId' to be non-null");
        this.runtimeDatabaseEncryptionKeyName = runtimeDatabaseEncryptionKeyName;
        this.runtimeType = runtimeType;
    }

    private OrganizationArgs() {
        this.analyticsRegion = Codegen.empty();
        this.authorizedNetwork = Codegen.empty();
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.projectId = Codegen.empty();
        this.runtimeDatabaseEncryptionKeyName = Codegen.empty();
        this.runtimeType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> analyticsRegion;
        private @Nullable Output<String> authorizedNetwork;
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private Output<String> projectId;
        private @Nullable Output<String> runtimeDatabaseEncryptionKeyName;
        private @Nullable Output<String> runtimeType;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analyticsRegion = defaults.analyticsRegion;
    	      this.authorizedNetwork = defaults.authorizedNetwork;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.projectId = defaults.projectId;
    	      this.runtimeDatabaseEncryptionKeyName = defaults.runtimeDatabaseEncryptionKeyName;
    	      this.runtimeType = defaults.runtimeType;
        }

        public Builder analyticsRegion(@Nullable Output<String> analyticsRegion) {
            this.analyticsRegion = analyticsRegion;
            return this;
        }
        public Builder analyticsRegion(@Nullable String analyticsRegion) {
            this.analyticsRegion = Codegen.ofNullable(analyticsRegion);
            return this;
        }
        public Builder authorizedNetwork(@Nullable Output<String> authorizedNetwork) {
            this.authorizedNetwork = authorizedNetwork;
            return this;
        }
        public Builder authorizedNetwork(@Nullable String authorizedNetwork) {
            this.authorizedNetwork = Codegen.ofNullable(authorizedNetwork);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder projectId(Output<String> projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        public Builder projectId(String projectId) {
            this.projectId = Output.of(Objects.requireNonNull(projectId));
            return this;
        }
        public Builder runtimeDatabaseEncryptionKeyName(@Nullable Output<String> runtimeDatabaseEncryptionKeyName) {
            this.runtimeDatabaseEncryptionKeyName = runtimeDatabaseEncryptionKeyName;
            return this;
        }
        public Builder runtimeDatabaseEncryptionKeyName(@Nullable String runtimeDatabaseEncryptionKeyName) {
            this.runtimeDatabaseEncryptionKeyName = Codegen.ofNullable(runtimeDatabaseEncryptionKeyName);
            return this;
        }
        public Builder runtimeType(@Nullable Output<String> runtimeType) {
            this.runtimeType = runtimeType;
            return this;
        }
        public Builder runtimeType(@Nullable String runtimeType) {
            this.runtimeType = Codegen.ofNullable(runtimeType);
            return this;
        }        public OrganizationArgs build() {
            return new OrganizationArgs(analyticsRegion, authorizedNetwork, description, displayName, projectId, runtimeDatabaseEncryptionKeyName, runtimeType);
        }
    }
}
