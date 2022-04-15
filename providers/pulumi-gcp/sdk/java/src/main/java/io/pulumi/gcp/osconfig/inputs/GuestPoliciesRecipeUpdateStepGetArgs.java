// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepArchiveExtractionGetArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepDpkgInstallationGetArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepFileCopyGetArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepFileExecGetArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepMsiInstallationGetArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepRpmInstallationGetArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepScriptRunGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GuestPoliciesRecipeUpdateStepGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesRecipeUpdateStepGetArgs Empty = new GuestPoliciesRecipeUpdateStepGetArgs();

    /**
     * Extracts an archive into the specified directory.
     * Structure is documented below.
     * 
     */
    @Import(name="archiveExtraction")
      private final @Nullable Output<GuestPoliciesRecipeUpdateStepArchiveExtractionGetArgs> archiveExtraction;

    public Output<GuestPoliciesRecipeUpdateStepArchiveExtractionGetArgs> archiveExtraction() {
        return this.archiveExtraction == null ? Codegen.empty() : this.archiveExtraction;
    }

    /**
     * Installs a deb file via dpkg.
     * Structure is documented below.
     * 
     */
    @Import(name="dpkgInstallation")
      private final @Nullable Output<GuestPoliciesRecipeUpdateStepDpkgInstallationGetArgs> dpkgInstallation;

    public Output<GuestPoliciesRecipeUpdateStepDpkgInstallationGetArgs> dpkgInstallation() {
        return this.dpkgInstallation == null ? Codegen.empty() : this.dpkgInstallation;
    }

    /**
     * Copies a file onto the instance.
     * Structure is documented below.
     * 
     */
    @Import(name="fileCopy")
      private final @Nullable Output<GuestPoliciesRecipeUpdateStepFileCopyGetArgs> fileCopy;

    public Output<GuestPoliciesRecipeUpdateStepFileCopyGetArgs> fileCopy() {
        return this.fileCopy == null ? Codegen.empty() : this.fileCopy;
    }

    /**
     * Executes an artifact or local file.
     * Structure is documented below.
     * 
     */
    @Import(name="fileExec")
      private final @Nullable Output<GuestPoliciesRecipeUpdateStepFileExecGetArgs> fileExec;

    public Output<GuestPoliciesRecipeUpdateStepFileExecGetArgs> fileExec() {
        return this.fileExec == null ? Codegen.empty() : this.fileExec;
    }

    /**
     * Installs an MSI file.
     * Structure is documented below.
     * 
     */
    @Import(name="msiInstallation")
      private final @Nullable Output<GuestPoliciesRecipeUpdateStepMsiInstallationGetArgs> msiInstallation;

    public Output<GuestPoliciesRecipeUpdateStepMsiInstallationGetArgs> msiInstallation() {
        return this.msiInstallation == null ? Codegen.empty() : this.msiInstallation;
    }

    /**
     * Installs an rpm file via the rpm utility.
     * Structure is documented below.
     * 
     */
    @Import(name="rpmInstallation")
      private final @Nullable Output<GuestPoliciesRecipeUpdateStepRpmInstallationGetArgs> rpmInstallation;

    public Output<GuestPoliciesRecipeUpdateStepRpmInstallationGetArgs> rpmInstallation() {
        return this.rpmInstallation == null ? Codegen.empty() : this.rpmInstallation;
    }

    /**
     * Runs commands in a shell.
     * Structure is documented below.
     * 
     */
    @Import(name="scriptRun")
      private final @Nullable Output<GuestPoliciesRecipeUpdateStepScriptRunGetArgs> scriptRun;

    public Output<GuestPoliciesRecipeUpdateStepScriptRunGetArgs> scriptRun() {
        return this.scriptRun == null ? Codegen.empty() : this.scriptRun;
    }

    public GuestPoliciesRecipeUpdateStepGetArgs(
        @Nullable Output<GuestPoliciesRecipeUpdateStepArchiveExtractionGetArgs> archiveExtraction,
        @Nullable Output<GuestPoliciesRecipeUpdateStepDpkgInstallationGetArgs> dpkgInstallation,
        @Nullable Output<GuestPoliciesRecipeUpdateStepFileCopyGetArgs> fileCopy,
        @Nullable Output<GuestPoliciesRecipeUpdateStepFileExecGetArgs> fileExec,
        @Nullable Output<GuestPoliciesRecipeUpdateStepMsiInstallationGetArgs> msiInstallation,
        @Nullable Output<GuestPoliciesRecipeUpdateStepRpmInstallationGetArgs> rpmInstallation,
        @Nullable Output<GuestPoliciesRecipeUpdateStepScriptRunGetArgs> scriptRun) {
        this.archiveExtraction = archiveExtraction;
        this.dpkgInstallation = dpkgInstallation;
        this.fileCopy = fileCopy;
        this.fileExec = fileExec;
        this.msiInstallation = msiInstallation;
        this.rpmInstallation = rpmInstallation;
        this.scriptRun = scriptRun;
    }

    private GuestPoliciesRecipeUpdateStepGetArgs() {
        this.archiveExtraction = Codegen.empty();
        this.dpkgInstallation = Codegen.empty();
        this.fileCopy = Codegen.empty();
        this.fileExec = Codegen.empty();
        this.msiInstallation = Codegen.empty();
        this.rpmInstallation = Codegen.empty();
        this.scriptRun = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesRecipeUpdateStepGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GuestPoliciesRecipeUpdateStepArchiveExtractionGetArgs> archiveExtraction;
        private @Nullable Output<GuestPoliciesRecipeUpdateStepDpkgInstallationGetArgs> dpkgInstallation;
        private @Nullable Output<GuestPoliciesRecipeUpdateStepFileCopyGetArgs> fileCopy;
        private @Nullable Output<GuestPoliciesRecipeUpdateStepFileExecGetArgs> fileExec;
        private @Nullable Output<GuestPoliciesRecipeUpdateStepMsiInstallationGetArgs> msiInstallation;
        private @Nullable Output<GuestPoliciesRecipeUpdateStepRpmInstallationGetArgs> rpmInstallation;
        private @Nullable Output<GuestPoliciesRecipeUpdateStepScriptRunGetArgs> scriptRun;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesRecipeUpdateStepGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveExtraction = defaults.archiveExtraction;
    	      this.dpkgInstallation = defaults.dpkgInstallation;
    	      this.fileCopy = defaults.fileCopy;
    	      this.fileExec = defaults.fileExec;
    	      this.msiInstallation = defaults.msiInstallation;
    	      this.rpmInstallation = defaults.rpmInstallation;
    	      this.scriptRun = defaults.scriptRun;
        }

        public Builder archiveExtraction(@Nullable Output<GuestPoliciesRecipeUpdateStepArchiveExtractionGetArgs> archiveExtraction) {
            this.archiveExtraction = archiveExtraction;
            return this;
        }
        public Builder archiveExtraction(@Nullable GuestPoliciesRecipeUpdateStepArchiveExtractionGetArgs archiveExtraction) {
            this.archiveExtraction = Codegen.ofNullable(archiveExtraction);
            return this;
        }
        public Builder dpkgInstallation(@Nullable Output<GuestPoliciesRecipeUpdateStepDpkgInstallationGetArgs> dpkgInstallation) {
            this.dpkgInstallation = dpkgInstallation;
            return this;
        }
        public Builder dpkgInstallation(@Nullable GuestPoliciesRecipeUpdateStepDpkgInstallationGetArgs dpkgInstallation) {
            this.dpkgInstallation = Codegen.ofNullable(dpkgInstallation);
            return this;
        }
        public Builder fileCopy(@Nullable Output<GuestPoliciesRecipeUpdateStepFileCopyGetArgs> fileCopy) {
            this.fileCopy = fileCopy;
            return this;
        }
        public Builder fileCopy(@Nullable GuestPoliciesRecipeUpdateStepFileCopyGetArgs fileCopy) {
            this.fileCopy = Codegen.ofNullable(fileCopy);
            return this;
        }
        public Builder fileExec(@Nullable Output<GuestPoliciesRecipeUpdateStepFileExecGetArgs> fileExec) {
            this.fileExec = fileExec;
            return this;
        }
        public Builder fileExec(@Nullable GuestPoliciesRecipeUpdateStepFileExecGetArgs fileExec) {
            this.fileExec = Codegen.ofNullable(fileExec);
            return this;
        }
        public Builder msiInstallation(@Nullable Output<GuestPoliciesRecipeUpdateStepMsiInstallationGetArgs> msiInstallation) {
            this.msiInstallation = msiInstallation;
            return this;
        }
        public Builder msiInstallation(@Nullable GuestPoliciesRecipeUpdateStepMsiInstallationGetArgs msiInstallation) {
            this.msiInstallation = Codegen.ofNullable(msiInstallation);
            return this;
        }
        public Builder rpmInstallation(@Nullable Output<GuestPoliciesRecipeUpdateStepRpmInstallationGetArgs> rpmInstallation) {
            this.rpmInstallation = rpmInstallation;
            return this;
        }
        public Builder rpmInstallation(@Nullable GuestPoliciesRecipeUpdateStepRpmInstallationGetArgs rpmInstallation) {
            this.rpmInstallation = Codegen.ofNullable(rpmInstallation);
            return this;
        }
        public Builder scriptRun(@Nullable Output<GuestPoliciesRecipeUpdateStepScriptRunGetArgs> scriptRun) {
            this.scriptRun = scriptRun;
            return this;
        }
        public Builder scriptRun(@Nullable GuestPoliciesRecipeUpdateStepScriptRunGetArgs scriptRun) {
            this.scriptRun = Codegen.ofNullable(scriptRun);
            return this;
        }        public GuestPoliciesRecipeUpdateStepGetArgs build() {
            return new GuestPoliciesRecipeUpdateStepGetArgs(archiveExtraction, dpkgInstallation, fileCopy, fileExec, msiInstallation, rpmInstallation, scriptRun);
        }
    }
}
