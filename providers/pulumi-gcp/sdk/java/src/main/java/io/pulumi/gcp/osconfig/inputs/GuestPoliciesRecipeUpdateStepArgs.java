// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepArchiveExtractionArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepDpkgInstallationArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepFileCopyArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepFileExecArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepMsiInstallationArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepRpmInstallationArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepScriptRunArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GuestPoliciesRecipeUpdateStepArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesRecipeUpdateStepArgs Empty = new GuestPoliciesRecipeUpdateStepArgs();

    /**
     * Extracts an archive into the specified directory.
     * Structure is documented below.
     * 
     */
    @InputImport(name="archiveExtraction")
      private final @Nullable Input<GuestPoliciesRecipeUpdateStepArchiveExtractionArgs> archiveExtraction;

    public Input<GuestPoliciesRecipeUpdateStepArchiveExtractionArgs> getArchiveExtraction() {
        return this.archiveExtraction == null ? Input.empty() : this.archiveExtraction;
    }

    /**
     * Installs a deb file via dpkg.
     * Structure is documented below.
     * 
     */
    @InputImport(name="dpkgInstallation")
      private final @Nullable Input<GuestPoliciesRecipeUpdateStepDpkgInstallationArgs> dpkgInstallation;

    public Input<GuestPoliciesRecipeUpdateStepDpkgInstallationArgs> getDpkgInstallation() {
        return this.dpkgInstallation == null ? Input.empty() : this.dpkgInstallation;
    }

    /**
     * Copies a file onto the instance.
     * Structure is documented below.
     * 
     */
    @InputImport(name="fileCopy")
      private final @Nullable Input<GuestPoliciesRecipeUpdateStepFileCopyArgs> fileCopy;

    public Input<GuestPoliciesRecipeUpdateStepFileCopyArgs> getFileCopy() {
        return this.fileCopy == null ? Input.empty() : this.fileCopy;
    }

    /**
     * Executes an artifact or local file.
     * Structure is documented below.
     * 
     */
    @InputImport(name="fileExec")
      private final @Nullable Input<GuestPoliciesRecipeUpdateStepFileExecArgs> fileExec;

    public Input<GuestPoliciesRecipeUpdateStepFileExecArgs> getFileExec() {
        return this.fileExec == null ? Input.empty() : this.fileExec;
    }

    /**
     * Installs an MSI file.
     * Structure is documented below.
     * 
     */
    @InputImport(name="msiInstallation")
      private final @Nullable Input<GuestPoliciesRecipeUpdateStepMsiInstallationArgs> msiInstallation;

    public Input<GuestPoliciesRecipeUpdateStepMsiInstallationArgs> getMsiInstallation() {
        return this.msiInstallation == null ? Input.empty() : this.msiInstallation;
    }

    /**
     * Installs an rpm file via the rpm utility.
     * Structure is documented below.
     * 
     */
    @InputImport(name="rpmInstallation")
      private final @Nullable Input<GuestPoliciesRecipeUpdateStepRpmInstallationArgs> rpmInstallation;

    public Input<GuestPoliciesRecipeUpdateStepRpmInstallationArgs> getRpmInstallation() {
        return this.rpmInstallation == null ? Input.empty() : this.rpmInstallation;
    }

    /**
     * Runs commands in a shell.
     * Structure is documented below.
     * 
     */
    @InputImport(name="scriptRun")
      private final @Nullable Input<GuestPoliciesRecipeUpdateStepScriptRunArgs> scriptRun;

    public Input<GuestPoliciesRecipeUpdateStepScriptRunArgs> getScriptRun() {
        return this.scriptRun == null ? Input.empty() : this.scriptRun;
    }

    public GuestPoliciesRecipeUpdateStepArgs(
        @Nullable Input<GuestPoliciesRecipeUpdateStepArchiveExtractionArgs> archiveExtraction,
        @Nullable Input<GuestPoliciesRecipeUpdateStepDpkgInstallationArgs> dpkgInstallation,
        @Nullable Input<GuestPoliciesRecipeUpdateStepFileCopyArgs> fileCopy,
        @Nullable Input<GuestPoliciesRecipeUpdateStepFileExecArgs> fileExec,
        @Nullable Input<GuestPoliciesRecipeUpdateStepMsiInstallationArgs> msiInstallation,
        @Nullable Input<GuestPoliciesRecipeUpdateStepRpmInstallationArgs> rpmInstallation,
        @Nullable Input<GuestPoliciesRecipeUpdateStepScriptRunArgs> scriptRun) {
        this.archiveExtraction = archiveExtraction;
        this.dpkgInstallation = dpkgInstallation;
        this.fileCopy = fileCopy;
        this.fileExec = fileExec;
        this.msiInstallation = msiInstallation;
        this.rpmInstallation = rpmInstallation;
        this.scriptRun = scriptRun;
    }

    private GuestPoliciesRecipeUpdateStepArgs() {
        this.archiveExtraction = Input.empty();
        this.dpkgInstallation = Input.empty();
        this.fileCopy = Input.empty();
        this.fileExec = Input.empty();
        this.msiInstallation = Input.empty();
        this.rpmInstallation = Input.empty();
        this.scriptRun = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesRecipeUpdateStepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GuestPoliciesRecipeUpdateStepArchiveExtractionArgs> archiveExtraction;
        private @Nullable Input<GuestPoliciesRecipeUpdateStepDpkgInstallationArgs> dpkgInstallation;
        private @Nullable Input<GuestPoliciesRecipeUpdateStepFileCopyArgs> fileCopy;
        private @Nullable Input<GuestPoliciesRecipeUpdateStepFileExecArgs> fileExec;
        private @Nullable Input<GuestPoliciesRecipeUpdateStepMsiInstallationArgs> msiInstallation;
        private @Nullable Input<GuestPoliciesRecipeUpdateStepRpmInstallationArgs> rpmInstallation;
        private @Nullable Input<GuestPoliciesRecipeUpdateStepScriptRunArgs> scriptRun;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesRecipeUpdateStepArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveExtraction = defaults.archiveExtraction;
    	      this.dpkgInstallation = defaults.dpkgInstallation;
    	      this.fileCopy = defaults.fileCopy;
    	      this.fileExec = defaults.fileExec;
    	      this.msiInstallation = defaults.msiInstallation;
    	      this.rpmInstallation = defaults.rpmInstallation;
    	      this.scriptRun = defaults.scriptRun;
        }

        public Builder archiveExtraction(@Nullable Input<GuestPoliciesRecipeUpdateStepArchiveExtractionArgs> archiveExtraction) {
            this.archiveExtraction = archiveExtraction;
            return this;
        }

        public Builder archiveExtraction(@Nullable GuestPoliciesRecipeUpdateStepArchiveExtractionArgs archiveExtraction) {
            this.archiveExtraction = Input.ofNullable(archiveExtraction);
            return this;
        }

        public Builder dpkgInstallation(@Nullable Input<GuestPoliciesRecipeUpdateStepDpkgInstallationArgs> dpkgInstallation) {
            this.dpkgInstallation = dpkgInstallation;
            return this;
        }

        public Builder dpkgInstallation(@Nullable GuestPoliciesRecipeUpdateStepDpkgInstallationArgs dpkgInstallation) {
            this.dpkgInstallation = Input.ofNullable(dpkgInstallation);
            return this;
        }

        public Builder fileCopy(@Nullable Input<GuestPoliciesRecipeUpdateStepFileCopyArgs> fileCopy) {
            this.fileCopy = fileCopy;
            return this;
        }

        public Builder fileCopy(@Nullable GuestPoliciesRecipeUpdateStepFileCopyArgs fileCopy) {
            this.fileCopy = Input.ofNullable(fileCopy);
            return this;
        }

        public Builder fileExec(@Nullable Input<GuestPoliciesRecipeUpdateStepFileExecArgs> fileExec) {
            this.fileExec = fileExec;
            return this;
        }

        public Builder fileExec(@Nullable GuestPoliciesRecipeUpdateStepFileExecArgs fileExec) {
            this.fileExec = Input.ofNullable(fileExec);
            return this;
        }

        public Builder msiInstallation(@Nullable Input<GuestPoliciesRecipeUpdateStepMsiInstallationArgs> msiInstallation) {
            this.msiInstallation = msiInstallation;
            return this;
        }

        public Builder msiInstallation(@Nullable GuestPoliciesRecipeUpdateStepMsiInstallationArgs msiInstallation) {
            this.msiInstallation = Input.ofNullable(msiInstallation);
            return this;
        }

        public Builder rpmInstallation(@Nullable Input<GuestPoliciesRecipeUpdateStepRpmInstallationArgs> rpmInstallation) {
            this.rpmInstallation = rpmInstallation;
            return this;
        }

        public Builder rpmInstallation(@Nullable GuestPoliciesRecipeUpdateStepRpmInstallationArgs rpmInstallation) {
            this.rpmInstallation = Input.ofNullable(rpmInstallation);
            return this;
        }

        public Builder scriptRun(@Nullable Input<GuestPoliciesRecipeUpdateStepScriptRunArgs> scriptRun) {
            this.scriptRun = scriptRun;
            return this;
        }

        public Builder scriptRun(@Nullable GuestPoliciesRecipeUpdateStepScriptRunArgs scriptRun) {
            this.scriptRun = Input.ofNullable(scriptRun);
            return this;
        }
        public GuestPoliciesRecipeUpdateStepArgs build() {
            return new GuestPoliciesRecipeUpdateStepArgs(archiveExtraction, dpkgInstallation, fileCopy, fileExec, msiInstallation, rpmInstallation, scriptRun);
        }
    }
}
