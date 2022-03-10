// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.RCranPackageArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.RGitHubPackageArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Settings for a R environment.
 * 
 */
public final class ModelEnvironmentDefinitionRArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelEnvironmentDefinitionRArgs Empty = new ModelEnvironmentDefinitionRArgs();

    /**
     * The packages from Bioconductor.
     * 
     */
    @InputImport(name="bioConductorPackages")
      private final @Nullable Input<List<String>> bioConductorPackages;

    public Input<List<String>> getBioConductorPackages() {
        return this.bioConductorPackages == null ? Input.empty() : this.bioConductorPackages;
    }

    /**
     * The CRAN packages to use.
     * 
     */
    @InputImport(name="cranPackages")
      private final @Nullable Input<List<RCranPackageArgs>> cranPackages;

    public Input<List<RCranPackageArgs>> getCranPackages() {
        return this.cranPackages == null ? Input.empty() : this.cranPackages;
    }

    /**
     * The packages from custom urls.
     * 
     */
    @InputImport(name="customUrlPackages")
      private final @Nullable Input<List<String>> customUrlPackages;

    public Input<List<String>> getCustomUrlPackages() {
        return this.customUrlPackages == null ? Input.empty() : this.customUrlPackages;
    }

    /**
     * The packages directly from GitHub.
     * 
     */
    @InputImport(name="gitHubPackages")
      private final @Nullable Input<List<RGitHubPackageArgs>> gitHubPackages;

    public Input<List<RGitHubPackageArgs>> getGitHubPackages() {
        return this.gitHubPackages == null ? Input.empty() : this.gitHubPackages;
    }

    /**
     * The version of R to be installed
     * 
     */
    @InputImport(name="rVersion")
      private final @Nullable Input<String> rVersion;

    public Input<String> getRVersion() {
        return this.rVersion == null ? Input.empty() : this.rVersion;
    }

    /**
     * The Rscript path to use if an environment build is not required.
     * The path specified gets used to call the user script.
     * 
     */
    @InputImport(name="rscriptPath")
      private final @Nullable Input<String> rscriptPath;

    public Input<String> getRscriptPath() {
        return this.rscriptPath == null ? Input.empty() : this.rscriptPath;
    }

    /**
     * Date of MRAN snapshot to use in YYYY-MM-DD format, e.g. "2019-04-17"
     * 
     */
    @InputImport(name="snapshotDate")
      private final @Nullable Input<String> snapshotDate;

    public Input<String> getSnapshotDate() {
        return this.snapshotDate == null ? Input.empty() : this.snapshotDate;
    }

    /**
     * Indicates whether the environment is managed by user or by AzureML.
     * 
     */
    @InputImport(name="userManaged")
      private final @Nullable Input<Boolean> userManaged;

    public Input<Boolean> getUserManaged() {
        return this.userManaged == null ? Input.empty() : this.userManaged;
    }

    public ModelEnvironmentDefinitionRArgs(
        @Nullable Input<List<String>> bioConductorPackages,
        @Nullable Input<List<RCranPackageArgs>> cranPackages,
        @Nullable Input<List<String>> customUrlPackages,
        @Nullable Input<List<RGitHubPackageArgs>> gitHubPackages,
        @Nullable Input<String> rVersion,
        @Nullable Input<String> rscriptPath,
        @Nullable Input<String> snapshotDate,
        @Nullable Input<Boolean> userManaged) {
        this.bioConductorPackages = bioConductorPackages;
        this.cranPackages = cranPackages;
        this.customUrlPackages = customUrlPackages;
        this.gitHubPackages = gitHubPackages;
        this.rVersion = rVersion;
        this.rscriptPath = rscriptPath;
        this.snapshotDate = snapshotDate;
        this.userManaged = userManaged;
    }

    private ModelEnvironmentDefinitionRArgs() {
        this.bioConductorPackages = Input.empty();
        this.cranPackages = Input.empty();
        this.customUrlPackages = Input.empty();
        this.gitHubPackages = Input.empty();
        this.rVersion = Input.empty();
        this.rscriptPath = Input.empty();
        this.snapshotDate = Input.empty();
        this.userManaged = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelEnvironmentDefinitionRArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> bioConductorPackages;
        private @Nullable Input<List<RCranPackageArgs>> cranPackages;
        private @Nullable Input<List<String>> customUrlPackages;
        private @Nullable Input<List<RGitHubPackageArgs>> gitHubPackages;
        private @Nullable Input<String> rVersion;
        private @Nullable Input<String> rscriptPath;
        private @Nullable Input<String> snapshotDate;
        private @Nullable Input<Boolean> userManaged;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelEnvironmentDefinitionRArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bioConductorPackages = defaults.bioConductorPackages;
    	      this.cranPackages = defaults.cranPackages;
    	      this.customUrlPackages = defaults.customUrlPackages;
    	      this.gitHubPackages = defaults.gitHubPackages;
    	      this.rVersion = defaults.rVersion;
    	      this.rscriptPath = defaults.rscriptPath;
    	      this.snapshotDate = defaults.snapshotDate;
    	      this.userManaged = defaults.userManaged;
        }

        public Builder bioConductorPackages(@Nullable Input<List<String>> bioConductorPackages) {
            this.bioConductorPackages = bioConductorPackages;
            return this;
        }

        public Builder bioConductorPackages(@Nullable List<String> bioConductorPackages) {
            this.bioConductorPackages = Input.ofNullable(bioConductorPackages);
            return this;
        }

        public Builder cranPackages(@Nullable Input<List<RCranPackageArgs>> cranPackages) {
            this.cranPackages = cranPackages;
            return this;
        }

        public Builder cranPackages(@Nullable List<RCranPackageArgs> cranPackages) {
            this.cranPackages = Input.ofNullable(cranPackages);
            return this;
        }

        public Builder customUrlPackages(@Nullable Input<List<String>> customUrlPackages) {
            this.customUrlPackages = customUrlPackages;
            return this;
        }

        public Builder customUrlPackages(@Nullable List<String> customUrlPackages) {
            this.customUrlPackages = Input.ofNullable(customUrlPackages);
            return this;
        }

        public Builder gitHubPackages(@Nullable Input<List<RGitHubPackageArgs>> gitHubPackages) {
            this.gitHubPackages = gitHubPackages;
            return this;
        }

        public Builder gitHubPackages(@Nullable List<RGitHubPackageArgs> gitHubPackages) {
            this.gitHubPackages = Input.ofNullable(gitHubPackages);
            return this;
        }

        public Builder rVersion(@Nullable Input<String> rVersion) {
            this.rVersion = rVersion;
            return this;
        }

        public Builder rVersion(@Nullable String rVersion) {
            this.rVersion = Input.ofNullable(rVersion);
            return this;
        }

        public Builder rscriptPath(@Nullable Input<String> rscriptPath) {
            this.rscriptPath = rscriptPath;
            return this;
        }

        public Builder rscriptPath(@Nullable String rscriptPath) {
            this.rscriptPath = Input.ofNullable(rscriptPath);
            return this;
        }

        public Builder snapshotDate(@Nullable Input<String> snapshotDate) {
            this.snapshotDate = snapshotDate;
            return this;
        }

        public Builder snapshotDate(@Nullable String snapshotDate) {
            this.snapshotDate = Input.ofNullable(snapshotDate);
            return this;
        }

        public Builder userManaged(@Nullable Input<Boolean> userManaged) {
            this.userManaged = userManaged;
            return this;
        }

        public Builder userManaged(@Nullable Boolean userManaged) {
            this.userManaged = Input.ofNullable(userManaged);
            return this;
        }
        public ModelEnvironmentDefinitionRArgs build() {
            return new ModelEnvironmentDefinitionRArgs(bioConductorPackages, cranPackages, customUrlPackages, gitHubPackages, rVersion, rscriptPath, snapshotDate, userManaged);
        }
    }
}
