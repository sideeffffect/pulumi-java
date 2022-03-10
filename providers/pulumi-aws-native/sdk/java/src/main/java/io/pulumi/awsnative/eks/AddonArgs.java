// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.eks;

import io.pulumi.awsnative.eks.enums.AddonResolveConflicts;
import io.pulumi.awsnative.eks.inputs.AddonTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AddonArgs extends io.pulumi.resources.ResourceArgs {

    public static final AddonArgs Empty = new AddonArgs();

    /**
     * Name of Addon
     * 
     */
    @InputImport(name="addonName")
      private final @Nullable Input<String> addonName;

    public Input<String> getAddonName() {
        return this.addonName == null ? Input.empty() : this.addonName;
    }

    /**
     * Version of Addon
     * 
     */
    @InputImport(name="addonVersion")
      private final @Nullable Input<String> addonVersion;

    public Input<String> getAddonVersion() {
        return this.addonVersion == null ? Input.empty() : this.addonVersion;
    }

    /**
     * Name of Cluster
     * 
     */
    @InputImport(name="clusterName", required=true)
      private final Input<String> clusterName;

    public Input<String> getClusterName() {
        return this.clusterName;
    }

    /**
     * Resolve parameter value conflicts
     * 
     */
    @InputImport(name="resolveConflicts")
      private final @Nullable Input<AddonResolveConflicts> resolveConflicts;

    public Input<AddonResolveConflicts> getResolveConflicts() {
        return this.resolveConflicts == null ? Input.empty() : this.resolveConflicts;
    }

    /**
     * IAM role to bind to the add-on's service account
     * 
     */
    @InputImport(name="serviceAccountRoleArn")
      private final @Nullable Input<String> serviceAccountRoleArn;

    public Input<String> getServiceAccountRoleArn() {
        return this.serviceAccountRoleArn == null ? Input.empty() : this.serviceAccountRoleArn;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<AddonTagArgs>> tags;

    public Input<List<AddonTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public AddonArgs(
        @Nullable Input<String> addonName,
        @Nullable Input<String> addonVersion,
        Input<String> clusterName,
        @Nullable Input<AddonResolveConflicts> resolveConflicts,
        @Nullable Input<String> serviceAccountRoleArn,
        @Nullable Input<List<AddonTagArgs>> tags) {
        this.addonName = addonName;
        this.addonVersion = addonVersion;
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.resolveConflicts = resolveConflicts;
        this.serviceAccountRoleArn = serviceAccountRoleArn;
        this.tags = tags;
    }

    private AddonArgs() {
        this.addonName = Input.empty();
        this.addonVersion = Input.empty();
        this.clusterName = Input.empty();
        this.resolveConflicts = Input.empty();
        this.serviceAccountRoleArn = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AddonArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> addonName;
        private @Nullable Input<String> addonVersion;
        private Input<String> clusterName;
        private @Nullable Input<AddonResolveConflicts> resolveConflicts;
        private @Nullable Input<String> serviceAccountRoleArn;
        private @Nullable Input<List<AddonTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(AddonArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addonName = defaults.addonName;
    	      this.addonVersion = defaults.addonVersion;
    	      this.clusterName = defaults.clusterName;
    	      this.resolveConflicts = defaults.resolveConflicts;
    	      this.serviceAccountRoleArn = defaults.serviceAccountRoleArn;
    	      this.tags = defaults.tags;
        }

        public Builder addonName(@Nullable Input<String> addonName) {
            this.addonName = addonName;
            return this;
        }

        public Builder addonName(@Nullable String addonName) {
            this.addonName = Input.ofNullable(addonName);
            return this;
        }

        public Builder addonVersion(@Nullable Input<String> addonVersion) {
            this.addonVersion = addonVersion;
            return this;
        }

        public Builder addonVersion(@Nullable String addonVersion) {
            this.addonVersion = Input.ofNullable(addonVersion);
            return this;
        }

        public Builder clusterName(Input<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder clusterName(String clusterName) {
            this.clusterName = Input.of(Objects.requireNonNull(clusterName));
            return this;
        }

        public Builder resolveConflicts(@Nullable Input<AddonResolveConflicts> resolveConflicts) {
            this.resolveConflicts = resolveConflicts;
            return this;
        }

        public Builder resolveConflicts(@Nullable AddonResolveConflicts resolveConflicts) {
            this.resolveConflicts = Input.ofNullable(resolveConflicts);
            return this;
        }

        public Builder serviceAccountRoleArn(@Nullable Input<String> serviceAccountRoleArn) {
            this.serviceAccountRoleArn = serviceAccountRoleArn;
            return this;
        }

        public Builder serviceAccountRoleArn(@Nullable String serviceAccountRoleArn) {
            this.serviceAccountRoleArn = Input.ofNullable(serviceAccountRoleArn);
            return this;
        }

        public Builder tags(@Nullable Input<List<AddonTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<AddonTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public AddonArgs build() {
            return new AddonArgs(addonName, addonVersion, clusterName, resolveConflicts, serviceAccountRoleArn, tags);
        }
    }
}
